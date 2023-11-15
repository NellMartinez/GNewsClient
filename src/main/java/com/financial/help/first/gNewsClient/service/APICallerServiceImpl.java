package com.financial.help.first.gNewsClient.service;

import com.financial.help.first.gNewsClient.dto.response.ArticlesResponseDTO;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class APICallerServiceImpl implements IAPICallerService {

    @Value("${gNews.apikey}")
    private static String apiKey;

    @Value("${gNews.root.endPoint}")
    private static String rootEndpoint;


    @Override
    public ArticlesResponseDTO getArticles(int articlesAmount) {
        return null;
    }
}
