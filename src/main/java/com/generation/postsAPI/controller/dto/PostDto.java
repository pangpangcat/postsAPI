package com.generation.postsAPI.controller.dto;

public class PostDto {
    private String name;

    private String country;

    private String city;

    private String recommendation;

    private String image_Url;

    public PostDto( String name, String country, String city, String recommendation, String imageUrl){
        this.name = name;
        this.country = country;
        this.city = city;
        this.recommendation = recommendation;
        this.image_Url = imageUrl;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
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
        return image_Url;
    }

    public void setImageUrl(String imageUrl) {
        this.image_Url = imageUrl;
    }
}
