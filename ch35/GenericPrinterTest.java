package ch35;

import ch34.Powder;

public class GenericPrinterTest {
    public static void main(String[] args) {
        Powder powder = new Powder();
        GenericPrinter<Powder> powderPrinter = new GenericPrinter<>(); //T를 그냥 쓰면 안되고 T 대신 실제 어떤 타입을 쓸건지 지정하면됨.
        powderPrinter.setMaterial(powder); // GenericPrinter 클래스안의 메서드 .setMaterial를 사용
        Powder p = powderPrinter.getMaterial();
        // PowderPrinter는 GenericPrinter타입이고 p는 Powder타입이라 형변환이 필요한데 제너릭메서드를 사용해서 형변환 안해도됨.
        System.out.println(powderPrinter.toString());
    }


}
