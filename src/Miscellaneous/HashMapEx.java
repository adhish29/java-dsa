package Miscellaneous;

import java.util.HashMap;
import java.util.Map;

public class HashMapEx {
    public static void main(String[] args) {
        Map<Integer, String> m = new HashMap<>();
        m.put(1, "Adhish");
        m.put(2, "Fida");
        m.put(3, "Rakesh");
        System.out.println(m.get(3));
        for (Map.Entry<Integer, String> e : m.entrySet()) {
            System.out.println(e.getKey() + " : " + e.getValue());
        }
        if (m.get(4) == null) {
            System.out.println("ddd");
        }
        System.out.println(m.computeIfAbsent(4, k -> "Abhash"));
        m.computeIfPresent(3, (k, v) -> "Raj");
        System.out.println(m.toString());
        System.out.println(m.getOrDefault(100, "Not Present"));
        System.out.println(m.remove(1));
    }
}
