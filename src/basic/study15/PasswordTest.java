package basic.study15;

public class PasswordTest {

    private String password;

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) throws PasswordException {

        if (password == null) {
            throw new PasswordException("비밀번호는 null 일 수 없습니다.");
        } else if (password.length() < 5) {
            throw new PasswordException("비밀번호는 5자 이상이어야 합니다.");
        } else if (password.matches("[a-zA-Z]+")) {
            throw new PasswordException("비밀번호는 숫자나 특수문자를 포함해야 합니다.");
        }

        this.password = password;
    }

    public static void main(String[] args) {
        PasswordTest test = new PasswordTest();

        String password = "abc";

        try {
            test.setPassword(password);
            System.out.println("오류 없음");
        } catch (PasswordException e) {
            System.out.println(e.getMessage());
        }
    }

}
