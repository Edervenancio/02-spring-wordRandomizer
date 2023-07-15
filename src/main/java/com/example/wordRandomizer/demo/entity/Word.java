package com.example.wordRandomizer.demo.entity;


import jakarta.persistence.*;

@Entity
@Table(name="Word")
public class Word {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private int id;

    @Column(name="enteredText")
    private String enteredText;


    @Column(name="randomizedText")
    private String randomizedText;


    public Word(int id, String enteredText, String randomizedText) {
        this.id = id;
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
