public class FirstOccurrenceStrings {


    public static void main(String[] args) {
        System.out.println(strStr("leetcode", "leeto"));
    }


    public static int strStr(String haystack, String needle) {
        return haystack.contains(needle) ? haystack.indexOf(needle) : -1;
    }
}
