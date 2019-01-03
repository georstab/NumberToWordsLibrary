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

    public DemicalToList(BigDecimal theInput) {
        this.Input = theInput;
    }

    // Needed vars
    private MathContext MC = new MathContext(10, RoundingMode.UP);
    private BigDecimal TEN = new BigDecimal("10");
    private BigDecimal ONE = new BigDecimal("1");
    private BigDecimal ZERO = new BigDecimal("0");
    private int comperator;


    // METHOD : Extracts the Decimal part of the input and stores it into the listDecimal list digit by digit
    public List<BigInteger> DecimalToList(){

        BigDecimal TheIntegral = new BigDecimal(Input.intValue());
        BigDecimal decimal = Input.subtract(TheIntegral);

        // Rounding of the decimal to 10 digits
        decimal = decimal.setScale(10, RoundingMode.DOWN);


        // Here we do the following math:
        // demical*10 - remainder to keep for example the 4 out of 0.456
        // exe. 0.456*10 = 4.56 (4.56%1 = 0.56 ) ==> 4.56 - 0.56 = 4
        do {

            decimal = decimal.multiply(TEN,MC);

            BigDecimal remainder = decimal.remainder(ONE,MC);

            listDecimal.add(decimal.subtract(remainder).toBigInteger());

            decimal = remainder;

            comperator = ZERO.compareTo(remainder);

        }while (comperator != 0);
        return listDecimal;
    }

    // METHOD : prints the elements of the listDecimal : for debugging reasons
    public void printDecimal(){
        listDecimal.forEach(System.out::println);
    }

}
