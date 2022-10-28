package com.generation.postsAPI.repository;

import com.generation.postsAPI.repository.entity.Post;
import org.springframework.data.repository.CrudRepository;

// This will be AUTO IMPLEMENTED by Spring into a Bean called itemRepository
// CRUD refers Create, Read, Update, Delete
public interface PostRepository extends CrudRepository<Post, Integer> {

}
