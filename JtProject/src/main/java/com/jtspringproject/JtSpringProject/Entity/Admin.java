package com.jtspringproject.JtSpringProject.Entity;

import javax.persistence.*;

@Entity
@Table(name = "Admin")
public class Admin extends User{

    Admin(){
        super();
        this.type = "Admin";
    }
}