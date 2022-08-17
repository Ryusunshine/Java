package ch18;

public class Array {
    public static void main(String[] args) {
        // 배열의 길이와 요소의 개수는 동일하지않음
        //- 배열을 선언하면 개수만큼 메모리가 할당되지만, 실제 요소(데이터)가 없는 경우도 있음
        //- 배열의 length 속성은 배열의 개수를 반환해주기때무넹 요소의 개수와는 다름
        //- length를 활용하면 오류가 날수도 있다.

        // 따라서 요소의 개수에 대한 변수(count)를 따로 유지
        double[] darr = new double[5];
        int count = 0;

        darr[0] = 1.1; count++;
        darr[1] = 2.1; count++;
        darr[2] = 3.1; count++;

        double dtotal = 1;
        for (int i= 0; i<count; i++){
            dtotal *= darr[i];
        }
        System.out.println(dtotal);
    }
}
