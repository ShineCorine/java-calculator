package study;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;


class CalculatorTest {

    @Test
    void splitStringWithCommaTest() throws Exception{
        String testStr = "1,2";
        assertThat(Calculator.myParser(testStr)).contains(1,2);
    }
    @Test
    void splitStringEndWithCommaTest() throws Exception{
        String testStr = "1,";
        assertThat(Calculator.myParser(testStr)).contains(1);
    }
    @Test
    void splitStringWithParathesisTest() throws Exception{
        String testStr = "(1,2)";
        assertThat(Calculator.removeParathesis(testStr)).isEqualTo("1,2");
    }

    @Test
    void getCharIndexFromStringThrowStringIndexOutOfBoundsExceptionTest() throws Exception{
        String testStr = "abc";
        assertThatThrownBy(()-> Calculator.myCharAt(testStr, 's'))
                .isInstanceOf(IndexOutOfBoundsException.class)
        ;
    }

}