package ch18;

import ch17.car;

public class ArrayList {
    public static void main(String[] args) {
        java.util.ArrayList<car> carSale = new java.util.ArrayList<car>();

        carSale.add(new car());
        carSale.add(new car());
        carSale.add(new car());
        carSale.add(new car());

        for(int i= 0; i<carSale.size(); i++){
            carSale.get(i).getCarNum();
        }
    }
}
