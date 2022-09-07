package ch26;

public class complicatedCalculator implements Calculate {
    @Override
    public int add(int num1, int num2) {
        return num1 + num2;
    }

    @Override
    public int substract(int num1, int num2) {
        return num1 - num2;
    }

    @Override
    public int times(int num1, int num2) {
        return (int)(num1 * num2);
    }

    @Override
    public int divide(int num1, int num2) {
        if (num2 == 0)
            return Error;
        return (int)(num1 / num2);
    }

    public void showInfo(){
        System.out.println("Everything is served");
    }
}
