package ch47;

public class PasswordTest {
    private String password;

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        if (password == null){
            throw new PasswordException("Input Password");
        } else if (password.length()<5){
            throw new PasswordException("Password should be over 7 letters");
        } else if (password.matches("[a-zA-Z]+")){
            throw new PasswordException("Password should have one or more numbers or special characters");
        } this.password = password;
    }

    public static void main(String[] args) {
        PasswordTest test = new PasswordTest();
        String password = "ryusun123";

        try {
            test.setPassword(password);
            System.out.println("Set the password successfully"); // exception이 발생하지않으면 해당문구가 출력됨
        } catch (PasswordException e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
        }

        String password1 = null;

        try {
            test.setPassword(password1);
            System.out.println("Set the password successfully"); // exception이 발생하지않으면 해당문구가 출력됨
        } catch (PasswordException e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
        }

        String password2 = "abcdef";

        try {
            test.setPassword(password2);
            System.out.println("Set the password successfully"); // exception이 발생하지않으면 해당문구가 출력됨
        } catch (PasswordException e) {
            e.printStackTrace();
            System.out.println(e.getMessage());



    }}}
