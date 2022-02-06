package by.java.epam;

import by.java.epam.application.utils.Maths;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class FindAverageTest {

    /** Test array **/
    final Object[] array =  {1, 2, 3, 4, 5};

    @Test
    void changeArrayTest(){
        assertThat(Maths.getAverageScore(array)).isEqualTo(3);
    }
}
