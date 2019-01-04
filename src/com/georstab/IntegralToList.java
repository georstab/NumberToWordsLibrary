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

    private MathContext MC = new MathContext(13, RoundingMode.HALF_UP);
    private BigDecimal TEN = new BigDecimal("10");
    private BigDecimal ONE = new BigDecimal("1");
    private BigDecimal ZERO = new BigDecimal("0");
    private int comperator;


    public IntegralToList(BigDecimal theInput) {
        this.theInput = theInput;
    }

    // METHOD : Extracts the integral part of the input and stores it into the listIntegral digit by digit
    public List<BigInteger> integralToListM(){

        BigDecimal TheIntegral = new BigDecimal(theInput.intValue());

        // Integral/10 ==> keep remainder*10
        // exe 123/10 = 12.3 ==> keep 0.3*10 = 3
        do {
            TheIntegral = TheIntegral.movePointLeft(1);

            BigDecimal remainder = TheIntegral.remainder(ONE);

            listIntegral.add(remainder.movePointRight(1).toBigInteger());

            TheIntegral = TheIntegral.subtract(remainder);

            comperator = ZERO.compareTo(TheIntegral);

        }while (comperator !=0);
        Collections.reverse(listIntegral); return listIntegral;

    }

    // DEBUG
    public void printIntegral(){
        System.out.println(listIntegral);
    }

}
