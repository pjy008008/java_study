package mid2.collection.map.test.member;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MemberRepository {
    private Map<String, Member> map = new HashMap<>();

    public void save(Member member) {
        map.put(member.getId(), member);
    }

    public Member findById(String key) {
        if (map.containsKey(key)) {
            return map.get(key);
        }
        return null;
    }

    public Member findByName(String name) {
        for (Member member : map.values()) {
            if (member.getName().equals(name)) {
                return member;
            }
        }
        return null;
    }

    public void remove(String key) {
        map.remove(key);
    }
}
