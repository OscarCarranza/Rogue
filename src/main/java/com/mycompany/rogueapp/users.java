package com.mycompany.rogueapp;
import org.ektorp.support.CouchDbDocument;

public class users extends CouchDbDocument {    
    String username;
    String password;
    String type;

    public users(String username, String password, String type) {
        this.username = username;
        this.password = password;
        this.type = type;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "users{" + "username=" + username + ", password=" + password + ", type=" + type + '}';
    }
}
