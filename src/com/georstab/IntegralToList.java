package com.georstab;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class IntegralToList {

    private List<BigInteger> listIntegral = new ArrayList<>();
    private BigDecimal Input ;
    private BigDecimal ONE = new BigDecimal("1");
    private BigDecimal ZERO = new BigDecimal("0");
    private int comparator = 1;

    public IntegralToList(BigDecimal theInput) {
        this.Input = theInput;
    }

    public List<BigInteger> integralToListM(){

        BigDecimal TheIntegral = new BigDecimal(Input.toBigInteger());

        while (comparator !=0) {

            TheIntegral = TheIntegral.movePointLeft(1);

            BigDecimal remainder = TheIntegral.remainder(ONE);

            listIntegral.add(remainder.movePointRight(1).toBigInteger());

            TheIntegral = TheIntegral.subtract(remainder);

            comparator = ZERO.compareTo(TheIntegral);
        }
        Collections.reverse(listIntegral); return listIntegral;

    }

    // DEBUG
    public void printIntegral(){
        System.out.println(listIntegral);
    }

}
