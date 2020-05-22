package com.company.linear_programs;

import org.junit.Test;

import static org.hamcrest.core.Is.is;

import java.io.IOException;

import static org.junit.Assert.*;

public class ForthTest {

    @Test
    public void changeExperiment() throws IOException {
        Forth forth = new Forth();
        double experiment = forth.change(999.888);

        assertThat(experiment, is(888.999));
    }
}