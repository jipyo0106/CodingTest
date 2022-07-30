package baekjoon;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.*;

import static org.assertj.core.api.Assertions.assertThat;

class _11365Test {
    private final ByteArrayOutputStream output = new ByteArrayOutputStream();
    private _11365 object;

    @BeforeEach
    void setUpOutputStream() {
        System.setOut(new PrintStream(output));
    }
    @AfterEach
    void resotreOutputStream() {
        System.setOut(System.out);
        output.reset();
    }

    void setInputStream(String input) {
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
    }

    @Test
    void testCase1() throws IOException {
        // given
        setInputStream("!edoc doog a tahW\n" +
                "noitacitsufbo\n" +
                "erafraw enirambus detcirtsernu yraurbeF fo tsrif eht no nigeb ot dnetni eW\n" +
                "lla sees rodroM fo drol eht ,ssertrof sih nihtiw delaecnoC\n" +
                "END");

        String compareResult = "What a good code!\n" +
                "obfustication\n" +
                "We intend to begin on the first of February unrestricted submarine warfare\n" +
                "Concealed within his fortress, the lord of Mordor sees all";

        // when
        object = new _11365();
        object.solution();

        // then
        assertThat(output.toString().trim())
                .isEqualTo(compareResult);
    }

}