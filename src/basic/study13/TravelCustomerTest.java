package basic.study13;

import java.util.ArrayList;
import java.util.List;

public class TravelCustomerTest {

    public static void main(String[] args) {

        TravelCustomer customerLee = new TravelCustomer("이순신", 40, 100);
        TravelCustomer customerKim = new TravelCustomer("김유신", 20, 100);
        TravelCustomer customerHong = new TravelCustomer("홍길동", 13, 50);

        List<TravelCustomer> customerList = new ArrayList<>();
        customerList.add(customerLee);
        customerList.add(customerKim);
        customerList.add(customerHong);

        System.out.println("고객 명단 출력");
//        customerList.forEach(System.out::println);
//        customerList.stream().map(s -> s.getName()).forEach(System.out::println);
        customerList.stream().map(TravelCustomer::getName).forEach(System.out::println);

        System.out.println("여행 비용");
        int sum = customerList.stream().mapToInt(TravelCustomer::getPrice).sum();
        System.out.println("sum = " + sum);

        // NOTE: 중간 연산은 여러개를 사용할 수 있고, 최종연산이 실행되기 전 한꺼번에 실행된다.
        System.out.println("20세 이상 고객");
        customerList.stream().filter(c -> c.getAge() >= 20)
                .map(TravelCustomer::getName)
                .sorted()
                .forEach(System.out::println);

    }

}
