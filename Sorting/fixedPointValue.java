package Sorting;

public class fixedPointValue {
    public static void main(String[] arg){
              int arr[]={-10, -1, 0, 3, 10, 11, 30, 50, 100};
              int value=fixedValue(arr);
              System.out.println(value);
    }

    private static int fixedValue(int[] arr) {
        int len=arr.length;
        for(int i=0;i<len;i++){
            if(arr[i]==i)
              return i;
        }
        return -1;
    }
}
