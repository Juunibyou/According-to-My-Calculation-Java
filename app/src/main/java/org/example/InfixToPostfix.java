package org.example; 
import java.util.*; 

public class InfixToPostfix { 

    public String convert(String expression){

        String out = ""; Stack<Character> stack = new Stack<>(); 
        
        for (char c : expression.toCharArray()){ 

            if (Character.isDigit(c)){
                out += c;
            } 
            else if (c == '('){
                stack.push(c);
            } 
            else if (c == ')'){ 

                while (!stack.isEmpty() && stack.peek() != '('){
                    out += stack.pop();
                } 
                stack.pop(); 

            } else { 
                
                while (!stack.isEmpty() && symbol(stack.peek()) >= symbol(c)){
                     out += stack.pop(); 
                } 
                stack.push(c); 
            } 
        } 
        
        while (!stack.isEmpty()){
            out += stack.pop(); 
        }

    return out; 
    } 
    
    private int symbol (char op){
        if (op == '+' || op == '-'){return 1;} 
        if (op == '*' || op == '/'){return 2;} 
        return 0; 
    } 
}