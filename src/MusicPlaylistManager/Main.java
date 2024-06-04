/* Exercise 2: Music Playlist Manager
Create a Playlist class that manages a list of songs.

Song Class:
Fields: title, artist, duration
Constructor: Initialize all fields

Playlist Class:
Fields: playlistName, songs (an ArrayList of Song objects)
Constructor: Initialize playlistName and an empty songs list
Methods:
addSong(Song song): Adds a song to the playlist.
removeSong(String title): Removes a song by its title.
listSongs(): Prints the details of all songs in the playlist.
totalDuration(): Calculates and returns the total duration of all songs in the playlist.
 */

package MusicPlaylistManager;

public class Main {
    public static void main(String[] args) {

        Song song1 = new Song("Often", "The Weeknd", 2.50);
        Song song2 = new Song("Find ur Love", "Drake", 3.00);
        Song song3 = new Song("Jerry Sprunger", "Tory Lanez", 3.40);

        Playlist playlist1 = new Playlist("Vibes");

        playlist1.addSong(song1);
        playlist1.addSong(song2);
        playlist1.addSong(song3);
        System.out.println();

        playlist1.listSongs();

        playlist1.removeSong(song1.getTitle());

        playlist1.listSongs();
    }
}
