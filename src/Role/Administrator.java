package Role;

public class Administrator extends  Person{
    public Administrator() {
    }

    public Administrator(String ID, String password) {
        super(ID, password);
        setRole("Administrator");
    }
}
