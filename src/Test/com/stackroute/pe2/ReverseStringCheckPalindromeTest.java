package com.stackroute.pe2;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ReverseStringCheckPalindromeTest {
    ReverseStringCheckPalindrome reverseobj;
    @Before
    public void setUp() throws Exception {
        reverseobj=new ReverseStringCheckPalindrome();
    }

    @After
    public void tearDown() throws Exception {
        reverseobj=null;
    }




    @Test
    public void TestCheckForNotPalindrome() throws Exception{

        // Assert
        assertEquals("Not Palindrome",reverseobj.CheckPalindrome("abcd"));
    }
    @Test
    public void TestCheckForPalindrome() throws Exception {
        //Assert
        assertEquals("Palindrome",reverseobj.CheckPalindrome("aba"));
    }
    @Test
    public void TestCheckForEmptyString() throws Exception {
        //Assert
        assertEquals("Empty String",reverseobj.CheckPalindrome(""));
    }
    @Test
    public void TestCheckForNull() throws Exception {
        //Assert
        assertEquals("Empty String",reverseobj.CheckPalindrome(null));
    }


}