package com.example.wordRandomizer.demo.dao;

import com.example.wordRandomizer.demo.entity.Word;
import jakarta.persistence.Entity;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public class WordDAOImpl implements WordDAO{



    private EntityManager entityManager;

    @Autowired
    public WordDAOImpl(EntityManager entityManager){
        this.entityManager = entityManager;
    }
    @Override
    @Transactional
    public void save(Word theWord) {
        entityManager.persist(theWord);
    }

    @Override
    public List<Word> findAll() {
        TypedQuery<Word> theQuery = entityManager.createQuery("FROM Word", Word.class);

        // return query results
        return theQuery.getResultList();
    }
}
