package com.sapient;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import static org.junit.Assert.*;

public class AppTest {
    private App MyApp;
    
   
   @Before
    public void setup() {
        MyApp = new App();
    }
	
    
    //case1 
    @Test
    public void testOne() {
        boolean count = MyApp.CheckNum(7);
        assertTrue(count == false);
    }
	
	//case 2
    @Test
    public void testTwenty() {
        boolean count = MyApp.CheckNum(121);
        assertTrue(count == true);
    }
	
	
	//case3 
    @Test
    public void testNinteen() {
        boolean count = MyApp.CheckNum(100);
        assertTrue(count == false);
    }

}
