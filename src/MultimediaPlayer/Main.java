/*
3. Abstract Classes and Interfaces
Exercise:
Design a system for a multimedia player.

Create an interface Playable with methods play(), pause(), and stop().
Create an abstract class Media that implements Playable and has properties String title and double duration.
Create classes Audio and Video that extend Media and provide implementations for the play(), pause(), and stop() methods.
Objective:

Instantiate objects of Audio and Video, set their properties,
and call their methods to demonstrate the use of abstract classes and interfaces.
 */

package MultimediaPlayer;

public class Main {
    public static void main(String[] args) {

        Audio audio = new Audio("Joe Rogan Podcast", 58.25);
        Video video = new Video("Nature Documentary", 120.00);

        // Demonstrating Audio
        System.out.println("Audio:");
        audio.play();
        audio.pause();
        audio.stop();

        // Demonstrating Video
        System.out.println("\nVideo:");
        video.play();
        video.pause();
        video.stop();
    }
}

