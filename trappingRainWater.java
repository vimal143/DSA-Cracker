public class trappingRainWater {

    public static void main(String[] args) {
        int arr[] = new int[] { 0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1 };
        int n = arr.length;
        water(arr, n);
    }

    private static void water(int[] arr, int n) {
        int res = 0;
        for (int i = 0; i < n - 1; i++) {
            int left = arr[i];
            for (int j = 0; j < i; j++) {
                left = Math.max(left, arr[j]);
            }
            int right = arr[i]; 
            for(int j = i + 1; j < n; j++) 
            { 
                right = Math.max(right, arr[j]); 
            } 
            res += Math.min(left, right) - arr[i]; 
    } 
      System.out.println(res);  
    }
        
    
}
