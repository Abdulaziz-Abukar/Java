package MovieCollectionManager;

public class Movie {
    private String title;
    private String director;
    private double rating;

    public Movie(String title, String director, double rating) {
        this.title = title;
        this.director = director;
        this.rating = rating;
    }

    public String getTitle() {
        return title;
    }

    public String getDirector() {
        return director;
    }

    public double getRating() {
        return rating;
    }

    public void getMovieInfo() {
        System.out.println("Title: " + title +
                ", Director: " + director +
                ", Rating: " + rating);
    }
}
