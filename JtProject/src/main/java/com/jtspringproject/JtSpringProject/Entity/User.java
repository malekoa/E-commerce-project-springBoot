package com.jtspringproject.JtSpringProject.Entity;
import javax.persistence.*;

/**
 * The User class represents a basic entity for users in the application.
 * It is annotated with {@link Entity} to indicate that it is a JPA entity
 * and can be mapped to a database table. The inheritance strategy used is
 * {@link InheritanceType#JOINED}, meaning subclasses will be stored in separate tables
 * linked by primary keys.
 *
 * The User class corresponds to the "User" table in the database.
 */
@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@Table(name = "User")
public class User {
    // User attributes

    /**
     * The primary key of the user.
     */
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    /**
     * The username of the user.
     */
    private String username;

    /**
     * The password of the user.
     */
    private String password;

    /**
     * The type of the user. (e.g., "Customer", "Admin", etc.)
     * This attribute is protected, so subclasses can access it directly.
     */
    protected String type;

    // Constructors

    /**
     * Creates a new User object with the default type set to "Customer".
     */
    public User() {
        this.type = "Customer";
    }

    /**
     * Creates a new User object with the provided details.
     *
     * @param id       The unique identifier of the user.
     * @param username The username of the user.
     * @param password The password of the user.
     * @param type     The type of the user (e.g., "Customer", "Admin", etc.).
     */
    public User(int id, String username, String password, String type) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.type = type;
    }

    // Accessor Methods

    /**
     * Gets the unique identifier of the user.
     *
     * @return The user's identifier.
     */
    public Integer getId() {
        return id;
    }

    /**
     * Gets the username of the user.
     *
     * @return The user's username.
     */
    public String getUsername() {
        return username;
    }

    /**
     * Gets the password of the user.
     *
     * @return The user's password.
     */
    public String getPassword() {
        return password;
    }

    /**
     * Gets the type of the user.
     *
     * @return The user's type.
     */
    public String getType() {
        return type;
    }

    // Mutator Methods

    /**
     * Sets the password of the user.
     *
     * @param password The new password for the user.
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * Sets the username of the user.
     *
     * @param username The new username for the user.
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * Sets the unique identifier of the user.
     *
     * @param id The new identifier for the user.
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * Sets the type of the user.
     *
     * @param type The new type for the user.
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * Returns a string representation of the User object.
     *
     * @return A string containing the user's id, username, password, and type.
     */
    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}