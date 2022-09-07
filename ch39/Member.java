package ch39;

public class Member {
    private int memberId;        //회원 아이디
    private String memberName;   //회원 이름

    public Member(int memberId, String memberName){ //생성자
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
    public String toString(){   //toString 메소드 오버로딩
        return memberName + " 's Id is " + memberId ;
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
            if (this.memberId == member.memberId){
                return true;
            } else return false;
        } return false;
    }

}
