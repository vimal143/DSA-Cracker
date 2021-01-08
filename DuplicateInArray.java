
import java.util.Set;

public class DuplicateInArray {

    private static Set<Integer> set;
    private static int[] arr;

    public static void main(String[] args) {
        int[] arr = new int[] { 1, 1, 2, 3, 4, 3, 5 };
        int len = arr.length;
        findDuplicate(arr, len);
    }

    private static void findDuplicate(int[] arr, int len) {
        for (int i = 0; i < len; i++) 
        { 
            if (arr[ Math.abs(arr[i])] >= 0) 
                arr[ Math.abs(arr[i])] = -arr[ Math.abs(arr[i])]; 
            else
                System.out.print(Math.abs(arr[i]) + " "); 
        }          
    }
    
}
