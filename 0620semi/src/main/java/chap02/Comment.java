package chap02;

public class Comment {
    // AppContext
    // 09~14행 코드 한 개 객체를 생성하고 초기화 하는 설정.
    // 스프링이 생성하는 객체를 빈 객체로 부른다. // new를 안하기 위해 스프링을 쓴다
    // 이 빈 객체에 대한 정보를 담고 있는 메서드가 greeter 메서드.
    // @Bean 애노테이션을 붙인 메서드는 객체를 생성하고 알맞게 초기화 해야한다.
    // 12행에서 Greeter 객체를 초기화하고 있다.
    // @Bean 어노테이션이 붙으면 해당 메서드가 생성한 객체를 스프링이 관리하는 빈 객체로 등록한다.

    // Main
    // AnnotationConfigApplicationContext를 통해 컨테이너 생성 후 로딩할 수 있다.
    // 앞서 작성한 AppContext 클래스를
    // 생성자 파라미터로 전달한다,AnnotationConfigApplication은
    // AppContext에 정의한
    // @Bean 정보를 읽어와 Greeter 객체를 생성하고 초기화 한다.
    // ApplicationContext는 인터페이스
    // 메세지, 프로필, 환경 변수 등을 처리할 수 있다

    // AppContext 보면 @Bean 메소드 이름이 greeter 생성 객체의 리턴 타입이 Greeter,
    // getBean() 메서드는 greeter() 메서드 생성한 Greeter객체를 리턴한다.
    // getBean() 메서드, AnnotationConfigApplicationContext가 자바 설정 읽어와 생성하는 빈 객체를 검색할 때 사용.

    // Greeter
    // greet 메서드에서 사용할 문자열포멧은 setFormat
    // String.format 자바의 포매팅 기능이다, 포메팅 기능을 안쓰면 +로 연결해줘야해, 변수 처리도 못해
}
