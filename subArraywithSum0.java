import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
public class subArraywithSum0 {
    
    public static void main(String[] args){
        int n;
        Boolean tf;
        Scanner scanner=new Scanner(System.in);
        n=scanner.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
           arr[i]=scanner.nextInt();
        scanner.close();
        tf=sumOfSubArray(arr ,n);
        if(tf)
          System.out.println("Subarray with sum 0 is found");
        else 
          System.out.println("No subarray found");


    }

    private static Boolean sumOfSubArray(int[] arr, int n) {

        Set<Integer> set=new HashSet<Integer>();
        int sum=0;
        for(int i=0;i<n;i++){
            sum+=arr[i];
            if(arr[i]==0||sum==0||set.contains(sum))
               return true;
            set.add(sum);   
                
        }
        return false;
    }
}
