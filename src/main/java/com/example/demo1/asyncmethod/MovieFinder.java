package com.example.demo1.asyncmethod;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.concurrent.CompletableFuture;

@Component
public class MovieFinder implements CommandLineRunner {
    private static final Logger logger = LoggerFactory.getLogger(MovieFinder.class);

    private MovieLookUpService movieLookUpService;

    public MovieFinder(MovieLookUpService movieLookupService) {
        this.movieLookUpService = movieLookupService;
    }

    @Override
    public void run(String... args) throws Exception {
        // Start the clock
        long start = System.currentTimeMillis();

        // Kick of multiple, asynchronous lookups
//        CompletableFuture<Movie> movie1 = movieLookUpService.findMovie(1);
//        CompletableFuture<Movie> movie2 = movieLookUpService.findMovie(2);
//        CompletableFuture<Movie> movie3 = movieLookUpService.findMovie(23);

        // Wait until they are all done
//        CompletableFuture.allOf(movie1,movie2,movie3).join();

        // Print results, including elapsed time
//        logger.info("Elapsed time: " + (System.currentTimeMillis() - start));
//        logger.info("--> " + movie1.get());
//        logger.info("--> " + movie2.get());
//        logger.info("--> " + movie3.get());

    }
}
