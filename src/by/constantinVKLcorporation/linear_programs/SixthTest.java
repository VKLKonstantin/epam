package by.constantinVKLcorporation.linear_programs;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class SixthTest {

    @Test
    public void coordinateCheck() {
        Sixth sixth = new Sixth();
        boolean result = sixth.coordinate(2, 2);

        assertThat(result, is(true));
    }
}