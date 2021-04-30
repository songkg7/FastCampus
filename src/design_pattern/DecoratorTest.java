package design_pattern;

import design_pattern.decorator.Audi;
import design_pattern.decorator.ICar;

public class DecoratorTest {
    public static void main(String[] args) {
        ICar audi = new Audi(1000);
        audi.showPrice();

        
    }
}
