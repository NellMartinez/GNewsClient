package com.financial.help.first.gNewsClient.service;

import com.financial.help.first.gNewsClient.dto.response.ArticlesResponseDTO;

public interface IAPICallerService {

    // fetching N news articles
    ArticlesResponseDTO getArticles(int articlesAmount);

   // finding a news article with a specific title or author

   // searching by keywords

   // Include a cache in your API service as well so users are not fetching the same things over and over.
}
