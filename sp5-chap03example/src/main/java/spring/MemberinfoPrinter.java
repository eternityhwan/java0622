package spring;

import spring.dao.MemeberDao;

public class MemberinfoPrinter {

    private MemeberDao memDao;
    private MemeberDao printer;

    public void printMemberinfo(String email) {
        Member member = memDao.selectByEmail(email);
        if (member == null) {
            System.out.println("데이터 없음\n");
            return;
        }
//        printer.print(member);
//        System.out.println();
    }

    public void setMemberDao(MemeberDao memeberDao) { this.memDao = memeberDao; }

//    public void setPrinter(MemberPrinter printer) { this.printer = printer; }
}
