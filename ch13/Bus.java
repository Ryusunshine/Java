package ch13;

public class Bus {
    int busNumber;
    int passengerCount;
    int money;

    public Bus(int busNumber){
        this.busNumber = busNumber;
    }

    public void take(int money){
        this.money += money;
        passengerCount ++;
    }

    public void showBusInfo(){
        System.out.println("There is(are) "+ passengerCount + " passenger(s) in the " + busNumber + " Bus and the income is " + money );
    }
}
