package basic.study10;

import java.util.Arrays;
import java.util.stream.IntStream;

public class IntArrayStreamTest {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5};

        for (int i : arr) {
            System.out.println(i);
        }

        System.out.println("==========");

        Arrays.stream(arr).forEach(System.out::println);

        // NOTE: stream 은 재사용이 불가능하다. 사용할 때마다 생성해주자.
        // IntStream stream = Arrays.stream(arr);
        int sum = Arrays.stream(arr).sum();
        System.out.println("sum = " + sum);

    }
}
