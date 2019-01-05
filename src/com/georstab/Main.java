package com.georstab;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;

public class Main {

    public static void main(String[] args) {

        BigDecimal input = new BigDecimal("1234567891123456789112345678911234567891.55");

       // IntegralListToWords dada = new IntegralListToWords(input);

       // String asdd = dada.returnIntegralWords();
       // System.out.println(asdd);

        IntegralToList asdasd = new IntegralToList(input);
        asdasd.integralToListM();
        System.out.println("INTEGRAL PART :");
        asdasd.printIntegral();

        DemicalToList dadda = new DemicalToList(input);
        dadda.DecimalToList();
        System.out.println("DECIMAL PART:");
        dadda.printDecimal();
        

    }

}


