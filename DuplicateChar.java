import java.util.Scanner;

public class DuplicateChar {
    static final int CharNo=256;
    
    public static void main(String[] args){
        String str;
        Scanner scanner=new Scanner(System.in);
        str=scanner.nextLine();
        duplicate(str);
    }

    private static void duplicate(String str) {
        int count[]=new int[CharNo];
        fillCharCounts(str,count);
        for (int i = 0; i < CharNo; i++) 
            if (count[i] > 1) 
                System.out.println((char)(i) +  
                          ", count = " + count[i]);
    }

    private static void fillCharCounts(String str, int[] count) {
        for(int i=0;i<str.length();i++){
            count[str.charAt(i)]++;
        }
    }
    
}
