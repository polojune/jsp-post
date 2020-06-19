package com.cos.apple.model;

import java.sql.Timestamp;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Post {
   private int id; 
   private int memberId; 
   private String title; 
   private String content; 
   private Timestamp createDate;
}
