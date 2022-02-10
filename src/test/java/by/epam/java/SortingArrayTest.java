package by.epam.java;

import by.epam.java.application.utils.Sort;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class SortingArrayTest {

    /** Test arrays **/
    final Object[] array =  {3, 4, 1, 2, 7, 6};
    final Object[] sorted = {1, 2, 3, 4, 6, 7};

    @Test
    void sortHoareTest(){
        Sort.sortHoare(array, 0, array.length-1);
        assertThat(Arrays.equals(array, sorted)).isEqualTo(true);
    }

    @Test
    void sortShellsTest(){
        Sort.sortShells(array);
        assertThat(Arrays.equals(array, sorted)).isEqualTo(true);
    }

    @Test
    void sortInsertTest(){
        Sort.sortInsert(array);
        assertThat(Arrays.equals(array, sorted)).isEqualTo(true);
    }
}
