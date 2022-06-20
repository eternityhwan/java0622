package spring;

public class RegisterRequest { // 회원가입을 처리할 때 필요한 요소를 담고있는 클래스.

    private String email;
    private String password;
    private String confirmPassword;
    private String name;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
     this.password = password;
    }

    public String getConfirmPassword( String confirmPassword) {
        return confirmPassword;
    }

    public void setConfirmPassword(String confirmPassowrd) {
        this.confirmPassword = confirmPassowrd;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isPasswordEqualToConfirmPassword() {
        return password.equals(confirmPassword);
    }
}
