/*
Exercise 6: Movie Collection Manager
Create a MovieCollection class that manages a list of movies.

Movie Class:
Fields: title, director, rating
Constructor: Initialize all fields

MovieCollection Class:
Fields: collectionName, movies (an ArrayList of Movie objects)
Constructor: Initialize collectionName and an empty movies list
Methods:
addMovie(Movie movie): Adds a movie to the collection.
removeMovie(String title): Removes a movie by its title.
listMovies(): Prints the details of all movies in the collection.
averageRating(): Calculates and returns the average rating of all movies in the collection.
 */

package MovieCollectionManager;

public class Main {
    public static void main(String[] args) {
        Movie movie1 = new Movie("Black Panther", "Nigga", 10.00);
        Movie movie2 = new Movie("Spiderman", "Stan Lee", 8.50);
        Movie movie3 = new Movie("Get Out", "IDK", 7.79);
        Movie movie4 = new Movie("Venom", "Marvel", 5.25);

        MovieCollection collection = new MovieCollection("MyCollection");

        collection.addMovie(movie1);
        collection.addMovie(movie2);
        collection.addMovie(movie3);
        collection.addMovie(movie4);

//        collection.listMovies();
//        collection.removeMovie(movie1.getTitle());
//        collection.listMovies();

        double average_rating = collection.averageRating();
        System.out.printf("average rating of collection: %.2f%n", average_rating);
    }
}
