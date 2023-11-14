package com.financial.help.first.gNewsClient.controller;

import com.financial.help.first.gNewsClient.model.Article;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/news/")
public class GNewsController {

    @GetMapping("articles")
    public List<Article> getNArticles(@RequestParam (value="amount", defaultValue="50") String amount){


    }
}
