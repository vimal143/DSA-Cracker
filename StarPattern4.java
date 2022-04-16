public class StarPattern4 {
    public static void main(String[] arguments){
        for(int i=1;i<=5;i++){
            for(int j=1;j<=7;j++){
                if(j>=5-i && j<=3+i)
                   System.out.print("*");
                else
                   System.out.print(" ");   
            }
            System.out.print("\n");

        }


    }
    
}
