package com.georstab;

import java.math.BigDecimal;

public class Main {

    public static void main(String[] args) {


        BigDecimal input = new BigDecimal(9999);

        IntegralListToWords dada = new IntegralListToWords(input);

        String asdd = dada.returnIntegralWords();
        System.out.println(asdd);

        IntegralToList dadda = new IntegralToList(input);
        dadda.printIntegral();

    }

}


