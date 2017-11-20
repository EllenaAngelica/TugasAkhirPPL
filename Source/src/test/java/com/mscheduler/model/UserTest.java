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
 * @author
 * Ellena Angelica (2015730029)
 * Billy Adiwijaya (2015730053)
 * Yosua (2015730067)
 */
public class UserTest {
    User instance;
    
    public UserTest() {
        instance = new User("email@gmail.com");
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
        String expResult = "email@gmail.com";
        String result = instance.getEmail();
        assertEquals(expResult, result);
    }

    /**
     * Test of setEmail method, of class User.
     */
    @Test
    public void testSetEmail() {
        System.out.println("setEmail");
        String email = "change@gmail.com";
        instance.setEmail(email);
        assertEquals(email, instance.getEmail());
    }

    /**
     * Test of getPassword method, of class User.
     */
    @Test
    public void testGetPassword() {
        System.out.println("getPassword");
        String expResult = "";
        String result = instance.getPassword();
        assertEquals(expResult, result);
    }

    /**
     * Test of setPassword method, of class User.
     */
    @Test
    public void testSetPassword() {
        System.out.println("setPassword");
        String password = "password";
        instance.setPassword(password);
        assertEquals(password, instance.getPassword());
    }

    /**
     * Test of getName method, of class User.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        String expResult = "";
        String result = instance.getName();
        assertEquals(expResult, result);
    }

    /**
     * Test of setName method, of class User.
     */
    @Test
    public void testSetName() {
        System.out.println("setName");
        String name = "user";
        User instance = new User();
        instance.setName(name);
        assertEquals(name, instance.getName());
    }

    /**
     * Test of isIsAdmin method, of class User.
     */
    @Test
    public void testIsIsAdmin() {
        System.out.println("isIsAdmin");
        boolean expResult = false;
        boolean result = instance.isIsAdmin();
        assertEquals(expResult, result);
    }

    /**
     * Test of setIsAdmin method, of class User.
     */
    @Test
    public void testSetIsAdmin() {
        System.out.println("setIsAdmin");
        boolean isAdmin = true;
        instance.setIsAdmin(isAdmin);
        assertEquals(true, instance.isIsAdmin());
    }

    /**
     * Test of saving method, of class User.
     */
    @Test
    public void testSaving() {
        System.out.println("saving");
        boolean expResult = true;
        boolean result = instance.saving();
        assertEquals(expResult, result);
    }

    /**
     * Test of readUser method, of class User.
     */
    @Test
    public void testReadUser() {
        System.out.println("readUser");
        String expResult = "";
        String result = instance.readUser().getEmail();
        assertEquals(expResult, result);
    }

    /**
     * Test of BooleanReadUser method, of class User.
     */
    @Test
    public void testBooleanReadUser() {
        System.out.println("BooleanReadUser");
        System.out.println("Case 1 : User tidak ada");
        String input1 = "xyz@gmail.com";
        boolean expResult1 = false;
        boolean result1 = instance.BooleanReadUser(input1);
        assertEquals(expResult1, result1);
        System.out.println("Case 2 : User ada");
        String input2 = "xyz@gmail.com";
        boolean expResult2 = true;
        boolean result2 = instance.BooleanReadUser(input2);
        assertEquals(expResult2, result2);
    }

    /**
     * Test of BooleanReadPass method, of class User.
     */
    @Test
    public void testBooleanReadPass() {
        System.out.println("BooleanReadPass");
        String email = "admin@ms.com";
        String input = "admin";
        boolean expResult = true;
        boolean result = instance.BooleanReadPass(email, input);
        assertEquals(expResult, result);
    }

    /**
     * Test of readUserOne method, of class User.
     */
    @Test
    public void testReadUserOne() {
        System.out.println("readUserOne");
        String email = "user2@ms.com";
        User expResult = new User("user2@ms.com");
        User result = instance.readUserOne(email);
        assertEquals(expResult, result);
    }

    /**
     * Test of encr method, of class User.
     */
    @Test
    public void testEncr() {
        System.out.println("encr");
        String text = "admin";
        String expResult = "21232f297a57a5a743894a0e4a801fc3";
        String result = instance.encr(text);
        assertEquals(expResult, result);
    }

    /**
     * Test of checkLoginDb method, of class User.
     */
    @Test
    public void testCheckLoginDb() {
        System.out.println("checkLoginDb");
        System.out.println("Case 1 : User tidak ada");
        User usr1 = new User("nothing@nothing.not");
        String expResult1 = "0";
        String result1 = instance.checkLoginDb(usr1);
        assertEquals(expResult1, result1);
        
        System.out.println("Case 2 : User ada tapi bukan admin");
        User usr2 = new User("user2@ms.com");
        String expResult2 = "1";
        String result2 = instance.checkLoginDb(usr2);
        assertEquals(expResult2, result2);
        
        System.out.println("Case 3 : User ada dan adalah admin");
        User usr3 = new User("admin@ms.com");
        String expResult3 = "2";
        String result3 = instance.checkLoginDb(usr3);
        assertEquals(expResult3, result3);
    }

    /**
     * Test of lastAdmin method, of class User.
     */
    @Test
    public void testLastAdmin() {
        System.out.println("lastAdmin");
        boolean expResult = true;
        boolean result = instance.lastAdmin();
        assertEquals(expResult, result);
    }

    /**
     * Test of editAll method, of class User.
     */
    @Test
    public void testEditAll() {
        System.out.println("editAll");
        User usr = new User("newEmail@new.com");
        boolean expResult = false;
        boolean result = instance.editAll(usr);
        assertEquals(expResult, result);
    }

    /**
     * Test of editOne method, of class User.
     */
    @Test
    public void testEditOne() {
        System.out.println("editOne");
        String condition = "user";
        User usr = new User("user1@ms.com");
        boolean expResult = true;
        boolean result = instance.editOne(condition, usr);
        assertEquals(expResult, result);
    }

    /**
     * Test of readAll method, of class User.
     * BELUM
     */
    @Test
    public void testReadAll() {
        System.out.println("readAll");
        String expResult = "";
        String result = instance.readAll();
        assertEquals(expResult, result);
    }

    /**
     * Test of del method, of class User.
     */
    @Test
    public void testDel() {
        System.out.println("del");
        boolean expResult = false;
        boolean result = instance.del();
        assertEquals(expResult, result);
    }

    /**
     * Test of checkdel method, of class User.
     */
    @Test
    public void testCheckdel() {
        System.out.println("checkdel");
        String Email = "user19@ms.com";
        User dihapus = new User("user19@ms.com");
        dihapus.del();
        boolean expResult = true;
        boolean result = instance.checkdel(Email);
        assertEquals(expResult, result);
    }
    
}
