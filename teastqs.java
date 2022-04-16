public class teastqs {
    public static void main(String[] args){
        int arr[][]={
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };
        int diag1=0;
        int diag2=0;
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                if(i==j)
                   diag1+=arr[i][j];

                else if((i+j)==2)
                   diag2+=arr[i][j];   
            }
        }
        System.out.println(diag1);
        System.out.println(diag2);
    }
    
}
