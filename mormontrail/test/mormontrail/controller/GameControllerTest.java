/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mormontrail.controller;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Chaskiel
 */
public class GameControllerTest {
    
    public GameControllerTest() {
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
    
}
