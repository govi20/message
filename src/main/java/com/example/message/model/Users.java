package com.example.message.model;

import org.hibernate.validator.constraints.UniqueElements;

import javax.persistence.*;

@Entity
public class Users {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    long id;

    String username;

    private String name;

    @Column(name = "email_address")
    private String emailAddress;

    private String password;

    @Transient
    private String confirmPassword;

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getConfirmPassword() {
        return confirmPassword;
    }

    public void setConfirmPassword(String confirmPassword) {
        this.confirmPassword = confirmPassword;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass () != o.getClass ()) return false;

        Users users = (Users) o;

        if (id != users.id) return false;
        if (!username.equals (users.username)) return false;
        if (!name.equals (users.name)) return false;
        if (!emailAddress.equals (users.emailAddress)) return false;
        return password.equals (users.password);
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        if(username!=null)
            result = 31 * result + username.hashCode ();
        if(name!=null)
            result = 31 * result + name.hashCode ();
        if(emailAddress!=null)
            result = 31 * result + emailAddress.hashCode ();
        if(password!=null)
            result = 31 * result + password.hashCode ();
        return result;
    }


}
