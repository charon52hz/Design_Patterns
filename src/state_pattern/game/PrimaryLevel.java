package state_pattern.game;

public class PrimaryLevel extends Level{
    @Override
    public void play() {
        System.out.println("---------play game----------");
    }

    @Override
    public int doubleScore(int score) {
        System.out.println("入门级不支持积分加倍功能");
        return score;
    }

    @Override
    public void changeCards() {
        System.out.println("入门级不支持换牌功能");
    }

    @Override
    public void peekCards() {
        System.out.println("入门级不支持偷看牌功能");
    }
}
