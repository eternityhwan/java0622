package spring;

import spring.dao.MemeberDao;

import java.util.Collection;

public class MemberListPrinter {

    private MemeberDao memberDao;
    private MemberPrinter printer;

    public MemberListPrinter(MemeberDao memeberDao, MemberPrinter printer) {
        this.memberDao = memeberDao;
        this.printer = printer;
    }

    public void printAll() {
        Collection<Member> members = memberDao.selectAll();
        members.forEach(m -> printer.print(m));
    }
}
// Collection 이란? 객체의 모음, 그룹.
// Collection Framework 개념.
// Collection 인터페이스(java.utill.Collection과 Map 인터페이스 자바 컬렉션 클래스의 주요 "루트"인터페이스.
// 쓰는 이유, 일괄된 api AraayList, Vector, LinkedList 컬렉션에서 상속받아 통일된 메서드를 사용하게 된다.
// 프로그래밍 노력 감소.
// 프로그램 속도 및 품질 향상.