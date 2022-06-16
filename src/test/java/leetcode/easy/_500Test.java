package leetcode.easy;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class _500Test {
    @Test
    @DisplayName("입력값 대문자 소문자 혼용")
    void testCase1() {
        // given
        String[] words = {"Hello", "Alaska", "Dad", "Peace"};

        String[] compareResult = {"Alaska", "Dad"};

        _500 object = new _500();

        // when
        String[] result = object.solution(words);

        // then
        assertThat(result).isEqualTo(compareResult);
    }

    @Test
    @DisplayName("return배열에 아무값도 없어야함")
    void testCase2() {
        // given
        String[] words = {"omk"};

        String[] compareResult = {};

        _500 object = new _500();

        // when
        String[] result = object.solution(words);

        // then
        assertThat(result).isEqualTo(compareResult);
    }

    @Test
    void testCase3() {
        // given
        String[] words = {"adsdf", "sfd"};

        String[] compareResult = {"adsdf", "sfd"};

        _500 object = new _500();

        // when
        String[] result = object.solution(words);

        // then
        assertThat(result).isEqualTo(compareResult);
    }
}