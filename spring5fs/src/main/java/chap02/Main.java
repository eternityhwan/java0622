package chap02;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = // 설정 정보를 이용하여 빈 객체를 생성한다.
            new AnnotationConfigApplicationContext();
        Greeter g = ctx.getBean("greeter", Greeter.class); // 빈 객체를 제공한다.
        String msg = g.greet("스프링");
        System.out.println(msg);
        ctx.close();
    }
}
// 3행 AnnotationConfigApplicationContext 클래스는 자바 설정에서 정보를 읽어와 빈 객체를 생성하고 관리한다.
// 08~09 AnnotationConfigApplicationContext 객체를 생성할 때 앞서 작성한 AppContext 클래스를
// 생성자 파라메터로 전달한다. AnnotationConfigAplicationContext는 AppContext에 정의한 @Bean 설정 정보를 읽어와
// Greeter 객체를 생성하고 초기화 한다.
// 10행 GetBean() 메소드는 AnnotationConfigApplicationContext가 자바 설정을 읽어와 생성한 빈 객체를 검색할 때 사용된다.
// Getbean() 메서드의 첫 번째 파라미터는 @Bean 애노테이션의 메서드 이름인 빈 객체의 이름, 두 번째 파라미터는 검색할 빈 객체의 타입.
// Getbean은 객체의 이름과 객체의 타입으로 가져올 수 있는 것, return으로 Greeter 객체를 리턴한다.

// 11행 Greeter 객체의 greet 메서드를 실행한다.
// 핵심은 AnnotationConfigApplicationContext 클래스.
// 스프링의 핵심 기능은 객체를 생성하고 초기화 하는 것.
// ApplicationContext 라는 인터페이스에 정의되어있음, AnnotationConfigApplicationContext 클래스는 자바 클래스에서
// 정보를 읽어와 객체 생성과 초기화를 수행한다.

// AnnotationConfigApplicationContext : 자바 애노테이션을 이용한 클래스로부터 객체 설정 정보를 가져온다.
// GenericXmlApplicationContext : XML로부터 객체 설정 정보를 가져온다.

