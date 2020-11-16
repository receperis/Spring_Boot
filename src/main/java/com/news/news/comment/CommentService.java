package com.news.news.comment;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CommentService {
    @Autowired
    private CommentRepository commentRepository;

    public List<Comment> getAll(){
        return commentRepository.findAll();
    }

    public Optional<Comment> getById(Long id){
        return commentRepository.findById(id);
    }

    public Comment create(Comment newComment) {

        return commentRepository.save(newComment);

    }

    public Comment update(Comment updatedComment) {

        return commentRepository.save(updatedComment);

    }

    public void delete(Long id) {
        commentRepository.deleteById(id);

    }

    public List<Comment> getAllByArticleId(Long articleId) {
        return commentRepository.findAllByArticleId(articleId);

    }
}

