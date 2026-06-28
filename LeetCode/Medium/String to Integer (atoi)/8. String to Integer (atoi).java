// 8. String to Integer (atoi) [Medium]
// https://leetcode.com/problems/string-to-integer-atoi/
// Language: java | Runtime: 1 ms | Memory: 43.8 MB
// Tags: String
// Synced: 2026-06-29

class Solution {

    static int myAtoi(String s) {
        int index = 0;
        int sign = 1;
        int result = 0;

        // Skip leading spaces
        while (index < s.length() && s.charAt(index) == ' ') {
            index++;
        }

        // Check sign
        if (index < s.length()) {
            char ch = s.charAt(index);

            if (ch == '-') {
                sign = -1;
                index++;
            } else if (ch == '+') {
                index++;
            }
        }

        // Convert digits to number
        while (index < s.length() && Character.isDigit(s.charAt(index))) {

            int digit = s.charAt(index) - '0';
//Integer.MAX_VALUE = 2147483647
            // Handle overflow and underflow
            if (result > Integer.MAX_VALUE / 10 ||
                (result == Integer.MAX_VALUE / 10 && digit > 7)) {

// result > 214748364 → multiplying by 10 will definitely overflow.
// result == 214748364 → only digits 0 through 7 are safe.
// digit > 7 → the new number would exceed 2147483647, causing overflow.

if (sign == 1) {
    return Integer.MAX_VALUE;
} else {
    return Integer.MIN_VALUE;
}
            }

            result = result * 10 + digit;
            index++;
        }

        return result * sign;
    }
}