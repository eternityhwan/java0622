package chap02;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main2 {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx =
                new AnnotationConfigApplicationContext(AppContext.class);
        Greeter g1 = ctx.getBean("Greeter", Greeter.class);
        Greeter g2 = ctx.getBean("Greeter", Greeter.class);
        System.out.println("(g1 == g2) = " + (g1 == g2));
        ctx.close();
    }
}
// 싱글톤(Singleton)객체
// 10~11행 이름이 greeter 인 빈객체를 구해 g1과 g2로 할당.
// 12행 g1과 g2가 같은 객체인지 여부를 콘솔에 출력.

