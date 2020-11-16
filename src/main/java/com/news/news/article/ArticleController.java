package com.news.news.article;

import com.news.news.topic.Topic;
import com.news.news.topic.TopicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/articles")
public class ArticleController {

    @Autowired
    private ArticleService articleService;

    @Autowired
    private TopicService topicService;

    @GetMapping("")
    public List<Article> getAll(@RequestParam(required=false) String topicId){

        if (topicId==null) {
            return articleService.getAll();
        } else {
            Optional<Topic> topic=topicService.getById(Long.parseLong(topicId));
            return topic.orElse(new Topic()).getArticleList();
        }
    }

    @GetMapping("/{id}")
    public Article getById(@PathVariable Long id){
        return articleService.getById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND));
    }

    @PostMapping("")
    public Article create(@RequestBody Article newArticle){
        return articleService.create(newArticle);
    }

    @PutMapping("")
    public Article update(@RequestBody Article updatedArticle){
        return articleService.update(updatedArticle);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id){
        articleService.delete(id);


    }

}
