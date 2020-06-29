package linear_programs;

import by.constantinVKLcorporation.module_01.linear_program.Forth;
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