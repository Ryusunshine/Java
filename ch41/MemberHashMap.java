package ch41;

import java.util.HashMap;
import java.util.Iterator;

public class MemberHashMap {
    private HashMap<Integer, Member> hashMap; // key = Integer, Value = Member

    public MemberHashMap() {
        hashMap = new HashMap();
    }

    public void addMember(Member member) {
        hashMap.put(member.getMemberId(), member);
    }

    public boolean removeMember(int memberId) {
        if (hashMap.containsKey(memberId)) {
            hashMap.remove(memberId);
        }
        System.out.println("Not exist");
        return false;
    }

    public void showAll(){
        Iterator<Integer> iter = hashMap.keySet().iterator(); //keySet하면 key값들을 set형식으로 가져옴
        // 가져온 key interator는 integer 값이라서 이렇게 써준다. -> Iterator<Integer>
        while (iter.hasNext()){//key값들이 있는동안
            int key = iter.next(); // key값들을 하나씩 가져온다.
            Member member = hashMap.get(key); // 하면 value값들을 가져온다.
            System.out.println(member);
        }
    }
}
