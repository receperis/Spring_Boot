package com.news.news.topic;


import com.news.news.article.ArticleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TopicService {
    @Autowired
    private TopicRepository topicRepository;

    @Autowired
    private ArticleRepository articleRepository;

    public List<Topic> getAll(){
        return topicRepository.findAll();
    }

    public Optional<Topic> getById(Long id){
        return topicRepository.findById(id);
    }

    public Topic create(Topic newTopic) {

        return topicRepository.save(newTopic);

    }

    public Topic update(Topic updatedTopic) {

        return topicRepository.save(updatedTopic);

    }

    public void delete(Long id) {
        topicRepository.deleteById(id);

    }

    public List<Topic> getAllByArticleId(Long articleId) {
        return topicRepository.findByArticles_id(articleId);
    }
}

