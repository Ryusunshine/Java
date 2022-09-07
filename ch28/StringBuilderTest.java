package ch28;

public class StringBuilderTest {
    public static void main(String[] args) {
        String java = new String("Java");
        String android = new String("Android");

        StringBuilder buffer = new StringBuilder(java); // java객체 바로 넣기
        buffer.append(android);// android객체 추가
        String Test = buffer.toString();// .toString(): String으로 변환한다. (sb.toString())
        System.out.println(Test);

        /*
        그 외 StringBuilder/StringBuffer 기능
        1) .append(): 문자열을 추가한다. (sb.append("bbb"), sb.append(4))
        2) .insert(int offset, String str): offset 위치에 str을 추가한다. (sb.insert(2, "ccc"))
        3) .replace(): 첫번째와 두번째 파라미터로 받는 숫자 인덱스에 위치한 문자열을 대체한다. (.replace(3, 6, "ye"))
         */

    }
}
