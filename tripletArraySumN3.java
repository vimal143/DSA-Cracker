import java.util.Scanner;

public class tripletArraySumN3 {
    public static void main(String[] args){
        int n,sum=0;
        Scanner scanner=new Scanner(System.in);
        n=scanner.nextInt();
        sum=scanner.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=scanner.nextInt();
        }
        scanner.close();
        tripletSearch(arr,n,sum);

    }

    private static void tripletSearch(int[] arr, int n,int sum) {
        for(int i=0;i<n-2;i++){
            for(int j=0;j<n-1;j++){
                for(int k=0;k<n;k++){
                    if(arr[i]+arr[j]+arr[k]==sum){
                        System.out.println(arr[i]+","+arr[j]+","+arr[k]);
                    }
                }
            }
        }
    }
    
}
