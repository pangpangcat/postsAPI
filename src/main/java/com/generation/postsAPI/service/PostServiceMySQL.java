package com.generation.postsAPI.service;

import com.generation.postsAPI.repository.entity.Post;
import com.generation.postsAPI.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
public class PostServiceMySQL implements PostService{

    private final PostRepository postRepository;

    public PostServiceMySQL(@Autowired PostRepository postRepository) {
        this.postRepository = postRepository;
    }

    @Override
    public Post save(Post post) {
        return postRepository.save(post);
    }

    @Override
    public void delete(int postId) {
        postRepository.deleteById( postId);
    }

    @Override
    public List<Post> all() {
        List<Post> result = new ArrayList<>();
        postRepository.findAll().forEach( result::add);
        return result;

    }

    @Override
    public Post findById(int postId) {
        return null;
    }
}
