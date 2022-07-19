package com.example.demo.bll.api;

import com.example.demo.types.model.PalindromeDto;
import com.example.demo.types.model.PalindromeRequest;

public interface LongestPalindromeChecker {

  PalindromeDto longestPalindromeString(PalindromeRequest request);
}
