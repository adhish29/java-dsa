package Miscellaneous;

public class StringPermutation {

    public static void stringPermutation(String str, String ans) {
        if (str.length() == 0) {
            System.out.println(ans);
            return;
        }
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            String rest = str.substring(0, i) + str.substring(i + 1);
            stringPermutation(rest, ans + ch);
        }
    }

    public static void main(String[] args) {
        stringPermutation("abc", "");
    }
}
