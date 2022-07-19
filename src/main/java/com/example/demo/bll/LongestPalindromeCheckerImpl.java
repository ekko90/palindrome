package com.example.demo.bll;

import org.springframework.stereotype.Component;

import com.example.demo.bll.api.LongestPalindromeChecker;

@Component
public class LongestPalindromeCheckerImpl implements LongestPalindromeChecker {

  // O(n^2)
  public String longestPalindromeString(String s) {
    if (s == null)
      return null;
    String longest = s.substring(0, 1);
    for (int i = 0; i < s.length() - 1; i++) {
      // odd cases like 121
      String palindrome = this.intermediatePalindrome(s, i, i);
      if (palindrome.length() > longest.length()) {
        longest = palindrome;
      }
      // even cases like 1221
      palindrome = this.intermediatePalindrome(s, i, i + 1);
      if (palindrome.length() > longest.length()) {
        longest = palindrome;
      }
    }
    return longest;
  }

  private String intermediatePalindrome(String s, int left, int right) {
    if (left > right)
      return null;
    while (left >= 0 && right < s.length()
        && s.charAt(left) == s.charAt(right)) {
      left--;
      right++;
    }
    return s.substring(left + 1, right);
  }



}
