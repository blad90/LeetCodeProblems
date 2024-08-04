import java.util.Arrays;
import java.util.Stack;

public class SingleNumber {

    public static void main(String[] args) {
        System.out.println(singleNumber(new int[]{4,1,2,1,2}));
    }

    public static int singleNumber(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = 1; j < nums.length; j++) {
                if(nums[i] == nums[j]){
                    continue;
                } else{
                    return nums[j];
                }
            }
        }
        return -1;
    }
}
