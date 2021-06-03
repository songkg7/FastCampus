package basic.study16;

import java.io.IOException;
import java.io.InputStreamReader;

public class SystemInTest {

    public static void main(String[] args) {
        System.out.println("알파벳 여러 개를 쓰고 [Enter] 를 누르세요");

        int i;

        try {
            // NOTE: 한글을 입력하기 위해 사용하는 입출력 스트림
            InputStreamReader isr = new InputStreamReader(System.in);
            while ((i = isr.read()) != '\n') {
//                System.out.println(i);
                System.out.print((char)i);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
