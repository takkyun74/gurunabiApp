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

    String api1 = "89f7197b2d5b4c16154a5fc05f0b1fef";

    String api2 = "d776cb014c9cfa4df83f8468d0db699a";

    //ぐるなび都道府県マスタ取得API
    private static final String URL = "https://api.gnavi.co.jp/master/PrefSearchAPI/v3/" +
            "?keyid=89f7197b2d5b4c16154a5fc05f0b1fef&lang=ja";

    public PrefCodeDto prefService() {
        return restPrefTemplate.getForObject(URL, PrefCodeDto.class);

    }


}
