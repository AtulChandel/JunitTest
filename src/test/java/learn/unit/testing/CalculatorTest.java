package learn.unit.testing;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    @Test
    public void SumTwoNumberTest(){
        int result = Calculator.SumTwoNumber(5,10);
        assertEquals(15, result);
    }

    @Test
    public void DifferenceTwoNumberTest(){
        int result = Calculator.DifferenceTwoNumber(10,5);
        assertEquals(5, result);
    }

    @Test
    public void MultipleTwoNumberTest(){
        int result = Calculator.MultipleTwoNumber(4, 3);
        assertEquals(12, result);
    }

    @Test
    public void DivisionTwoNumberTest(){
        int result = Calculator.DivisionTwoNumber(15, 3);
        assertEquals(5, result);
    }

    @Test
    public void SumAnyNumberTest(){
        int result = Calculator.sumAnyNumber(2,3,4,5);
        assertEquals(14, result);
    }
}
