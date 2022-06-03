import main.java.User;

public class App {
    public static void main(String[] args) throws Exception {
        User odhran = User.getUser();

        System.out.println("Hello " + odhran.getFirstName() + " " + odhran.getLastName() + "!");
    }
}
