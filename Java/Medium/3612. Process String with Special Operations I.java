class Solution {
    public String processStr(String s) {
        String res = "";
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (Character.isLetter(ch)) {
                res += ch;
            } else if (ch == '#') {
                res += res;
            } else if (ch == '%') {
                res = reverse(res);
            } else if (ch == '*') {
                res = remove(res);
            }
        }
        return res;
    }

    public String reverse(String c) {
        String s = "";
        for (int i = c.length() - 1; i >= 0; i--) {
            s += c.charAt(i);
        }
        return s;
    }

    public String remove(String c) {
        if (c.length() == 0) return "";
        return c.substring(0, c.length() - 1);
    }
}
©leetcode
