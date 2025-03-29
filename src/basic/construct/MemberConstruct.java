package basic.construct;

public class MemberConstruct {
    String name;
    int age;
    int grade;
    MemberConstruct(String name,int age){
        this(name, age, 50); // this는 MemberConstruct라는 생성자를 호출함, 중복 제거
        //this()는 생성자 코드의 첫줄에만 가능함 **중요**
    }
    MemberConstruct(String name,int age,int grade){
        System.out.println(name+", "+age+", "+grade);
        this.name=name;
        this.age=age;
        this.grade=grade;
    }
}
