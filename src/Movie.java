import java.util.ArrayList;
import java.util.List;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Movie {



    private int MovieID;
    private String title , language , cast1 , cast2 , genre;
    private String ReleaseDate;
    private int runningTime;// In min
    private String director;
    private String country;
    private double budget;
    private double revenue;
    private  double movieRating;

    public Movie(String MovieId, String title, String director, String releaseDate, double rating, String language, String country, String cast1, String cast2, String genre, double budget, double revenue) {
        this.MovieID = MovieID;
        this.title = title;
        //this.ReleaseDate = LocalDate.parse(ReleaseDate, DateTimeFormatter.ofPattern("yyyy-MM-dd"));
        this.runningTime = runningTime;
        this.director = director;
        this.country=country;
        this.budget=budget;
        this.revenue=revenue;
        this.cast1=cast1;
        this.cast2=cast2;
        this.language=language;
        this.genre=genre;
        this.movieRating=movieRating;
    }

    public Movie(int movieID, String title, String releaseDate) {
        this.MovieID=movieID;
        this.title=title;
        this.ReleaseDate=releaseDate;
    }


    //  public void setReleaseDate(String releaseDate) {
    //    this.ReleaseDate = LocalDate.parse(releaseDate, DateTimeFormatter.ofPattern("yyyy-MM-dd"));
    //}


    public int getMovieID() {
        return MovieID;
    }

    public void setMovieID(int movieID) {
        MovieID = movieID;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCast1() {
        return cast1;
    }

    public void setCast1(String cast1) {
        this.cast1 = cast1;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getCast2() {
        return cast2;
    }

    public void setCast2(String cast2) {
        this.cast2 = cast2;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getRunningTime() {
        return runningTime;
    }

    public void setRunningTime(int runningTime) {
        this.runningTime = runningTime;
    }

    public String getReleaseDate() {
        return ReleaseDate;
    }

    public void setReleaseDate(String releaseDate) {
        ReleaseDate = releaseDate;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public double getRevenue() {
        return revenue;
    }

    public void setRevenue(double revenue) {
        this.revenue = revenue;
    }

    public double getBudget() {
        return budget;
    }

    public void setBudget(double budget) {
        this.budget = budget;
    }

    public double getMovieRating() {
        return movieRating;
    }

    public void setMovieRating(double movieRating) {
        this.movieRating = movieRating;
    }

 /*   public float calcRating() {
        float averageRating = 0;

        if (rating != null) { //if there is exception !!
            float sum = 0;
            for(Float avg: rating ) {
                sum += avg;
            }
            averageRating = sum / rating.size();
        }
        return averageRating;
    }

    // ((rating * totalnumofrating) + newrating)/totalnumofrating+1;

    public String CalcDuration() {
        int hrs = runningTime / 60;
        int min = runningTime % 60;

        if (hrs != 0) {
            return hrs + " hrs " + min + " min";
        } else {
            return min + " min";
        }
    }*/

}
