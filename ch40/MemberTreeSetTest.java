package ch40;

//TreeSet은 오름차순으로 정렬한다.내림차순으로 정렬하고싶으면 compareTo함수에서 반환값에 -(마이너스)를 곱해주면 된다.

import java.util.Comparator;
import java.util.TreeSet;

class MyCompare implements Comparator<String>{ // compare하는 방식을 새로 만든것

    @Override
    public int compare(String s1, String s2){
        return s1.compareTo(s2);
    }
}

public class MemberTreeSetTest {
    public static void main(String[] args) {
        /*
        MemberTreeSet MemberTreeSet = new MemberTreeSet();

        Member member1 = new Member(100, "Benson");
        Member member2 = new Member(101, "John");
        Member member3 = new Member(102, "Howard");
        Member member4 = new Member(100, "James");

        MemberTreeSet.addMember(member1);
        MemberTreeSet.addMember(member2);
        MemberTreeSet.addMember(member3);
        MemberTreeSet.showAllMember();

        MemberTreeSet.addMember(member4);
//        memberList.removeMember(100);
        MemberTreeSet.showAllMember();
    }*/

        TreeSet<String> set = new TreeSet<String>(new MyCompare()); // 비교방식을 ()안에 넣어주면 된다.
        set.add("Park");
        set.add("kim");
        set.add("Lee");
        System.out.println(set);
}}
