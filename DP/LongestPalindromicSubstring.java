package DP;

public class LongestPalindromicSubstring {
    public static void main(String[] args) {
        //case 1
        String case1 = "babaddab";
        System.out.println(longestPalindrome(case1));
        //case 2
        String case2 = "cbbd";
        System.out.println(longestPalindrome(case2));
    }
    public static String longestPalindrome(String s){
        int n = s.length();
        int max = 0;
        int begin = 0;
        boolean[][] dp = new boolean[n][n];
        for(int i = 0; i < n; i++){
            dp[i][i] = true;
        }
        for(int l = 1; l <= n; l++){
            for(int i = 0; i <= n - l; i++){
                int j = i + l - 1;
                if(l == 2 && s.charAt(i) == s.charAt(j)){
                    dp[i][j] = true;
                }
                if(l > 2 && s.charAt(i) == s.charAt(j)){
                    dp[i][j] = dp[i + 1][j - 1];
                }
                if(dp[i][j]){
                    int length = j - i + 1;
                    if(length > max){
                        max = length;
                        begin = i;
                    }
                }
            }
        }
        return s.substring(begin, begin + max);
    }
}
