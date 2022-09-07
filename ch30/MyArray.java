package ch30;


public class MyArray {

    int[] intArr;
    int count; // 배열칸의 개수

    public int ARRAY_SIZE;
    public static final int ERROR_NUM = 999999999;

    public static boolean isEmpty(){
        return false;
    }

    public MyArray(){
        count = 0;
        ARRAY_SIZE = 10;
        intArr = new int[ARRAY_SIZE];
    }

    public MyArray(int size){
        count = 0;
        ARRAY_SIZE = size;
        intArr = new int[size];
    }

    public void addElement(int num){
        if (count >= ARRAY_SIZE){
            System.out.println("Not enough memory");
            return ;
        }
        intArr[count++] = num; // 배열 한칸씩에 num를 넣는다
    }

    public void insertElement(int index, int num){
        int i;
        if (index <0 || index > count){ //마지막 데이터보다 더 크면 중간에 빈 배열에 생기니깐 이것도 오류발생
            return;
        }
        if (count >= ARRAY_SIZE){ // 배열이 꽉찬 경우
            return ;
        }
        for (i = count -1; i < index; i--){//맨 마지막 인덱스가 count-1, 맨 마지막 인덱스부터 한칸씩 뒤로 보내준다.
            intArr[i+1] = intArr[i];
            intArr[index] = num; // 그리고 원하는 인덱스에 데이터를 넣어준다.
            count ++;
        }
    }

    public int removeElement(int index) {
        int ret = ERROR_NUM;
        if ( isEmpty()){
            System.out.println("Array is empty");
            return ret;
        }

        if (index< 0 || index > count-1){// 삭제할 데이터가 가능한 범위에 있는지 체크크
           return ret;
        }

        ret = intArr[index];
        for (int i=index; i<count-1; i++) {
            intArr[i] = intArr[i + 1]; // 앞으로 한칸씩 이동
        }
            count--;
            return ret;

    }

    public void printAll()
    {
        if(count == 0){
            System.out.println("출력할 내용이 없습니다.");
            return;
        }

        for(int i=0; i<count; i++){
            System.out.println(intArr[i]);
        }

    }



}
