package basic.study19;

import java.io.*;

class Person implements Serializable {
    String name;
    transient String job;

    public Person() {
    }

    public Person(String name, String job) {
        this.name = name;
        this.job = job;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", job='" + job + '\'' +
                '}';
    }
}

public class SerializationTest {
    public static void main(String[] args) {

        Person personLee = new Person("이순신", "대표이사");
        Person personKim = new Person("김유신", "상무이사");

        try (FileOutputStream fos = new FileOutputStream("serial.txt");
             ObjectOutputStream oos = new ObjectOutputStream(fos)) {

            // serialization
            oos.writeObject(personLee);
            oos.writeObject(personKim);

        } catch (IOException e) {
            e.printStackTrace();
        }

        try (FileInputStream fis = new FileInputStream("serial.txt");
             ObjectInputStream ois = new ObjectInputStream(fis)) {

            // deserialization
            Person pLee = (Person) ois.readObject();
            Person pKim = (Person) ois.readObject();

            System.out.println("pLee = " + pLee);
            System.out.println("pKim = " + pKim);

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }


    }
}
