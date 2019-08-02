package algorithm;


import com.sun.xml.internal.ws.api.pipe.Fiber;

import java.util.Arrays;
import java.util.Scanner;

/**
 给定一个整数数组 nums，其中恰好有两个元素只出现一次，其余所有元素均出现两次。 找出只出现一次的那两个元素。

 示例 :

 输入: [1,2,1,3,2,5]
 输出: [3,5]
 */
public class day09 {
    public static void main(String[] args) {
        int arr[] = new int[]{5,4,7,8,9,5,4,10,14,25,41};
        for (int i = 0; i < arr.length; i++) {
            if (!String.valueOf(arr).contains(String.valueOf(arr[i]))) {
                System.out.println(arr[i]);
            }
        }
    }
}

