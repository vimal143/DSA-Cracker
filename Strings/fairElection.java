package Strings;

import java.util.Arrays;
import java.util.Scanner;


public class fairElection {
    public static void main(String[] args){
        int tc;
        Scanner scanner=new Scanner(System.in);
        tc=scanner.nextInt();
        while(tc>0){
            int N=scanner.nextInt();
            int M=scanner.nextInt();
            int[] A=new int[N];
            int[] B=new int[M];
            int sumA=0,sumB=0;
            for(int i=0;i<N;i++){
                A[i]=scanner.nextInt();
                sumA+=A[i];
            }   
            for(int j=0;j<M;j++){
                B[j]=scanner.nextInt();
                sumB+=B[j];
            }
                
         election(A,B,N,M,sumA,sumB);

        }
        }

        private static void election(int[] a, int[] b, int n, int m,int sumA,int sumB) {
            int swap=0;
            int temp;
            int suma=sumA;
            int sumb=sumB;
            while(suma<=sumb){
                int min = Arrays.stream(a).min().getAsInt();
                int max = Arrays.stream(b).max().getAsInt();
                int indexA=findIndex(a,min);
                int indexB=findIndex(b, max);
                if(min<max){
                    temp=a[indexA];
                    a[indexA]=b[indexB];
                    b[indexB]=temp;
                    suma=(suma+max)-min;
                    sumb=(sumb-max)+min;
                    swap++;
                }
            }

            if(swap>0)
            System.out.println(swap);
            else 
            System.out.println(-1);
        }


        private static int findIndex(int[] a, int val) {

            int len = a.length;  
 
          for(int i=0;i<len;i++)
         {
             if(a[i]==val)
               return i;
         }
        return -1;
    }
}
