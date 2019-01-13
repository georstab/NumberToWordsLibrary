package com.georstab;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.List;

public class DecimalListToWords {

    private BigDecimal Input;
    private DecimalToList var;
    private List<BigInteger> DecimalData;


    public DecimalListToWords(BigDecimal TheInput){
        this.Input = TheInput;
        this.var = new DecimalToList(Input);
        this.DecimalData = var.DecimalToListM();
    }

    public String ReturnDecimalWords(){
        String result;

        switch (DecimalData.size()){
            case 1 : result = oneToNine();
            break;

            case 2 : result = tenToNinetyNine();
            break;

            default: result = "zero";

        }return result;

    }

    public String oneToNine(){
        int a = DecimalData.get(0).intValue();
        return new DATA().getOneToNine()[a];

    }

    public String tenToNinetyNine() {
        int a = DecimalData.get(0).intValue();
        int b = DecimalData.get(1).intValue();

        if (a == 1) {
            return new DATA().getTenToTwenty()[b];

        } else return new DATA().getTenToNinety()[a] + " " + new DATA().getOneToNine()[b];
    }

}
