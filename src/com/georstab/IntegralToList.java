package com.georstab;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.MathContext;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class IntegralToList {

    private List<BigInteger> listIntegral = new ArrayList<>();
    private BigDecimal theInput ;

    // Constructor
    public IntegralToList(BigDecimal theInput) {
        this.theInput = theInput;
    }

    // Needed vars
    private MathContext MC = new MathContext(10, RoundingMode.DOWN);
    private BigDecimal TEN = new BigDecimal("10");
    private BigDecimal ONE = new BigDecimal("1");
    private BigDecimal ZERO = new BigDecimal("0");
    private int comperator;

    // METHOD : Extracts the integral part of the input and stores it into the listIntegral digit by digit
    public List<BigInteger> integralToListM(){

        // input number ==> integral part
        BigDecimal TheIntegral = new BigDecimal(theInput.intValue());

        // Here we do the following math:
        // Integral/10 ==> keep remainder*10
        // exe 123/10 = 12.3 ==> keep 0.3*10 = 3
        do {
            TheIntegral = TheIntegral.divide(TEN, MC);

            BigDecimal remainder = TheIntegral.remainder(ONE, MC);

            listIntegral.add(remainder.multiply(TEN).toBigInteger());

            TheIntegral = TheIntegral.subtract(remainder);

            comperator = ZERO.compareTo(TheIntegral);

        }while (comperator !=0);
        Collections.reverse(listIntegral); return listIntegral;
    }




    // METHOD : prints the elements of the listIntegral : for debugging reasons
    public void printIntegral(){
        listIntegral.forEach(System.out::println);
    }

}
