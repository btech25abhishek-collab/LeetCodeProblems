
class Solution {
    public String decodeAtIndex(String s, int k) {
        long length = 0;

        for (char c : s.toCharArray()) {
            if (Character.isDigit(c)) {
                length *= c - '0';
            } else {
                length++;
            }
        }

        for (int i = s.length() - 1; i >= 0; i--) {
            char c = s.charAt(i);

            k %= length;

            if (k == 0 && Character.isLetter(c)) {
                return String.valueOf(c);
            }

            if (Character.isDigit(c)) {
                length /= c - '0';
            } else {
                length--;
            }
        }

        return "";
    }
}
