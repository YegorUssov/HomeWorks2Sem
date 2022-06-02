package AISD;

import java.util.ArrayDeque;
import java.util.Deque;

class ValidParentheses {

    public boolean isValid(String s) {

        if (null == s || s.trim().equals("")) {
            return true;
        }

        if (s.length() % 2 != 0) {
            return false;
        }

        int length = s.length();

        Deque<Character> stack = new ArrayDeque<>(length);

        for (int i = 0; i < length; i++) {
            if (s.charAt(i) == '(' || s.charAt(i) == '[' || s.charAt(i) == '{') {
                stack.push(s.charAt(i));
            } else {
                if (stack.isEmpty()) {
                    return false;
                }
                switch (s.charAt(i)) {

                    case ')':
                        if (stack.pop() != '(') {
                            return false;
                        }
                        break;
                    case ']':
                        if (stack.pop() != '[') {
                            return false;
                        }
                        break;

                    case '}':
                        if (stack.pop() != '{') {
                            return false;
                        }
                        break;
                }
            }
        }

        return stack.isEmpty();
    }
}