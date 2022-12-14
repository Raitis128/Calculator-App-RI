package com;

import androidx.test.ext.junit.runners.AndroidJUnit4;
import androidx.test.filters.MediumTest;
import androidx.test.rule.ActivityTestRule;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;

import com.example.calculator_app_ri.MainActivity;
import com.example.calculator_app_ri.R;

@MediumTest
@RunWith(AndroidJUnit4.class)
public class MainActivityUITest {

    @Rule
    public ActivityTestRule<MainActivity> activityScenarioRule
            = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void check_input_of_all_numbers() {

        onView(withId(R.id.btnOne)).perform(click());
        onView(withId(R.id.btnTwo)).perform(click());
        onView(withId(R.id.btnThree)).perform(click());
        onView(withId(R.id.btnFour)).perform(click());
        onView(withId(R.id.btnFive)).perform(click());
        onView(withId(R.id.btnSix)).perform(click());
        onView(withId(R.id.btnSeven)).perform(click());
        onView(withId(R.id.btnEight)).perform(click());
        onView(withId(R.id.btnNine)).perform(click());

        final String expectedResult = "123456789";

        onView(withId(R.id.etNumbers)).check(matches(withText(expectedResult)));
    }

    @Test
    public void multiply_func() {
        onView(withId(R.id.btnFour)).perform(click());
        onView(withId(R.id.btnEight)).perform(click());

        onView(withId(R.id.btnMultiply)).perform(click());

        onView(withId(R.id.btnThree)).perform(click());
        onView(withId(R.id.btnTwo)).perform(click());

        onView(withId(R.id.btnEquals)).perform(click());

        final String expectedResult = "1536.0";

        onView(withId(R.id.etNumbers)).check(matches(withText(expectedResult)));
    }

    @Test
    public void divide_func() {
        onView(withId(R.id.btnFour)).perform(click());
        onView(withId(R.id.btnEight)).perform(click());

        onView(withId(R.id.btnDivide)).perform(click());

        onView(withId(R.id.btnThree)).perform(click());
        onView(withId(R.id.btnTwo)).perform(click());

        onView(withId(R.id.btnEquals)).perform(click());

        final String expectedResult = "1.5";

        onView(withId(R.id.etNumbers)).check(matches(withText(expectedResult)));
    }

    @Test
    public void plus_func() {
        onView(withId(R.id.btnFour)).perform(click());
        onView(withId(R.id.btnEight)).perform(click());

        onView(withId(R.id.btnPlus)).perform(click());

        onView(withId(R.id.btnThree)).perform(click());
        onView(withId(R.id.btnTwo)).perform(click());

        onView(withId(R.id.btnEquals)).perform(click());

        final String expectedResult = "80.0";

        onView(withId(R.id.etNumbers)).check(matches(withText(expectedResult)));
    }

    @Test
    public void minus_func() {
        onView(withId(R.id.btnFour)).perform(click());
        onView(withId(R.id.btnEight)).perform(click());

        onView(withId(R.id.btnMinus)).perform(click());

        onView(withId(R.id.btnThree)).perform(click());
        onView(withId(R.id.btnTwo)).perform(click());

        onView(withId(R.id.btnEquals)).perform(click());

        final String expectedResult = "16.0";

        onView(withId(R.id.etNumbers)).check(matches(withText(expectedResult)));
    }
}
