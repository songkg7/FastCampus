package basic.study16;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamTest03 {
    public static void main(String[] args) {

        int i;
        try (FileInputStream fis = new FileInputStream("input2.txt")) {

            byte[] bs = new byte[10];
            while ((i = fis.read(bs)) != -1) {

                // NOTE: 버퍼에 남아있는 자료를 주의해서 출력
                for (int j = 0; j < i; j++) {
                    System.out.print((char) bs[j]);
                }
                System.out.println(" : " + i + "바이트 읽음");

            }

        } catch (IOException e) {
            System.out.println(e);
        }

    }
}
