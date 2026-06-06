import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class CollectionDemo {
    public static void main(String[] args) {
        //SET:an unodered collection that does allow duplicate elements.
        Set<String> set = new HashSet<>();
        //C
        set.add("set1");
        set.add("set2");
        set.add("Banana");
        //D
        set.remove("set2");
        //R
        boolean hasBanana = set.contains("Banana");//Determin whether "banana" is in the set;/CHECK if "banana" in the set;
        System.out.println(hasBanana);
        for(String s : set){
            System.out.println(s);

        }

        System.out.println(set);

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
