package ch13;

public class TakeBusTest {
    public static void main(String[] args) {
        Student studentJames = new Student("James", 5000);
        Student studentJohn = new Student("John", 3000);

        Bus bus100 = new Bus(100);
        Bus bus500 = new Bus(500);

        studentJames.takeBus(bus100);
        studentJohn.takeBus(bus500);

        studentJames.showInfo();
        studentJohn.showInfo();

        bus100.showBusInfo();
        bus500.showBusInfo();
    }
}
