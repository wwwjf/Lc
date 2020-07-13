package com.wwwjf.leetcode;

import java.util.HashSet;
import java.util.Set;

/**
 * 最长不重复子串
 */
public class SubString {
    public static int lengthOfLongestSubstring(String s) {

        Set<Character> result = new HashSet<>();
        int len = s.length();
        int start = -1;
        int resultLen = 0;
        for (int i = 0; i < len; i++) {
            if (i != 0) {
                result.remove(s.charAt(i - 1));
            }
            while (start + 1 < len && !result.contains(s.charAt(start + 1))) {
                result.add(s.charAt(start + 1));
                start++;
                result.iterator().forEachRemaining(System.out::print);
                System.out.println("-");
            }
            resultLen = Math.max(resultLen, start - i + 1);

        }
        return resultLen;
    }
}
