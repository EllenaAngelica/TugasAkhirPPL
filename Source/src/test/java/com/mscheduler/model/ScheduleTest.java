package com.mscheduler.model;

import java.util.Arrays;
import java.util.Date;
import java.util.List;
import junit.framework.TestCase;

/**
 *
 * @author Ellena Angelica (2015730029) Billy Adiwijaya (2015730053) Yosua
 * (2015730067)
 */
public class ScheduleTest extends TestCase {
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
    Meeting meeting;

    Date date_start;
    Date date_end;
    DateRange date;
    Schedule instance;

    public ScheduleTest(String testName) {
        super(testName);
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
        meeting = new Meeting(id, title, agenda, location, duration, proposed_date_range, negotiation_deadline, participants, important_participants, status, agreed_time, pastDeadline);

        date_start = new Date(2017, 6, 5);
        date_end = new Date(2017, 6, 6);
        date = new DateRange(date_start, date_end);
        instance = new Schedule(meeting, date);
    }

    @org.junit.BeforeClass
    public static void setUpClass() throws Exception {
    }

    @org.junit.AfterClass
    public static void tearDownClass() throws Exception {
    }

    /**
     * Test of getDate method, of class Schedule.
     */
    public void testGetDate() {
        System.out.println("getDate");
        DateRange expResult = date;
        DateRange result = instance.getDate();
        assertEquals(expResult, result);
    }

    /**
     * Test of setDate method, of class Schedule.
     */
    public void testSetDate() {
        System.out.println("setDate");
        Date new_date_start = new Date(2017, 7, 5);
        Date new_date_end = new Date(2017, 7, 6);
        DateRange newDate = new DateRange(new_date_start, new_date_end);
        instance.setDate(newDate);
        assertEquals(newDate, instance.getDate());
    }

    /**
     * Test of addImportantParticipant method, of class Schedule.
     */
    public void testAddImportantParticipant() {
        System.out.println("addImportantParticipant");
        instance.addImportantParticipant();
        assertEquals(7, instance.getTotalParticipant());
    }

    /**
     * Test of addParticipant method, of class Schedule.
     */
    public void testAddParticipant() {
        System.out.println("addParticipant");
        instance.addParticipant();
        assertEquals(7, instance.getTotalParticipant());
    }

    /**
     * Test of getTotalParticipant method, of class Schedule.
     */
    public void testGetTotalParticipant() {
        System.out.println("getTotalParticipant");
        Schedule instance2 = new Schedule(meeting, date);
        int expResult = 6;
        int result = instance2.getTotalParticipant();
        assertEquals(expResult, result);
    }

    /**
     * Test of isValid method, of class Schedule.
     */
    public void testIsValid() {
        System.out.println("isValid");
        Schedule instance2 = new Schedule(meeting, date);
        boolean expResult = false;
        boolean result = instance.isValid();
        assertEquals(expResult, result);
    }

}
