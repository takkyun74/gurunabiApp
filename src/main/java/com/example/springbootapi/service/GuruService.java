package com.example.springbootapi.service;

import com.example.springbootapi.dto.GuruCodeDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class GuruService {

    @Autowired
    @Qualifier("searchRestTemplate")
    RestTemplate restguruTemplate;



    // 店舗名と都道府県
    private static final String URL = "https://api.gnavi.co.jp/RestSearchAPI/v3/?keyid=d776cb014c9cfa4df83f8468d0db699a" +
            "&pref={pref_code}&category_l={category_code}";


    public GuruCodeDto service(String pref_code, String category_code){
//        System.out.println(URL);
        return restguruTemplate.getForObject(URL, GuruCodeDto.class, pref_code, category_code);
    }


}



