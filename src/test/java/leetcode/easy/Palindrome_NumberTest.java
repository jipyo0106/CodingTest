package leetcode.easy;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class Palindrome_NumberTest {
    @Test
    void solution1_리턴값_true() {
        // given
        int x = 121;

        boolean compareResult = true;

        Palindrome_Number object = new Palindrome_Number();

        // when
        boolean result = object.solution(x);

        // then
        assertThat(result).isEqualTo(compareResult);
    }
    @Test
    void solution1_x가_마이너스일때() {
        // given
        int x = -121;

        boolean compareResult = false;

        Palindrome_Number object = new Palindrome_Number();

        // when
        boolean result = object.solution(x);

        // then
        assertThat(result).isEqualTo(compareResult);
    }
    @Test
    void solution1_x첫째자리수가_0() {
        // given
        int x = 10;

        boolean compareResult = false;

        Palindrome_Number object = new Palindrome_Number();

        // when
        boolean result = object.solution(x);

        // then
        assertThat(result).isEqualTo(compareResult);
    }
    @Test
    void solution2_리턴값_true() {
        // given
        int x = 10;

        boolean compareResult = false;

        Palindrome_Number object = new Palindrome_Number();

        // when
        boolean result = object.solution2(x);

        // then
        assertThat(result).isEqualTo(compareResult);
    }
    @Test
    void solution2_x가_마이너스일때() {
        // given
        int x = -121;

        boolean compareResult = false;

        Palindrome_Number object = new Palindrome_Number();

        // when
        boolean result = object.solution2(x);

        // then
        assertThat(result).isEqualTo(compareResult);
    }
    @Test
    void solution2_x첫째자리수가_0() {
        // given
        int x = 10;

        boolean compareResult = false;

        Palindrome_Number object = new Palindrome_Number();

        // when
        boolean result = object.solution2(x);

        // then
        assertThat(result).isEqualTo(compareResult);
    }



}