package ch18;

import ch17.car;

public class ArrayList {
    public static void main(String[] args) {
        java.util.ArrayList<car> carSale = new java.util.ArrayList<car>();

        carSale.add(new car()); // 배열 한칸씩 car객체를 생성한것을 넣는다.
        carSale.add(new car());
        carSale.add(new car());
        carSale.add(new car());

        for(int i= 0; i<carSale.size(); i++){// 배열에서 그 객체를 호출하는 함수는 배열이름.get(i)
            carSale.get(i).getCarNum();
        }
    }
}
