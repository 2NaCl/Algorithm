package algorithm;

import java.util.Scanner;

/**
 * 给定一个整数数组 nums 和一个目标值 target，请你在该数组中找出和为目标值的那 两个 整数，并返回他们的数组下标。
 *
 * 你可以假设每种输入只会对应一个答案。但是，你不能重复利用这个数组中同样的元素。
 *
 * @示例:
 *
 * 给定 nums = [2, 7, 11, 15], target = 9
 *
 * 因为 nums[0] + nums[1] = 2 + 7 = 9
 * 所以返回 [0, 1]
 */
public class day02 {
    public static void main(String[] args) {
        int[] arr = new int[5];
        int i ;
        System.out.println("请指定一个数");
        int j = new Scanner(System.in).nextInt();
        for (i = 0; i<5; i++) {
            arr[i] = new Scanner(System.in).nextInt();
        }
        for (int k = 0; k < i-1; k++) {
            for (int q = 1; q < i; q++) {
                if (arr[k] + arr[q] == j) {
                    System.out.println(k+","+q);
                }
            }
        }
    }
}
