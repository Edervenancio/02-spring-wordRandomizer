package com.example.wordRandomizer.demo.dao;

import com.example.wordRandomizer.demo.entity.Word;

import java.util.List;

public interface WordDAO {

    void save(Word theWord);

    List<Word> findAll();

}
