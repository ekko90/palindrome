package com.example.demo.types.model;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class PalindromeDto {

  private String content;
  private String timestamp;
  private Integer longest_palindrome_size;
}
