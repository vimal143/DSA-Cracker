import java.util.Arrays;
import java.util.Scanner;

public class ChocolateProblem {
    public static void main(String[] args){
        int stud=7;
        int arr[]=new int[]{12, 4, 7, 9, 2, 23,25, 41, 30, 40, 28,42, 30, 44, 48, 43,50};
        int len=arr.length;
        mindiff(arr,len,stud);

    }

    private static void mindiff(int[] arr, int length,int stud) {
        int diff=Integer.MAX_VALUE;
        Arrays.sort(arr);
        for(int i=0;i+stud-1<length;i++){
            int ans=arr[i+stud-1]-arr[i];
            if(ans<diff)
               diff=ans;
              
        }
        System.out.println(diff);
    }
    
}
