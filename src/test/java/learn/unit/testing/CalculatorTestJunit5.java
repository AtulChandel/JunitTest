package learn.unit.testing;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTestJunit5 {



    @BeforeAll
    public static void init(){
        System.out.println("This is init method...");
    }

    @AfterAll
    public static void cleanup(){
        System.out.println("This is cleanup method...");
    }

    @BeforeEach
    public void beforeEach(TestInfo testInfo){
        System.out.println("This is before execution of "+ testInfo.getDisplayName());
    }

    @AfterEach
    public void afterEach(TestInfo testInfo){
        System.out.println("This is after execution of "+ testInfo.getDisplayName());
    }
    @Test
    public void SumTwoNumberTest(){
        System.out.println("Running SumTwoNumberTest....");
        int result = Calculator.SumTwoNumber(5,10);
        assertEquals(15, result);
    }

    @Test
    public void DifferenceTwoNumberTest(){
        System.out.println("Running DifferenceTwoNumberTest...");
        int result = Calculator.DifferenceTwoNumber(10,5);
        assertEquals(5, result);
    }

    @Test
    public void MultipleTwoNumberTest(){
        System.out.println("Running MultipleTwoNumberTest...");
        int result = Calculator.MultipleTwoNumber(4, 3);
        assertEquals(12, result);
    }

    @Test
    public void DivisionTwoNumberTest(){
        System.out.println("Running DivisionTwoNumberTest...");
        int result = Calculator.DivisionTwoNumber(15, 3);
        assertEquals(5, result);
    }

    @Test
    public void SumAnyNumberTest(){
        System.out.println("Running SumAnyNumberTest...");
        int result = Calculator.sumAnyNumber(2,3,4,5);
        assertEquals(14, result);
    }
}
