public class User {

    private int id;
    private String email;

    private String pass;

    private String username;

    public User() {
    }

    public User(int id, java.lang.String email, java.lang.String pass, java.lang.String username) {
        this.id = id;
        this.email = email;
        this.pass = pass;
        this.username = username;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public java.lang.String getEmail() {
        return email;
    }

    public void setEmail(java.lang.String email) {
        this.email = email;
    }

    public java.lang.String getPass() {
        return pass;
    }

    public void setPass(java.lang.String pass) {
        this.pass = pass;
    }

    public java.lang.String getUsername() {
        return username;
    }

    public void setUsername(java.lang.String username) {
        this.username = username;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return id +" - "+email +" - " + pass + " - "+ username;
    }
}
