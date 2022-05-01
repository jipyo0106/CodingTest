package programmers.level1;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class _17681Test {
    @Test
    void testCase1() {
        // given
        int n = 5;
        int arr1[] = {9, 20, 28, 18, 11},
                arr2[] = {30, 1, 21, 17, 28};
        _17681 object = new _17681();
        String compareResult[] = {"#####", "# # #", "### #", "#  ##", "#####"};

        // when
        String result[] = object.solution(n, arr1, arr2);

        // then

        assertThat(result).isEqualTo(compareResult);
    }

    @Test
    void testCase2() {
        // given
        int n = 6;
        int arr1[] = {46, 33, 33, 22, 31, 50},
                arr2[] = {27, 56, 19, 14, 14, 10};
        _17681 object = new _17681();
        String compareResult[] = {"######", "###  #", "##  ##", " #### ", " #####", "### # "};

        // when
        String result[] = object.solution(n, arr1, arr2);

        // then

        assertThat(result).isEqualTo(compareResult);
    }

}