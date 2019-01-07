package com.georstab;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;

public class Main {

    public static void main(String[] args) {

        BigDecimal input = new BigDecimal("1056465465499329");

        IntegralListToWords dada = new IntegralListToWords(input);

        String asdd = dada.returnIntegralWords();
        System.out.println(asdd);


    }

}


