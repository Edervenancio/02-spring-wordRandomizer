package com.example.wordRandomizer.demo.entity;


import jakarta.persistence.*;

@Entity
@Table(name="word")
public class Word {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private int id;

    @Column(name="enteredText")
    private String enteredText;


    @Column(name="randomizedText")
    private String randomizedText;


    public Word(String enteredText, String randomizedText) {
        this.enteredText = enteredText;
        this.randomizedText = randomizedText;
    }

    public Word(){

    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEnteredText() {
        return enteredText;
    }

    public void setEnteredText(String enteredText) {
        this.enteredText = enteredText;
    }

    public String getRandomizedText() {
        return randomizedText;
    }

    public void setRandomizedText(String randomizedText) {
        this.randomizedText = randomizedText;
    }


    @Override
    public String toString() {
        return "Word{" +
                "id=" + id +
                ", enteredText='" + enteredText + '\'' +
                ", randomizedText='" + randomizedText + '\'' +
                '}';
    }
}
