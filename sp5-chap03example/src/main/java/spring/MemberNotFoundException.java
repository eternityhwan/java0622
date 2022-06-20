package spring;

public class MemberNotFoundException extends RuntimeException {
    // RuntimeException 상속받은 클래스들은 Checked Exception으로 부른다.
    // 오류 처리를 하지않으면 컴파일 오류가 발생. 반드시 오류 처리를 해야한다.

    // RuntimeException을 상송받은 클래스들은 unCheckedException이라 한다.
    // 오류 처리를 하지 않아도 컴파일에서 오류가 발생되지 않는다.
}
