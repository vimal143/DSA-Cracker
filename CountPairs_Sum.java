import java.util.Scanner;

// Given an array of integers, and a number ‘sum’, find the number of pairs of integers in
//  the array whose sum is equal to ‘sum’.
public class CountPairs_Sum {
    public static void main(String[] args){
        int n,sum;
        Scanner scanner=new Scanner(System.in);
        n=scanner.nextInt();
        sum=scanner.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
           arr[i]=scanner.nextInt();
        count_Pair_for_sum(arr,n,sum);   
    }

    private static void count_Pair_for_sum(int[] arr, int n,int sum) {
        int count=0;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]+arr[j]==sum)
                   count++;

            }
        }
        System.out.println(count);
    }

    
}
