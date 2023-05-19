package interpreter_pattern.example_calculator;

import java.util.Map;

public class AddExpression extends SymbolExpression{
    public AddExpression(AbstractExpression left, AbstractExpression right) {
        super(left, right);
    }

    @Override
    public int interpreter(Map<String,Integer> var) {
        return left.interpreter(var)+right.interpreter(var);
    }
}
