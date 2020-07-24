package com.py7hon;

/**
 * 给定一个字符串 s，找到 s 中最长的回文子串。你可以假设 s 的最大长度为 1000。  <br>
 * 示例 1：  输入: "babad" 输出: "bab" 注意: "aba" 也是一个有效答案。 <br>
 * 示例 2：  输入: "cbbd" 输出: "bb"
 *
 * @author Seven
 * @version 1.0
 * @date 2020/7/24 15:23
 */
class Q5 {
    // TODO 不用暴力破解
    public String longestPalindrome(String s) {
        if (s == null || s.length() == 0) {
            return "";
        }
        if (s.length() == 1) {
            return s;
        }

        char[] chars = s.toCharArray();
        int strLength = s.length();
        // 判断不同长度的回文串，从 1 开始，到 s.length() 结束
        for (int length = strLength; length >= 1; length--) {
            // 从字符串的开头开始，往后遍历 length 个字符
            int time = strLength - length + 1;
            for (int i = 0; i < time; i++) {
                String subStr = s.substring(i, i + length);
                if (isPalindrome(subStr)) {
                    return subStr;
                }
            }
        }

        return null;
    }

    public boolean isPalindrome(String str) {
        for (int i = 0; i < str.length() / 2; i++) {
            if (str.charAt(i) != str.charAt(str.length() - i - 1)) {
                return false;
            }
        }

        return true;
    }
}
