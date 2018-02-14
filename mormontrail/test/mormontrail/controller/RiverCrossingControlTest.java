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
public class RiverCrossingControlTest {
    
    public RiverCrossingControlTest() {
    }

    /**
     * Test of calcCrossingOfRiver method, of class RiverCrossingControl.
     */
    @Test
    public void testCalcCrossingOfRiver() {
        System.out.println("calcCrossingOfRiver");
       int weight = 300;
        int depth = 1;
      
        
        RiverCrossingControl instance = new RiverCrossingControl();
        int expResult = 3;
        int result = instance.calcCrossingOfRiver(weight, depth);
        assertEquals(expResult, result);
        
        
        
        
          weight = 99;
         depth = 2;
      
        
       
         expResult = -1;
       result = instance.calcCrossingOfRiver(weight, depth);
        assertEquals(expResult, result);
        
        
        
        
        weight = 300;
         depth = 0;
      
        
        
       expResult = -1;
         result = instance.calcCrossingOfRiver(weight, depth);
        assertEquals(expResult, result);
        
    }
    
}
