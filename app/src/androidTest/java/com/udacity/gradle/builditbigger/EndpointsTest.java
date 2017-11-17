package com.udacity.gradle.builditbigger;

import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

import static junit.framework.Assert.assertEquals;

@RunWith(AndroidJUnit4.class)
public class EndpointsTest {

    @Rule
    public ActivityTestRule<MainActivity> mActivityTestRule =
            new ActivityTestRule<>(MainActivity.class);


    private String outputString;
    @Test
    public void verifyAsyncTask() throws Throwable{

        final CountDownLatch signal = new CountDownLatch(1);
        final EndpointsAsyncTask myTask = new EndpointsAsyncTask(){
            @Override
            protected void onPostExecute(String result) {
                super.onPostExecute(result);
                outputString = result;
                signal.countDown();
            }
        };
        myTask.execute(mActivityTestRule.getActivity());
        signal.await(30, TimeUnit.SECONDS);
        assertEquals(outputString!="", true);
    }
}
