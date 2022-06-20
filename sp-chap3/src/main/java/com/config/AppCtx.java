package com.config;


import org.springframework.context.annotation.Configuration;


// Assembler 대신 스프링을 사용하는 코드를 작성 할 것.


@Configuration // @Configuration 스프링 설정 클래스, 이 애노테이션이 있어야 스프링 설정 클래스로 사용할 수 있다.
public class AppCtx {

//    @Bean // @Bean 해당 메서드가 생성한 객체를 스프링 빈이라 설정, 각 메서드마다 빈 객체를 생성한다
//    public MemeberDao memeberDao() { // memberDao() 메서드를 이용해서 생성한 빈 객체는 memberDao이름으로 스프링에 등록된다.
//        return new MemeberDao();
//    }

//    @Bean
//    public MemberRegisterService memberRegSvc() {
//        return new MemberRegisterService(memeberDao()); // memberDao 생성 객체가 MemberRegisterService 생성자 호출할 때 메서드 호출.
//    }  // 생성자를 매개변수로 넘겼기 때문에 생성자 방식의 DI

//    @Bean // 23~28행 setMemberDao() 메서드로 의존 객체 주입한다. 의존 객체를 주입하는 것은 스프링 컨테이너, 설정클래스를 이용해서 컨테이너를 생성.
//    public ChangePasswordService changePwdSvc() {
//        ChangePasswordService pwdSvc = new ChangePasswordService();
//        pwdSvc.setMemeberDao(memeberDao()); // setter 메서드, 메서드 이름이 set으로 시작한다, set 뒤에 첫 글자는 대문자로 시작한다. 리턴타입 void
//        return pwdSvc; // GET은 셋으로 초기화 한 애를 가져옴, SETMemberDao로 DI 했기 때문에 SET 방식.
//    }

//    @Bean
//    public MemberPrinter memberPrinter() {
//        return new MemberPrinter();
//    }

//    @Bean
//    public MemberListPrinter listPrinter() {
//        return new MemberListPrinter(memeberDao(), memberPrinter());
//    }

//    @Bean
//    public MemberinfoPrinter infoPrinter() {
//        MemberinfoPrinter infoPrinter = new MemberinfoPrinter();
//        infoPrinter.setMemberDao(memeberDao()); // <- memberDao 빈 주입
//        infoPrinter.setPrinter(memberPrinter()); // < - memberPrinter 빈 주입
//        return infoPrinter;
//    } // infoPrinter 빈은 세터 메서드를 이용해서 memberDao 빈과 member Printer 빈을 주입한다.
}

