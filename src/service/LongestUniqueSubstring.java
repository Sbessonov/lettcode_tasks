package service;

import java.util.ArrayList;
import java.util.List;

//TODO: speed up
public class LongestUniqueSubstring {
    public int lengthOfLongestSubstring(String s) {
        List<Character> chars = new ArrayList<>();
        int headPointer = 0;
        int tailPointer;
        int maxLength = 0;
        boolean maxLengthFound = false;

        while (!maxLengthFound && headPointer < s.length()){
            chars.add(s.charAt(headPointer));
            tailPointer = headPointer + 1;

            while (tailPointer < s.length() && !chars.contains(s.charAt(tailPointer))){
                chars.add(s.charAt(tailPointer++));
            }
            maxLengthFound = tailPointer == s.length();
            maxLength = Math.max(maxLength, chars.size());
            chars.clear();
            headPointer++;

        }
        return maxLength;
    }
}
