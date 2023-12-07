package com.example.demo1;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public record MovieRecord(String type, ValueRecord value) {
}
