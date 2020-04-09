package com.sapient;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import static org.junit.Assert.*;

public class AppTest {
    private App Myapp;
    
    @Before
    public void setup() {
        Myapp = new App();
    }
	
    
    //case1 
    @Test
    public void testOne() {
        boolean count = Myapp.CheckNum(7);
        assertTrue(count == false);
    }

	//case2
    @Test
    public void testTwenty() {
        boolean count = Myapp.CheckNum(80);
        assertTrue(count == true);
    }

	//case3
    @Test
    public void testNinteen() {
        boolean count = Myapp.CheckNum(171);
        assertTrue(count == false);
    }

}
