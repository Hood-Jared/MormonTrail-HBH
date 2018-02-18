/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mormontrail.controller;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author jared
 */
public class InventoryControllerTest {
    
    public InventoryControllerTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of calcInventoryUsage method, of class InventoryController.
     */
    @Test
    public void testCalcInventoryUsage() {
        System.out.println("calcInventoryUsage");
        int quantity = 101;
        int daysOfTravel = 0;
        int qtyActors = 0;
        int expResult = -1;
        int result = InventoryController.calcInventoryUsage(quantity, daysOfTravel, qtyActors);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
        
        
        
        System.out.println("calcInventoryUsage");
        quantity = 99;
        daysOfTravel = 1;
        qtyActors = 1;
        expResult = 99;
        result = InventoryController.calcInventoryUsage(quantity, daysOfTravel, qtyActors);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    //    fail("The test case is a prototype.");
        
        System.out.println("calcInventoryUsage");
        quantity = -1;
        daysOfTravel = 1;
        qtyActors = 1;
        expResult = -1;
        result = InventoryController.calcInventoryUsage(quantity, daysOfTravel, qtyActors);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    //    fail("The test case is a prototype.");
        
    
         System.out.println("calcInventoryUsage");
        quantity = 50;
        daysOfTravel = 1;
        qtyActors = 5;
        expResult = 250;
        result = InventoryController.calcInventoryUsage(quantity, daysOfTravel, qtyActors);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    //    fail("The test case is a prototype.");
        
    }
    
}
