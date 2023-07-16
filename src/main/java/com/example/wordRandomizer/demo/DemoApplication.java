package com.example.wordRandomizer.demo;

import com.example.wordRandomizer.demo.dao.WordDAO;
import com.example.wordRandomizer.demo.entity.Word;
import com.example.wordRandomizer.demo.util.WordFlusher;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class DemoApplication {


	@Bean
	public CommandLineRunner commandLineRunner(WordDAO wordDao){
		return runner -> {
			  saveWord(wordDao);
			 showAll(wordDao);
			//wordFlush(flush);
		};
	}

	private void showAll(WordDAO wordDao) {
		List<Word> theWord = wordDao.findAll();

		for (Word theWords : theWord){
			System.out.println(theWord);
		}
	}



	private void saveWord(WordDAO wordDao) {



		WordFlusher wordd = new WordFlusher();
		String firstText = "Randomized";
		String teste = wordd.flush(firstText);
		Word tempWord = new Word(firstText, teste);
		System.out.println(tempWord);
		wordDao.save(tempWord);
	}

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

}
