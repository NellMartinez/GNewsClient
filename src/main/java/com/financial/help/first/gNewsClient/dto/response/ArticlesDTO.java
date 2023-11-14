package com.financial.help.first.gNewsClient.dto.response;

import com.financial.help.first.gNewsClient.model.Article;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Setter;
import lombok.ToString;

import java.util.Set;

@Setter
@ToString
@AllArgsConstructor
public class ArticlesDTO {

    private Set<Article> articles;


}
