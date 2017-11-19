package com.mscheduler.model;

import junit.framework.TestCase;

/**
 *
 * @author
 * Ellena Angelica (2015730029)
 * Billy Adiwijaya (2015730053)
 * Yosua (2015730067)
 */
public class ListInvitationViewModelTest extends TestCase {
    
    public ListInvitationViewModelTest(String testName) {
        super(testName);
    }

    /**
     * Test of getMeeting_id method, of class ListInvitationViewModel.
     */
    public void testGetMeeting_id() {
        System.out.println("getMeeting_id");
        ListInvitationViewModel instance = null;
        int expResult = 0;
        int result = instance.getMeeting_id();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setMeeting_id method, of class ListInvitationViewModel.
     */
    public void testSetMeeting_id() {
        System.out.println("setMeeting_id");
        int meeting_id = 0;
        ListInvitationViewModel instance = null;
        instance.setMeeting_id(meeting_id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMeeting_title method, of class ListInvitationViewModel.
     */
    public void testGetMeeting_title() {
        System.out.println("getMeeting_title");
        ListInvitationViewModel instance = null;
        String expResult = "";
        String result = instance.getMeeting_title();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setMeeting_title method, of class ListInvitationViewModel.
     */
    public void testSetMeeting_title() {
        System.out.println("setMeeting_title");
        String meeting_title = "";
        ListInvitationViewModel instance = null;
        instance.setMeeting_title(meeting_title);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getInvitation_status method, of class ListInvitationViewModel.
     */
    public void testGetInvitation_status() {
        System.out.println("getInvitation_status");
        ListInvitationViewModel instance = null;
        InvitationStatus expResult = null;
        InvitationStatus result = instance.getInvitation_status();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setInvitation_status method, of class ListInvitationViewModel.
     */
    public void testSetInvitation_status() {
        System.out.println("setInvitation_status");
        InvitationStatus invitation_status = null;
        ListInvitationViewModel instance = null;
        instance.setInvitation_status(invitation_status);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
