package com.financial.help.first.gNewsClient.model;

import jakarta.persistence.Entity;
import lombok.Data;

@Entity
@Data
public class Source {

    private String source;
    private String url;

}
