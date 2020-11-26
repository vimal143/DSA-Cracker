import java.util.Scanner;

public class stringRotation {
    public static void main(String[ ] args){
        String str1,str2;
        Scanner scanner =new Scanner(System.in);
        str1=scanner.nextLine();
        str2=scanner.nextLine();
        scanner.close();
        Boolean check=checkRoation(str1,str2);
        if(check)
            System.out.println("Strings are Rotation of Each Other");
        else
            System.out.println("No Rotation Found");    
    }

    private static Boolean checkRoation(String str1, String str2) {
        return (str1.length()==str2.length() && ((str1+str1).indexOf(str2)!=-1));
        
    }
    
}
