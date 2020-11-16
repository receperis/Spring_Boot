package com.news.news.comment;

import com.news.news.article.Article;

import javax.persistence.*;

@Entity
public class Comment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String body;
    private String authorName;
    @ManyToOne
    @JoinColumn(nullable=false)
    private Article article;

    public Comment(Long id, Article article, String body, String authorName) {
        this.id = id;
        this.article = article;
        this.body = body;
        this.authorName = authorName;
    }

    public Comment() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Article getArticle() {
        return article;
    }

    public void setArticle(Article article) {
        this.article = article;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }
}
