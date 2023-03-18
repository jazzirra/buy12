import java.util.Arrays;

public class User extends Basket{
    private String login;

    private String password;

    public User(Tovar[] tovarsOfBuy, String login, String password) {
        super(tovarsOfBuy);
        this.login = login;
        this.password = password;
    }




    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "User:" + login + "\n" +
                "Shopping : " + Arrays.toString(tovarsOfBuy) ;
    }
}
