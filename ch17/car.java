package ch17;

public class car {
    private static int serialNum = 10000;
    private int carNum;


    public car(){ // 생성자: 객체 초기화. 자동차가 하나 만들어질때 변수 설정.
        serialNum++;
        carNum = serialNum;
    }

    public int getCarNum(){
        return carNum;
    }

    public void setCarNum(int carNum){
        this.carNum = carNum;
    }
}
