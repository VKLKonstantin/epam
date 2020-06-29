package linear_programs;

import by.constantinVKLcorporation.module_01.linear_program.First;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class FirstTest {
    @Test
    public void action() {
        First check = new First();

        int result = check.formula(4, 5, 6);
        assertThat(result, is(8));

    }
}