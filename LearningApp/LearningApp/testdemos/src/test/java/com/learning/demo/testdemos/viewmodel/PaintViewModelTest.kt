package com.learning.demo.testdemos.viewmodel

import com.google.common.truth.Truth.assertThat

import com.learning.demo.testdemos.repo.FakePaintRepository
import com.learning.demo.testdemos.util.Status
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith


@ExtendWith(InstantExecutorExtension::class)
class PaintViewModelTest {

  /*  @get:Rule
    var instantTaskExecutorRule = InstantTaskExecutorRule()

    @get:Rule
    var mainCoroutineRule = MainCoroutineRule()*/

private lateinit var paintViewModel: PaintViewModel

@BeforeEach
fun setup(){

    //test doubles --- fake repository
    paintViewModel = PaintViewModel(FakePaintRepository())
}

    @Test
    fun `insert painting without year returns error`()  {

            paintViewModel.makePaint("Monkey", "La gorg", "")
            val value = paintViewModel.insertPaintMessage.value
            assertThat(value?.status).isEqualTo(Status.ERROR)
    }

    @Test
    fun `insert painting without name returns error`(){

        paintViewModel.makePaint("", "La gorg", "345")
        val value = paintViewModel.insertPaintMessage.value
        assertThat(value?.status).isEqualTo(Status.ERROR)
    }

    @Test
    fun `insert painting without artistname returns error`(){
        paintViewModel.makePaint("Monkey", "", "788")
        val value = paintViewModel.insertPaintMessage.value
        assertThat(value?.status).isEqualTo(Status.ERROR)

    }
}