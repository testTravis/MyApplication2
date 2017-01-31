package com.example.erezyehezkel.myapplication;


import org.junit.Test;

import static org.junit.Assert.*;
import android.content.Context;
import android.support.test.InstrumentationRegistry;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.*;

/**
 * Instrumentation test, which will execute on an Android device.
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
@RunWith(AndroidJUnit4.class)
public class ExampleInstrumentedTest {
    @Test
    public void useAppContext() throws Exception {
        // Context of the app under test.
        Context appContext = InstrumentationRegistry.getTargetContext();

        assertEquals("com.example.erezyehezkel.myapplication", appContext.getPackageName());
        
    }
        @Test
    public void addition_isCorrect1() throws Exception {
        assertEquals(4, 2 + 2);
    }
        @Test
    public void addition_isCorrect2() throws Exception {
        assertEquals(4, 2 - 2);
    }
            @Test
    public void addition_isCorrect3() throws Exception {
        assertEquals(5, 2 + 3);
    }
}



/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
