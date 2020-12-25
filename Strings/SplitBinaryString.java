package Strings;

public class SplitBinaryString {
    public static void main(String[] args){
        String bin="0100110101";
        int len=bin.length();
        splitString(bin,len);
    }

    private static void splitString(String bin, int len) {
        int count0=0,count1=0,res=0;
        for(int i=0;i<len;i++){
            if(bin.charAt(i)=='0')
               count0++;
            else
               count1++;
            
            if(count0==count1)
               res++;


        }
        if(count0!=count1)
            System.out.println("Can not be determined");

        System.out.println(res);    
    }
    
}
