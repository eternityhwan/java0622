package chap02;

public class Greeter {

    private String format;

    public String greet(String guest) {
        return String.format(format, guest);
    }
    // greet 메서드는 String의 문자열 포맷을 이용해서 새로운 문자열을 생성한다.
    // greet() 메서드에서 사용할 문자열 포맷은 setFormat() 메서드를 이용해서 설정하도록 구현한다.

    // Greeter 클래스를 사용하는 코드는 다음과 같이 Greeter 객체를 생성한 뒤,
    // setFormat() 메서드를 이용하여 문자열 포맷을 지정하고, greet() 메서드를 이용해서 메세지를 생성할 것.
    //    Greeter greeter = new Greeter();
    //    greeter.setFormat("%s, 안녕하세요!");
    //    String msg = greeter.greet("스프링");
      public void setFormat(String format) {
        this.format = format;
    }
}
