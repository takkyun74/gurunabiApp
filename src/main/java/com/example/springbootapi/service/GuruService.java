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
            "&pref={pref_code}&category_l={category_code}&name={name}";

    public GuruCodeDto service(String pref_code, String category_code, String name){
//        System.out.println(URL);
        return restguruTemplate.getForObject(URL, GuruCodeDto.class, pref_code, category_code, name);
    }

    //居酒屋グループ
    private static final String IzakayaURL = "https://api.gnavi.co.jp/RestSearchAPI/v3/?keyid=d776cb014c9cfa4df83f8468d0db699a" +
            "&category_l=RSFST09000" +
            "&name={name}&pref={pref_code}";

    public GuruCodeDto IzakayaService(String pref_code, String name){
//        System.out.println(URL);
        return restguruTemplate.getForObject(IzakayaURL, GuruCodeDto.class, pref_code, name);
    }


    //日本料理・郷土料理グループ
    private static final String NihonRyouriURL = "https://api.gnavi.co.jp/RestSearchAPI/v3/?keyid=d776cb014c9cfa4df83f8468d0db699a" +
            "&category_l=RSFST02000" +
            "&name={name}&pref={pref_code}";

    public GuruCodeDto NihonRyouriService(String pref_code, String name){
//        System.out.println(URL);
        return restguruTemplate.getForObject(NihonRyouriURL, GuruCodeDto.class, pref_code, name);
    }


    //すし・魚料理・シーフードグループ
    private static final String SushiSakanaSeafoodURL = "https://api.gnavi.co.jp/RestSearchAPI/v3/?keyid=d776cb014c9cfa4df83f8468d0db699a" +
            "&category_l=RSFST03000" +
            "&name={name}&pref={pref_code}";

    public GuruCodeDto SushiService(String pref_code, String name){
//        System.out.println(URL);
        return restguruTemplate.getForObject(SushiSakanaSeafoodURL, GuruCodeDto.class, pref_code, name);
    }

    //鍋グループ
    private static final String NabeURL = "https://api.gnavi.co.jp/RestSearchAPI/v3/?keyid=d776cb014c9cfa4df83f8468d0db699a" +
            "&category_l=RSFST04000" +
            "&name={name}&pref={pref_code}";

    public GuruCodeDto NabeService(String pref_code, String name){
//        System.out.println(URL);
        return restguruTemplate.getForObject(NabeURL, GuruCodeDto.class, pref_code, name);
    }

    //焼肉・ホルモングループ
    private static final String YakinikuHorumonURL = "https://api.gnavi.co.jp/RestSearchAPI/v3/?keyid=d776cb014c9cfa4df83f8468d0db699a" +
            "&category_l=RSFST05000" +
            "&name={name}&pref={pref_code}";

    public GuruCodeDto YakinikuService(String pref_code, String name){
//        System.out.println(URL);
        return restguruTemplate.getForObject(YakinikuHorumonURL, GuruCodeDto.class, pref_code, name);
    }

    //焼き鳥・肉料理・串料理グループ
    private static final String YakitoriURL = "https://api.gnavi.co.jp/RestSearchAPI/v3/?keyid=d776cb014c9cfa4df83f8468d0db699a" +
            "&category_l=RSFST06000" +
            "&name={name}&pref={pref_code}";

    public GuruCodeDto YakitoriService(String pref_code, String name){
//        System.out.println(URL);
        return restguruTemplate.getForObject(YakitoriURL, GuruCodeDto.class, pref_code, name);
    }

    //和食グループ
    private static final String WasyokuURL = "https://api.gnavi.co.jp/RestSearchAPI/v3/?keyid=d776cb014c9cfa4df83f8468d0db699a" +
            "&category_l=RSFST01000" +
            "&name={name}&pref={pref_code}";

    public GuruCodeDto WasyokuService(String pref_code, String name){
//        System.out.println(URL);
        return restguruTemplate.getForObject(WasyokuURL, GuruCodeDto.class, pref_code, name);
    }

    //お好み焼き・粉物グループ
    private static final String OkonomiyakiURL = "https://api.gnavi.co.jp/RestSearchAPI/v3/?keyid=d776cb014c9cfa4df83f8468d0db699a" +
            "&category_l=RSFST07000" +
            "&name={name}&pref={pref_code}";

    public GuruCodeDto OkonomiyakiService(String pref_code, String name){
//        System.out.println(URL);
        return restguruTemplate.getForObject(OkonomiyakiURL, GuruCodeDto.class, pref_code, name);
    }


    //ラーメン・麺料理グループ
    private static final String RamenURL = "https://api.gnavi.co.jp/RestSearchAPI/v3/?keyid=d776cb014c9cfa4df83f8468d0db699a" +
            "&category_l=RSFST08000" +
            "&name={name}&pref={pref_code}";

    //中華グループ
    private static final String TyuukaURL = "https://api.gnavi.co.jp/RestSearchAPI/v3/?keyid=d776cb014c9cfa4df83f8468d0db699a" +
            "&category_l=RSFST14000" +
            "&name={name}&pref={pref_code}";

    //イタリアン・フレンチグループ
    private static final String ItarianURL = "https://api.gnavi.co.jp/RestSearchAPI/v3/?keyid=d776cb014c9cfa4df83f8468d0db699a" +
            "&category_l=RSFST11000" +
            "&name={name}&pref={pref_code}";

    //洋食グループ
    private static final String YousyokuURL = "https://api.gnavi.co.jp/RestSearchAPI/v3/?keyid=d776cb014c9cfa4df83f8468d0db699a" +
            "&category_l=RSFST13000" +
            "&name={name}&pref={pref_code}";

    //欧米・各国料理グループ
    private static final String OubeiURL = "https://api.gnavi.co.jp/RestSearchAPI/v3/?keyid=d776cb014c9cfa4df83f8468d0db699a" +
            "&category_l=RSFST12000" +
            "&name={name}&pref={pref_code}";

    //カレーグループ
    private static final String KareURL = "https://api.gnavi.co.jp/RestSearchAPI/v3/?keyid=d776cb014c9cfa4df83f8468d0db699a" +
            "&category_l=RSFST16000" +
            "&name={name}&pref={pref_code}";

    //アジア・エスニック料理グループ
    private static final String AsiaURL = "https://api.gnavi.co.jp/RestSearchAPI/v3/?keyid=d776cb014c9cfa4df83f8468d0db699a" +
            "&category_l=RSFST15000" +
            "&name={name}&pref={pref_code}";

    //オーガニック・創作料理グループ
    private static final String OrganicURL = "https://api.gnavi.co.jp/RestSearchAPI/v3/?keyid=d776cb014c9cfa4df83f8468d0db699a" +
            "&category_l=RSFST17000" +
            "&name={name}&pref={pref_code}";

    //ダイニングバー・バー・ビアホールグループ
    private static final String DiningURL = "https://api.gnavi.co.jp/RestSearchAPI/v3/?keyid=d776cb014c9cfa4df83f8468d0db699a" +
            "&category_l=RSFST10000" +
            "&name={name}&pref={pref_code}";

    //お酒グループ
    private static final String OsakeURL = "https://api.gnavi.co.jp/RestSearchAPI/v3/?keyid=d776cb014c9cfa4df83f8468d0db699a" +
            "&category_l=RSFST21000" +
            "&name={name}&pref={pref_code}";

    //カフェ・スイーツグループ
    private static final String CafeURL = "https://api.gnavi.co.jp/RestSearchAPI/v3/?keyid=d776cb014c9cfa4df83f8468d0db699a" +
            "&category_l=RSFST18000" +
            "&name={name}&pref={pref_code}";

    //宴会・カラオケ・エンターテイメントグループ
    private static final String EnkaiURL = "https://api.gnavi.co.jp/RestSearchAPI/v3/?keyid=d776cb014c9cfa4df83f8468d0db699a" +
            "&category_l=RSFST19000" +
            "&name={name}&pref={pref_code}";

    //ファミレス・ファーストフードグループ
    private static final String FamilesURL = "https://api.gnavi.co.jp/RestSearchAPI/v3/?keyid=d776cb014c9cfa4df83f8468d0db699a" +
            "&category_l=RSFST20000" +
            "&name={name}&pref={pref_code}";

    //その他の料理グループ
    private static final String OtherURL = "https://api.gnavi.co.jp/RestSearchAPI/v3/?keyid=d776cb014c9cfa4df83f8468d0db699a" +
            "&category_l=RSFST90000" +
            "&name={name}&pref={pref_code}";



}



