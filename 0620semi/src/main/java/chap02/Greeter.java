package chap02;

public class Greeter { // String 문자열 포맷을 이용해 새 문자열을 생성

    private String format;

    public String greet(String guest) {
        return String.format(format, guest);
    }

    public void setFormat(String format) {
        this.format = format;
    }

}
