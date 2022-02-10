package by.epam.java;

import by.epam.java.application.utils.Init;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class InitArrayFromFileTest {

    /** Test arrays **/
    Object[] array = {1, 3, 6, 4, 2, 5};

    @Test
    void initArrayFromFile(){
        assertThat(Arrays.equals
                (array, Init.initArrayFromFile())).isEqualTo(true);
    }
}
