package lec15;

import java.util.HashMap;
import java.util.Map;

public class Lec15Map {
    public static void main(String[] args) {

        // JDK 8까지
        Map<Integer, String> map = new HashMap<>();
        map.put(3, "A");
        map.put(4, "B");

        // JDK 9부터
        Map<Integer, String> map2 = Map.of(1, "A", 2, "B");

        // key만 가져오기
        for (int key : map.keySet()) {
            System.out.println(key);
            System.out.println(map.get(key));
        }

        // key-value 쌍으로 가져오기
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }
    }
}
