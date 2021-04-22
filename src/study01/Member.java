package study01;

public class Member {

    private String name;
    private Gender gender;
    private double weight;
    private double height;
    private int age;
    private String phone;
    private String address;

    public void memberInfo() {
        System.out.println("키가 " + height + "이고 몸무게가 " + weight + "인 " + gender + "이 있습니다. 이름은 " + name + "이고 나이는 " + age + "세 입니다.");
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
