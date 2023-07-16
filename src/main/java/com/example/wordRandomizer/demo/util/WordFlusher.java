package com.example.wordRandomizer.demo.util;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.Random;

@Component
public class WordFlusher {


    private String flushedWord;
    public String flush(String flushedWord){

        Random random = new Random();
        int number;


        char[] arr = new char[flushedWord.length()];

        StringBuffer newWord = new StringBuffer();
        for (int i = 0; i < flushedWord.length(); i++) {
            number = random.nextInt(flushedWord.length());
            arr[i] = flushedWord.charAt(number);
            newWord.append(arr[i]);
        }
       String flushedString = newWord.toString();

        return flushedString;


    }



}
