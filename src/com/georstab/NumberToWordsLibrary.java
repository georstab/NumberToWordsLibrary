package com.georstab;

import java.math.BigDecimal;

public class NumberToWordsLibrary {
    private BigDecimal input;
    private IntegralListToWords integral;
    private DecimalListToWords decimal ;


public  NumberToWordsLibrary(BigDecimal TheInput){
    this.input = TheInput;
    integral = new IntegralListToWords(input);
    decimal = new DecimalListToWords(input);
}

public String GetWords(){
    return integral.returnIntegralWords()+"Euros And "+decimal.ReturnDecimalWords()+" Cents";
}

}
