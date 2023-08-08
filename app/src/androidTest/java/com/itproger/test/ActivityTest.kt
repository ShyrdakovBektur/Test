package com.itproger.test

import androidx.test.espresso.Espresso
import androidx.test.espresso.ViewAction
import androidx.test.espresso.ViewAssertion
import androidx.test.espresso.action.ViewActions
import androidx.test.espresso.assertion.ViewAssertions
import androidx.test.espresso.matcher.ViewMatchers
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.ext.junit.rules.ActivityScenarioRule
import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking
import org.junit.Rule
import org.junit.Test

class ActivityTest {

    @Rule
    @JvmField
    var rule: ActivityScenarioRule<MainActivity> = ActivityScenarioRule(MainActivity::class.java)

   @Test
   fun testSimpleAdd() {
       runBlocking {
           Espresso.onView(withId( R.id.edt_1)).perform(ViewActions.typeText("24"))
           Espresso.onView(withId( R.id.edt_1)).perform(ViewActions.closeSoftKeyboard())
           delay(2000)

           Espresso.onView(withId( R.id.edt_2)).perform(ViewActions.typeText("6"))
           Espresso.onView(withId( R.id.edt_2)).perform(ViewActions.closeSoftKeyboard())
           delay(2000)

           Espresso.onView(withId(R.id.btn_plus)).perform(ViewActions.click())
           delay(2000)

           Espresso.onView(withId(R.id.textView)).check(ViewAssertions.matches(ViewMatchers.withText("30")))
           delay(2000)
       }
   }

    @Test
    fun testSipmleDivide() {
        runBlocking {
            Espresso.onView(withId( R.id.edt_1)).perform(ViewActions.typeText("24"))
            Espresso.onView(withId( R.id.edt_1)).perform(ViewActions.closeSoftKeyboard())
            delay(2000)

            Espresso.onView(withId( R.id.edt_2)).perform(ViewActions.typeText("6"))
            Espresso.onView(withId( R.id.edt_2)).perform(ViewActions.closeSoftKeyboard())
            delay(2000)

            Espresso.onView(withId(R.id.btn_plus)).perform(ViewActions.click())
            delay(2000)

            Espresso.onView(withId(R.id.textView)).check(ViewAssertions.matches(ViewMatchers.withText("4")))
            delay(1000)
        }
    }

}