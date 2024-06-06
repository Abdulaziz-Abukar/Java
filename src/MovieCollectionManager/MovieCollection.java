package MovieCollectionManager;
import java.util.ArrayList;
public class MovieCollection {
    private String collectionName;
    ArrayList<Movie> movies;

    public MovieCollection(String collectionName) {
        this.collectionName = collectionName;
        movies = new ArrayList<>();
    }

    public void addMovie(Movie movie) {
        movies.add(movie);
    }

    public void removeMovie(String title) {
        for (int i = 0; i < movies.size(); i++) {
            if (movies.get(i).getTitle().equals(title)) {
                movies.remove(i);
                System.out.println("Movie has been removed.");
                return;
            }
        }
        System.out.println("Movie has not been found in collection.");
    }

    public void listMovies() {
        for (Movie movie : movies) {
            movie.getMovieInfo();
        }
    }

    public double averageRating() {
        double avgRating = 0;
        int count = 0;
        for (Movie movie : movies) {
            avgRating += movie.getRating();
            count++;
        }
        return avgRating / count;
    }
}
