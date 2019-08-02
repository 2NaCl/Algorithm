package algorithm;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * 有一个二维矩阵 A 其中每个元素的值为 0 或 1 。
 *
 * 移动是指选择任一行或列，并转换该行或列中的每一个值：将所有 0 都更改为 1，将所有 1 都更改为 0。
 *
 * 在做出任意次数的移动后，将该矩阵的每一行都按照二进制数来解释，矩阵的得分就是这些数字的总和。
 *
 * 返回尽可能高的分数。
 *
 *
 *
 * @示例：
 *
 * @输入：[[0,0,1,1],[1,0,1,0],[1,1,0,0]]
 * @输出：39
 * 解释：
 * 转换为 [[1,1,1,1],[1,0,0,1],[1,1,1,1]]
 * 0b1111 + 0b1001 + 0b1111 = 15 + 9 + 15 = 39
 */
public class day03 {
    public static final Integer ZERO = 0;
    public static final Integer ONE=1;
    public static void main(String[] args) {
        System.out.println("指定行数与列数");
        int row = new Scanner(System.in).nextInt();
        int column = new Scanner(System.in).nextInt();
        System.out.println("开始构建");
        Integer[][] arrayList = new Integer[row][column];
        for (int i = 0; i < row; i++) {//赋值
            for (int j = 0; j < column; j++) {
                arrayList[i][j] = new Scanner(System.in).nextInt();
            }
        }
        for (int i = 0; i < row; i++) {//输出原本的
            for (int j = 0; j < column; j++) {
                System.out.print(arrayList[i][j]+" ");

            }
            System.out.println("\n");
        }

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                arrayList[i][j] = change(arrayList[i][j]);
                System.out.print(arrayList[i][j]+" ");
            }
            System.out.println("\n");
        }
        double k = 0;
        System.out.println("总和为：");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                k = Math.pow(2, 3-j)*arrayList[i][j] + k;
            }

        }
        System.out.println(k);

    }

    public static Integer change(Integer num) {
        if (num == 0) {
            return ONE;
        } else {
            return ZERO;
        } 
    }
}
