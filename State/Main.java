package State;

public class Main {
    public static void main(String[] args) {
        MusicPlayer player = new MusicPlayer();
        player.play();
        player.stop();
        player.play();
        player.resume();
        player.pause();
        player.stop();
        player.stop();
    }
}
