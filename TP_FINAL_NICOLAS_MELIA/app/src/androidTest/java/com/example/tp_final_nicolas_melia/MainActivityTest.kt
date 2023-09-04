package com.example.tp_final_nicolas_melia

import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.ext.junit.runners.AndroidJUnit4
import org.junit.Assert.*
import org.junit.Test
import org.junit.runner.RunWith
import androidx.test.espresso.Espresso
import androidx.test.espresso.ViewAction
import androidx.test.espresso.action.ViewActions
import androidx.test.espresso.matcher.ViewMatchers
import org.junit.Rule

@RunWith(AndroidJUnit4::class)
class MainActivityTest{

    @get:Rule
    var rule : ActivityScenarioRule<*> = ActivityScenarioRule(MainActivity::class.java)

    @Test
    fun mainActivityCompareWords(){
       /* Espresso.onView(
            ViewMatchers.withId(R.id.edt1)
        ).perform(
            ViewActions.typeText("hola")
        )

        Espresso.onView(
            ViewMatchers.withId(R.id.edt2)
        ).perform(
            ViewActions.typeText("hola")
        )*/

        Espresso.onView(
            ViewMatchers.withId(R.id.btn)
        ).perform(
            ViewActions.click()
        )
    }

}