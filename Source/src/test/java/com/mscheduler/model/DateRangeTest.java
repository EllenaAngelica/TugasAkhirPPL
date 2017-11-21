<<<<<<< HEAD
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mscheduler.model;

import java.time.LocalDateTime;
=======
package com.mscheduler.model;

import java.time.LocalDateTime;
import java.time.ZoneId;
>>>>>>> 4fd4869806e02e7ff9ad226df27629265cbdcad8
import java.util.Date;
import java.util.List;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
<<<<<<< HEAD
 * @author Lenovo Iyoss
=======
 * @author
 * Ellena Angelica (2015730029)
 * Billy Adiwijaya (2015730053)
 * Yosua (2015730067)
>>>>>>> 4fd4869806e02e7ff9ad226df27629265cbdcad8
 */
public class DateRangeTest {
    
    public DateRangeTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of dateToLocalDateTime method, of class DateRange.
     */
    @Test
    public void testDateToLocalDateTime() {
        System.out.println("dateToLocalDateTime");
<<<<<<< HEAD
        Date date = null;
        DateRange instance = new DateRange();
        LocalDateTime expResult = null;
        LocalDateTime result = instance.dateToLocalDateTime(date);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
=======
        Date date = new Date(2017, 6, 5);
        DateRange instance = new DateRange();
        LocalDateTime expResult = LocalDateTime.ofInstant(date.toInstant(), ZoneId.systemDefault());
        LocalDateTime result = instance.dateToLocalDateTime(date);
        assertEquals(expResult, result);
>>>>>>> 4fd4869806e02e7ff9ad226df27629265cbdcad8
    }

    /**
     * Test of localDateTimeToDate method, of class DateRange.
     */
    @Test
    public void testLocalDateTimeToDate() {
        System.out.println("localDateTimeToDate");
<<<<<<< HEAD
        LocalDateTime ldate = null;
        DateRange instance = new DateRange();
        Date expResult = null;
        Date result = instance.localDateTimeToDate(ldate);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
=======
        Date date = new Date(2017, 6, 5);
        LocalDateTime ldate = LocalDateTime.ofInstant(date.toInstant(), ZoneId.systemDefault());;
        DateRange instance = new DateRange();
        Date expResult = Date.from(ldate.atZone(ZoneId.systemDefault()).toInstant());;
        Date result = instance.localDateTimeToDate(ldate);
        assertEquals(expResult, result);
>>>>>>> 4fd4869806e02e7ff9ad226df27629265cbdcad8
    }

    /**
     * Test of getDate_start method, of class DateRange.
     */
    @Test
    public void testGetDate_start() {
        System.out.println("getDate_start");
<<<<<<< HEAD
        DateRange instance = new DateRange();
        Date expResult = null;
        Date result = instance.getDate_start();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
=======
        Date date_start = new Date(2017, 6, 5);
        Date date_end = new Date(2017, 6, 6);
        DateRange instance = new DateRange(date_start, date_end);
        Date expResult = date_start;
        Date result = instance.getDate_start();
        assertEquals(expResult, result);
>>>>>>> 4fd4869806e02e7ff9ad226df27629265cbdcad8
    }

    /**
     * Test of setDate_start method, of class DateRange.
     */
    @Test
    public void testSetDate_start() {
        System.out.println("setDate_start");
<<<<<<< HEAD
        Date date_start = null;
        DateRange instance = new DateRange();
        instance.setDate_start(date_start);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
=======
        Date new_date_start = new Date(2017, 6, 4);
        Date date_start = new Date(2017, 6, 5);
        Date date_end = new Date(2017, 6, 6);
        DateRange instance = new DateRange(date_start, date_end);
        instance.setDate_start(date_start);
        assertEquals(new_date_start, instance.getDate_start());
>>>>>>> 4fd4869806e02e7ff9ad226df27629265cbdcad8
    }

    /**
     * Test of getDate_end method, of class DateRange.
     */
    @Test
    public void testGetDate_end() {
        System.out.println("getDate_end");
<<<<<<< HEAD
        DateRange instance = new DateRange();
        Date expResult = null;
        Date result = instance.getDate_end();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
=======
        Date date_start = new Date(2017, 6, 5);
        Date date_end = new Date(2017, 6, 6);
        DateRange instance = new DateRange(date_start, date_end);
        Date expResult = date_end;
        Date result = instance.getDate_end();
        assertEquals(expResult, result);
>>>>>>> 4fd4869806e02e7ff9ad226df27629265cbdcad8
    }

    /**
     * Test of setDate_end method, of class DateRange.
     */
    @Test
    public void testSetDate_end() {
        System.out.println("setDate_end");
<<<<<<< HEAD
        Date date_end = null;
        DateRange instance = new DateRange();
        instance.setDate_end(date_end);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
=======
        Date new_date_end = new Date(2017, 6, 7);
        Date date_start = new Date(2017, 6, 5);
        Date date_end = new Date(2017, 6, 6);
        DateRange instance = new DateRange(date_start, date_end);
        instance.setDate_end(date_end);
        assertEquals(new_date_end, instance.getDate_end());
>>>>>>> 4fd4869806e02e7ff9ad226df27629265cbdcad8
    }

