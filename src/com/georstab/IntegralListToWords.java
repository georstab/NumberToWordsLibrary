package com.georstab;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.List;

public class IntegralListToWords {

    private BigDecimal Input;
    private IntegralToList var;
    private List<BigInteger> IntegralData;


    public IntegralListToWords(BigDecimal TheInput) {
        this.Input = TheInput;
        this.var = new IntegralToList(Input);
        this.IntegralData = var.integralToListM();
    }

    public String returnIntegralWords() {
        String result;

        switch (IntegralData.size()) {
            case 1 : result = oneToNine(0);
            break;

            case 2 : result = tenToNinetyNine(0);
            break;

            case 3 : result = nineHundredNinetyNine(0);
            break;

            default: result = Concat();


        } return result;

    }

    public String Concat(){

        StringBuilder builder = new StringBuilder();
        int Remainder = IntegralData.size()%3;
        int Trinitys = IntegralData.size()/3;

        builder.append(FunctionOperator(Remainder)).append(" ").append(new DATA().getNumerics()[Trinitys]).append(" ");
        Trinitys -=1;

        int pos = Remainder;

        while(Trinitys != -1){

            builder.append(nineHundredNinetyNine(pos)).append(" ").append(new DATA().getNumerics()[Trinitys]).append(" ");
            Trinitys -=1;
            pos +=3;

        }return builder.toString();


    }

    public String FunctionOperator(int R){
        String result;

        switch (R){
            case 1 : result =  oneToNine(0);
            break;

            case 2 : result = tenToNinetyNine(0);
            break;

            default: result = nineHundredNinetyNine(0);

        }return result;
    }


    public String oneToNine(int pos) {
        int a = IntegralData.get(pos).intValue();
        return new DATA().getOneToNine()[a];

    }

    public String tenToNinetyNine(int pos){
        int a = IntegralData.get(pos).intValue();
        int b = IntegralData.get(pos+1).intValue();

        if (a == 1) {
            return new DATA().getTenToTwenty()[b];

        }else return new DATA().getTenToNinety()[a] +" "+ new DATA().getOneToNine()[b];

    }

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
