package ch22;

public class VIPCustomer extends Customer { // 상속
    double salesRatio;
    private String agentId; // 전문상담원

    public VIPCustomer(String customerId, String CustomerName) {
        super(customerId, CustomerName);
        customerGrade = "VIP";
        bonusRatio = 0.05;
        salesRatio= 0.1;
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
