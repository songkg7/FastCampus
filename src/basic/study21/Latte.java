package basic.study21;

public class Latte extends Decorator {

    // 상위 클래스에 기본 생성자가 없으면 하위 클래스에서 매개변수를 가진 생성자는 super() 를 호출해야한다.
    public Latte(Coffee coffee) {
        super(coffee);
    }

    @Override
    public void brewing() {
        super.brewing();
        System.out.println("Adding Milk");
    }
}
