import java.util.*;

public class FirstNonRepeating {
    public static void main(String[] args) {

        String str = "swiss";
        Map<Character, Integer> map = new HashMap<>();

        // Count frequency
        for (char c : str.toCharArray()) {
            if (map.containsKey(c)) {
                map.put(c, map.get(c) + 1);
            } else {
                map.put(c, 1);
            }
        }

        // Find first non-repeating
        for (char c : str.toCharArray()) {
            if (map.get(c) == 1) {
                System.out.println(c);
                break;
            }
        }
    }
}