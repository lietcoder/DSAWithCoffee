package DSANotesProblems;

public class LongestSubstringIn2Strings {

    public static int longestSubString(String s, String t){
        char[] c1 = s.toCharArray() ;
        char[] c2 = t.toCharArray();
        int[][] dp = new int[s.length()+1][t.length()+1];
        int max =0;
        for(int i=1;i<s.length(); i++){
            for(int j=1;j<t.length();j++){
               if(s.charAt(i-1)==t.charAt(i-1)){
                   dp[i][j]= dp[i-1][j-1]+1;
                   max = Math.max(dp[i][j], max);
                }
            }
        }
        return max;
    }

    public static void main(String[] args) {
        System.out.println("lenth of longest substr: "+ longestSubString("abcdaf", "zbcf"));
    }
}
