package state_pattern.game;

public class SecondaryLevel extends Level{
    @Override
    public void play() {
        System.out.println("---------play game----------");
    }

    @Override
    public int doubleScore(int score) {
        System.out.println("积分加倍");
        return score * 2;
    }

    @Override
    public void changeCards() {
        System.out.println("熟练级不支持换牌功能");
    }

    @Override
    public void peekCards() {
        System.out.println("熟练级不支持偷看牌功能");
    }
}
