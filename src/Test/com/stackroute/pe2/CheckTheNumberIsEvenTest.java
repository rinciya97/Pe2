package com.stackroute.pe2;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CheckTheNumberIsEvenTest {
    CheckTheNumberIsEven checkEvenObject;
    @Before
    public void setUp() throws Exception {
        checkEvenObject=new CheckTheNumberIsEven();

    }

    @After
    public void tearDown() throws Exception {
        checkEvenObject=null;

    }

    @Test
    public void ReturnTrueIfEven() throws Exception {

        //Assert
        assertEquals(true,checkEvenObject.isEvenMethod(22));
    }
    @Test
    public void ReturnFalseIfOdd() throws Exception {

        //Assert
        assertEquals(false,checkEvenObject.isEvenMethod(21));
    }


}