package study;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;


class CalculatorTest {

    @Test
    void splitStringWithCommaTest(){
        String testStr = "1,2";
        assertThat(Calculator.myParser(testStr)).contains(1,2);
    }
    @Test
    void splitStringEndWithCommaTest(){
        String testStr = "1,";
        assertThat(Calculator.myParser(testStr)).contains(1);
    }
    @Test
    void splitStringWithParenthesesTest(){
        String testStr = "(1,2)";
        assertThat(Calculator.removeParenthesis(testStr)).isEqualTo("1,2");
    }

    @Test
    void getCharIndexFromStringThrowStringIndexOutOfBoundsExceptionTest(){
        String testStr = "abc";
        assertThatThrownBy(()-> Calculator.myCharAt(testStr, 's'))
                .isInstanceOf(IndexOutOfBoundsException.class)
        ;
    }

}