package com.example.temacurs15;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class Message {
   private String sender;
   private String reciever;
   private String text;
   private boolean seen;
   private String sentDate;
}
