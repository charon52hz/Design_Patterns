package interpreter_pattern.example_calculator;

import java.util.Map;

public abstract class AbstractExpression {
    public abstract int interpreter(Map<String,Integer> var);
}
