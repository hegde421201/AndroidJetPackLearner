package com.learning.demo.testdemos.model

import androidx.arch.core.executor.testing.InstantTaskExecutorRule
import androidx.room.Room
import androidx.test.core.app.ApplicationProvider
import androidx.test.filters.SmallTest
import com.google.common.truth.Truth.assertThat
import dagger.hilt.android.testing.HiltAndroidRule
import dagger.hilt.android.testing.HiltAndroidTest
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.test.runTest
import org.junit.After
import org.junit.Before
import org.junit.Rule
import org.junit.Test
import javax.inject.Inject
import javax.inject.Named


//@ExtendWith(InstantExecutorExtension::class)
@SmallTest
@ExperimentalCoroutinesApi
@HiltAndroidTest
class PaintDaoTest {

    @get:Rule
    var instantTaskExecutorRule = InstantTaskExecutorRule()

    @get:Rule
    var hiltRule = HiltAndroidRule(this)

    @Inject
    @Named("testDatabase")
    lateinit var database: PaintDatabase


    private lateinit var dao : PaintDao
//private lateinit var database: PaintDatabase

@Before
fun setup(){

/*database = Room.
inMemoryDatabaseBuilder(ApplicationProvider.getApplicationContext(),PaintDatabase::class.java).
allowMainThreadQueries().build()*/

    hiltRule.inject()

    dao = database.paintDao()


}

    @After
    fun teardown(){
        database.close()
    }

    @OptIn(ExperimentalCoroutinesApi::class)
    @Test
    fun insertPaintTesting() = runTest{

        val examplePainting = Paint("Elephant","Lady Bhago",1568,"test.com",1)
        dao.insertPainting(examplePainting)
        val value = dao.observePaintings().getOrAwaitValueTest()
        assertThat(value).contains(examplePainting)
    }

    @OptIn(ExperimentalCoroutinesApi::class)
    @Test
    fun deletePaintTesting() = runTest{

        val examplePainting = Paint("Cat","Van dussen",1348,"test3.com",2)

        dao.insertPainting(examplePainting)
        dao.deletePainting(examplePainting)

        val value = dao.observePaintings().getOrAwaitValueTest()
        assertThat(value).doesNotContain(examplePainting)
    }


}