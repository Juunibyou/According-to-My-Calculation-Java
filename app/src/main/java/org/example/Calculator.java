package org.example; 

public class Calculator { 

    private InfixToPostfix conv; 
    private PostfixEvaluator eval; 

    public Calculator() {
        conv = new InfixToPostfix();
        eval = new PostfixEvaluator();
    }

    public double evaluate(String expression) { 
        String post = conv.convert(expression); 
        return eval.eval(post); 
    } 
}