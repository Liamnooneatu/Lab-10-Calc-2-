package ie.atu.calc;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CalculatorTest {
    Calculator myCalc;

    @Test
    public void testAdd() {
        myCalc = new Calculator();
        assertEquals(40, myCalc.add(20, 20));
    }


    @Test
    public void testSub() {
        myCalc = new Calculator();
        assertEquals(20, myCalc.sub(100, 80));
    }


    @Test
    public void testMultiply() {
        myCalc = new Calculator();
        assertEquals(25, myCalc.multiply(5, 5));
    }


    @Test
    public void testDivide() {
        myCalc = new Calculator();
        assertEquals(5, myCalc.divide(10, 2));
    }
}
