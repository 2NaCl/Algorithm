package algorithm;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class day07 {
    public static void main(String[] args) {
        Map map = new HashMap<String, Integer>();
        map.put("R", 1);
        map.put("L", -1);
        map.put("U", 2);
        map.put("D", -2);
        int sum = 0;
        String word = new Scanner(System.in).nextLine();
        word = "R";
        Map map1 = new HashMap<String,Integer>();
        for (int i = 0; i < 4; i++) {
            word = new Scanner(System.in).nextLine();
            sum = (int) map.get(word);
        }
        System.out.println(sum==0?"true":"false");
    }
}
