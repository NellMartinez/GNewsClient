package com.financial.help.first.gNewsClient.controller;

import com.financial.help.first.gNewsClient.dto.response.ArticlesResponseDTO;
import com.financial.help.first.gNewsClient.service.APICallerServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/v1/news/")
public class GNewsController {

    @Autowired
    private APICallerServiceImpl APICallerService;

    @PostMapping(value = "articles",
            produces =  MediaType.APPLICATION_JSON_VALUE,
            consumes = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public List<ArticlesResponseDTO> getNArticles(@RequestParam(name = "q", required = true) String query, @RequestBody ){


    }
}
