package Sorting;

public class positionsInSortedArray {
    public static void main(String[] args){
        int []arr={1,2,2,2,2,3,4,5,5,6,7,8,8,8,8};
        int search=9;
        checkPosition(arr,search);
    }

    private static void checkPosition(int[] arr, int search) {
        int len=arr.length;
        int first=-1,last=-1;
        for(int i=0;i<len;i++){
            if(search!=arr[i])
               continue;
            if(first==-1){
                first=i;
                last=i;
            }  
            last=i;
                  

        }
        if(first!=-1){
            System.out.println("First index Found="+first);
            System.out.println("Last index found="+last);
        }
        else{
            System.out.println("Not found");
        }
    }
}
