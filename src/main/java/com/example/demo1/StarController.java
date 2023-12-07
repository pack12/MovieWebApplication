package com.example.demo1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

@Controller
public class StarController {

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/star")
    public String starForm(Model model){
        model.addAttribute("movie", new Movie());
        return "star";
    }

    @PostMapping("/star")
    public String greetingSubmit(@ModelAttribute Movie movie, Model model){
        model.addAttribute("movie",movie);
        MovieRecord movieRecord = restTemplate.getForObject("http://localhost:8080/api/"+movie.getId(), MovieRecord.class);

        model.addAttribute("movieRecord", movieRecord);
        return "result";
    }





}
