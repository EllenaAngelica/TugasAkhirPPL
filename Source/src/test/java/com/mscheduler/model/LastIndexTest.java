package com.mscheduler.model;

import junit.framework.TestCase;

/**
 *
 * @author
 * Ellena Angelica (2015730029)
 * Billy Adiwijaya (2015730053)
 * Yosua (2015730067)
 */
public class LastIndexTest extends TestCase {
    
    public LastIndexTest(String testName) {
        super(testName);
    }

    /**
     * Test of getLastNo method, of class LastIndex.
     */
    public void testGetLastNo() {
        System.out.println("getLastNo");
        LastIndex instance = new LastIndex();
        int expResult = 0;
        int result = instance.getLastNo();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setLastNo method, of class LastIndex.
     */
    public void testSetLastNo() {
        System.out.println("setLastNo");
        int lastNo = 0;
        LastIndex instance = new LastIndex();
        instance.setLastNo(lastNo);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
