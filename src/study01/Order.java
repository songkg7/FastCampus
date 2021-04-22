package study01;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Order {

    private Long id;
    private String orderPhoneNumber;
    private String deliveryAddress;
    private LocalDateTime orderDate;
    private int price;
    private String menuId;

    public void orderInfo() {
        System.out.println("주문 접수 번호 : " + id);
        System.out.println("주문 핸드폰 번호 : " + orderPhoneNumber);
        System.out.println("주문 집 주소 : " + deliveryAddress);
        System.out.println("주문 날짜 : " + orderDate.format(DateTimeFormatter.ISO_DATE));
        System.out.println("주문 시간 : " + orderDate.format(DateTimeFormatter.ISO_TIME));
        System.out.println("주문 가격 : " + price);
        System.out.println("메뉴 번호 : " + menuId);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getOrderPhoneNumber() {
        return orderPhoneNumber;
    }

    public void setOrderPhoneNumber(String orderPhoneNumber) {
        this.orderPhoneNumber = orderPhoneNumber;
    }

    public String getDeliveryAddress() {
        return deliveryAddress;
    }

    public void setDeliveryAddress(String deliveryAddress) {
        this.deliveryAddress = deliveryAddress;
    }

    public LocalDateTime getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(LocalDateTime orderDate) {
        this.orderDate = orderDate;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getMenuId() {
        return menuId;
    }

    public void setMenuId(String menuId) {
        this.menuId = menuId;
    }
}
