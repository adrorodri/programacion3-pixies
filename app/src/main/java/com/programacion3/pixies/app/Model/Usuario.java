package com.programacion3.pixies.app.Model;

import com.google.gson.annotations.Expose;

/**
 * Created by adro_ on 5/4/2018.
 */

public class Usuario {

    @Expose
    String email;

    @Expose
    String password;

    public Usuario(String email, String password) {
        this.email = email;
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
