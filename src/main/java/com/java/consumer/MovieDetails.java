package com.java.consumer;

import java.util.List;
import java.util.function.Consumer;

class Movie{
    private String movieName;
    private String hero;
    private Integer rating;

    public Movie(String movieName, String hero, Integer rating) {
        this.movieName = movieName;
        this.hero = hero;
        this.rating = rating;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public String getHero() {
        return hero;
    }

    public void setHero(String hero) {
        this.hero = hero;
    }

    public Integer getRating() {
        return rating;
    }

    public void setRating(Integer rating) {
        this.rating = rating;
    }
}
public class MovieDetails {
    public static void main(String[] args) {
        Consumer<Movie> consumer= movie -> {
            System.out.println("********************************************");
            System.out.println("MovieName:"+ movie.getMovieName());
            System.out.println("Hero: "+ movie.getHero());
            System.out.println("Movie Rating: "+movie.getRating());

        };
        for (Movie movie: populate()) {
            consumer.accept(movie);
        }
    }

    private static List<Movie> populate(){
        return List.of(new Movie("Movie1","Hero",5),
              new Movie("Movie2","Hero1",4),
              new Movie("Movie3","Hero2",3),
              new Movie("Movie4","Hero3",5),
              new Movie("Movie5","Hero4",2));
    }
}
