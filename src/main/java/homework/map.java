
package homework;

import java.util.HashMap;
import java.util.Map;

public class map {
    public static void main(String[] args) {
        Map<String, Integer> info = new HashMap<>();

        info.put("Tom", 1200);
        info.put("Jarry", 800);
        info.put("Peter", 1000);
        info.put("Jack", 1100);

        for (String s : info.keySet()) {
            System.out.println(s + " " + info.get(s));
        }

        System.out.println("");
        info.remove("Tom");

        for (String s : info.keySet()) {
            System.out.println(s + " " + info.get(s));
        }

        System.out.println("");

        info.put("Jack", 1500);
        System.out.println("Jack的工资为" + info.get("Jack"));

        System.out.println("");

        for (String s : info.keySet()) {
            if (info.get(s) <= 1000) {
                info.put(s, (int) (info.get(s)*1.2));
                System.out.println(s + " " + info.get(s));
            }
        }
    }

    }


