package com.mscheduler.model;

import junit.framework.TestCase;

/**
 *
 * @author 
 * Ellena Angelica (2015730029)
 * Billy Adiwijaya (2015730053)
 * Yosua (2015730067)
 */
public class MeetingStatusTest extends TestCase {
    
    MeetingStatus meetingStatus;
    
    public MeetingStatusTest(String testName, MeetingStatus meetingStatus) {
        super(testName);
        this.meetingStatus = meetingStatus;
    }

    /**
     * Test of values method, of class MeetingStatus.
     */
    public void testValues() {
        System.out.println("values");
        MeetingStatus[] expResult = null;
        MeetingStatus[] result = MeetingStatus.values();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of valueOf method, of class MeetingStatus.
     */
    public void testValueOf() {
        System.out.println("valueOf");
        String name = "";
        MeetingStatus expResult = null;
        MeetingStatus result = MeetingStatus.valueOf(name);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
