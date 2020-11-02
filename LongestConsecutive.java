import java.util.Arrays;

//Longest Consecutive subsequence
public class LongestConsecutive {
    public static void main(String[] args){
        int arr[]=new int[]{36, 41, 56, 35, 44, 33, 34, 92, 43, 32, 42 };
        int len=arr.length;
        subsequence(arr,len);
    }

    static int subsequence(int arr[], 
                                   int n)
{
     
    // Sort the array 
     Arrays.sort(arr);
      
      int ans = 0, count = 1;
       
    // find the maximum length 
    // by traversing the array 
      for(int i = 1; i < n; i++)
    {
         
        // If the current element is 
        // equal to previous element +1 
        if (arr[i] == arr[i - 1] + 1)
            count++;
        else
            count = 1;
             
        // Update the maximum 
        ans = Math.max(ans, count);
    }
    return ans;
}


}
    

