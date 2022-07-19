package com.example.demo.dal.api;

import java.util.List;

import com.example.demo.types.model.PalindromeDto;

public interface PalindromeRepository {

  void save(PalindromeDto request);

  List<PalindromeDto> loadAll();

}
