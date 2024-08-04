import java.util.ArrayList;
import java.util.List;


/**
 * 412. Fizz Buzz
 * Given an integer n, return a string array answer (1-indexed) where:
 * <p>
 * answer[i] == "FizzBuzz" if i is divisible by 3 and 5.
 * answer[i] == "Fizz" if i is divisible by 3.
 * answer[i] == "Buzz" if i is divisible by 5.
 * answer[i] == i (as a string) if none of the above conditions are true.
 * </p>
 * */
public class FizzBuzz {

    public static void main(String[] args) {
        System.out.println(fizzBuzz(15));
    }

    public static List<String> fizzBuzz(int n) {
        List<String> answer = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            if(i % 3 == 0 && i % 5 == 0){
                answer.add("FizzBuzz");
            } else if(i % 3 == 0){
                answer.add("Fizz");
            } else if(i % 5 == 0){
                answer.add("Buzz");
            } else {
                answer.add(String.valueOf(i));
            }
        }

        return answer;
    }
}
