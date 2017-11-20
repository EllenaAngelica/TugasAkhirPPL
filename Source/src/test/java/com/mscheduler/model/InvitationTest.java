/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mscheduler.model;

import java.time.Instant;
import java.util.List;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Lenovo Iyoss
 */
public class InvitationTest {
    Invitation instance;
    int meetID = 4;
    String to = "user1@ms.com";
    
    public InvitationTest() {
        instance = new Invitation(meetID,to);
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of getMeeting_id method, of class Invitation.
     */
    @Test
    public void testGetMeeting_id() {
        System.out.println("getMeeting_id");
        int expResult = meetID;
        int result = instance.getMeeting_id();
        assertEquals(expResult, result);
    }

    /**
     * Test of setMeeting_id method, of class Invitation.
     */
    @Test
    public void testSetMeeting_id() {
        System.out.println("setMeeting_id");
        int meeting_id = 0;
        Invitation instance = new Invitation();
        instance.setMeeting_id(meeting_id);
        assertEquals(meeting_id, instance.getMeeting_id());
    }

    /**
     * Test of getTo method, of class Invitation.
     */
    @Test
    public void testGetTo() {
        System.out.println("getTo");
        String expResult = this.to;
        String result = instance.getTo();
        assertEquals(expResult, result);    
    }

    /**
     * Test of setTo method, of class Invitation.
     */
    @Test
    public void testSetTo() {
        System.out.println("setTo");
        String to = "";
        Invitation instance = new Invitation();
        instance.setTo(to);
        assertEquals(to, instance.getTo());
    }

    /**
     * Test of getAvailability method, of class Invitation.
     */
    @Test
    public void testGetAvailability() {
        System.out.println("getAvailability");
        Invitation instance = new Invitation();
        List<DateRange> expResult = null;
        List<DateRange> result = instance.getAvailability();
        assertEquals(expResult, result);

    }

    /**
     * Test of setAvailability method, of class Invitation.
     */
    @Test
    public void testSetAvailability() {
        System.out.println("setAvailability");
        List<DateRange> availability = null;
        Invitation instance = new Invitation();
        instance.setAvailability(availability);

    }

    /**
     * Test of addAvailability method, of class Invitation.
     */
    @Test
    public void testAddAvailability() {
        System.out.println("addAvailability");
        DateRange availability = new DateRange("16/04/2017 07 - 21/04/2017 11");
        Invitation instance = new Invitation();
        instance.addAvailability(availability);
        assertNotNull(this);
    }

    /**
     * Test of getStatus method, of class Invitation.
     */
    @Test
    public void testGetStatus() {
        System.out.println("getStatus");
        Invitation instance = new Invitation();
        InvitationStatus expResult = null;
        InvitationStatus result = instance.getStatus();
        assertEquals(expResult, result);
    }

    /**
     * Test of setStatus method, of class Invitation.
     */
    @Test
    public void testSetStatus() {
        System.out.println("setStatus");
        InvitationStatus status = InvitationStatus.confirmed;
        Invitation instance = new Invitation();
        instance.setStatus(status);
        assertEquals(status, instance.getStatus());
    }
    
}
