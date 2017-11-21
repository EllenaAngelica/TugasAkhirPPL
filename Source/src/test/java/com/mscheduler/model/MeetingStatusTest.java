/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mscheduler.model;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * 
 * @author
 * Ellena Angelica (2015730029)
 * Billy Adiwijaya (2015730053)
 * Yosua (2015730067)
 */
public class MeetingStatusTest {
    
    public MeetingStatusTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of values method, of class MeetingStatus.
     */
    @Test
    public void testValues() {
        System.out.println("values");
        MeetingStatus[] expResult = {MeetingStatus.negotiating,MeetingStatus.canceled,MeetingStatus.confirmed,MeetingStatus.running,MeetingStatus.finished};
        MeetingStatus[] result = MeetingStatus.values();
        assertArrayEquals(expResult, result);
    }

    /**
     * Test of valueOf method, of class MeetingStatus.
     */
//    @Test
//    public void testValueOf() {
//        System.out.println("valueOf");
//        String name = "";
//        MeetingStatus expResult = null;
//        MeetingStatus result = MeetingStatus.valueOf(name);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
    
}
