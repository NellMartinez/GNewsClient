package com.financial.help.first.gNewsClient.model;

import jakarta.persistence.Entity;
import lombok.Data;

import java.util.Date;

@Entity
@Data
public class Article {

    private String title;
    private String description;
    private String content;
    private String url;
    private String image;
    private Date publishedAt;
    private Source source;


}
