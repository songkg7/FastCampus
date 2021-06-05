package basic.study21;

public class CoffeeTest {

    public static void main(String[] args) {

        Coffee ethiopiaCoffee = new Ethiopia();
        ethiopiaCoffee.brewing();

        System.out.println("--------------------");

        Coffee ethiopiaLatte = new Latte(ethiopiaCoffee);
        ethiopiaLatte.brewing();

        System.out.println("--------------------");

        Coffee ethiopiaMocha = new Mocha(new Latte(ethiopiaCoffee));
        ethiopiaMocha.brewing();

        System.out.println("--------------------");

        Coffee kenyaCoffee = new WhippingCream(new Mocha(new Latte(new Kenya())));
        kenyaCoffee.brewing();

    }

}
