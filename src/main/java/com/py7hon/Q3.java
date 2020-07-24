package com.py7hon;

import java.util.*;
import java.util.concurrent.ThreadFactory;
import java.util.function.BiFunction;

/**
 * @author Seven
 * @date 2020/2/14 19:11
 * @description
 * @modifiedBy
 */
public class Q3 {
    static class Solution {
        public static int lengthOfLongestSubstring(String s) {
            Set<Character> set = new HashSet<>();
            int result = 0;
            for (int i = 0; i < s.length(); i++) {
                if (set.contains(s.charAt(i))) {
                    break;
                }
                set.add(s.charAt(i));
                result++;
            }
            return result;
        }
    }

    public static void main(String[] args) {
        String s1 = "abcabcbb";
        String s2 = "bbbbb";
        String s3 = "pww";
        Stack<Integer> stack = new Stack<>();
        stack.pop();
        stack.push(1);
        stack.push(2);
        stack.push(4);
        stack.push(6);
        stack.pop();

    }
}
