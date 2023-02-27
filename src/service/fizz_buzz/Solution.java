package service.fizz_buzz;

import java.util.ArrayList;
import java.util.List;

/*
* Given an integer n, return a string array answer (1-indexed) where:

answer[i] == "FizzBuzz" if i is divisible by 3 and 5.
answer[i] == "Fizz" if i is divisible by 3.
answer[i] == "Buzz" if i is divisible by 5.
answer[i] == i (as a string) if none of the above conditions are true.
* */
public class Solution {
    public List<String> fizzBuzz(int n) {
        List<String> result = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            boolean skip = false;
            if (i % 3 == 0 && i % 5 == 0) {
                result.add("FizzBuzz");
                skip = true;
            }
            if (!skip && (i % 3 == 0)) {
                result.add("Fizz");
                skip = true;
            }
            if (!skip && (i % 5 == 0)) {
                result.add("Buzz");
                skip = true;
            }
            if (!skip) {
                result.add(String.valueOf(i));
            }
        }
        return result;
    }
}
