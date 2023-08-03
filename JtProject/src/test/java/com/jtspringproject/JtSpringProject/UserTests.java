// package com.jtspringproject.JtSpringProject;

// import com.jtspringproject.JtSpringProject.Entity.User;
// import org.junit.jupiter.api.Test;

// public class UserTests {

//     User user = new User(1, "1", "1", null);
//     @Test
//     void userConstructorTest(){
//         assert(user.getId() == 1);
//         assert(user.getUsername().equals("1"));
//         assert(user.getPassword().equals("1"));
//         assert(user.getType() == null);

//     }

// }
package com.jtspringproject.JtSpringProject;

import com.jtspringproject.JtSpringProject.Entity.User;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

public class UserTests {

    User user;

    @BeforeEach
    void setUp() {
        user = new User(1, "username", "password", "type");
    }

    @Test
    void testGetId() {
        assertEquals(1, user.getId());
    }

    @Test
    void testGetUsername() {
        assertEquals("username", user.getUsername());
    }

    @Test
    void testGetPassword() {
        assertEquals("password", user.getPassword());
    }

    @Test
    void testGetType() {
        assertEquals("type", user.getType());
    }

    @Test
    void testSetId() {
        user.setId(2);
        assertEquals(2, user.getId());
    }

    @Test
    void testSetUsername() {
        user.setUsername("newUsername");
        assertEquals("newUsername", user.getUsername());
    }

    @Test
    void testSetPassword() {
        user.setPassword("newPassword");
        assertEquals("newPassword", user.getPassword());
    }

    @Test
    void testSetType() {
        user.setType("newType");
        assertEquals("newType", user.getType());
    }

    @Test
    void testToString() {
        String expected = "User{id=1, username=username, password=password, type=type}";
        assertEquals(expected, user.toString());
    }
}