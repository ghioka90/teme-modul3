package com.example.temacurs13;

import org.springframework.stereotype.Service;

@Service
public class MathService {
    public int getResult(MathEquation mathEquation ){
        int firstNo = mathEquation.getFirstNo();
        int secondNo = mathEquation.getSecondNo();
        String operator = mathEquation.getOperator();

        return switch (operator){
            case "diff" -> firstNo - secondNo;
            case "sum" -> firstNo + secondNo;
            case "multiply" -> firstNo * secondNo;
            case "div" -> firstNo / secondNo;
            case "pow" -> (int)Math.pow(firstNo, secondNo);
            default -> 0;
        };
    }


}
