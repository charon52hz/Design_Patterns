package command_pattern.commandCollection;

public class Adder {
    private int sum;
    public int add(int value){
        sum += value;
        return sum;
    }
}
