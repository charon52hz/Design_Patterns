package observer_pattern;

public class PersonBuySmall implements _Observer{
    @Override
    public void update(int num) {
        if (num<=3){
            System.out.println(this+":赢钱");
        }else
            System.out.println(this+":输钱");
    }
}
