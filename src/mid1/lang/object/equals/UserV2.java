package mid1.lang.object.equals;

import java.util.Objects;

public class UserV2 {
    private String id;
    public UserV2(String id) {
        this.id = id;
    }

//    @Override
//    public boolean equals(Object object) {
//        //매개변수가 object로 들어오기 때문에 다운캐스팅 필요, instanceOf 사용하면 좋음
//        if (object instanceof UserV2 user) {
//            return id.equals(user.id);
//        }
//        return false;
//    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        UserV2 userV2 = (UserV2) object;
        return Objects.equals(id, userV2.id);
    }
}