    /**
     * Test of localDateStart method, of class DateRange.
     */
    @Test
    public void testLocalDateStart() {
        System.out.println("localDateStart");
<<<<<<< HEAD
        DateRange instance = new DateRange();
        LocalDateTime expResult = null;
        LocalDateTime result = instance.localDateStart();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
=======
        Date date_start = new Date(2017, 6, 5);
        Date date_end = new Date(2017, 6, 6);
        DateRange instance = new DateRange(date_start, date_end);
        LocalDateTime expResult = LocalDateTime.ofInstant(date_start.toInstant(), ZoneId.systemDefault());
        LocalDateTime result = instance.localDateStart();
        assertEquals(expResult, result);
>>>>>>> 4fd4869806e02e7ff9ad226df27629265cbdcad8
    }

    /**
     * Test of setLocalDate_start method, of class DateRange.
     */
    @Test
    public void testSetLocalDate_start() {
        System.out.println("setLocalDate_start");
<<<<<<< HEAD
        LocalDateTime date_start = null;
        DateRange instance = new DateRange();
        instance.setLocalDate_start(date_start);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
=======
        Date date_start = new Date(2017, 6, 5);
        DateRange instance = new DateRange();
        LocalDateTime ldt_date_start = LocalDateTime.ofInstant(date_start.toInstant(), ZoneId.systemDefault());
        instance.setLocalDate_start(ldt_date_start);
        assertEquals(ldt_date_start, instance.localDateStart());
>>>>>>> 4fd4869806e02e7ff9ad226df27629265cbdcad8
    }

    /**
     * Test of localDateEnd method, of class DateRange.
     */
    @Test
    public void testLocalDateEnd() {
        System.out.println("localDateEnd");
<<<<<<< HEAD
        DateRange instance = new DateRange();
        LocalDateTime expResult = null;
        LocalDateTime result = instance.localDateEnd();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
=======
        System.out.println("setLocalDate_start");
        Date date_start = new Date(2017, 6, 5);
        Date date_end = new Date(2017, 6, 6);
        DateRange instance = new DateRange(date_start, date_end);
        LocalDateTime expResult = LocalDateTime.ofInstant(date_end.toInstant(), ZoneId.systemDefault());;
        LocalDateTime result = instance.localDateEnd();
        assertEquals(expResult, result);
>>>>>>> 4fd4869806e02e7ff9ad226df27629265cbdcad8
    }

    /**
     * Test of setLocalDate_end method, of class DateRange.
     */
    @Test
    public void testSetLocalDate_end() {
        System.out.println("setLocalDate_end");
<<<<<<< HEAD
        LocalDateTime date_end = null;
        DateRange instance = new DateRange();
        instance.setLocalDate_end(date_end);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

=======
        Date date_end = new Date(2017, 6, 5);
        DateRange instance = new DateRange();
        LocalDateTime ldt_date_end = LocalDateTime.ofInstant(date_end.toInstant(), ZoneId.systemDefault());
        instance.setLocalDate_end(ldt_date_end);
        assertEquals(ldt_date_end, instance.localDateEnd());
    }

    //=============================BAWAH BELUM
>>>>>>> 4fd4869806e02e7ff9ad226df27629265cbdcad8
    /**
     * Test of length method, of class DateRange.
     */
    @Test
    public void testLength() {
        System.out.println("length");
        DateRange instance = new DateRange();
        int expResult = 0;
        int result = instance.length();
        assertEquals(expResult, result);
<<<<<<< HEAD
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
=======
>>>>>>> 4fd4869806e02e7ff9ad226df27629265cbdcad8
    }

    /**
     * Test of isBetweenAny method, of class DateRange.
     */
    @Test
    public void testIsBetweenAny() {
        System.out.println("isBetweenAny");
        List<DateRange> date = null;
        DateRange instance = new DateRange();
        boolean expResult = false;
        boolean result = instance.isBetweenAny(date);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isDateRangeBetween method, of class DateRange.
     */
    @Test
    public void testIsDateRangeBetween() {
        System.out.println("isDateRangeBetween");
        DateRange date = null;
        DateRange instance = new DateRange();
        boolean expResult = false;
        boolean result = instance.isDateRangeBetween(date);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isDateBetween method, of class DateRange.
     */
    @Test
    public void testIsDateBetween() {
        System.out.println("isDateBetween");
        LocalDateTime date = null;
        DateRange instance = new DateRange();
        boolean expResult = false;
        boolean result = instance.isDateBetween(date);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class DateRange.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        DateRange instance = new DateRange();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString2 method, of class DateRange.
     */
    @Test
    public void testToString2() {
        System.out.println("toString2");
        DateRange instance = new DateRange();
        String expResult = "";
        String result = instance.toString2();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isOverlap method, of class DateRange.
     */
    @Test
    public void testIsOverlap() {
        System.out.println("isOverlap");
        DateRange dr2 = null;
        DateRange instance = new DateRange();
        boolean expResult = false;
        boolean result = instance.isOverlap(dr2);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of mergeDate method, of class DateRange.
     */
    @Test
    public void testMergeDate() {
        System.out.println("mergeDate");
        DateRange dr = null;
        DateRange instance = new DateRange();
        instance.mergeDate(dr);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isOverlapAny method, of class DateRange.
     */
    @Test
    public void testIsOverlapAny() {
        System.out.println("isOverlapAny");
        List<DateRange> conflicted_meeting_time = null;
        DateRange instance = new DateRange();
        boolean expResult = false;
        boolean result = instance.isOverlapAny(conflicted_meeting_time);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
