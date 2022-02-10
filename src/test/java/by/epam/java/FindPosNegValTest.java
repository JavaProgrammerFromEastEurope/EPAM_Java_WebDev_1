package by.epam.java;

import by.epam.java.application.utils.Maths;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class FindPosNegValTest {

    /** Test array **/
    final Object[] array =  {-1, 2, -3, 4, -5};

    @Test
    void findPosValTest(){
        assertThat(Maths.countByTypeValues
            (array, true, 0, array.length-1)).isEqualTo(2);
    }

    @Test
    void findNegValTest(){
        assertThat(Maths.countByTypeValues
            (array, false, 0, array.length-1)).isEqualTo(3);
    }
}
