package acme.bean;

public class Contact {
    public Contact() {
        super();
    }
    
    public Contact(String name, String email) {
      this.name = name;
      this.email = email;
    }
    
    private String name;
    private String email;


    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }
}
