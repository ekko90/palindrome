package com.example.demo.dal;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.dal.api.PalindromeRepository;
import com.example.demo.types.model.PalindromeDto;

@Repository
public class PalindromeRepositoryImpl implements PalindromeRepository {
  private final List<PalindromeDto> database = new ArrayList<>();

  @Override
  public void save(PalindromeDto request) {
    this.database.add(request);
  }

  @Override
  public List<PalindromeDto> loadAll() {
    return this.database;
  }
}
