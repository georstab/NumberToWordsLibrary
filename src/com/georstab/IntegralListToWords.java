package com.georstab;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.List;

public class IntegralListToWords {

    private BigDecimal theInput;
    private String result;
    private IntegralToList var;
    private List<BigInteger> IntegralData;

    //Constructor
    public IntegralListToWords(BigDecimal input) {
        this.theInput = input;
        this.var = new IntegralToList(theInput);
        this.IntegralData = var.integralToListM();
    }



    // Class DecimalListToWords
    // Method returnWords for the integral part
    public String returnIntegralWords() {

        switch (IntegralData.size()) {
            case 1 : result = oneToNine(0);
            break;

            case 2 : result = tenToNinetyNine(0);
            break;

            case 3 : result = nineHundredNinetyNine(0);
            break;

            case 4 : result = nineHundredNinetyNine(0)+" thousand "+nineHundredNinetyNine(1);
            break;

            case 5 : result = nineHundredNinetyNine(0)+" thousand "+nineHundredNinetyNine(2);
            break;

            case 6 : result = nineHundredNinetyNine(0)+" thousand "+nineHundredNinetyNine(3);
            break;


        } return result;

    }


    public String oneToNine(int pos) {
        int a = IntegralData.get(pos).intValue();
        return new DATA().getOneToNine()[a];

    }

    public String tenToNinetyNine(int pos){
        int a = IntegralData.get(pos).intValue();
        int b = IntegralData.get(pos+1).intValue();

        if(a == 1 & b == 0){
            return "Ten";

        }else if (a == 1 & b !=0) {
            return new DATA().getTenToTwenty()[b];

        }else return new DATA().getTenToNinety()[a] +" "+ new DATA().getOneToNine()[b];

    }

    // flawed logic here
    public String nineHundredNinetyNine(int pos){
        int a = IntegralData.get(pos).intValue();
        int b = IntegralData.get(pos+1).intValue();

        if(a == 0){
            return tenToNinetyNine(pos+1);
        }else if(a == 0 & b == 0) {
            return oneToNine(pos+2);
        } else {
            return new DATA().getHundreds()[a] +" "+tenToNinetyNine(pos+1);
        }

    }


}
