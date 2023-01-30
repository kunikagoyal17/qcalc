package com.crio.qcalc;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class StandardCalculatorTest {
    private StandardCalculator standardCalculator;

    @BeforeEach
    void setup(){
        standardCalculator = new StandardCalculator();
    }




    @Test
    @DisplayName("Test Addition of Two doubles")
    void testAdditionOperation(){
        standardCalculator.add(10.0,10.0);
        double actualResult = standardCalculator.getResult();
        Assertions.assertEquals(20.0, actualResult);
    }

    @Test
    @DisplayName("Test Substraction of Two doubles")
    void testSubtractionOperation(){
        standardCalculator.subtract(10.0,20.5);
        double actualResult = standardCalculator.getResult();
        Assertions.assertEquals(-10.5, actualResult);
    }



@Test
@DisplayName("Test Division of Two doubles")

void testDivisionOperation(){
    standardCalculator.divide(10.0, 2.0);
    double actualResult = standardCalculator.getResult();
        Assertions.assertEquals(5.0, actualResult);

}



@Test
@DisplayName("Test Multiplication of Two doubles")

void testMultiplicationOperation()
{
    standardCalculator.multiply(1.0,2.0);
    double actualResult = standardCalculator.getResult();
    Assertions.assertEquals(2.0, actualResult);
}





}
