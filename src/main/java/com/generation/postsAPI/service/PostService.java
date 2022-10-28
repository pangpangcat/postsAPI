package com.generation.postsAPI.service;

import com.generation.postsAPI.repository.entity.Post;

import java.util.List;

public interface PostService {

    Post save (Post post);

    void delete (int postId);

    List<Post> all();

    Post findById (int postId);
}
