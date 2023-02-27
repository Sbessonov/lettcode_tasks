package service.roman_to_int;

import java.util.HashMap;
import java.util.Map;

public class RomanToInt {
    private Map<Character, Integer> values = new HashMap<>();

    {
        values.put('I', 1);
        values.put('V', 5);
        values.put('X', 10);
        values.put('L', 50);
        values.put('C', 100);
        values.put('D', 500);
        values.put('M', 1000);
    }

    public int romanToInt(String s) {
        int i = s.length() - 1;
        int right = values.get(s.charAt(i--));
        int result = right;
        while (i >= 0) {
            int current = values.get(s.charAt(i--));
            result += current < right
                    ? -current
                    : current;
            right = current;

        }
        return result;
    }
}
