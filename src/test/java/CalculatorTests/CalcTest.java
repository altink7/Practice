package CalculatorTests;

import SLM.CalculatorController;
import org.junit.Assert;
import org.junit.Test;
public class CalcTest {
    @Test
    public void testSum(){
        CalculatorController CC = new CalculatorController();
        int actual = CC.sum(1, 2);
        int expected = 3;
        Assert.assertEquals("should be 3", expected, actual);
    }
}
