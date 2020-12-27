package Strings;

import java.util.Stack;

public class balanceTheBracket{
    public static void main(String[] args){
        String brackets="}}{{";
        System.out.println(checkBalanceExp(brackets));

    }

    private static int checkBalanceExp(String brackets) {
              int len=brackets.length();
              if(len%2!=0)
                 return -1;
              Stack<Character> stack=new Stack<>();
              for(int i=0;i<len;i++){
                  char c=brackets.charAt(i);
                  if(c=='}'&& !stack.isEmpty()){
                      if(stack.peek()=='{')
                         stack.pop();
                  else
                      stack.push(c);

                  }
                  stack.push(c);
              }
              int reducedLength = stack.size();
              int n = 0; 
        while (!stack.empty() && stack.peek() == '{') 
        { 
            stack.pop(); 
            n++; 
        } 
        return (reducedLength/2 + n%2);
      



        
    }

}