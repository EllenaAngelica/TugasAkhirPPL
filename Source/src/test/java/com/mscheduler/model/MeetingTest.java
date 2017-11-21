/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mscheduler.model;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
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
public class MeetingTest {
    int id;
    String title;
    String agenda;
    String location;
    int duration;
    Date proposed_date_start;
    Date proposed_date_end;
    DateRange proposed_date_range;
    Date negotiation_deadline;
    List<String> participants;
    List<String> important_participants;
    MeetingStatus status;
    Date agreed_time_date_start;
    Date agreed_time_date_end;
    DateRange agreed_time;
    boolean pastDeadline;
    Meeting instance;
    
    public MeetingTest() {
        id = 1;
        title = "Negotiating";
        agenda = "Negotiating how much new workers will be paid.";
        location = "Meeting room";
        duration = 4;
        proposed_date_start = new Date(2017, 5, 30);
        proposed_date_end = new Date(2017, 6, 1);
        proposed_date_range = new DateRange(proposed_date_start, proposed_date_end);
        negotiation_deadline = new Date(2017, 6, 2);
        participants = Arrays.asList("people1", "people2", "people3");
        important_participants = Arrays.asList("vip1", "vip2", "vip3");
        status = MeetingStatus.negotiating;
        agreed_time_date_start = new Date(2017, 6, 3);
        agreed_time_date_end = new Date(2017, 6, 4);
        agreed_time = new DateRange(agreed_time_date_start, agreed_time_date_end);
        pastDeadline = false;
        instance = new Meeting(id, title, agenda, location, duration, proposed_date_range, negotiation_deadline, participants, important_participants, status, agreed_time, pastDeadline);
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of toString method, of class Meeting.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
        String expResult = "ID : " + this.id + "\n"
                + "Title : " + this.title + "\n"
                + "Agenda : " + this.agenda + "\n"
                + "Location : " + this.location + "\n"
                + "Duration : " + this.duration + " hours\n"
                + "Proposed Date Range : " + df.format(this.proposed_date_start) + " - " + df.format(this.proposed_date_end)+"\n"
                + "Negotiation Deadline : " + df.format(this.negotiation_deadline)+"\n"
                + "Status : " + this.status+"\n"
                + "Agreed Time : " + this.agreed_time_date_start + " - " + this.agreed_time_date_end +"\n";
        String result = instance.toString();
        assertEquals(expResult, result);
    }

