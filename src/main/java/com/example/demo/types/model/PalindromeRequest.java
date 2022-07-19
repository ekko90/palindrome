package com.example.demo.types.model;

import lombok.Builder;
import lombok.Data;
import lombok.NonNull;

@Builder
@Data
public class PalindromeRequest {

  @NonNull
  private String content;
  @NonNull
  private String timestamp;

}
