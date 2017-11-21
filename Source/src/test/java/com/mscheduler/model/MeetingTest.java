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
                + "Agreed Time : " + this.agreed_time_date_start + " - " + this.agreed_time_date_end +"\n"
                + "Important Participant List : \n"
                + "vip1\nvip2\nvip3\n"
                + "Participant List : \n"
                + "people1\npeople2\npeople3\n";
        String result = instance.toString();
        assertEquals(expResult, result);
    }

    /**
     * Test of isPastDeadline method, of class Meeting.
     */
    @Test
    public void testIsPastDeadline() {
        System.out.println("isPastDeadline");
        boolean expResult = false;
        boolean result = instance.isPastDeadline();
        assertEquals(expResult, result);
    }

    /**
     * Test of isImportantParticipant method, of class Meeting.
     */
    @Test
    public void testIsImportantParticipant() {
        System.out.println("isImportantParticipant");
        String email = "vip1";
        boolean expResult = true;
        boolean result = instance.isImportantParticipant(email);
        assertEquals(expResult, result);
    }

    /**
     * Test of isNormalParticipant method, of class Meeting.
     */
    @Test
    public void testIsNormalParticipant() {
        System.out.println("isNormalParticipant");
        String email = "people1";
        boolean expResult = true;
        boolean result = instance.isNormalParticipant(email);
        assertEquals(expResult, result);
    }

    /**
     * Test of getId method, of class Meeting.
     */
    @Test
    public void testGetId() {
        System.out.println("getId");
        int expResult = 1;
        int result = instance.getId();
        assertEquals(expResult, result);
    }

    /**
     * Test of setId method, of class Meeting.
     */
    @Test
    public void testSetId() {
        System.out.println("setId");
        int new_id = 0;
        instance.setId(new_id);
        assertEquals(new_id, instance.getId());
    }

    /**
     * Test of getTitle method, of class Meeting.
     */
    @Test
    public void testGetTitle() {
        System.out.println("getTitle");
        String expResult = "Negotiating";
        String result = instance.getTitle();
        assertEquals(expResult, result);
    }

    /**
     * Test of setTitle method, of class Meeting.
     */
    @Test
    public void testSetTitle() {
        System.out.println("setTitle");
        String new_title = "Changed Plan";
        Meeting instance = new Meeting();
        instance.setTitle(title);
    }

    /**
     * Test of getAgenda method, of class Meeting.
     */
    @Test
    public void testGetAgenda() {
        System.out.println("getAgenda");
        String expResult = "Negotiating how much new workers will be paid.";
        String result = instance.getAgenda();
        assertEquals(expResult, result);
    }

    /**
     * Test of getPastDeadline method, of class Meeting.
     */
    @Test
    public void testGetPastDeadline() {
        System.out.println("getPastDeadline");
        Boolean expResult = false;
        Boolean result = instance.getPastDeadline();
        assertEquals(expResult, result);
    }

    /**
     * Test of setPastDeadline method, of class Meeting.
     */
    @Test
    public void testSetPastDeadline() {
        System.out.println("setPastDeadline");
        Boolean new_pastDeadline = true;
        instance.setPastDeadline(new_pastDeadline);
        assertEquals(new_pastDeadline, instance.getPastDeadline());
    }

    /**
     * Test of setAgenda method, of class Meeting.
     */
    @Test
    public void testSetAgenda() {
        System.out.println("setAgenda");
        String new_agenda = "plan B";
        instance.setAgenda(new_agenda);
        assertEquals(new_agenda, instance.getAgenda());
    }

    /**
     * Test of getLocation method, of class Meeting.
     */
    @Test
    public void testGetLocation() {
        System.out.println("getLocation");
        String expResult = "Meeting room";
        String result = instance.getLocation();
        assertEquals(expResult, result);
    }

    /**
     * Test of setLocation method, of class Meeting.
     */
    @Test
    public void testSetLocation() {
        System.out.println("setLocation");
        String new_location = "x";
        instance.setLocation(new_location);
        assertEquals(new_location, instance.getLocation());
    }

    /**
     * Test of getDuration method, of class Meeting.
     */
    @Test
    public void testGetDuration() {
        System.out.println("getDuration");
        int expResult = 4;
        int result = instance.getDuration();
        assertEquals(expResult, result);
    }

    /**
     * Test of setDuration method, of class Meeting.
     */
    @Test
    public void testSetDuration() {
        System.out.println("setDuration");
        int new_duration = 3;
        instance.setDuration(new_duration);
        assertEquals(new_duration, instance.getDuration());
    }

    /**
     * Test of getProposed_date_range method, of class Meeting.
     */
    @Test
    public void testGetProposed_date_range() {
        System.out.println("getProposed_date_range");
        DateRange expResult = this.proposed_date_range;
        DateRange result = instance.getProposed_date_range();
        assertEquals(expResult, result);
    }

    /**
     * Test of setProposed_date_range method, of class Meeting.
     */
    @Test
    public void testSetProposed_date_range() {
        System.out.println("setProposed_date_range");
        DateRange new_proposed_date_range = null;
        DateRange temp = this.proposed_date_range;
        instance.setProposed_date_range(new_proposed_date_range);
        assertEquals(new_proposed_date_range, instance.getProposed_date_range());
        instance.setProposed_date_range(temp);
    }

    /**
     * Test of getNegotiation_deadline method, of class Meeting.
     */
    @Test
    public void testGetNegotiation_deadline() {
        System.out.println("getNegotiation_deadline");
        Date expResult = this.negotiation_deadline;
        Date result = instance.getNegotiation_deadline();
        assertEquals(expResult, result);
    }

    /**
     * Test of setNegotiation_deadline method, of class Meeting.
     */
    @Test
    public void testSetNegotiation_deadline() {
        System.out.println("setNegotiation_deadline");
        Date new_negotiation_deadline = null;
        Date temp = this.negotiation_deadline;
        instance.setNegotiation_deadline(new_negotiation_deadline);
        assertEquals(new_negotiation_deadline, instance.getNegotiation_deadline());
        instance.setNegotiation_deadline(temp);
    }

    /**
     * Test of getParticipants method, of class Meeting.
     */
    @Test
    public void testGetParticipants() {
        System.out.println("getParticipants");
        List<String> expResult = this.participants;
        List<String> result = instance.getParticipants();
        assertEquals(expResult, result);
    }

    /**
     * Test of setParticipants method, of class Meeting.
     */
    @Test
    public void testSetParticipants() {
        System.out.println("setParticipants");
        List<String> new_participants = null;
        List<String> temp = this.participants;
        instance.setParticipants(new_participants);
        assertEquals(new_participants, instance.getParticipants());
        instance.setParticipants(temp);
    }

    /**
     * Test of getImportant_participants method, of class Meeting.
     */
    @Test
    public void testGetImportant_participants() {
        System.out.println("getImportant_participants");
        List<String> expResult = this.important_participants;
        List<String> result = instance.getImportant_participants();
        assertEquals(expResult, result);
    }

    /**
     * Test of setImportant_participants method, of class Meeting.
     */
    @Test
    public void testSetImportant_participants() {
        System.out.println("setImportant_participants");
        List<String> new_important_participants = null;
        List<String> temp = this.important_participants;
        instance.setImportant_participants(new_important_participants);
        assertEquals(new_important_participants, instance.getImportant_participants());
        instance.setImportant_participants(temp);
    }

    /**
     * Test of getStatus method, of class Meeting.
     */
    @Test
    public void testGetStatus() {
        System.out.println("getStatus");
        MeetingStatus expResult = this.status;
        MeetingStatus result = instance.getStatus();
        assertEquals(expResult, result);
    }

    /**
     * Test of setStatus method, of class Meeting.
     */
    @Test
    public void testSetStatus() {
        System.out.println("setStatus");
        MeetingStatus new_status = MeetingStatus.canceled;
        instance.setStatus(new_status);
        assertEquals(new_status, instance.getStatus());
    }

    /**
     * Test of getAgreed_time method, of class Meeting.
     */
    @Test
    public void testGetAgreed_time() {
        System.out.println("getAgreed_time");
        DateRange expResult = this.agreed_time;
        DateRange result = instance.getAgreed_time();
        assertEquals(expResult, result);
    }

    /**
     * Test of setAgreed_time method, of class Meeting.
     */
    @Test
    public void testSetAgreed_time() {
        System.out.println("setAgreed_time");
        DateRange new_agreed_time = null;
        DateRange temp = this.agreed_time;
        instance.setAgreed_time(new_agreed_time);
        assertEquals(new_agreed_time, instance.getAgreed_time());
        instance.setAgreed_time(temp);
    }
    
}
