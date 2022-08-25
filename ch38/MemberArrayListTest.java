package ch38;

import ch18.ArrayList;

public class MemberArrayListTest {
    public static void main(String[] args) {
        MemberArrayList memberList = new MemberArrayList();

        Member member1 = new Member(100, "Benson");
        Member member2 = new Member(101, "John");
        Member member3 = new Member(102, "Howard");
        Member member4 = new Member(103, "Elliet");

        memberList.addMember(member1);
        memberList.addMember(member2);
        memberList.addMember(member3);
        memberList.addMember(member4);

        memberList.showAllMember();
        memberList.removeMember(100);
        memberList.showAllMember();



    }
}
