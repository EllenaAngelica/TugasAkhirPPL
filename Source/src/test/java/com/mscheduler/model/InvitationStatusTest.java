package com.mscheduler.model;

import junit.framework.TestCase;

/**
 *
 * @author
 * Ellena Angelica (2015730029)
 * Billy Adiwijaya (2015730053)
 * Yosua (2015730067)
 */
public class InvitationStatusTest extends TestCase {
    
    public InvitationStatusTest(String testName) {
        super(testName);
    }

    /**
     * Test of values method, of class InvitationStatus.
     */
    public void testValues() {
        System.out.println("values");
        InvitationStatus[] expResult = null;
        InvitationStatus[] result = InvitationStatus.values();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of valueOf method, of class InvitationStatus.
     */
    public void testValueOf() {
        System.out.println("valueOf");
        String name = "";
        InvitationStatus expResult = null;
        InvitationStatus result = InvitationStatus.valueOf(name);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
