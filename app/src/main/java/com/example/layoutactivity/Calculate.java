package com.example.layoutactivity;

import java.math.BigDecimal;
import java.util.ArrayList;

public class Calculate {
    private double seqResult;
    private double finalResult;

    private double result;
    String temp = "";
    ArrayList<Double> numbers = new ArrayList<>();
    ArrayList<String> signs = new ArrayList<>();

    private int dec = 11;

    Calculate(){
        numbers.add((double) 0);
    }

    //GETTERS and SETTERS
    public double getSeqResult(){
        return seqResult;
    }
    public void setSeqResult(double seqResult){
        this.seqResult = seqResult;
    }

    public double getFinalResult() { return finalResult; }
    public void setFinalResult(double finalResult) { this.finalResult = finalResult; }

    public int getDec() { return dec; }
    public void setDec(int dec) { this.dec=dec; }

    public double getResult() {
        return result;
    }

    public void setResult(double result) {
        this.result = result;
    }

    //OTHER METHODS
    public void calculate(){
        int index;
        double result = 0;
        ArrayList<Double> nClone = (ArrayList<Double>) numbers.clone();
        ArrayList<String> sClone = (ArrayList<String>) signs.clone();

        if(numbers.size() == 1) {
            setFinalResult(numbers.get(numbers.size()-1));
            return;
        }

        while(sClone.contains("\\")){
            index = sClone.indexOf("\\");
            result = divide(nClone.get(index), nClone.get(index+1));
            nClone.set(index, result);
            nClone.remove(index+1);
            sClone.remove(index);
        }
        while(sClone.contains("*")){
            index = sClone.indexOf("*");
            result = multiply(nClone.get(index), nClone.get(index+1));
            nClone.set(index, result);
            nClone.remove(index+1);
            sClone.remove(index);
        }
        while(sClone.contains("-")){
            index = sClone.indexOf("-");
            result = subtract(nClone.get(index), nClone.get(index+1));
            nClone.set(index, result);
            nClone.remove(index+1);
            sClone.remove(index);
        }
        while(sClone.contains("+")){
            index = sClone.indexOf("+");
            result = add(nClone.get(index), nClone.get(index+1));
            nClone.set(index, result);
            nClone.remove(index+1);
            sClone.remove(index);
        }

        result = decimalFunc(result);
        setFinalResult(result);
    }

    public void sequenceCalculate(){
        double tempResult = 0;

        if (numbers.size() == 1){
            tempResult = numbers.get(0);

        } else if(numbers.size() > 1) {
            switch (signs.get(signs.size()-1)){
                case "+":

                    tempResult = add(getSeqResult(), numbers.get(numbers.size()-1));
                    break;

                case "-":

                    tempResult = subtract(getSeqResult(), numbers.get(numbers.size()-1));
                    break;

                case "*":

                    tempResult = multiply(getSeqResult(), numbers.get(numbers.size()-1));
                    break;

                case "\\":
                    tempResult = divide(getSeqResult(), numbers.get(numbers.size()-1));
                    break;

                default:
            }
        }

        tempResult = decimalFunc(tempResult);
        setResult(tempResult);
    }

    public double divide(double first, double second){
        return first / second;
    }

    public double multiply(double first, double second){
        return first * second;
    }

    public double add(double first, double second){
        return first + second;
    }

    public double subtract(double first, double second){
        return first - second;
    }

    private double decimalFunc(double result) {
        BigDecimal bigDec = new BigDecimal(Double.toString(result));
        int decPlaces = bigDec.scale();
        if (decPlaces > dec)
            result = Double.parseDouble(String.format("%."+dec+"f", result));
        return result;
    }


}
