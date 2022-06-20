package spring.assmbler;

import spring.ChangePasswordService;
import spring.MemberRegisterService;
import spring.dao.MemeberDao;

public class Assembler { // 객체 조립기.

    private MemeberDao memeberDao;
    private MemberRegisterService regSvc;
    private ChangePasswordService pwdSvc;

    public Assembler() { // 13에서 18줄까지 객체를 생성한다 주입은 아래에서 하는거지.
        memeberDao = new MemeberDao();
        regSvc = new MemberRegisterService(memeberDao); // memberRegisterService 객체, ChangePasswordService 의존 주입
        pwdSvc = new ChangePasswordService();
        pwdSvc.setMemeberDao(memeberDao); // changePasswordService는 세터(set으로 DI 주입)를 통해 주입 받는다.
    }

    public MemeberDao getMemeberDao() {
        return memeberDao;
    }

    public MemberRegisterService getMemberRegisterService() {
        return regSvc;
    }

    public ChangePasswordService getChangePasswordService() {
        return pwdSvc;
    }

}
