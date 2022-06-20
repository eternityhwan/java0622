package chap02;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration // 스프링 클래스로 지정한다는 것.
public class AppContext {

    @Bean
    public Greeter greeter() {
        Greeter g = new Greeter(); // 객체 생성만
        g.setFormat("%s, 안녕하세요!");
        return g;
    }
}
