import java.util.Scanner;

public class palindromeString {
    public static void main(String[] args){
        String str;
        Scanner scanner=new Scanner(System.in);
        str=scanner.next();
        scanner.close();
        palindrome(str);
    }

    private static void palindrome(String str) {
        int len=str.length()-1;
        int i=0;
        while(i<len){
            if(str.charAt(i)!=str.charAt(len))
            {
                System.out.println("Not a Palindrome");
                break;
            }
              
            i++;
            len--;  
        }

        System.out.println("Palindrome String");
    }
    
}
