package com.news.news.topic;

import com.news.news.article.Article;

import javax.persistence.*;
import java.util.List;

@Entity
public class Topic {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String topicName;

    @ManyToMany
    private List<Article> articles;

    public Topic(Long id, String topicName) {
        this.id = id;
        this.topicName = topicName;
    }

    public Topic() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTopicName() {
        return topicName;
    }

    public void setTopicName(String topicName) {
        this.topicName = topicName;
    }

    public List<Article> getArticleList() {
        return articles;
    }

    public void setArticleList(List<Article> articleList) {
        this.articles = articleList;
    }
}
