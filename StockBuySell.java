import java.util.ArrayList;
import java.util.Scanner;

class Interval{
    int buy,sell;
}

public class StockBuySell {
    public static void main(String[] args){
        int n;
        Scanner scanner=new Scanner(System.in);
        n=scanner.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
          arr[i]=scanner.nextInt();
        maxProfit(arr,n);
        scanner.close();


    }

    private static void maxProfit(int[] arr, int n) {
        int count=0;
        ArrayList<Interval>ans=new ArrayList<Interval>();
        int i=0;
        while(i<n-1){
            while((i<n-1) &&(arr[i+1]<=arr[i]) )
               i++;
              
            if (i == n - 1) 
               break; 
 
           Interval slot = new Interval(); 
           slot.buy = i++; 
           
           while ((i < n) && (arr[i] >= arr[i - 1])) 
                i++; 
  
            slot.sell = i - 1; 
            ans.add(slot); 
 
            count++;
        }
        if(count==0)
           System.out.println("No Profit making day");
        else{
            for(int j=0;i<count;j++){
                System.out.println("Buy on  Day " + ans.get(j).buy + "and Sell on Day " + ans.get(j).sell);
            }
        }  


    }
    
}
