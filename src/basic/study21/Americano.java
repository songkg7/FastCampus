package basic.study21;

public class Americano extends Decorator {

    public Americano(Coffee coffee) {
        super(coffee);
    }

    @Override
    public void brewing() {
        super.brewing();
        System.out.println("Add Water");
    }
}
