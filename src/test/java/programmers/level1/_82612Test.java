package programmers.level1;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class _82612Test {

    @Test
    void testCase1() {
        // given
        int price = 3,
                money = 20,
                count = 4;
        long compareResult = 10;

        _82612 object = new _82612();

        // when
        long result = object.solution(price, money, count);

        // then
        assertThat(result).isEqualTo(compareResult);
    }
}