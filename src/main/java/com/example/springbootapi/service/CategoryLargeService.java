package com.example.springbootapi.service;


import com.example.springbootapi.dto.CategoryCodeDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class CategoryLargeService {

    @Autowired
    @Qualifier("searchRestTemplate")
    RestTemplate restCategoryTemplate;

    //大業態マスタ取得API
    private static final String URL = "https://api.gnavi.co.jp/master/CategoryLargeSearchAPI/v3/" +
            "?keyid=d776cb014c9cfa4df83f8468d0db699a&lang=ja";

    public CategoryCodeDto categoryService() {
        return restCategoryTemplate.getForObject(URL, CategoryCodeDto.class);
    }

}
