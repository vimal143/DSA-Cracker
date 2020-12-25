package Strings;

import java.util.ArrayDeque;
import java.util.Deque;

public class BalancedBracket {
    public static void main(String[] args){
        String brackets="([{}])";
        if(bracketsBalanced(brackets))
           System.out.println("Brackets are Balanced");
        else  
           System.out.println("Brackets are not Balanced");
    }

    private static boolean bracketsBalanced(String brackets) {
        int len=brackets.length();
        Deque stack=new ArrayDeque<Character>();
        for(int i=0;i<len;i++){
            char c=brackets.charAt(i);
            if(c=='(' || c=='[' || c=='{'){
                stack.push(c);
                continue;
            }
            if(stack.isEmpty())
              return false;
            char check;  
            switch(c){
                case ')': 
                 check = (Character)(stack.pop());
                 if (check == '{' || check == '[') 
                    return false; 
                break;
                case '}': 
                check = (Character)stack.pop(); 
                if (check == '(' || check == '[') 
                    return false; 
                break; 
  
            case ']': 
                check = (Character)stack.pop(); 
                if (check == '(' || check == '{') 
                    return false; 
                break;  

            }  

        }
        return (stack.isEmpty());
    }
    
}
