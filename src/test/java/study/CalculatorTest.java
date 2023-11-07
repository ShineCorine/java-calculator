package study;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;


class CalculatorTest {

    @DisplayName("','로 구분된 숫자를 분리하는 메서드 테스트")
    @Test
    void splitStringWithCommaTest(){
        String testStr = "1,2";
        assertThat(Calculator.myParser(testStr)).contains(1,2);
    }

    @DisplayName("','로 끝나는 문자열도 올바르게 끝나는지 테스트")
    @Test
    void splitStringEndWithCommaTest(){
        String testStr = "1,";
        assertThat(Calculator.myParser(testStr)).containsExactly(1);
    }

    @DisplayName("문자열에서 괄호를 제거하는 메서드 테스트")
    @Test
    void splitStringWithParenthesesTest(){
        String testStr = "(1,2)";
        assertThat(Calculator.removeParenthesis(testStr)).isEqualTo("1,2");
    }

    @DisplayName("IndexOutOfBoundException이 제대로 일어나는지 확인하는 테스트")
    @Test
    void getCharIndexFromStringThrowStringIndexOutOfBoundsExceptionTest(){
        String testStr = "abc";
        assertThatThrownBy(()-> Calculator.myCharAt(testStr, 4))
                .isInstanceOf(IndexOutOfBoundsException.class)
        ;
    }

}