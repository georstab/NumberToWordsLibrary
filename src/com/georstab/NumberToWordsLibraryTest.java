package com.georstab;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class NumberToWordsLibraryTest {

    private static BigDecimal input;
    private static NumberToWordsLibrary var1;

    @BeforeClass
    public static void BeforeClass() {
        input = new BigDecimal("99.56");
        var1 = new NumberToWordsLibrary(input);
    }

    @Test
    public void getWords() {

        String var = "ninety nine Euros And fifty six Cents";
        assertEquals(var1.GetWords(), var);

    }

}