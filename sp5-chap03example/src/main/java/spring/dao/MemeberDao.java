package spring.dao;

import spring.Member;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class MemeberDao { // DB에 접근하는 클래스를 DAO라 함. only data access 목적

    private static long nextId = 0;

    private Map<String, Member> map =new HashMap<>();

    public Member selectByEmail(String email) {
        return map.get(email);
    }

    public void insert(Member member) {
        member.setId(++nextId);
        map.put(member.getEmail(), member);
    }

    public void update(Member member) {
        map.put(member.getEmail(), member);

    }

    public Collection<Member> selectAll() {
        return map.values();
    }
}

