/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mscheduler.model;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Lenovo Iyoss
 */
public class UserTest {
    
    public UserTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of getEmail method, of class User.
     */
    @Test
    public void testGetEmail() {
        System.out.println("getEmail");
        User instance = new User();
        String expResult = "";
        String result = instance.getEmail();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setEmail method, of class User.
     */
    @Test
    public void testSetEmail() {
        System.out.println("setEmail");
        String email = "";
        User instance = new User();
        instance.setEmail(email);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPassword method, of class User.
     */
    @Test
    public void testGetPassword() {
        System.out.println("getPassword");
        User instance = new User();
        String expResult = "";
        String result = instance.getPassword();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPassword method, of class User.
     */
    @Test
    public void testSetPassword() {
        System.out.println("setPassword");
        String password = "";
        User instance = new User();
        instance.setPassword(password);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getName method, of class User.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        User instance = new User();
        String expResult = "";
        String result = instance.getName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setName method, of class User.
     */
    @Test
    public void testSetName() {
        System.out.println("setName");
        String name = "";
        User instance = new User();
        instance.setName(name);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isIsAdmin method, of class User.
     */
    @Test
    public void testIsIsAdmin() {
        System.out.println("isIsAdmin");
        User instance = new User();
        boolean expResult = false;
        boolean result = instance.isIsAdmin();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setIsAdmin method, of class User.
     */
    @Test
    public void testSetIsAdmin() {
        System.out.println("setIsAdmin");
        boolean isAdmin = false;
        User instance = new User();
        instance.setIsAdmin(isAdmin);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of saving method, of class User.
     */
    @Test
    public void testSaving() {
        System.out.println("saving");
        User instance = new User();
        boolean expResult = false;
        boolean result = instance.saving();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of readUser method, of class User.
     */
    @Test
    public void testReadUser() {
        System.out.println("readUser");
        User instance = new User();
        User expResult = null;
        User result = instance.readUser();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of BooleanReadUser method, of class User.
     */
    @Test
    public void testBooleanReadUser() {
        System.out.println("BooleanReadUser");
        String input = "";
        User instance = new User();
        boolean expResult = false;
        boolean result = instance.BooleanReadUser(input);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of BooleanReadPass method, of class User.
     */
    @Test
    public void testBooleanReadPass() {
        System.out.println("BooleanReadPass");
        String email = "";
        String input = "";
        User instance = new User();
        boolean expResult = false;
        boolean result = instance.BooleanReadPass(email, input);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of readUserOne method, of class User.
     */
    @Test
    public void testReadUserOne() {
        System.out.println("readUserOne");
        String email = "";
        User instance = new User();
        User expResult = null;
        User result = instance.readUserOne(email);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of encr method, of class User.
     */
    @Test
    public void testEncr() {
        System.out.println("encr");
        String text = "";
        User instance = new User();
        String expResult = "";
        String result = instance.encr(text);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of checkLoginDb method, of class User.
     */
    @Test
    public void testCheckLoginDb() {
        System.out.println("checkLoginDb");
        User usr = null;
        User instance = new User();
        String expResult = "";
        String result = instance.checkLoginDb(usr);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of lastAdmin method, of class User.
     */
    @Test
    public void testLastAdmin() {
        System.out.println("lastAdmin");
        User instance = new User();
        boolean expResult = false;
        boolean result = instance.lastAdmin();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of editAll method, of class User.
     */
    @Test
    public void testEditAll() {
        System.out.println("editAll");
        User usr = null;
        User instance = new User();
        boolean expResult = false;
        boolean result = instance.editAll(usr);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of editOne method, of class User.
     */
    @Test
    public void testEditOne() {
        System.out.println("editOne");
        String condition = "";
        User usr = null;
        User instance = new User();
        boolean expResult = false;
        boolean result = instance.editOne(condition, usr);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of readAll method, of class User.
     */
    @Test
    public void testReadAll() {
        System.out.println("readAll");
        User instance = new User();
        String expResult = "";
        String result = instance.readAll();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of del method, of class User.
     */
    @Test
    public void testDel() {
        System.out.println("del");
        User instance = new User();
        boolean expResult = false;
        boolean result = instance.del();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of checkdel method, of class User.
     */
    @Test
    public void testCheckdel() {
        System.out.println("checkdel");
        String Email = "";
        User instance = new User();
        boolean expResult = false;
        boolean result = instance.checkdel(Email);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
