package ch38;

import java.util.ArrayList;
import java.util.Iterator;

public class MemberArrayList {
    private ArrayList<Member> arrayList;// <Member>를 관리

    public MemberArrayList(){// 생성자는 반환타입 안써!
        arrayList = new ArrayList<>(); // 이미 위에서 arrayList 타입을 설정해줬으니깐 또 안써도돼!
    }

    public MemberArrayList(int size){
        arrayList = new ArrayList<>(size);
    }

    public void addMember(Member member){ //배열에 멤버를 더해줘야하니깐 멤버타입의 멤버객체를 매개변수로 받아야해
        arrayList.add(member);
    }

    public boolean removeMember(int memberId){
        /* for (int i= 0; i<arrayList.size(); i++){
            Member member = arrayList.get(i); //Arraylist는 get()함수가 있음. get으로 받아와서 Member타입으로 형변환
            int tempId = member.getMemberId(); // Member 타입의 getMemberId 메서드로 아이디를 불러서 가져오고 그 값을 tempId에 저장
            if (tempId == MemberId) {
                arrayList.remove(i); // 맞으면 그 값을 삭제
                return true;
            }
            // 아니면 그 값이 없다는 의미
        }*/

        Iterator<Member> iter = arrayList.iterator();

        while (iter.hasNext()){
            Member member = iter.next();
            int tempId = member.getMemberId();
            if (tempId == memberId){
                arrayList.remove(member);
                return true;
            }
        }
        System.out.println(memberId + " does not exist");
        return false;
}
    public void showAllMember(){
        for (Member mem: arrayList){
            System.out.println(mem);
        }
        System.out.println();
    }
}


