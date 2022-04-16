public class GCD{
    public static void main(String[] args){
        int a=12,b=6;
        int lcm=a>b?a:b;
        while(true){
            if(lcm%a==0 && lcm%b==0){
                System.out.println(lcm);
                break;

            }
            ++lcm;
        }

        // int gcd=1;
        // for(int i=1;i<=a && i<=b;++i){
        //     if(a%i==0 && b%i==0){
        //         gcd=i;
        //     }
        // }
        // System.out.println(gcd);
    }
}