package com.mscheduler.model;

import junit.framework.TestCase;

/**
 *
 * @author
 * Ellena Angelica (2015730029)
 * Billy Adiwijaya (2015730053)
 * Yosua (2015730067)
 */
public class ListMeetingViewModelTest extends TestCase {
    
    public ListMeetingViewModelTest(String testName) {
        super(testName);
    }

    /**
     * Test of getMeeting_id method, of class ListMeetingViewModel.
     */
    public void testGetMeeting_id() {
        System.out.println("getMeeting_id");
        ListMeetingViewModel instance = null;
        int expResult = 0;
        int result = instance.getMeeting_id();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setMeeting_id method, of class ListMeetingViewModel.
     */
    public void testSetMeeting_id() {
        System.out.println("setMeeting_id");
        int meeting_id = 0;
        ListMeetingViewModel instance = null;
        instance.setMeeting_id(meeting_id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMeeting_title method, of class ListMeetingViewModel.
     */
    public void testGetMeeting_title() {
        System.out.println("getMeeting_title");
        ListMeetingViewModel instance = null;
        String expResult = "";
        String result = instance.getMeeting_title();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setMeeting_title method, of class ListMeetingViewModel.
     */
    public void testSetMeeting_title() {
        System.out.println("setMeeting_title");
        String meeting_title = "";
        ListMeetingViewModel instance = null;
        instance.setMeeting_title(meeting_title);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMeeting_status method, of class ListMeetingViewModel.
     */
    public void testGetMeeting_status() {
        System.out.println("getMeeting_status");
        ListMeetingViewModel instance = null;
        MeetingStatus expResult = null;
        MeetingStatus result = instance.getMeeting_status();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setMeetingStatus method, of class ListMeetingViewModel.
     */
    public void testSetMeetingStatus() {
        System.out.println("setMeetingStatus");
        MeetingStatus meeting_status = null;
        ListMeetingViewModel instance = null;
        instance.setMeetingStatus(meeting_status);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
