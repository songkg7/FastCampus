package basic.study02;

public class App {

    public static void main(String[] args) {

        Student student = new Student("Edward", 20000);

        Taxi taxi = new Taxi("잘 나간다 운수");

        student.takeTaxi(taxi, 12000);

        student.info();
        taxi.info();

    }

}
