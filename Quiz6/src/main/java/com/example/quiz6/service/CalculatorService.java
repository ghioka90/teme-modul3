package com.example.quiz6.service;

import org.springframework.stereotype.Service;

import java.math.BigInteger;

@Service
public class CalculatorService {

    public Integer sumIntegers(String first, String second) {
        return Integer.parseInt(first) + Integer.parseInt(second);
    }

    public BigInteger sumBigIntegers(String first, String second) {
        BigInteger a = new BigInteger(first);
        BigInteger b = new BigInteger(second);
        return a.add(b);
    }


}

