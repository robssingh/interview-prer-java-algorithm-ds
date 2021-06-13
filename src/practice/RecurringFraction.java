package practice;

import java.util.HashMap;

public class RecurringFraction {

    public static void format(int numr, int denr) {
        String res = "";
        HashMap<Integer, Integer> map = new HashMap<>();
        int rem = numr % denr;
        while (rem != 0 && !map.containsKey(rem)) {
            map.put(rem, res.length());
            rem *= 10;
            System.out.println(rem);
            int res_part = rem / denr;
            res += String.valueOf(res_part);
            rem = rem % denr;
        }
        if (rem == 0) {
            System.out.println("");
        } else if (map.containsKey(rem)) {
            System.out.println(res.substring(map.get(rem)));
        }
    }

    public static void main(String[] args) {
        format(50, 22);
    }

}
