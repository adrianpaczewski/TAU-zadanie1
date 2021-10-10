package zad1;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

public class CalculatorTest {

    private Calculator calculator;

    @Before
    public void setUp(){
        calculator = new Calculator();
        System.out.println("Before");
    }

    @After
    public void tearDown(){
        calculator = null;
        System.out.println("After");
    }

    @Test
    public void testAddition() {

        assertEquals(5L, calculator.calculate(3L, 2L, OperationType.ADD));

        assertEquals(100L, calculator.calculate(75L, 25L, OperationType.ADD));

        assertEquals(4500L, calculator.calculate(1750L, 2750L, OperationType.ADD));

        assertEquals(-18L, calculator.calculate(-20L, 2L, OperationType.ADD));

        assertEquals(-4L, calculator.calculate(-2L, -2L, OperationType.ADD));
    }

    @Test
    public void testSubtraction() {
        long result = calculator.calculate(6L, 2L, OperationType.SUBTRACT);

        assertEquals(4L, result);
    }

    @Test
    public void testMultiplication() {
        long result = calculator.calculate(4, 2, OperationType.MULTIPLY);

        assertEquals(8L, result);
    }

    @Test
    public void testDivision() {
        long result = calculator.calculate(8L, 2L, OperationType.DIVIDE);

        assertEquals(4L, result);
    }

    @Test
    public void throwArithmeticExceptionWhenDivideByZero() {

        assertThrows(ArithmeticException.class, () -> calculator.calculate(2L, 0L, OperationType.DIVIDE));

    }




 }
