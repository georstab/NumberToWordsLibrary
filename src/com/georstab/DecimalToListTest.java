package com.georstab;

import org.junit.Test;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class DecimalToListTest {

    @Test
    public void decimalToListM() {
        BigDecimal input = new BigDecimal("99.56");
        DecimalToList var = new DecimalToList(input);

        BigInteger var1 = new BigInteger("5");
        BigInteger var2 = new BigInteger("6");

        List<BigInteger> actual = var.DecimalToListM();

        List<BigInteger> expected = new ArrayList<>();
        expected.add(var1);
        expected.add(var2);

        assertEquals(actual,expected);
    }
}