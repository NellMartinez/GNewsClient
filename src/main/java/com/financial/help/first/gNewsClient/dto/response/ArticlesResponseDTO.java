package com.financial.help.first.gNewsClient.dto.response;

import com.financial.help.first.gNewsClient.model.Article;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@Setter
@Getter
@ToString
@AllArgsConstructor
public class ArticlesResponseDTO {

    private int totalResults;
    private List<Article> articles;


}
