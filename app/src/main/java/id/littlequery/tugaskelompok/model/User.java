package id.littlequery.tugaskelompok.model;

public class User {
    private String name,email;

    //constructor
    public User(String name, String email){
        this.name = name;
        this.email = email;
    }
    // Getter dan Setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
