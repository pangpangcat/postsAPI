package com.generation.postsAPI.repository.entity;
import com.generation.postsAPI.controller.dto.PostDto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Post {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer id = null;

    private String name;

    private String country;

    private String city;

    private String recommendation;

    private String image_url;

    public Post(PostDto postDto) {
        this.name = postDto.getName();
        this.country = postDto.getCountry();
        this.city = postDto.getCity();
        this.recommendation = postDto.getRecommendation();
        this.image_url = postDto.getImageUrl();
    }

    public Post() {
        // default constructor
    }


    public Integer getId(){
        return id;
    }

    public void setId(Integer id){
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getRecommendation() {
        return recommendation;
    }

    public void setRecommendation(String recommendation) {
        this.recommendation = recommendation;
    }

    public String getImageUrl() {
        return image_url;
    }

    public void setImageUrl(String imageUrl) {
        this.image_url = imageUrl;
    }

    @Override
    public String toString(){
        return "Post{" + "id=" + id + ", name='" + name +'\'' + ", country ='" + country
                + '\'' +", city ='" + city + '\'' + ", recommendation = '" + recommendation
                + '\'' +", imageUrl='" + image_url + '\'' +'}';
    }
}
