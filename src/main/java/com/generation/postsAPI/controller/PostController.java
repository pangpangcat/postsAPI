package com.generation.postsAPI.controller;

import com.generation.postsAPI.controller.dto.PostDto;
import com.generation.postsAPI.repository.PostRepository;
import com.generation.postsAPI.repository.entity.Post;
import com.generation.postsAPI.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/post")
public class PostController{

    final PostService postService;

    public PostController(@Autowired  PostService postService) {
        this.postService = postService;
    }


    @GetMapping("/all")
    public Iterable<Post> getPosts(){
        return postService.all();
    }

    @PostMapping
    public Post save(@RequestBody PostDto postDto){
        return postService.save(new Post(postDto));
    }

    @GetMapping("/{id}")
    public Post findPostById ( @PathVariable Integer id){
        return postService.findById( id );
    }

    @PutMapping("/{id}")
    public Post update(@RequestBody PostDto postDto, @PathVariable Integer id){
        Post post = postService.findById( id );
        post.setName( postDto.getName());
        post.setCountry( postDto.getCountry());
        post.setCity( postDto.getCity());
        post.setRecommendation( postDto.getRecommendation());
        post.setImageUrl( postDto.getImageUrl());

        return postService.save (post);
    }

    @DeleteMapping("/{id}")
    public void delete ( @PathVariable Integer id){
        postService.delete(id);
    }





}
