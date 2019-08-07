package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.time.*;
import java.util.Date;

@Entity
public class Bullhorn {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;


    @NotNull
    @Size(min=1)
    private String title;


    @NotNull
    @Size(min=1)
    private String content;

    @NotNull
    //@Size(min=10)
    //@Size(max=10)
    //private Date postedDate;
    //LocalDateTime currentDateTime = LocalDateTime.now();
    //postedDate = currentDateTime;

    //private LocalDateTime postedDate;
    private LocalDate postedDate;
    //postedDate = LocalDateTime.now();

    @NotNull
    @Size(min=1)
    private String sentBy;


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public LocalDate getPostedDate() {
        return postedDate;
    }

    public void setPostedDate(LocalDate postedDate) {
        //this.postedDate = postedDate;
        this.postedDate = LocalDate.now();
    }

    public String getSentBy() {
        return sentBy;
    }

    public void setSentBy(String sentBy) {
        this.sentBy = sentBy;
    }
}
