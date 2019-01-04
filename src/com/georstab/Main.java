package com.georstab;

import java.math.BigDecimal;

public class Main {

    public static void main(String[] args) {


        BigDecimal input = new BigDecimal(123456789.56465);

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


