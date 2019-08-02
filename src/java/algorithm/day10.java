package algorithm;

import java.text.SimpleDateFormat;
import java.util.Date;

public class day10 {
    public static void main(String[] args) {
        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        System.out.println(sdf.format(date));
    }
}
