package com.example.springbootapi.service;


import com.example.springbootapi.dto.PrefCodeDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class PrefService {


    @Autowired
    @Qualifier("searchRestTemplate")
    RestTemplate restPrefTemplate;

    //ぐるなび都道府県マスタ取得API
    private static final String URL = "https://api.gnavi.co.jp/master/PrefSearchAPI/v3/" +
            "?keyid=d776cb014c9cfa4df83f8468d0db699a&lang=ja";

    public PrefCodeDto prefService() {
        return restPrefTemplate.getForObject(URL, PrefCodeDto.class);

    }


}
