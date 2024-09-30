package br.com.erudio.math;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

public class SimpleMath {
    @RequestMapping(value = "/sum/{numberOne}/{numberTwo}", method = RequestMethod.GET)
    public Double sum(Double numberOne, Double numberTwo) {
        return numberOne + numberTwo;
    }

    @RequestMapping(value = "/subtraction/{numberOne}/{numberTwo}", method = RequestMethod.GET)
    public Double subtraction(Double numberOne, Double numberTwo) {
        return numberOne - numberTwo;
    }

    @RequestMapping(value = "/multiplication/{numberOne}/{numberTwo}", method = RequestMethod.GET)
    public Double multiplication(Double numberOne, Double numberTwo) {
        return numberOne * numberTwo;
    }

    @RequestMapping(value = "/division/{numberOne}/{numberTwo}", method = RequestMethod.GET)
    public Double division(Double numberOne, Double numberTwo) {
        return numberOne / numberTwo;
    }

    @RequestMapping(value = "/mean/{numberOne}/{numberTwo}", method = RequestMethod.GET)
    public Double mean(Double numberOne, Double numberTwo) {
        return (numberOne + numberTwo) / 2;
    }

    @RequestMapping(value = "/squareRoot/{number}", method = RequestMethod.GET)
    public Double squareRoot(Double number) {
        return Math.sqrt(number);
    }
}
