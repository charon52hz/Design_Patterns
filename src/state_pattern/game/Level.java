package state_pattern.game;

public abstract class Level {
    public abstract void play();
    public abstract int doubleScore(int score);
    public abstract void changeCards();
    public abstract void peekCards();
}
