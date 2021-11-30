package com.company;
import static org.junit.jupiter.api.Assertions.*;
//import org.junit.jupiter.api.Test;

import java.util.*;

class CalculatorTest {

    @org.junit.jupiter.api.Test
    void count() throws IndexOutOfBoundsException  {

        Calculator expText = new Calculator();
        boolean t;
        String s = "12+2";
        expText.setStr(s);
        t = expText.count();
        s = expText.toString();
        assertEquals(s, "14.0");

        t = false;
        s = "(9+2)/((4/2)+9)";
        expText.setStr(s);
        t = expText.count();
        s = expText.toString();
        assertEquals(s, "1.0");

    }

}




