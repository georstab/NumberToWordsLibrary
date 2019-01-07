package com.georstab;

import java.math.BigInteger;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;

public class DecimalToList {

    private List<BigInteger> listDecimal = new ArrayList<>();
    private BigDecimal Input ;
    private BigDecimal ONE = new BigDecimal("1");
    private BigDecimal ZERO = new BigDecimal("0");
    private int comparator = 1;

    public DecimalToList(BigDecimal theInput) {
        this.Input = theInput;
    }

    public List<BigInteger> DecimalToListM(){

        Input = Input.setScale(2,RoundingMode.HALF_UP);
        Input = Input.remainder(ONE);
        Input = Input.stripTrailingZeros();

        while (comparator != 0) {

            Input = Input.movePointRight(1);

            BigDecimal remainder = Input.remainder(ONE);

            listDecimal.add(Input.subtract(remainder).toBigInteger());

            Input = remainder;

            comparator = ZERO.compareTo(remainder);
        }
        return listDecimal;
    }

    //DEBUG
    public void printDecimal(){
        System.out.println(listDecimal);
    }

}
