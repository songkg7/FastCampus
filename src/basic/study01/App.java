package basic.study01;

import java.time.LocalDateTime;

public class App {

    public static void main(String[] args) {

        Member member = new Member();
        member.setName("Tomas");
        member.setGender(Gender.MALE);
        member.setHeight(180);
        member.setWeight(78);
        member.setAge(37);
        member.setAddress("서울시 강남구 역삼동 111-333");
        member.setPhone("01023450001");

        Order order = new Order();
        order.setId(202011020003L);
        order.setOrderPhoneNumber(member.getPhone());
        order.setDeliveryAddress(member.getAddress());
        order.setOrderDate(LocalDateTime.now());
        order.setPrice(35000);
        order.setMenuId("0003");

        member.memberInfo();
        order.orderInfo();

    }
}
