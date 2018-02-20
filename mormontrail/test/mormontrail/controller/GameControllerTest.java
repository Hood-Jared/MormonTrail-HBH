/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mormontrail.controller;

import org.junit.After;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;

/**
 *
 * @author Chaskiel
 */
public class GameControllerTest {
    
    public GameControllerTest() {
    }

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

    /**
     * Test of calcDailyFoodUsage method, of class GameController.
     */
    @Test
    
    
    public void testCalcDailyFoodUsage() {    
        
        System.out.println("calcDailyFoodUsage");
       
        //define inputs
        int amount = 4;
        int noPeople = 4;
        
        //
        GameController instance = new GameController();
        int expResult = 16; // define the expected output variable
        int result = instance.calcDailyFoodUsage(amount, noPeople);
       //test to see if the results returned equals the expected results
        assertEquals(expResult, result);
    
        
         //define inputs
         amount = 4;
         noPeople = 0;
        
        //
        
         expResult = -1; // define the expected output variable
         result = instance.calcDailyFoodUsage(amount, noPeople);
       //test to see if the results returned equals the expected results
        assertEquals(expResult, result);
        
        
         //define inputs
         amount = 4;
         noPeople = 8;
        
      expResult = -1; // define the expected output variable
         result = instance.calcDailyFoodUsage(amount, noPeople);
       //test to see if the results returned equals the expected results
        assertEquals(expResult, result);
        
        
        
         //define inputs
         amount = 8;
         noPeople = 1;
        
        
        
         expResult = -1; // define the expected output variable
         result = instance.calcDailyFoodUsage(amount, noPeople);
       //test to see if the results returned equals the expected results
        assertEquals(expResult, result);
        
        
        
         //define inputs
         amount = 5;
         noPeople = 1;
        
        //
        
         expResult = 5; // define the expected output variable
         result = instance.calcDailyFoodUsage(amount, noPeople);
       //test to see if the results returned equals the expected results
        assertEquals(expResult, result);
        
        
         //define inputs
         amount = 3;
         noPeople = 5;
        
        //
        
         expResult = 15; // define the expected output variable
         result = instance.calcDailyFoodUsage(amount, noPeople);
       //test to see if the results returned equals the expected results
        assertEquals(expResult, result);
        
        
         //define inputs
         amount = 5;
         noPeople = 5;
        
        //
        
         expResult = 25; // define the expected output variable
         result = instance.calcDailyFoodUsage(amount, noPeople);
       //test to see if the results returned equals the expected results
        assertEquals(expResult, result);
        
        
        
        
        
    }

	/**
	 * Tests of calcDailyTravel method, of class GameController.
	 */
	@Test
	public void test1CalcDailyTravel() {
		// Test Case 1
		int pace = 4;
		int oxenStamina = 4;
		int expResult = 16;
		int result = GameController.calcDailyTravel(pace, oxenStamina);
		assertEquals(expResult, result);
	}
    
	@Test
	public void test2CalcDailyTravel() {
		// Test Case 2
		int pace = 0;
		int oxenStamina = 4;
		int expResult = -1;
		int result = GameController.calcDailyTravel(pace, oxenStamina);
		assertEquals(expResult, result);
	}
	
	@Test
	public void test3CalcDailyTravel() {
		// Test Case 3
		int pace = 3;
		int oxenStamina = 0;
		int expResult = -1;
		int result = GameController.calcDailyTravel(pace, oxenStamina);
		assertEquals(expResult, result);
	}
	
	@Test
	public void test4CalcDailyTravel() {
		// Test Case 4
		int pace = 1;
		int oxenStamina = 5;
		int expResult = -1;
		int result = GameController.calcDailyTravel(pace, oxenStamina);
		assertEquals(expResult, result);
	}
	
	@Test
	public void test5CalcDailyTravel() {
		// Test Case 5
		int pace = 2;
		int oxenStamina = 5;
		int expResult = 10;
		int result = GameController.calcDailyTravel(pace, oxenStamina);
		assertEquals(expResult, result);
	}
	
	@Test
	public void test6CalcDailyTravel() {
		// Test Case 6
		int pace = 4;
		int oxenStamina = 3;
		int expResult = 12;
		int result = GameController.calcDailyTravel(pace, oxenStamina);
		assertEquals(expResult, result);
	}
	
	@Test
	public void test7CalcDailyTravel() {
		// Test Case 7
		int pace = 4;
		int oxenStamina = 5;
		int expResult = 20;
		int result = GameController.calcDailyTravel(pace, oxenStamina);
		assertEquals(expResult, result);
	}
}
