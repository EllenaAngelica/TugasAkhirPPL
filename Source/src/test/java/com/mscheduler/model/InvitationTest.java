package com.mscheduler.model;

import java.util.List;
import junit.framework.TestCase;

/**
 *
 * @author
 * Ellena Angelica (2015730029)
 * Billy Adiwijaya (2015730053)
 * Yosua (2015730067)
 */
public class InvitationTest extends TestCase {
    
    public InvitationTest(String testName) {
        super(testName);
    }

    /**
     * Test of getMeeting_id method, of class Invitation.
     */
    public void testGetMeeting_id() {
        System.out.println("getMeeting_id");
        Invitation instance = new Invitation();
        int expResult = 0;
        int result = instance.getMeeting_id();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setMeeting_id method, of class Invitation.
     */
    public void testSetMeeting_id() {
        System.out.println("setMeeting_id");
        int meeting_id = 0;
        Invitation instance = new Invitation();
        instance.setMeeting_id(meeting_id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTo method, of class Invitation.
     */
    public void testGetTo() {
        System.out.println("getTo");
        Invitation instance = new Invitation();
        String expResult = "";
        String result = instance.getTo();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTo method, of class Invitation.
     */
    public void testSetTo() {
        System.out.println("setTo");
        String to = "";
        Invitation instance = new Invitation();
        instance.setTo(to);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAvailability method, of class Invitation.
     */
    public void testGetAvailability() {
        System.out.println("getAvailability");
        Invitation instance = new Invitation();
        List<DateRange> expResult = null;
        List<DateRange> result = instance.getAvailability();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setAvailability method, of class Invitation.
     */
    public void testSetAvailability() {
        System.out.println("setAvailability");
        List<DateRange> availability = null;
        Invitation instance = new Invitation();
        instance.setAvailability(availability);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addAvailability method, of class Invitation.
     */
    public void testAddAvailability() {
        System.out.println("addAvailability");
        DateRange availability = null;
        Invitation instance = new Invitation();
        instance.addAvailability(availability);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getStatus method, of class Invitation.
     */
    public void testGetStatus() {
        System.out.println("getStatus");
        Invitation instance = new Invitation();
        InvitationStatus expResult = null;
        InvitationStatus result = instance.getStatus();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setStatus method, of class Invitation.
     */
    public void testSetStatus() {
        System.out.println("setStatus");
        InvitationStatus status = null;
        Invitation instance = new Invitation();
        instance.setStatus(status);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
