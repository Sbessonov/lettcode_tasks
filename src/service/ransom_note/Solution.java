package service.ransom_note;

import java.util.*;

public class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        if (ransomNote.length() > magazine.length()){
            return false;
        }
        List<Character> myMagazine = new ArrayList<>();
        for (int i = 0; i < magazine.length(); i++) {
            myMagazine.add(magazine.charAt(i));
        }
        int i = 0;
        boolean flag = true;
        while (i < ransomNote.length() && flag) {
            int index = myMagazine.indexOf(ransomNote.charAt(i++));
            if (index >= 0) {
                myMagazine.set(index, ' ');
            } else {
                flag = false;
            }
        }

        return flag;
    }
}
