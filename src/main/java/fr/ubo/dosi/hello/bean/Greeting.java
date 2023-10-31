package fr.ubo.dosi.hello.bean;

import org.springframework.stereotype.Service;

import java.util.Date;
public class Greeting {
    private String auteur ;
    private String message ;



    public Greeting(String name, String s) {
        this.auteur = name;
        this.message = s;
    }

    public Greeting() {
    }

    public String getAuteur() {
        return auteur;
    }

    public void setAuteur(String auteur) {
        this.auteur = auteur;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }


}
