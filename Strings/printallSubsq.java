package Strings;

import java.util.ArrayList;

public class printallSubsq {
   static ArrayList<String> res=new ArrayList<String>();
    public static void main(String[] args){
        String name="Vimal";
        subsequence(name,"");
        System.out.println(res);



    }

    private static void subsequence(String name, String ans) {
        if(name.length()==0){
            res.add(ans);
            return;
        }
        subsequence(name.substring(1), ans+name.charAt(0));
        subsequence(name.substring(1), ans);
    }
    
}
