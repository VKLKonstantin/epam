package com.company.linear_programs;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class ThirdTest {
    @Test
    public void action() {
        Third third = new Third();
        double result = third.formula(30, 90);
        assertThat(result, is(-7.030699522231104));
    }
}