package com.example.temacurs13;

import org.jetbrains.annotations.NotNull;
import org.springframework.stereotype.Service;

@Service
public class MathService {
    public int getResult(@NotNull MathEquation mathEquation ){
        int firstNumber = mathEquation.getFirstNumber();
        int secondNumber = mathEquation.getSecondNumber();
        String operation = mathEquation.getOperation();

        return switch (operation){

            case "diff" -> firstNumber - secondNumber;
            case "sum" -> firstNumber + secondNumber;
            case "multiply" -> firstNumber * secondNumber;
            case "div" -> firstNumber / secondNumber;
            case "pow" -> (int)Math.pow(firstNumber, secondNumber);
            default -> 0;
        };
    }


}
