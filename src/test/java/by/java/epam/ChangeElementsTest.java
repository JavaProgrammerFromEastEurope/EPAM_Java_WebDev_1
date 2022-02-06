package by.java.epam;

import by.java.epam.application.utils.Maths;
import org.junit.jupiter.api.Test;
import java.util.Arrays;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class ChangeElementsTest {

    /** Test arrays **/
    final Object[] array =  {3, 4, 1, 2, 7, 6};
    final Object[] modded = {3, 1, 7};

    @Test
    void changeArrayTest(){
        assertThat(Arrays.equals(
            Maths.changeArrayElements(array), modded)).isEqualTo(true);
    }
}
