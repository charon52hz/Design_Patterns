package interpreter_pattern.example_calculator;

import java.util.Map;
import java.util.Stack;

public class Calculator {
    private AbstractExpression expression;

    public Calculator(String inputExpression){
        Stack<AbstractExpression> stack = new Stack<>();
        char[] charArray = inputExpression.toCharArray();
        AbstractExpression left = null;
        AbstractExpression right = null;
        for (int i=0;i<charArray.length;i++){
            switch (charArray[i]){
                case '+':
                    left = stack.pop();
                    right = new VarExpression(String.valueOf(charArray[++i]));
                    stack.push(new AddExpression(left,right));
                    break;
                case '-':
                    left = stack.pop();
                    right = new VarExpression(String.valueOf(charArray[++i]));
                    stack.push(new SubExpression(left,right));
                    break;
                default:
                    stack.push(new VarExpression(String.valueOf(charArray[i])));
            }
        }
        this.expression = stack.pop();
    }

    public int run(Map<String,Integer> var){
        return this.expression.interpreter(var);
    }
}
