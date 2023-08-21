package pro.sky.skyprospringdemo7;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorServiceTest {

    private final CalculatorService calculatorService = new CalculatorService();

    @Test
    void greetings_success() {
        //Подготовка ожидаемого результата
        String expectedResult = "Добро пожаловать в калькулятор!";
        //Начало теста
        String actualResult = calculatorService.greetings();
        assertEquals(expectedResult, actualResult);
    }
    @Test
void plus_success() {
        //Подготовка входных данных
        int nam1 = 4;
        int nam2 = 2;
        //Подготовка ожидаемого результата
        String expectedResult = TestUtils.formatResult(nam1, nam2, "+", "6");
        //Начало теста
        String actualResult = calculatorService.plus(nam1, nam2);
        assertEquals(expectedResult, actualResult);
    }
    @Test
void minus_success() {
    //Подготовка входных данных
    int nam1 = 4;
    int nam2 = 2;
    //Подготовка ожидаемого результата
    String expectedResult = TestUtils.formatResult(nam1, nam2, "-", "2");
    //Начало теста
    String actualResult = calculatorService.minus(nam1, nam2);
    assertEquals(expectedResult, actualResult);
}
    @Test
    void multiply_success() {
        //Подготовка входных данных
        int nam1 = 4;
        int nam2 = 2;
        //Подготовка ожидаемого результата
        String expectedResult = TestUtils.formatResult(nam1, nam2,"*","8");
        //Начало теста
        String actualResult= calculatorService.multiply(nam1, nam2);
        assertEquals(expectedResult, actualResult);
    }
    @Test
    void divide_success() {
        //Подготовка входных данных
        int nam1 = 4;
        int nam2 = 2;
        //Подготовка ожидаемого результата
        String expectedResult = TestUtils.formatResult(nam1, nam2,"/","2.0");
        //Начало теста
        String actualResult= calculatorService.divide(nam1, nam2);
        assertEquals(expectedResult, actualResult);
    }
    @Test
    void divide_withNum2IsZero() {
        //Подготовка входных данных
        int nam1 = 4;
        int nam2 = 0;
        //Подготовка ожидаемого результата
        String expectedErrorMessage = "На ноль делить нельзя!";
        //Начало теста
        Exception exception = assertThrows(ZeroDivideException.class, () -> calculatorService.divide(nam1, nam2));
        assertEquals(expectedErrorMessage, exception.getMessage());
    }
}