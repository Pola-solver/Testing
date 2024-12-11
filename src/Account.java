public class Account {
    private String Email;
    private String Password;

    public Account(String email, String password) {
        this.Email = email;
        this.Password = password;
    }
    public void setEmail(String email) {
        Email = email;
    }

    public String getEmail() {
        return Email;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public String getPassword() {
        return Password;
    }
}