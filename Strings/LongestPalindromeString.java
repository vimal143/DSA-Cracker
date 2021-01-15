package Strings;

public class LongestPalindromeString {
    public static void main(String[] args) {
        String s = "Kanak";
        System.out.println(s.length());
        longestPalindrome(s);
    }

    private static void longestPalindrome(String s) {
        int n = s.length();
        boolean matrix[][] = new boolean[n][n];
        int maxlength = 1;
        for (int i = 0; i < n - 1; i++) {
            matrix[i][i] = true;
        }
        int start = 0;
        for (int i = 0; i < n - 1; ++i) {
            if (s.charAt(i) == s.charAt(i + 1)) {
                matrix[i][i + 1] = true;
                start = i;
                maxlength = 2;
            }
        }
        for (int k = 3; k <= n; ++k) {
            {
                for (int i = 0; i < n - k + 1; ++i) {
                    int j = i + k - 1;
                    if (matrix[i + 1][j - 1] && s.charAt(i) == s.charAt(j)) {
                        matrix[i][j] = true;
                        if (k > maxlength) {
                            start = i;
                            maxlength = k;
                        }
                    }
                }
            }
            System.out.println("LongestPalindromeString is: ");
            printString(s, start, start + maxlength - 1);
        }
    }

    private static void printString(String s, int start, int i) {

        System.out.println(s.substring(start, i + 1));
    }
}