package Q67_AddBinary;

public class Solution {
    public static void main(String[] args) {
        String a = "1010";
        String b = "1011";
        String ret = addBinary(a, b);
        System.out.println(ret);
    }

    public static String addBinary(String a, String b) {
        int index_a = a.length() - 1, index_b = b.length() - 1;
        Character carry = '0';
        String ret = "";
        while (index_a >= 0 || index_b >= 0 || carry != '0') {
            Character char_a = '0';
            Character char_b = '0';
            if (index_a >= 0 && index_a < a.length()) {
                char_a = a.charAt(index_a);
                index_a--;
            }
            if (index_b >= 0 && index_b < b.length()) {
                char_b = b.charAt(index_b);
                index_b--;
            }


            /**
             * add rules
             */
            if (char_a == '0' && char_b == '0') {
                ret = carry + "" + ret;
                carry = '0';
            } else if ((char_a == '0' && char_b == '1') || (char_a == '1' && char_b == '0')) {
                if (carry == '0') {
                    ret = "1" + ret;
                    carry = '0';
                } else {
                    ret = "0" + ret;
                    carry = '1';
                }
            } else {
                if (carry == '0') {
                    ret = "0" + ret;
                    carry = '1';
                } else {
                    ret = "1" + ret;
                    carry = '1';
                }
            }

        }
        return ret;
    }

//    public static void addRules(char char_a, char char_b, char carry, String ret) {
//        if (char_a == '0' && char_b == '0') {
//            ret += carry + "";
//            carry = '0';
//        } else if ((char_a == '0' && char_b == '1') || (char_a == '1' && char_b == '0')) {
//            if (carry == '0') {
//                ret += "1";
//                carry = '0';
//            } else {
//                ret += "0";
//                carry = '1';
//            }
//        } else {
//            if (carry == '0') {
//                ret += "0";
//                carry = '1';
//            } else {
//                ret += "1";
//                carry = '1';
//            }
//        }
//    }
}
