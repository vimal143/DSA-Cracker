import java.util.Arrays;

import java.util.Scanner;

public class watchingcpl {
    public static void main(String[ ] args){
        int tc;
        Scanner scanner=new Scanner(System.in);
        tc=scanner.nextInt();
        while(tc>0){
            int N,K,sum=0;
            N=scanner.nextInt();
            K=scanner.nextInt();
            int H[]=new int[N];
            for(int i=0;i<N;i++){
                H[i]=scanner.nextInt();
                sum+=H[i];

            }
            if(sum<(2*K))
               System.out.println(-1);
            else if(sum==(2*K))
              System.out.println(H.length);  
            if(sum>(2*K)){
                Arrays.sort(H);
            for (int xi = 0; xi < N / 2; xi++) { 
                    int t = H[xi]; 
                    H[xi] = H[N - xi - 1]; 
                    H[N - xi - 1] = t; 
                } 
                int l=0,j=0,k=0;
                int sa=0;
                for(j=0;j<N;j++){
                    sa+=H[j];
                    if(sa>=K)
                       break;
                    for( k=j+1;k<N;k++) {
                        if(H[k]>=(K-sa))
                           l=1;
                    } 
                    if(l==1){
                        sa=sa+H[k];
                        int temp=H[k];
                        H[j+1]=H[k];
                        H[k]=temp;

                    } 
                }
                int sb=0,m=0;
                while(j<N){
                    
                    sb=sb+H[j];
                    if(sb>=K)
                       break;

                    for(k=j+1;K<N;K++){
                        if(H[k]>=(K-sb))
                           m=1;

                    }
                    if(l==1){
                        sb=sb+H[k];
                        int temp=H[k];
                        H[j+1]=H[k];
                        H[k]=temp;

                    }    
                }

            } 
            tc--;
        }

    }
}
