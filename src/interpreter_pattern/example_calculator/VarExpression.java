package interpreter_pattern.example_calculator;

import java.util.Map;

public class VarExpression extends AbstractExpression{
    private String key;
    public VarExpression(String key){
        this.key = key;
    }
    @Override
    public int interpreter(Map<String,Integer> var) {
        return var.get(this.key);
    }
}
