package algorithm;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

/**
 * 爱丽丝有一手（hand）由整数数组给定的牌。
 *
 * 现在她想把牌重新排列成组，使得每个组的大小都是 W，且由 W 张连续的牌组成。
 *
 * 如果她可以完成分组就返回 true，否则返回 false。
 *
 *
 *
 * 示例 1：
 *
 * 输入：hand = [1,2,3,6,2,3,4,7,8], W = 3
 * 输出：true
 * 解释：爱丽丝的手牌可以被重新排列为 [1,2,3]，[2,3,4]，[6,7,8]。
 * 示例 2：
 *
 * 输入：hand = [1,2,3,4,5], W = 4
 * 输出：false
 * 解释：爱丽丝的手牌无法被重新排列成几个大小为 4 的组。
 */
public class day06 {
    public static void main(String[] args) {
        System.out.println("开始输入数字吧");
        Map map = new TreeMap();
        int temp=0;
        int imax = 0;
        for (int i = 0; temp!=1000; i++) {
            temp = new Scanner(System.in).nextInt();
            map.put(i + 1, temp);
            imax=i;
        }
        System.out.println("输入一个数");
        int q = new Scanner(System.in).nextInt();
        if (imax % q == 0) {
            System.out.println("true");
        }else System.out.println("false");


    }
}
