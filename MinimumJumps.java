// Minimum number of jumps to reach end
public class MinimumJumps {
       
    public static void main(String[ ] args){
        int [] arr=new int[]{1, 3, 5, 8, 9, 2, 6, 7, 6, 8, 9};
        int len=arr.length;
        System.out.println(jumpsEnd(arr,0,len-1));
        
    }

    private static int jumpsEnd(int[] arr, int v, int len) {
        if(len==v)
           return 0;
       if(arr[v]==0)
          return Integer.MAX_VALUE;
       int  min=Integer.MAX_VALUE;
       for (int i = v + 1; i <= len && i <= v + arr[v];  i++) { 
            int jumps = jumpsEnd(arr, i, len); 
            if (jumps != Integer.MAX_VALUE && jumps + 1 < min) 
                min = jumps + 1; 
        } 
        return min;    

    }

    
}
