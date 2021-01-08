import java.util.Arrays;

public class Test {
    public static void main(String[] args){
       String s="345123";
       char tempArray[]=s.toCharArray();
       Arrays.sort(tempArray);
       System.out.println( new String(tempArray));
    }
}
