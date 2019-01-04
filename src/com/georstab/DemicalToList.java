package com.georstab;

import java.math.BigInteger;
import java.math.MathContext;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;

public class DemicalToList {

    private List<BigInteger> listDecimal = new ArrayList<>();
    private BigDecimal Input ;

    private BigDecimal TEN = new BigDecimal("10");
    private BigDecimal ONE = new BigDecimal("1");
    private BigDecimal ZERO = new BigDecimal("0");
    private int comperator;

    public DemicalToList(BigDecimal theInput) {
        this.Input = theInput;
    }


    // METHOD : Extracts the Decimal part of the input and stores it into the listDecimal list digit by digit
    public List<BigInteger> DecimalToList(){

        Input = Input.setScale(2,RoundingMode.HALF_UP);
        Input = Input.remainder(ONE);
        Input = Input.stripTrailingZeros();


        do {

            Input = Input.multiply(TEN);

            BigDecimal remainder = Input.remainder(ONE);

            listDecimal.add(Input.subtract(remainder).toBigInteger());

            Input = remainder;

            comperator = ZERO.compareTo(remainder);

        }while (comperator != 0);
        return listDecimal;
    }


    //DEBUG
    public void printDecimal(){
        System.out.println(listDecimal);
    }

}
