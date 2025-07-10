package Role;

public class Person {
    private String ID;
    private String password;
    private String role;

    public Person() {}

    public Person(String ID, String password) {
        this.ID = ID;
        this.password = password;
    }

    public String getID() {
        return ID;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public static void login(){
        System.out.println("请输入身份证号码：");
        System.out.println("请输入密码：");
    }

    public static void register(){
        System.out.print("请输入身份证号码：");
        System.out.print("请输入密码：");
        System.out.print("请确认密码：");
        System.out.print("请输入手机号码：");
        System.out.print("请输入银行卡号码：");
    }
}
