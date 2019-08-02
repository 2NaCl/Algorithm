package algorithm;

import java.util.Scanner;

/**
 * 给定一个字符串和一个字符串字典，找到字典里面最长的字符串，该字符串可以通过删除给定字符串的某些字符来得到。
 * 如果答案不止一个，返回长度最长且字典顺序最小的字符串。如果答案不存在，则返回空字符串。
 *
 * @示例 1:
 * @输入: s = "abpcplea", d = ["ale","apple","monkey","plea"]
 * @输出: "apple"
 * 示例 2:
 * @输入: s = "abpcplea", d = ["a","b","c"]
 * @输出: "a"
 */
public class day04 {
    public static final Integer N = 5;

    public static void main(String[] args) {
        System.out.println("输入总的字符串");
        String i = new Scanner(System.in).nextLine();
        System.out.println("开始输入字符序列");
        System.out.println(ex(i,createString()));
    }

    /**
     * 创建字符串序列
     */
    public static String[] createString() {
        String[] strings = new String[N];
        for (int i = 0; i < 5; i++) {
            strings[i] = new Scanner(System.in).nextLine();
        }
        return strings;
    }
    /**
     * 判断
     */
    public static String ex(String s, String... strings) {
        for (int i = 0; i < 5; i++) {
            if (s.contains(strings[i])) {
                return strings[i];
            }
        }
        return "null";
    }
}
