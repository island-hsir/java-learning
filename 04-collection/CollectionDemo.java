import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class CollectionDemo {
    public static void main(String[] args) {
        // ArrayList 动态数组
        ArrayList<String> list = new ArrayList<>(Arrays.asList("huzhengkang", "jiangsjiao"));
        list.add("panliyue");
        System.out.println(list);
        list.remove("panliyue");
        list.set(1, "dashuaige");
        System.out.println(list);

        // HashMap 键值对
        HashMap<String, Integer> scores = new HashMap<>();
        scores.put("tom", 99);
        scores.put("jack", 100);
        scores.put("alice", 100);
        System.out.println(scores);

        // 通过 value 找 key
        String result = findByValue(scores, 100);
        System.out.println(result);
    }

    public static String findByValue(HashMap<String, Integer> map, Integer target) {
        for (String key : map.keySet()) {
            if (map.get(key).equals(target)) {
                return key;
            }
        }
        return null;
    }
}
