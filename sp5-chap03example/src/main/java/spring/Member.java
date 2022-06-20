package spring;

import java.time.LocalDateTime;

// 회원 관련 클래스, 회원 데이터를 표현하기 위해 이 클래스를 사용.
public class Member {

    private Long id;
    private String email;
    private String password;
    private String name;
    private LocalDateTime registerDateTime;

    public Member(String email, String password, String name, LocalDateTime registerDateTime) {
        this.email = email;
        this.password = password;
        this.name = name;
        this.registerDateTime = registerDateTime;
    }

    public void setId(Long id) { // set은 변수값을할당하는 목적의 함수(지정하는 것)
        this.id = id;
    }

    public Long getId() { // get 변수값을 반환하는 것을목적으로 하기에 return이 필요하다. (가져오는 것)
        return id;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public String getName() {
        return name;
    }

    public LocalDateTime getRegisterDateTime() {
        return registerDateTime;
    }

    public void changePassword(String oldPassword, String newPassword) {
        if (!password.equals(oldPassword))
            throw new WrongIdPasswordException();
        this.password = newPassword;
    }
    // 45~49 changePassowrd는 암호 변경 기능 구현.
    // oldpassword와 newPassword 두 파라메터를 전달받는다.
    // oldpassword와 newPassowrd가 다르면 WrongIdPasswordException을 발생.
    // 값이 같으면 password 필드를 newPassword로 변경한다.
}
