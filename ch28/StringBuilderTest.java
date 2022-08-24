package ch28;

public class StringBuilderTest {
    public static void main(String[] args) {
        String java = new String("Java");
        String android = new String("Android");

        StringBuilder buffer = new StringBuilder(java);
        buffer.append(android);
        String Test = buffer.toString();
        System.out.println(Test);

    }
}
