package MusicPlaylistManager;
import java.util.ArrayList;
public class Playlist {
    private String playlistName;
    ArrayList<Song> songs;

    public Playlist(String playlistName) {
        this.playlistName = playlistName;
        songs = new ArrayList<>();
    }

    public void addSong(Song song) {
        songs.add(song);
        System.out.println(song.getTitle() + " Has been added to " + playlistName);
    }

    public void removeSong(String title) {
        for (int i = 0; i < songs.size(); i++) {
            if (songs.get(i).getTitle().equals(title)) {
                songs.remove(i);
                System.out.println(title + " Removed from: " + playlistName);

                return;
            }
        }
        System.out.println(title + " not found in" + playlistName);
    }

    public void listSongs() {
        System.out.println("Playlist: " + playlistName);
        for (Song song : songs) {
            song.displaySongInfo();
        }
    }
}
