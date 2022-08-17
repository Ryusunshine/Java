package ch17;

public class carFactory {
    public static carFactory instance = new carFactory();

    private carFactory(){};

    public static carFactory getInstance() {
        if (instance == null)
            instance  = new carFactory();

        return instance;

    }
    public car createCar(){
        car car = new car(); // 반환타입은 car임
        return car;


    }
}
