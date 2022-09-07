package ch40;

//TreeSet 클래스 활용하기

//TreeSet은 요소가 추가될때마다 기존의 요소와 비교를 해서 애가 어디로 들어가야할지 구현해야한다(동일한 경우 못들어감)
//객체의 정렬에 사용하는 클래스
//Set 인터페이스를 구현하여 중복을 허용하지 않고, 오름차순이나 내림차순으로 객체를 정렬할 수 있음
//내부적으로 이진검색트리(binary search tree)로 구현됨
//이진검색트리에 저장하기 위해 각 객체를 비교해야 함
//비교 대상이 되는 객체에 Comparable이나 Comparator 인터페이스를 구현 해야 TreeSet에 추가 될 수 있음
//String, Integer등 JDK의 많은 클래스들이 이미 Comparable을 구현했음

//String 클래스는 이미 Comprable 인터페이스가 구현되어 있으므로 오름차순으로 정렬되어 출력됨

import java.util.TreeSet;
import java.util.Iterator;

public class MemberTreeSet {
    private TreeSet<Member> treeSet;// <Member>를 관리

    public MemberTreeSet(){// 생성자는 반환타입 안써!
        treeSet = new TreeSet<Member>(new Member()); // 이미 위에서 arrayList 타입을 설정해줬으니깐 또 안써도돼!
    }
    // Comparator는 TreeSet 생성자안에 comparator가 구현될 애를 지정해줘야함.

    public MemberTreeSet(int size){
        treeSet = new TreeSet();
    }

    public void addMember(Member member){ //배열에 멤버를 더해줘야하니깐 멤버타입의 멤버객체를 매개변수로 받아야해
        treeSet.add(member);
    }

    public boolean removeMember(int memberId){
        Iterator<Member> iter = treeSet.iterator();

        while (iter.hasNext()){
            Member member = iter.next();
            int tempId = member.getMemberId();
            if (tempId == memberId){
                treeSet.remove(member);
                return true;
            }
        }
        System.out.println(memberId + " does not exist");
        return false;
}
    public void showAllMember(){
        for (Member mem: treeSet){
            System.out.println(mem);
        }
        System.out.println();
    }
}


