package basic.study14;

public class ArrayIndexException {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5};
        try {
            for (int i = 0; i <= 5; i++) {
                System.out.println(arr[i]);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println(e);
        }

        // NOTE: try catch 가 없다면 여기까지 오지 않는다.
        System.out.println("here!!");

    }
}
