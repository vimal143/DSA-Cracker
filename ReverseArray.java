import java.util.Scanner;

public class ReverseArray{
    public static void main(String[] args){
        int arr[]=new int[10];
        int n;
        Scanner scan=new Scanner(System.in);
        n=scan.nextInt();
        for(int i=0;i<n;i++)
            arr[i]=scan.nextInt();
        scan.close();   
        for(int i=0;i<n;i++) 
            System.out.print(arr[i]+" ");
        System.out.println();
        reverse(arr,0,n-1);
        for(int i=0;i<n;i++)
            System.out.print(arr[i]+" ");
    }
    private static int[] reverse(int[] arr, int start, int end) {
        int temp;
        while(start<end){
            temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            end--;
            start++;
        }
        return arr;

    }

}