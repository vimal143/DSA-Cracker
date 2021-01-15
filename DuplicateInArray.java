
import java.util.Set;

public class DuplicateInArray {

    private static Set<Integer> set;
    private static int[] arr;

    public static void main(String[] args) {
        int[] arr = new int[] { 1, 8, 2, 3, 4, 1, 5,3,9,8 };
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
