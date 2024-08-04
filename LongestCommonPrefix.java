import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.Stack;

/** Write a function to find the longest common prefix string amongst an array of strings.
    If there is no common prefix, return an empty string "".
 */


public class LongestCommonPrefix {
    public static void main(String[] args) {
        System.out.println(longestCommonPrefix(new String[]{"flower", "flow", "flight"}));
    }

    public static String longestCommonPrefix(String[] strs) {
        Stack<Character> prefixes = new Stack<>();

        for (int i = 0; i < strs.length; i++) {
            prefixes.push(strs[i].charAt(i));
        }

        System.out.println(prefixes);
        return "";
    }
}
