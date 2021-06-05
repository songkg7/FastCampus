package basic.study20;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessFileTest {

    public static void main(String[] args) throws IOException {

        RandomAccessFile rf = new RandomAccessFile("random.txt", "rw");

        rf.writeInt(100);
        System.out.println("pos: " + rf.getFilePointer());

        rf.writeDouble(3.14);
        System.out.println("pos: " + rf.getFilePointer());

        rf.writeUTF("안녕하세요"); // 한글은 글자당 3바이트, string 은 마지막에 null character 2 바이트가 들어간다.
        System.out.println("pos: " + rf.getFilePointer());

        // 읽는 pointer 를 적절한 위치로 가져와야한다.
        rf.seek(0);

        int i = rf.readInt();
        double d = rf.readDouble();
        String str = rf.readUTF();

        System.out.println("i = " + i);
        System.out.println("d = " + d);
        System.out.println("str = " + str);
    }
}
