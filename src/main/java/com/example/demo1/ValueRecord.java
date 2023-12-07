package com.example.demo1;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public record ValueRecord(Long id, String movieName, String star, String year, String gross) {

}
