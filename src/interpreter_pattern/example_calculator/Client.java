package interpreter_pattern.example_calculator;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

/**
 * AbstractExpression:抽象表达式，声明了抽象的解释操作，是所有终结符表达式和非终结符表达式的公共父类。
 * SymbolExpression：非终结符表达式，实现了文法中非终结符的解释操作，由于在非终结符表达式中可以包含终结符表达式， 也可以继续包含非终结符表达式， 因此其解释操作一般通过递归的方式来完成。
 * VarExpression：终结符表达式，实现了与文法中的终结符相关联的解释操作，在句子中的每一个终结符都是该类的一个实例。
 * AddExpression、SubExpression：非终结符表达式的具体实现
 * Calculator：上下文环境，存储解释器之外的一些全局信息
 *
 * 增加新的解释表达式较为方便。 如果用户需要增加新的解释表达式只需要对应增加一个新的终结符表达式或非终结符表达式类， 原有表达式类代码无须修改， 符合“开闭原则”
 * 对于复杂文法难以维护。在解释器模式中，每一条规则至少需要定义一个类，因此如果一个语言包含太多文法规则，类的个数将会急剧增加，导致系统难以管理和维护，此时可以考虑使用语法分析程序等方式来取代解释器模式。
 */
public class Client {
    public static void main(String[] args) throws IOException {
        System.out.println("请输入表达式：");
        String input = new BufferedReader(new InputStreamReader(System.in)).readLine();

        HashMap<String, Integer> value = getValue(input);
        Calculator calculator = new Calculator(input);
        System.out.println("运算结果为："+input+"="+calculator.run(value));
    }
    public static HashMap<String,Integer> getValue(String exprStr) throws IOException{
        HashMap<String,Integer> map = new HashMap<String,Integer>();
        //解析有几个参数要传递
        for(char ch:exprStr.toCharArray()){
            if(ch != '+' && ch != '-'){
                //解决重复参数的问题
                if(!map.containsKey(String.valueOf(ch))){
                    System.out.println("请输入"+ch+"的值：");
                    String in = (new BufferedReader(new InputStreamReader (System.in))).readLine();
                    map.put(String.valueOf(ch),Integer.valueOf(in));
                }
            }
        }
        return map;
    }
}
