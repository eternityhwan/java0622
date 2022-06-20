package chap02;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration // Configuration 애노테이션은 해당 클래스를 스프링 설정 클래스로 지정한다.
public class AppContext {

    @Bean
    public Greeter greeter() {
        Greeter g = new Greeter();
        g.setFormat("%s, 안녕하세요!");
        return g;
    }
    // 9~14 행이 핵심, 스프링은 객체를 생성하고 초기화하는 기능을 제공.
    // 9~14 행에 객체를 생성하고 초기화 하는 설정을 담고 있다.
    // 스프링에서 생성하는 객체를 BEAN 객체라고 부르는데.
    // 이 빈 객체에 대한 정보를 담고 있는 메서드가 greeter() 메서드이다.
    // @Bean 애노테이션을 메서드에 붙이면 해당 메서드가 생성한 객체를 스프링이 관리하는 빈 객체로 등록한다.

    // @Bean 애노테이션을 붙인 메서드의 이름은 빈 객체를 구분할 때 사용한다.
    // 10~14 행에서 생성한 객체를 구분할 때 greeter 이름을 사용한다.
    // 이 이름은 bean 객체로 등록한다.

    // @Bean 애노테이션을 붙인 메서드는 객체를 생성하고 알맞게 초기화해야 한다.
    // 위 코드에서는 12행에서 Greeter 객체를 초기화하고 있다.

    // 이제는 AppContext를 읽어와 사용하는 것. -> Main 클래스에서 사용할 것이야.
}
