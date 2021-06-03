package basic.study18;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputStreamReaderTest {

    public static void main(String[] args) {

        // NOTE: 보조스트림의 사용법
        try (InputStreamReader fis = new InputStreamReader(new FileInputStream("reader.txt"))) {

            int i;
            while ((i = fis.read()) != -1) {
                System.out.print((char)i);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
