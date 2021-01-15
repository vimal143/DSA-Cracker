package Strings;

public class longestCommonPrefix {
    public static void main(String[] args){
    String arr[]={"Neharika","Neha","Nehu"};
    int n=arr.length;
    String ans=commonprefix(arr,n);
    System.out.println(ans);

    }

    private static String commonprefix(String[] arr2, int n2) {
        String prefix=arr2[0];
        for(int i=1;i<n2;i++){
            prefix=commonprefixfinder(prefix, arr2[i]);
        }
        return prefix;
    }
    


    private static String commonprefixfinder(String prefix, String string) {
        String result = "";
        int n1 = prefix.length(), n2 = string.length();

        for (int i = 0, j = 0; i <= n1 - 1 && j <= n2 - 1; i++, j++) {
            if (prefix.charAt(i) != string.charAt(j)) {
                break;
            }
            result += prefix.charAt(i);
        } 
  
        return (result);
       
    }
    
}

