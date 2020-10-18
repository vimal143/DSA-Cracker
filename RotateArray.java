public class RotateArray {
    public static void main(String[] args){
       int []array=new int[]{4,5,6,1,6,7,8};
       int length=array.length;
       rotation(array,length);
       for(int i=0;i<length;i++)
           System.out.print(array[i]+" ");
    }

    private static void rotation(int[] array, int length) {
        int last=array[length-1],i;
        for(i=length-1;i>0;i--){
            array[i]=array[i-1];
    
        }
        array[0]=last;

    }
}
