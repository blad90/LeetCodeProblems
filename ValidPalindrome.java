/**
 * A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and
 * removing all non-alphanumeric characters, it reads the same forward and backward. Alphanumeric characters
 * include letters and numbers.
 *
 * Given a string s, return true if it is a palindrome, or false otherwise.
 * */

public class ValidPalindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome(";."));
    }

    public static boolean isPalindrome(String s) {
        StringBuilder builder = new StringBuilder();
        StringBuilder s1 = new StringBuilder(s.toLowerCase());

        for (int i = 0; i < s1.length(); i++) {
            if(Character.isLetterOrDigit(s1.charAt(i))){
                builder.append(s1.charAt(i));
            }
        }
        if(builder.length() == 1 || builder.isEmpty()) return true;

        int left = 0;
        int right = builder.length() - 1;
        boolean flag = false;
        while (left < right){
            if(builder.charAt(left) == builder.charAt(right)){
                flag = true;
            } else return false;
            left++;
            right--;
        }
        return flag;
    }
}
