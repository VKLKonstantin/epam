package com.company;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;


public class MainTest {
    @Test
    public void action() {
        Main check = new Main(4, 5, 6);

        int result = check.formula(4, 5, 6);
        assertThat(result, is(8));

    }
}