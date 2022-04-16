public class Testq {
    public static void main(String[] args){
        int arr[]={1,2,9,8,5,6};
        
        int lar=arr[0];
        //int seclar=arr[1];
        int seclar;
        for(int i=1;i<6;i++){
            if(arr[i]>lar ){
                seclar=lar;
                lar=arr[i];
                
            }
            

        }
        
        
        System.out.println(lar);
    }
    
}
