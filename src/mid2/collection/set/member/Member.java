package mid2.collection.set.member;

import java.util.Objects;

public class Member {
    private String id;
    public Member(String id) {
        this.id = id;
    }
    public String getId() {
        return id;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Member member = (Member) o;
        return Objects.equals(id, member.id);
    }

    @Override
    public int hashCode() {
        //Object의 hash는 hashcode, 즉 fashFuntion을 쉽게 생성해준다.
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "Member{" +
                "id='" + id + '\'' +
                '}';
    }
}
