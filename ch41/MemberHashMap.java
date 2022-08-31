package ch41;

import java.util.HashMap;
import java.util.Iterator;

// HashMap은 Map 인터페이스의 구현체로, HashTable과 유사한 자료구조로 데이터를 저장한다.
//HashSet은 Set 인터페이스의 구현체로, 내부적으로 HashMap을 사용하기 때문에 HashTable과 유사한 자료구조로 데이터를 저장한다.
//2. 데이터 저장 형태
//HashMap은 Key-Value 쌍 형태로 데이터를 저장하며, Key와 Value의 mapping을 유지하고 있다.
//HashSet은 객체 그 자체를 저장한다.

// HashMap은 중복 Key 값을 허용X, 중복 Value 값은 허용.
// HashSet은 객체 자체를 데이터로 저장하기 때문에 중복을 허용하지 않는다.


public class MemberHashMap {
    private HashMap<Integer, Member> hashMap; // key = Integer, Value = Member

    public MemberHashMap() {
        hashMap = new HashMap();
    }

    public void addMember(Member member) {
        hashMap.put(member.getMemberId(), member);
    }

    public boolean removeMember(int memberId) {
        if (hashMap.containsKey(memberId)) {// containsKey(key) : 맵에서 인자로 보낸 키가 있으면 true 없으면 false를 반환한다.
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
            Member member = hashMap.get(key); // hashMap.get()하면 value값들을 가져온다.
            System.out.println(member);
        }
    }
}
