package ch14;

public class Bus {
    int busNumber;
    int busIncome;
    int passenger;

    public Bus(int number){
        this.busNumber = number;
    }

    public void take(int money) {
        this.busIncome += money;
        this.passenger ++;
    }

    public void showBusInfo() {
        System.out.println("The number "+ busNumber + " bus has "+ passenger + " passengers and income is " + busIncome);
    }
}
