package org.example; 
import java.util.*; 

public class PostfixEvaluator { 
    public double eval(String exp) { 
        Stack<Double> stack = new Stack<>(); 
        for(int i = 0; i < exp.length(); i++){ 
            
            char c = exp.charAt(i); 

            if(Character.isDigit(c)) { 
                stack.push((double)(c - '0')); 
            } 
            else { 
                double b = stack.pop(); 
                double a = stack.pop(); 
                
                if (c=='+'){stack.push(a+b);} 
                else if (c=='-'){stack.push(a-b);} 
                else if (c=='*'){stack.push(a*b);} 
                else if (c=='/'){stack.push(a/b);} 
            } 
        }

        return stack.pop(); 
    } 
}