package com.example.quiz6.controller;

import com.example.quiz6.service.CaluclatorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigInteger;

@RestController
public class HomeController {

    @Autowired
    private CaluclatorService caluclatorService;

    @GetMapping(value = "/add/first/{first}/second/{second}")
    public ResponseEntity<Integer> getFirstNameAndLastName(@PathVariable String first, @PathVariable String second) {
        return  ResponseEntity.ok(caluclatorService.sumIntegers(first, second));
    }
    @GetMapping(value = "/addBig/first/{first}/second/{second}")
    public ResponseEntity<BigInteger> getFirstNameAndLastNameBigInteger(@PathVariable String first, @PathVariable String second) {
        return  ResponseEntity.ok(caluclatorService.sumBigIntegers(first, second));
    }

}