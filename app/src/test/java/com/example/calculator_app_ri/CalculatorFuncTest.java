package com.example.calculator_app_ri;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CalculatorFuncTest {


    @Test
    public void check_if_number_is_zero(){
        final String givenString = "0";

        final Boolean expectedResult = true;
        final Boolean actualResult = CalculatorFunctions.numberIsZero(givenString);

        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void check_if_minus_is_presented() {
        final String givenString = "666";

        final Boolean expectedResult = false;
        final Boolean actualResult = CalculatorFunctions.minusIsPresent(givenString);

        assertEquals(expectedResult, actualResult);
    }

}
