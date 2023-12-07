package com.example.demo1;

import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.web.client.RestTemplate;

public class Movie {






    private long id;
    private String name;
    private MovieRecord targetMovie;
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
    public String getName(){
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    @Override
    public String toString() {
        return "Movie [name=" + name + "]";
    }
}
