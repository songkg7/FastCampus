package study02;

public class Student {

    private String name;
    private int money;

    public Student(String name, int money) {
        this.name = name;
        this.money = money;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public void takeTaxi(Taxi taxi, int cost) {
        taxi.take(cost);
        this.money -= cost;
    }

    public void info() {
        System.out.println(name + "님의 남은 돈은 " + money + "원 입니다.");
    }
}
