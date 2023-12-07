package com.example.demo1.asyncmethod;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
@JsonIgnoreProperties(ignoreUnknown=true)
public class Movie {
    private String MovieName;
    private String Year;
    private String Score;
    private String Star;
    private String Gross;


    public String getMovieName() {
        return MovieName;
    }

    public void setMovieName(String movieName) {
        MovieName = movieName;
    }

    public String getYear() {
        return Year;
    }

    public void setYear(String year) {
        Year = year;
    }

    public String getScore() {
        return Score;
    }

    public void setScore(String score) {
        Score = score;
    }

    public String getStar() {
        return Star;
    }

    public void setStar(String star) {
        Star = star;
    }

    public String getGross() {
        return Gross;
    }

    public void setGross(String gross) {
        Gross = gross;
    }

    @Override
    public String toString() {
        return "Movie [name=" + MovieName + ", Year=" + Year + ", Score=" + Score + ", Star="+Star+",Gross="+Gross+"]";
    }
}
