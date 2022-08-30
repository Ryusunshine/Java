package ch47;

public class PasswordException extends IllegalArgumentException{
    // IllegalArgumentException은 적합하지 않거나(illegal) 적절하지 못한(inappropriate) 인자를 메소드에 넘겨주었을 때 발생
    public PasswordException(String message){
        super(message);
    }

}
