package com.example.demo.types.error;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class MalformedRequestError {
  private String statusCode;
  private String message;
}
