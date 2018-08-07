package Q20_Parentheses;

import com.sun.xml.internal.ws.api.ha.StickyFeature;

import java.util.*;

public class Solution {
    public static void main(String[] args) {
        String s = "{[]}";
        boolean result = isValid(s);
        System.out.println(result);
    }

    public static boolean isValid(String s) {
        Map<Character, Character> parenMap = new HashMap<>();
        parenMap.put(')', '(');
        parenMap.put('}', '{');
        parenMap.put(']', '[');
        Set<Character> check = new HashSet<>();
        check.add('('); check.add(')');
        check.add('['); check.add(']');
        check.add('{'); check.add('}');

        boolean valid = false;

        Stack<Character> parenStack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (check.contains(s.charAt(i))) {
                if (!parenMap.keySet().contains(s.charAt(i))) {
                    parenStack.push(s.charAt(i));
                } else {
                    if (parenStack.isEmpty()) {
                        return false;
                    }
                    Character temp = parenStack.pop();
                    if (parenMap.get(s.charAt(i)) != temp) {
                        return false;
                    }
                }

            } else {
                return false;
            }
        }

        if (parenStack.isEmpty()) {
            valid = true;
        }
        return valid;
    }
}
