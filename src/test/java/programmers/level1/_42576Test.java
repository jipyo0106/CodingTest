package programmers.level1;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class _42576Test {
    @Test
    void testCase1() {
        // given
        String[] participant = {"leo", "kiki", "eden"};
        String[] completion = {"kiki", "eden"};

        String compareResult = "leo";

        _42576 object = new _42576();

        // when
        String result = object.solution(participant, completion);

        // then
        assertThat(result).isEqualTo(compareResult);
    }

    @Test
    void testCase2() {
        // given
        String[] participant = {"marina", "josipa", "nikola", "vinko", "filipa"};
        String[] completion = {"josipa", "filipa", "marina", "nikola"};

        String compareResult = "vinko";

        _42576 object = new _42576();

        // when
        String result = object.solution(participant, completion);

        // then
        assertThat(result).isEqualTo(compareResult);
    }

    @Test
    void testCase3() {
        // given
        String[] participant = {"mislav", "stanko", "mislav", "ana"};
        String[] completion = {"stanko", "ana", "mislav"};

        String compareResult = "mislav";

        _42576 object = new _42576();

        // when
        String result = object.solution(participant, completion);

        // then
        assertThat(result).isEqualTo(compareResult);
    }

    // 직접 만든 테스트 케이스
    @Test
    void 동명이민_2명이상4() {
        // given
        String[] participant = {"mislav", "stanko", "mislav", "ana", "xavi"};
        String[] completion = {"mislav", "stanko", "mislav", "ana"};

        String compareResult = "xavi";

        _42576 object = new _42576();

        // when
        String result = object.solution(participant, completion);

        // then
        assertThat(result).isEqualTo(compareResult);
    }

}