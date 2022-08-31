package ch41;

import java.util.HashMap;

public class MemberHashMapTest {
    public static void main(String[] args) {
        MemberHashMap MemberHashMap = new MemberHashMap();

        Member member1 = new Member(100, "Benson");
        Member member2 = new Member(101, "John");
        Member member3 = new Member(102, "Howard");
        Member member4 = new Member(100, "James");

        MemberHashMap.addMember(member1);
        MemberHashMap.addMember(member2);
        MemberHashMap.addMember(member3);
        MemberHashMap.showAll();

        HashMap<Integer, String > hashMap = new HashMap<Integer, String>();// HashMap<Key타입, value타입> 을 써줘야한다.
        hashMap.put(100, "Ryu");
        hashMap.put(200, "sun");
        hashMap.put(300, "Yeom");
        System.out.println(hashMap); // 원래 hashmap은 쌍으로 저장됨
}}
