package com.example.temacurs15;



import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class ApplicationController {

    @PostMapping("/message")
    public ResponseEntity<String> postMessage(
            @RequestBody Message message,
            @RequestHeader(value = "authentication", required = false) String apiKey) {

        if(apiKey != null && apiKey.equals("devmind-api-key")) {
            return new ResponseEntity<>("Message created", HttpStatus.CREATED);
        } else {
            return new ResponseEntity<>("Unauthorized", HttpStatus.UNAUTHORIZED);
        }
    }
}
