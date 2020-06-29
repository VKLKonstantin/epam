package linear_programs;

import by.constantinVKLcorporation.module_01.linear_program.Second;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class SecondTest {

    @Test
    public void action() {
        Second check = new Second();
         double result=check.formula(1,2,3);

         assertThat(result, is(0.25));
    }
}