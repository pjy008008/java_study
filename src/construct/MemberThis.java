package construct;

public class MemberThis {
    String nameField;
    void initMember(String nameParameter){
        nameField=nameParameter; //매개변수랑 이름이 다르면 this생략 가능, 자동으로 this가 붙음
        //this.nameField = nameParameter; // 이런식의 코딩 스타일도 있음.
    }
}
