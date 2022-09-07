package ch17;

public class car { // car 클래스에는 시리얼넘버와 그 시리얼넘버를 설정, 반환해주는 메서드로 구성한다.
    private static int serialNum = 10000; // 모든 serailNum는 10000부터 공통으로 시작
    private int carNum; // 객체마다 carNum은 다르니깐 인스턴스변수로


    public car(){ // 생성자: 객체 초기화. 자동차가 하나 만들어질때 변수 설정.
        serialNum++; //serialNum을 증가시키고서 carNum에 대입
        carNum = serialNum;
    }

    public int getCarNum(){
        return carNum;
    }

    public void setCarNum(int carNum){
        this.carNum = carNum;
    }
}
