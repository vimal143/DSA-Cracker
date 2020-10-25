import java.util.Scanner;

public class InversionCount {
//     Inversion Count for an array indicates – how far (or close) the array is from being
//  sorted. If array is already sorted then inversion count is 0. If array is sorted in
// reverse order that inversion count is the maximum.
// Formally speaking, two elements a[i] and a[j] form an inversion if a[i] > a[j] and i < j

    public static void main(String[] args){
        int n;
        Scanner Scanner=new Scanner(System.in);
        n=Scanner.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
           arr[i]=Scanner.nextInt();
        countInversion(arr,n);   
        
    }

    private static void countInversion(int[] arr, int n) {
        int count=0;
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]>arr[j])
                   count++;
            }
        }
        System.out.println(count);
    }
}
