package state_pattern.game;

public class Player {
    private int score;
    private Level level;
    public Player(){
        this.score = 0;
        this.level = new PrimaryLevel();
    }
    public void play_win(){
        this.level.play();
        score = score + doubleScore(10);
        gradeChange();
        System.out.println("当前积分为："+score+" ，当前等级为："+level);
    }
    public void play_lose(){
        this.level.play();
        score -= 10;
        gradeChange();
        System.out.println("当前积分为："+score+" ，当前等级为："+level);
    }
    private int doubleScore(int score){
        return this.level.doubleScore(score);
    }
    public void changeCards(){
        this.level.changeCards();
    }
    public void peekCards(){
        this.level.peekCards();
    }
    private void gradeChange(){
        if (this.score<10){
            this.level = new PrimaryLevel();
        }else if (this.score<50){
            this.level = new SecondaryLevel();
        }else if (this.score<100){
            this.level = new ProfessionalLevel();
        }else
            this.level = new FinalLevel();
    }
}
