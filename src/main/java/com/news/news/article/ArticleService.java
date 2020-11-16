package com.news.news.article;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ArticleService {
    @Autowired
    private ArticleRepository articleRepository;

    public List<Article> getAll(){
        return articleRepository.findAll();
    }

    public Optional<Article> getById(Long id){
        return articleRepository.findById(id);
    }

    public Article create(Article newArticle) {

        return articleRepository.save(newArticle);

    }

    public Article update(Article updatedArticle) {

        return articleRepository.save(updatedArticle);

    }

    public void delete(Long id) {
        articleRepository.deleteById(id);

    }
}

