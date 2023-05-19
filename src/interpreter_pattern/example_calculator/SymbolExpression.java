package interpreter_pattern.example_calculator;


import java.util.Map;

public abstract class SymbolExpression extends AbstractExpression{
    protected AbstractExpression left;
    protected AbstractExpression right;

    public SymbolExpression(AbstractExpression left,AbstractExpression right){
        this.left = left;
        this.right = right;
    }
    @Override
    public abstract int interpreter(Map<String,Integer> map);
}
