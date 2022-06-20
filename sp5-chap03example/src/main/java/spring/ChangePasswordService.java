package spring;

import spring.dao.MemeberDao;

public class ChangePasswordService {
    // ChangePasswordService 클래스는 암호를 변경할 Member 데이터를 찾기위해 email 사용한다.
    // email에 해당하는 Member가 없으면 10~11에서 익셉션을 발생시킨다, 발견되면 13행 changePassowrd를 발동시킨다.
    private MemeberDao memeberDao;

    public void changePassword(String email, String oldPwd, String newPwd) {
        Member member = memeberDao.selectByEmail(email);
        if (member == null)
            throw new MemberNotFoundException();

        member.changePassword(oldPwd, newPwd);

        memeberDao.update(member);
    }

    public void setMemeberDao(MemeberDao memeberDao) { // setMemberDao 메서드로 의존하는 MemberDao를 전달받는다.
        this.memeberDao = memeberDao;
    }

}
