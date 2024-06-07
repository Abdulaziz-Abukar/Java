package MultimediaPlayer;

public class Audio extends Media{

    public Audio(String title, double duration) {
        super(title, duration);
    }

    @Override
    public void play() {
        System.out.println(title + " has been played.");
    }
    @Override
    public void pause() {
        System.out.println(title + " has been paused.");
    }
    @Override
    public void stop() {
        System.out.println(title + " has been stopped.");
    }
}
