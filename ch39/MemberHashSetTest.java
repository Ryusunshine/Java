package ch39;

//HashSet을 써도 중복된애들이라고 정의해주지않으면 중복하는 데이터가 허용된다
// 따라서 중복된다고 equals()랑 hashcode()를 정의해줘야한다.


public class MemberHashSetTest {
    public static void main(String[] args) {
        MemberHashSet memberList = new MemberHashSet();

        Member member1 = new Member(100, "Benson");
        Member member2 = new Member(101, "John");
        Member member3 = new Member(102, "Howard");
        Member member4 = new Member(100, "James");

        memberList.addMember(member1);
        memberList.addMember(member2);
        memberList.addMember(member3);
        memberList.showAllMember();

        memberList.addMember(member4); //hashSet을 이용했으므로 중복되는 요소는 넣지않는다.
//        memberList.removeMember(100);
        memberList.showAllMember();



    }
}
