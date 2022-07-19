package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.bll.api.LongestPalindromeChecker;
import com.example.demo.dal.api.PalindromeRepository;
import com.example.demo.types.model.PalindromeDto;
import com.example.demo.types.model.PalindromeRequest;

@RequestMapping("/api")
@RestController
public class PalindromeController {
  @Autowired
  private LongestPalindromeChecker checker;
  @Autowired
  private PalindromeRepository repository;

  @PostMapping(path = "/upload")
  public ResponseEntity<PalindromeDto> findPalindrome(
      @RequestBody PalindromeRequest palindromeRequest) {
    PalindromeDto dto = this.checker.longestPalindromeString(palindromeRequest);
    this.repository.save(dto);
    return ResponseEntity.ok(dto);
  }

  @GetMapping(path = "/find-all")
  public ResponseEntity<List<PalindromeDto>> findAll() {
    return ResponseEntity.ok(this.repository.loadAll());
  }
}
