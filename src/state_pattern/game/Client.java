package state_pattern.game;

public class Client {
    public static void main(String[] args) {
        Player player = new Player();
        player.play_win();
        player.play_win();
        player.changeCards();
        player.peekCards();
        player.play_win();
        player.play_win();
        player.play_win();
        player.play_win();
        player.play_win();
        player.peekCards();
    }
}
