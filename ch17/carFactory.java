package ch17;

public class carFactory { // carFactory에는 유일한 인스턴스 객체인 carFactory를 설정, 생성
    private static carFactory instance = new carFactory();

    private carFactory(){}; // 우선 유일한 공장 하나 생성

    public static carFactory getInstance() {// 공장(인스턴스) 정보를 알려주는 메서드
        if (instance == null)
            instance  = new carFactory();

        return instance;

    }
    public car createCar(){// 공장(인스턴스)의 기능인 차를 생산하는 인스턴스 메서드를 만든다.
        car car = new car(); // 반환타입은 car임
        return car;


    }
}
