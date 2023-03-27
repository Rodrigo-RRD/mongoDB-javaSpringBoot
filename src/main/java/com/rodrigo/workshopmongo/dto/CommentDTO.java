package com.rodrigo.workshopmongo.dto;

import java.io.Serializable;
import java.util.Date;

public class CommentDTO implements Serializable{

    private String text;
    private Date date;
    private AuthorDTO author;

    public CommentDTO(){

    }


    public CommentDTO(String text, Date date, AuthorDTO author) {
        this.text = text;
        this.date = date;
        this.author = author;
    }

    public String getText() {
        return this.text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Date getDate() {
        return this.date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public AuthorDTO getAuthor() {
        return this.author;
    }

    public void setAuthor(AuthorDTO author) {
        this.author = author;
    }

}
