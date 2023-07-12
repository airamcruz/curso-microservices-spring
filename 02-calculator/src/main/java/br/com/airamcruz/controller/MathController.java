package br.com.airamcruz.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import br.com.airamcruz.exception.UnsuportedMathOperationExeception;
import br.com.airamcruz.util.NumberUtil;
import br.com.airamcruz.util.math.SimpleMathOperation;

@RestController
public class MathController {

    private static final String PLEASE_SET_A_NUMERIC_VALUE = "Please set a numeric value!";

    SimpleMathOperation simpleMathOperation;

    public MathController() {
        super();
        simpleMathOperation = new SimpleMathOperation();
    }

    @GetMapping("/sum/{numberOne}/{numberTwo}")
    public Double sum(@PathVariable(value = "numberOne") String numberOne, @PathVariable(value = "numberTwo") String numberTwo) {
        
        if(!this.isNumberValid(numberOne, numberTwo)) {
            throw new UnsuportedMathOperationExeception(PLEASE_SET_A_NUMERIC_VALUE);
        }

        return simpleMathOperation.sum(numberOne, numberTwo);
    }

    @GetMapping("/subtraction/{numberOne}/{numberTwo}")
    public Double subtraction(@PathVariable(value = "numberOne") String numberOne, @PathVariable(value = "numberTwo") String numberTwo) {
        
        if(!this.isNumberValid(numberOne, numberTwo)) {
            throw new UnsuportedMathOperationExeception(PLEASE_SET_A_NUMERIC_VALUE);
        }

        return simpleMathOperation.subtraction(numberOne, numberTwo);
    }

    @GetMapping("/multiplication/{numberOne}/{numberTwo}")
    public Double multiplication(@PathVariable(value = "numberOne") String numberOne, @PathVariable(value = "numberTwo") String numberTwo) {
        
        if(!this.isNumberValid(numberOne, numberTwo)) {
            throw new UnsuportedMathOperationExeception(PLEASE_SET_A_NUMERIC_VALUE);
        }

        return simpleMathOperation.multiplication(numberOne, numberTwo);
    }
    
    @GetMapping("/division/{numberOne}/{numberTwo}")
    public Double division(@PathVariable(value = "numberOne") String numberOne, @PathVariable(value = "numberTwo") String numberTwo) {
        
        if(!this.isNumberValid(numberOne, numberTwo)) {
            throw new UnsuportedMathOperationExeception(PLEASE_SET_A_NUMERIC_VALUE);
        }

        return simpleMathOperation.division(numberOne, numberTwo);
    }
    
    @GetMapping("/mean/{numberOne}/{numberTwo}")
    public Double mean(@PathVariable(value = "numberOne") String numberOne, @PathVariable(value = "numberTwo") String numberTwo) {
        
        if(!this.isNumberValid(numberOne, numberTwo)) {
            throw new UnsuportedMathOperationExeception(PLEASE_SET_A_NUMERIC_VALUE);
        }

        return simpleMathOperation.mean(numberOne, numberTwo);
    }
    
    @GetMapping("/squereRoot/{number}")
    public Double squereRoot(@PathVariable(value = "number") String number) {
        
        if(!this.isNumberValid(number)) {
            throw new UnsuportedMathOperationExeception(PLEASE_SET_A_NUMERIC_VALUE);
        }

        return simpleMathOperation.squereRoot(number);
    }

    private boolean isNumberValid(String numberOne, String numberTwo) {        
        return NumberUtil.isNumeric(numberOne) && NumberUtil.isNumeric(numberTwo);
    }

    private boolean isNumberValid(String number) {
        return this.isNumberValid(number, number);
    }
}
