package com.example.demo1.asyncmethod;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.concurrent.CompletableFuture;

@Service
public class MovieLookUpService {
    private static final Logger logger = LoggerFactory.getLogger(MovieLookUpService.class);

    private RestTemplate restTemplate;

    public MovieLookUpService(){

    }

    public void MovieLookupService(RestTemplateBuilder restTemplateBuilder) {
        this.restTemplate = restTemplateBuilder.build();
    }

//    @Async
//    public CompletableFuture<Movie> findMovie(int movieId) throws InterruptedException {
//        logger.info("Looking up Movie with Id: " + movieId);
//        String url = String.format("localhost:8080/api/%i",movieId);
//        Movie results = restTemplate.getForObject(url, Movie.class);
//        // Artificial delay of 1s for demonstration purposes
//        Thread.sleep(1000L);
//        return CompletableFuture.completedFuture(results);
//    }




}
