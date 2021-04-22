package study02;

public class Taxi {

    private String company;
    private int income;

    public Taxi(String company) {
        this.company = company;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public int getIncome() {
        return income;
    }

    public void setIncome(int income) {
        this.income = income;
    }

    public void take(int cost) {
        this.income += cost;
    }

    public void info() {
        System.out.println(company + "택시 수입은 " + income + "원 입니다.");
    }
}
