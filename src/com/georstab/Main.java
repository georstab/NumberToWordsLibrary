package com.georstab;

import java.math.BigDecimal;

public class Main {

    public static void main(String[] args) {

        BigDecimal input = new BigDecimal("99999999999.56");

        NumberToWordsLibrary var = new NumberToWordsLibrary(input);

        String RESULT = var.GetWords();

        System.out.println(RESULT);
    }

}


