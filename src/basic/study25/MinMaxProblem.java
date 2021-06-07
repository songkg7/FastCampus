package basic.study25;

import java.util.Arrays;
import java.util.stream.IntStream;

public class MinMaxProblem {

    public static void main(String[] args) {

        // sol 1
        int[] nums = {10, 55, 23, 2, 79, 101, 16, 82, 30, 45};

        int max = nums[0];
        int min = nums[0];

        for (int num : nums) {
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
        }

        System.out.println("max = " + max);
        System.out.println("min = " + min);

        // sol 2
        int max1 = Arrays.stream(nums).max().getAsInt();
        int min1 = Arrays.stream(nums).min().getAsInt();

        int minPos = IntStream.range(0, nums.length)
            .filter(i -> min1 == nums[i]).findFirst()
            .orElse(-1);

        int maxPos = IntStream.range(0, nums.length)
            .filter(i -> max1 == nums[i]).findFirst()
            .orElse(-1);

        System.out.println("max1 = " + max1);
        System.out.println("maxPos = " + maxPos);
        System.out.println("min1 = " + min1);
        System.out.println("minPos = " + minPos);

    }

}
