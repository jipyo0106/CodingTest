package programmers.level1;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class _82612Test {

    @Test
    void testCase1() {
        // given
        int price = 3,
                money = 20,
                count = 4,
        result = 10;

        // when
        _82612 object = new _82612();
        // then
        assertThat(object.solution(price, money, count)).isEqualTo(result);
    }
}