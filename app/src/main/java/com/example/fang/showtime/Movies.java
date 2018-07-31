package com.example.fang.showtime;

public class Movies {

    private String Title;
    private String Year;
    private String Prating;
    private String Genre;
    private String Rating;
    private int Poster;

    public Movies() {
    }

    public Movies(String title, String year, String prating, String genre, String rating, int poster)
    {
        Title = title;
        Year = year;
        Prating = prating;
        Genre = genre;
        Rating = rating;
        Poster = poster;
    }

    //Getter

    public String getTitle() {
        return Title;
    }

    public String getYear() {
        return Year;
    }

    public String getPrating() {
        return Prating;
    }

    public String getGenre() {
        return Genre;
    }

    public String getRating() {
        return Rating;
    }

    public int getPoster() {
        return Poster;
    }

    //Setter


    public void setTitle(String title) {
        Title = title;
    }

    public void setYear(String year) {
        Year = year;
    }

    public void setPrating(String prating) {
        Prating = prating;
    }

    public void setGenre(String genre) {
        Genre = genre;
    }

    public void setRating(String rating) {
        Rating = rating;
    }

    public void setPoster(int poster) {
        Poster = poster;
    }
}
