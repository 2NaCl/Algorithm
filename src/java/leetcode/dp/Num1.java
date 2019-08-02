package leetcode.dp;

import java.util.Scanner;

/**
 * 给定一个字符串 s，找到 s 中最长的回文子串。你可以假设 s 的最大长度为 1000。
 *
 * 输入: "babad"
 * 输出: "bab"
 * 注意: "aba" 也是一个有效答案。
 */
public class Num1 {
    public static void main(String[] args) {
        String s = new Scanner(System.in).nextLine();
        System.out.println(new Num1().longestPalindrome(s));
    }
    public String longestPalindrome(String s) {
        int k = 0;
        int sub = 0;
        String[][] s3 = new String[Integer.MAX_VALUE][Integer.MAX_VALUE];
        String s1 = new StringBuffer(s).reverse().toString();
        for (int i = 0; i < s.length(); i++) {
            for (int j = 0; j < s.length(); j++) {
                if (i==0||j==0){
                    s3[i][j] = "1";
                }else if (compare(s.charAt(i),s1.charAt(j))) {
                    s3[i][j] = s3[i - 1][j - 1] + 1;
                }
            }
            if (s3[i].length > k) {
                k = s3[i].length;
                sub = i;
            }

        }
        return s.substring(sub - k + 1, sub + 1);
    }


    public boolean compare(char s1, char s2) {
        if (s1==s2) {
            return true;
        } else return false;
    }
}
