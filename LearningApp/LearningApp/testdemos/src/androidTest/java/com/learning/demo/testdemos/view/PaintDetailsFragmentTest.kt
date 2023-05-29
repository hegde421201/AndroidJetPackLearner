package com.learning.demo.testdemos.view

import androidx.arch.core.executor.testing.InstantTaskExecutorRule
import androidx.navigation.NavController
import androidx.navigation.Navigation
import androidx.test.espresso.Espresso
import androidx.test.espresso.Espresso.pressBack
import androidx.test.espresso.action.ViewActions
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.matcher.ViewMatchers
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.filters.MediumTest
import com.google.common.truth.Truth.assertThat
import com.learning.demo.testdemos.launchFragmentInHiltContainer
import dagger.hilt.android.testing.HiltAndroidRule
import dagger.hilt.android.testing.HiltAndroidTest
import kotlinx.coroutines.ExperimentalCoroutinesApi
import org.junit.Before
import org.junit.Rule
import org.junit.Test
import org.mockito.Mockito
import javax.inject.Inject
import com.learning.demo.testdemos.R
import com.learning.demo.testdemos.model.Paint
import com.learning.demo.testdemos.model.getOrAwaitValueTest
import com.learning.demo.testdemos.repo.FakePaintRepositoryTest
import com.learning.demo.testdemos.viewmodel.PaintViewModel

@MediumTest
@HiltAndroidTest
@ExperimentalCoroutinesApi
class PaintDetailsFragmentTest {

    @get:Rule
    var hiltRule = HiltAndroidRule(this)

    @get:Rule
    val instantTaskExecutorRule = InstantTaskExecutorRule()

    @Inject
    lateinit var fragmentFactory : PaintFragmentFactory

    @Before
    fun setup(){
        hiltRule.inject()
    }

    @Test
    fun testNavigationFromDetailsFragToImageApi(){

        val navController = Mockito.mock(NavController::class.java)

        launchFragmentInHiltContainer<PaintDetailsFragment>(
           factory = fragmentFactory
        ){
            Navigation.setViewNavController(requireView(),navController)
        }

        Espresso.onView(ViewMatchers.withId(R.id.paint_image)).perform(click())

        Mockito.verify(navController).navigate(PaintDetailsFragmentDirections.actionSecondFragmentToThirdFragment())
    }

    @Test
    fun testOnBackPressed(){
        val navController = Mockito.mock(NavController::class.java)

        launchFragmentInHiltContainer<PaintDetailsFragment>(
            factory = fragmentFactory
        ){
            Navigation.setViewNavController(requireView(),navController)
        }

       pressBack()
        Mockito.verify(navController).popBackStack()
    }

    @Test
    fun testSave(){
            val testVM = PaintViewModel(FakePaintRepositoryTest())

        launchFragmentInHiltContainer<PaintDetailsFragment>(
            factory = fragmentFactory
        ){
            viewModel = testVM
        }

        Espresso.onView(withId(R.id.paints_name)).perform(ViewActions.replaceText("Donkey"))
        Espresso.onView(withId(R.id.artist_name)).perform(ViewActions.replaceText("La lorgs"))
        Espresso.onView(withId(R.id.year_value)).perform(ViewActions.replaceText("1984"))
        Espresso.onView(withId(R.id.btnSave)).perform(click())

        assertThat(testVM.paintsList.getOrAwaitValueTest()).contains(Paint("Donkey","La lorgs",1984,""))


    }
}