package ch51;

public class CoffeeTest {
    public static void main(String[] args) {

        Coffee EtiopiaCoffee = new EtiopiaCoffee();
        EtiopiaCoffee.brewing();

        System.out.println();
        Coffee EtiopiaLatte = new Latte(EtiopiaCoffee);
        EtiopiaLatte.brewing();

        System.out.println();

        Coffee EtiopiaMochaLatte = new Mocha(new Latte(new EtiopiaCoffee()));
        EtiopiaMochaLatte.brewing();

        System.out.println();
        Coffee KenyaMochaCreamLatte = new WhippedCream(new Mocha(new Latte(new KenyaCoffee())));
        KenyaMochaCreamLatte.brewing();


            }
        }

