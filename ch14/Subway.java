package ch14;

public class Subway {
    int subwayNumber;
    int passenger;
    int subwayIncome;

    public Subway(int number) {
        this.subwayNumber = number;

    }

    public void take(int money){
        this.subwayIncome += money;
        this.passenger ++;
    }

    public void showSubwayInfo() {
        System.out.println("The number " + subwayNumber + " subway has "+ passenger +" passengers and the income is "+ subwayIncome);
    }
}
