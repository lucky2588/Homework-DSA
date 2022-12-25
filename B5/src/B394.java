public class B394 {
    public String decodeString(String s) {
        return decodeString(s, 0, s.length());
    }
    public String decodeString(String s, int from, int to) {
        StringBuilder sb = new StringBuilder();

        int number = 0;
        for (int i = from; i < to; i++) {
            char c = s.charAt(i);
            if (Character.isDigit(c)) {
                number = 10 * number + (c - '0');
                continue;
            }

            if (c == '[') {
                int closingIndex = findClosingIndex(s, i);
                sb.append(decodeString(s, i + 1, closingIndex - 1).repeat(number));
                i = closingIndex - 1;
                number = 0;
            } else {
                sb.append(c);
            }
        }
        return sb.toString();
    }
    public int findClosingIndex(String s, int start) {
        int i;
        int bracketsCount = 1;
        for (i = start + 1; i < s.length() && bracketsCount > 0; i++) {
            if (s.charAt(i) == '[') {
                bracketsCount++;
            } else if (s.charAt(i) == ']') {
                bracketsCount--;
            }
        }
        return i;
    }
}
