package MultimediaPlayer;

abstract class Media implements Playable{
    String title;
    double duration;

    public Media(String title, double duration) {
        this.title = title;
        this.duration = duration;
    }


}
