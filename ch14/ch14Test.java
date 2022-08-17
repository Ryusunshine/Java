package ch14;

import ch13.Student;

public class ch14Test {
    public static void main(String[] args) {

        student studentJames = new student("James", 5, 5000);
        student studentTomas = new student("Tomas", 6, 10000);

        Bus bus360 = new Bus(360);
        Bus bus2460 = new Bus(2460);

        Subway subway2 = new Subway(2);
        Subway subway5 = new Subway(5);

        studentJames.takeBus(bus360);
        studentJames.takeSubway(subway5);
        studentJames.showInfo();

        studentTomas.takeBus(bus2460);
        studentTomas.takeSubway(subway5);
        studentTomas.showInfo();

        bus360.showBusInfo();
        subway5.showSubwayInfo();



    }


}
