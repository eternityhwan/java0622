package spring;

import spring.dao.MemeberDao;

import java.time.LocalDateTime;

public class MemberRegisterService {
    private MemeberDao memeberDao;

    public MemberRegisterService(MemeberDao memeberDao) { // 메모리 MemberDao
        this.memeberDao = memeberDao; // DB 처리 하려고 MemberDao 클래스의 메서드를 사용한다, 다른 클래스의 메서드를 사용 의존한다 표현.
    }    // 주입이란 클래스 외부에서 객체를 생성하여 해당 객체를 클래스 내부에주입하는 것., memberDao의 객체를 생성 -> 아래에서 생성자 생성없이 객체사용함

    public Long regist(RegisterRequest req) {
        Member member = memeberDao.selectByEmail(req.getEmail()); // 이메일을을 가지고 동일 이메일 존재 확인.
        if (member != null) {
            throw new DuplicateMemberException("dup email" + req.getEmail());
        }
        Member newMember = new Member(
                req.getEmail(), req.getPassword(), req.getName(),
                LocalDateTime.now());
        memeberDao.insert(newMember); // insert 메서드로 DB에 회원 데이터 삽입.
        return newMember.getId();
    }
}
