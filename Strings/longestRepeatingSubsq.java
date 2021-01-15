package Strings;

public class longestRepeatingSubsq {
    public static void main(String[] args){
        String str="aabbbbbbbaa";
        repeatingSubsequence(str);
    }

    private static void repeatingSubsequence(String str) {
        int n=str.length();
        int table[][]=new int[n+1][n+1];
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(str.charAt(i-1)==str.charAt(j-1) && i!=j){
                    table[i][j]=1+table[i-1][j-1];
                }
                else 
                   table[i][j]=Math.max(table[i][j-1],table[i-1][j]);
            }
        }
            System.out.println("Longest Repeating Substring:"+table[n][n]);
    }
    
}
