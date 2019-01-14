package com.georstab;

import org.junit.Test;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class IntegralToListTest {

    @Test
    public void integralToListM() {
        BigDecimal input = new BigDecimal("99.56");
        IntegralToList var = new IntegralToList(input);

        BigInteger var1 = new BigInteger("9");
        BigInteger var2 = new BigInteger("9");

        List<BigInteger> actual = var.integralToListM();

        List<BigInteger> expected = new ArrayList<>();
        expected.add(var1);
        expected.add(var2);

        assertEquals(actual,expected);

    }
}