    /**
     * Test of isPastDeadline method, of class Meeting.
     */
    @Test
    public void testIsPastDeadline() {
        System.out.println("isPastDeadline");
        Meeting instance = new Meeting();
        boolean expResult = false;
        boolean result = instance.isPastDeadline();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isImportantParticipant method, of class Meeting.
     */
    @Test
    public void testIsImportantParticipant() {
        System.out.println("isImportantParticipant");
        String email = "";
        Meeting instance = new Meeting();
        boolean expResult = false;
        boolean result = instance.isImportantParticipant(email);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isNormalParticipant method, of class Meeting.
     */
    @Test
    public void testIsNormalParticipant() {
        System.out.println("isNormalParticipant");
        String email = "";
        Meeting instance = new Meeting();
        boolean expResult = false;
        boolean result = instance.isNormalParticipant(email);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getId method, of class Meeting.
     */
    @Test
    public void testGetId() {
        System.out.println("getId");
        Meeting instance = new Meeting();
        int expResult = 0;
        int result = instance.getId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setId method, of class Meeting.
     */
    @Test
    public void testSetId() {
        System.out.println("setId");
        int id = 0;
        Meeting instance = new Meeting();
        instance.setId(id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTitle method, of class Meeting.
     */
    @Test
    public void testGetTitle() {
        System.out.println("getTitle");
        Meeting instance = new Meeting();
        String expResult = "";
        String result = instance.getTitle();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTitle method, of class Meeting.
     */
    @Test
    public void testSetTitle() {
        System.out.println("setTitle");
        String title = "";
        Meeting instance = new Meeting();
        instance.setTitle(title);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAgenda method, of class Meeting.
     */
    @Test
    public void testGetAgenda() {
        System.out.println("getAgenda");
        Meeting instance = new Meeting();
        String expResult = "";
        String result = instance.getAgenda();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPastDeadline method, of class Meeting.
     */
    @Test
    public void testGetPastDeadline() {
        System.out.println("getPastDeadline");
        Meeting instance = new Meeting();
        Boolean expResult = null;
        Boolean result = instance.getPastDeadline();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPastDeadline method, of class Meeting.
     */
    @Test
    public void testSetPastDeadline() {
        System.out.println("setPastDeadline");
        Boolean pastDeadline = null;
        Meeting instance = new Meeting();
        instance.setPastDeadline(pastDeadline);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setAgenda method, of class Meeting.
     */
    @Test
    public void testSetAgenda() {
        System.out.println("setAgenda");
        String agenda = "";
        Meeting instance = new Meeting();
        instance.setAgenda(agenda);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getLocation method, of class Meeting.
     */
    @Test
    public void testGetLocation() {
        System.out.println("getLocation");
        Meeting instance = new Meeting();
        String expResult = "";
        String result = instance.getLocation();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setLocation method, of class Meeting.
     */
    @Test
    public void testSetLocation() {
        System.out.println("setLocation");
        String location = "";
        Meeting instance = new Meeting();
        instance.setLocation(location);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDuration method, of class Meeting.
     */
    @Test
    public void testGetDuration() {
        System.out.println("getDuration");
        Meeting instance = new Meeting();
        int expResult = 0;
        int result = instance.getDuration();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDuration method, of class Meeting.
     */
    @Test
    public void testSetDuration() {
        System.out.println("setDuration");
        int duration = 0;
        Meeting instance = new Meeting();
        instance.setDuration(duration);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getProposed_date_range method, of class Meeting.
     */
    @Test
    public void testGetProposed_date_range() {
        System.out.println("getProposed_date_range");
        Meeting instance = new Meeting();
        DateRange expResult = null;
        DateRange result = instance.getProposed_date_range();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setProposed_date_range method, of class Meeting.
     */
    @Test
    public void testSetProposed_date_range() {
        System.out.println("setProposed_date_range");
        DateRange proposed_date_range = null;
        Meeting instance = new Meeting();
        instance.setProposed_date_range(proposed_date_range);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNegotiation_deadline method, of class Meeting.
     */
    @Test
    public void testGetNegotiation_deadline() {
        System.out.println("getNegotiation_deadline");
        Meeting instance = new Meeting();
        Date expResult = null;
        Date result = instance.getNegotiation_deadline();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNegotiation_deadline method, of class Meeting.
     */
    @Test
    public void testSetNegotiation_deadline() {
        System.out.println("setNegotiation_deadline");
        Date negotiation_deadline = null;
        Meeting instance = new Meeting();
        instance.setNegotiation_deadline(negotiation_deadline);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getParticipants method, of class Meeting.
     */
    @Test
    public void testGetParticipants() {
        System.out.println("getParticipants");
        Meeting instance = new Meeting();
        List<String> expResult = null;
        List<String> result = instance.getParticipants();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setParticipants method, of class Meeting.
     */
    @Test
    public void testSetParticipants() {
        System.out.println("setParticipants");
        List<String> participants = null;
        Meeting instance = new Meeting();
        instance.setParticipants(participants);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getImportant_participants method, of class Meeting.
     */
    @Test
    public void testGetImportant_participants() {
        System.out.println("getImportant_participants");
        Meeting instance = new Meeting();
        List<String> expResult = null;
        List<String> result = instance.getImportant_participants();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setImportant_participants method, of class Meeting.
     */
    @Test
    public void testSetImportant_participants() {
        System.out.println("setImportant_participants");
        List<String> important_participants = null;
        Meeting instance = new Meeting();
        instance.setImportant_participants(important_participants);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getStatus method, of class Meeting.
     */
    @Test
    public void testGetStatus() {
        System.out.println("getStatus");
        Meeting instance = new Meeting();
        MeetingStatus expResult = null;
        MeetingStatus result = instance.getStatus();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setStatus method, of class Meeting.
     */
    @Test
    public void testSetStatus() {
        System.out.println("setStatus");
        MeetingStatus status = null;
        Meeting instance = new Meeting();
        instance.setStatus(status);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAgreed_time method, of class Meeting.
     */
    @Test
    public void testGetAgreed_time() {
        System.out.println("getAgreed_time");
        Meeting instance = new Meeting();
        DateRange expResult = null;
        DateRange result = instance.getAgreed_time();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setAgreed_time method, of class Meeting.
     */
    @Test
    public void testSetAgreed_time() {
        System.out.println("setAgreed_time");
        DateRange agreed_time = null;
        Meeting instance = new Meeting();
        instance.setAgreed_time(agreed_time);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
