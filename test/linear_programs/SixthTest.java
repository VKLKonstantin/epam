package linear_programs;

import by.constantinVKLcorporation.module_01.linear_program.Sixth;
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