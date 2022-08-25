package ch41;

import java.util.Comparator;

public class Member implements Comparator<Member> {
    // public class Member implements Comparable<Member> = Comparable도 구현할수있다.

    private int memberId;        //회원 아이디
    private String memberName;   //회원 이름

    public Member(){};

    public Member(int memberId, String memberName) { //생성자
        this.memberId = memberId;
        this.memberName = memberName;
    }

    public int getMemberId() {  //
        return memberId;
    }

    public void setMemberId(int memberId) {
        this.memberId = memberId;
    }

    public String getMemberName() {
        return memberName;
    }

    public void setMemberName(String memberName) {
        this.memberName = memberName;
    }

    @Override
    public String toString() {   //toString 메소드 오버로딩
        return memberName + " 's Id is " + memberId;
    }

    //HashSet을 써도 중복된애들이라고 정의해주지않으면 중복하는 데이터가 허용된다
    // 따라서 중복된다고 equals()랑 hashcode()를 정의해줘야한다.
    @Override
    public int hashCode() { // 같은 객체일때 동일한 hashcode를 갖는다.
        return memberId;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Member) {//넘어온 매개변수 obj가 멤버변수인지 확인
            Member member = (Member) obj; //obj를 Member로 형변환
            if (this.memberId == member.memberId) {
                return true;
            } else return false;
        }
        return false;
    }

    // Comparator를 구현하면 compare 함수를 오버라이딩 해줘야한다.
    // Comparator의 활용 : 이미 Comparable이 구현된 경우 Comparator로 비교하는 방식을 다시 구현할 수 있음
    @Override
    public int compare(Member member1, Member member2) {// 애는 들어오는 매개변수가 2개임
        return (member1.memberId- member2.memberId);
    }
}
/*
    @Override
    public int compareTo(Member member) { //들어오는 member매개변수가 하나라서 this (나)인스턴스랑 비교한다.
        // compareTo함수의 반환값은 int이다.
        // 비교해서 내것(this)가 더 큰 경우 양수를 반환하고 매개변수가 더 큰경우는 음수를 반환, 같으면 0.

        if (this.memberId > member.memberId){
            return 1;
        } else if (this.memberId < member.memberId) {
            return -1;
        } else return 0;

        return (this.memberId - member.memberId)//; 오름차순 정렬. 위의 if문보다 이 코드가 더 간결함.
        // return (this.memberId - member.memberId) * (-1); //내림차순 정렬

 */
