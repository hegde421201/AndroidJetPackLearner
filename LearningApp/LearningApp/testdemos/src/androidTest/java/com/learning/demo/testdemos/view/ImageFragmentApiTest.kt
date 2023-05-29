package com.learning.demo.testdemos.view

import androidx.arch.core.executor.testing.InstantTaskExecutorRule
import androidx.navigation.NavController
import androidx.navigation.Navigation
import androidx.test.espresso.Espresso
import androidx.test.espresso.action.ViewActions
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.contrib.RecyclerViewActions
import androidx.test.espresso.matcher.ViewMatchers
import androidx.test.filters.MediumTest
import com.google.common.truth.Truth.assertThat
import com.learning.demo.testdemos.R
import com.learning.demo.testdemos.launchFragmentInHiltContainer
import com.learning.demo.testdemos.model.getOrAwaitValueTest
import com.learning.demo.testdemos.repo.FakePaintRepositoryTest
import com.learning.demo.testdemos.viewmodel.PaintViewModel
import dagger.hilt.android.testing.HiltAndroidRule
import dagger.hilt.android.testing.HiltAndroidTest
import kotlinx.coroutines.ExperimentalCoroutinesApi
import org.junit.Before
import org.junit.Rule
import org.junit.Test
import org.mockito.Mockito
import javax.inject.Inject

@MediumTest
@HiltAndroidTest
@ExperimentalCoroutinesApi
class ImageFragmentApiTest {

    @get:Rule
    val instantTaskExecutorRule = InstantTaskExecutorRule()

    @get:Rule
    var hiltRule = HiltAndroidRule(this)

    @Inject
    lateinit var fragmentFactory : PaintFragmentFactory

    @Before
    fun setup(){
        hiltRule.inject()
    }

    @Test
    fun testSelectImage(){

        val navController = Mockito.mock(NavController::class.java)

        val selectedImageUrl = "atilsamancioglu.com"


        val testVM = PaintViewModel(FakePaintRepositoryTest())

        launchFragmentInHiltContainer<ImageApiFragment>(
            factory = fragmentFactory
        ){
            Navigation.setViewNavController(requireView(),navController)
            viewModel = testVM
            imageRecyclerAdapter.images = listOf(selectedImageUrl)
        }

        Espresso.onView(ViewMatchers.withId(R.id.image_recyclerview)).
        perform(RecyclerViewActions.actionOnItemAtPosition<ImageRecyclerAdapter.ImageViewHolder>(0,click()))

        Mockito.verify(navController).popBackStack()

        assertThat(testVM.selectedImageUrl.getOrAwaitValueTest()).isEqualTo(selectedImageUrl)
    }
}