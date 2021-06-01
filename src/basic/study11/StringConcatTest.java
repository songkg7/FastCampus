package basic.study11;

public class StringConcatTest {
    public static void main(String[] args) {

        String s1 = "Hello";
        String s2 = "world";

        StringConcatImpl strImpl = new StringConcatImpl();
        strImpl.makeString(s1, s2);

        StringConcat concat = (s, v) -> System.out.println(s + ", " + v);
        concat.makeString(s1, s2);

        // 동작 원리
        // 내부적으로 익명 클래스가 만들어진다.


    }
}
