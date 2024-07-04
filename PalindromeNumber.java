import java.util.*;

/** Given an integer x, return true if x is a palindrome ,and false otherwise.
* */

public class PalindromeNumber {

    public static void main(String[] args) {
        System.out.println(isPalindrome(121));
    }

    public static boolean isPalindrome(int x) {
        Deque<Integer> nums = new LinkedList<>();
        int result = -1;
        boolean flag = false;

        if(x % 10 == 0) return true;

        while(x != 0){
            result = x % 10;
            x = x / 10;
            nums.push(result);
        }

        for (int i = nums.size()-1; i >= 0 && !nums.isEmpty(); i--) {
            if(nums.getFirst() == nums.getLast()){
                nums.removeFirst();
                if(nums.size() > 1) nums.removeLast();
                flag = true;
            } else flag = false;
        }
        return flag;
    }
}
