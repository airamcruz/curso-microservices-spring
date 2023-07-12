package br.com.airamcruz.util.math;

import br.com.airamcruz.exception.UnsuportedMathOperationExeception;
import br.com.airamcruz.util.NumberUtil;

public class SimpleMathOperation {

    public Double sum(Double numberOne, Double numberTwo){
        return numberOne + numberTwo;
    }

    public Double sum(String numberOne, String numberTwo){
        return this.sum(NumberUtil.convertToDouble(numberOne), NumberUtil.convertToDouble(numberTwo));
    }

    public Double subtraction(Double numberOne, Double numberTwo){
        return numberOne - numberTwo;
    }

    public Double subtraction(String numberOne, String numberTwo){
        return this.subtraction(NumberUtil.convertToDouble(numberOne), NumberUtil.convertToDouble(numberTwo));
    }

    public Double multiplication(Double numberOne, Double numberTwo){
        return numberOne * numberTwo;
    }

    public Double multiplication(String numberOne, String numberTwo){
        return this.multiplication(NumberUtil.convertToDouble(numberOne), NumberUtil.convertToDouble(numberTwo));
    }

    public Double division(Double numberOne, Double numberTwo){
        if(numberTwo == 0) {
            throw new UnsuportedMathOperationExeception("The divisor can't be 0!");
        }
        return numberOne / numberTwo;
    }

    public Double division(String numberOne, String numberTwo){
        return this.division(NumberUtil.convertToDouble(numberOne), NumberUtil.convertToDouble(numberTwo));
    }

    public Double mean(Double numberOne, Double numberTwo){
        return this.sum(numberOne, numberTwo) / 2;
    }

    public Double mean(String numberOne, String numberTwo){
        return this.mean(NumberUtil.convertToDouble(numberOne), NumberUtil.convertToDouble(numberTwo));
    }

    public Double squereRoot(Double number){
        return Math.sqrt(number);
    }

    public Double squereRoot(String number){
        return this.squereRoot(NumberUtil.convertToDouble(number));
    }
}
