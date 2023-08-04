package com.jtspringproject.JtSpringProject.Entity;

import javax.persistence.*;

@Entity
@Table(name = "Admin")
public class Admin extends User{

    public Admin() {
        this.setType("Admin");
    }
}