package com.wwwjf.leetcode;

public class StringRevese {

    public static String reverseLeftWords(String s,int n) {
        char[] result = new char[s.length()];
        char[] charArray = s.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            if (i>charArray.length-1-n) {
                result[i] = charArray[n+i-charArray.length];
            } else {
                result[i] = charArray[n+i];
            }
        }
        return new String(result);
    }
}
