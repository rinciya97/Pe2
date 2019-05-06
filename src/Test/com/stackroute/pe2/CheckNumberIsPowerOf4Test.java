package com.stackroute.pe2;

import org.junit.Test;

import static org.junit.Assert.*;

public class CheckNumberIsPowerOf4Test {

    CheckNumberIsPowerOf4 checknoobject=new CheckNumberIsPowerOf4();
    @Test
    public void checkPowerOf4Method() {

        // Assert
        assertEquals("Number is power of 4",checknoobject.checkPowerOf4Method(8));
    }
    @Test
    public void checkNumberIsNotPowerOf4Method() {

        // Assert
        assertEquals("Number is not a power of 4",checknoobject.checkPowerOf4Method(20));
    }
    @Test
    public void checkIfTheNumberIs0() {

        // Assert
        assertEquals("Number is 0",checknoobject.checkPowerOf4Method(0));
    }
    @Test
    public void checkIfTheNumberIs1() {

        // Assert
        assertEquals("Number is 1",checknoobject.checkPowerOf4Method(1));
    }
}