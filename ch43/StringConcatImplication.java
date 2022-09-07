package ch43;

public class StringConcatImplication implements StringConcat{
    @Override
    public void MakeString(String s1, String s2) { // 구현
        System.out.println(s1 +" "+s2);
    }
}
