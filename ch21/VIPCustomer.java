package ch21;

public class VIPCustomer extends Customer { // 상속
    double salesRatio;
    private String agentId; // 전문상담원

    VIPCustomer() {

        salesRatio = 0.1;
        bonusRatio = 0.05;
        customerGrade = "VIP";
    }

    @Override
    public int calPrice(int price) {
        bonusPoint += price * bonusRatio;
        price -= (int)(price * salesRatio);
        return price;
    }

    public String getAgentId() {
        return agentId;
    }

    public void setAgentId(String agentId) {
        this.agentId = agentId;
    }
}
