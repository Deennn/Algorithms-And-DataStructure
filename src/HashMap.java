import java.util.Map;

public class HashMap {


    public static void main(String[] args) {
        Map<String, Integer> map = new java.util.HashMap<>();

        map.put("abc", 1);
        map.put("a", 12);
        map.put("c", 13);
        System.out.println(map.get("a"));
        System.out.println(map);
    }
}
