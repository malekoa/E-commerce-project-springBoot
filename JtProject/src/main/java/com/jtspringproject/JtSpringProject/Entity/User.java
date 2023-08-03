package com.jtspringproject.JtSpringProject.Entity;
import javax.persistence.*;


@Entity
@Table(name = "User")
public class User{
    // User attributes
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer id;
    private String username;
    private String password;
    protected String type;

    // Constructors
    public User(){
        this.type = "Customer";
    }

    public User(int id, String username, String password, String type){
        this.id = id;
        this.username = username;
        this.password = password;
        this.type = type;
    }


    // Accessor Methods
    public Integer getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getType() {
        return type;
    }

    // Mutator Methods
    public void setPassword(String password) {
        this.password = password;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username=" + username +
                ", password=" + password +
                ", type=" + type +
                '}';
    }
}