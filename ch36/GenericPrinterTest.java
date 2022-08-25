package ch36;

import ch34.Powder;
import ch35.GenericPrinter;

public class GenericPrinterTest {
    public static void main(String[] args) {
        Powder powder = new Powder();
        ch35.GenericPrinter<Powder> powderPrinter = new GenericPrinter<>(); //T를 그냥 쓰면 안되고 T 대신 실제 어떤 타입을 쓸건지 지정하면됨.
        powderPrinter.setMaterial(powder);
        Powder p = powderPrinter.getMaterial();
        System.out.println(powderPrinter.toString());
    }


}
