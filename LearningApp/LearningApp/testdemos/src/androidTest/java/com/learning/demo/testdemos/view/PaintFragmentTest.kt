package com.learning.demo.testdemos.view

import androidx.fragment.app.FragmentFactory
import androidx.navigation.NavController
import androidx.navigation.Navigation
import androidx.test.espresso.Espresso
import androidx.test.espresso.ViewAction
import androidx.test.espresso.action.ViewActions
import androidx.test.espresso.matcher.ViewMatchers
import androidx.test.filters.MediumTest
import com.learning.demo.testdemos.launchFragmentInHiltContainer
import dagger.hilt.android.testing.HiltAndroidRule
import dagger.hilt.android.testing.HiltAndroidTest
import org.junit.Before
import org.junit.Rule
import org.junit.Test
import org.mockito.Mockito
import javax.inject.Inject
import com.learning.demo.testdemos.R

@MediumTest
@HiltAndroidTest
class PaintFragmentTest {

@get:Rule
var hiltRule = HiltAndroidRule(this)

    @Inject
    lateinit var fragment:PaintFragmentFactory


    @Before
    fun setup(){
        hiltRule.inject()
    }

    @Test
    fun testPaintFragToPaintDetailFragment() {

        val navController = Mockito.mock(NavController::class.java)

            launchFragmentInHiltContainer<PaintFragment>(
                factory = fragment
            ){
                Navigation.setViewNavController(requireView(),navController)
            }

        Espresso.onView(ViewMatchers.withId(R.id.floatingActionButton)).perform(ViewActions.click())

        Mockito.verify(navController).navigate(PaintFragmentDirections.actionFirstFragmentToSecondFragment())

    }


}