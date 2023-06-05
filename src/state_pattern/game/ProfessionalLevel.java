package state_pattern.game;

public class ProfessionalLevel extends Level{
    @Override
    public void play() {
        System.out.println("---------play game----------");
    }

    @Override
    public int doubleScore(int score) {
        System.out.println("积分加倍");
        return 2 * score;
    }

    @Override
    public void changeCards() {
        System.out.println("换牌");
    }

    @Override
    public void peekCards() {
        System.out.println("高手级不支持偷看牌功能");
    }
}
