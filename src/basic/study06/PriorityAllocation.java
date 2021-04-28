package basic.study06;

public class PriorityAllocation implements Scheduler {

    @Override
    public void getNextCall() {
        System.out.println("대기열에서 우선순위가 높은 고객 전화를 가져옵니다.");
    }

    @Override
    public void sendCallToAgent() {
        System.out.println("숙련도 높은 상담원에게 배분합니다.");
    }
}
