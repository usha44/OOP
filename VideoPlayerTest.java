
interface Playlist {
    void addSong(String song);
    void removeSong(String song);
}

class MediaPlayer {
    void play() { System.out.println("Playing media..."); }
    void pause() { System.out.println("Media paused."); }
    void stop() { System.out.println("Media stopped."); }
}

class VideoPlayer extends MediaPlayer implements Playlist {
    public void addSong(String song) {
        System.out.println("Song added: " + song);
    }

    public void removeSong(String song) {
        System.out.println("Song removed: " + song);
    }

    void rewind() { System.out.println("Rewinding video..."); }
    void fastForward() { System.out.println("Fast-forwarding video..."); }
}

public class VideoPlayerTest {
    public static void main(String[] args) {
        VideoPlayer vp = new VideoPlayer();
        vp.play();
        vp.pause();
        vp.stop();
        vp.rewind();
        vp.fastForward();
        vp.addSong("Imagine");
        vp.removeSong("Imagine");
    }
}
