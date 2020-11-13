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



//    // 店舗名と都道府県
//    private static final String URL = "https://api.gnavi.co.jp/RestSearchAPI/v3/?keyid=d776cb014c9cfa4df83f8468d0db699a" +
//            "&pref={pref_code}&name={name}";
//
//    public GuruCodeDto service(String pref_code,  String name){
////        System.out.println(URL);
//        return restguruTemplate.getForObject(URL, GuruCodeDto.class, pref_code,  name);
//    }

    String api1 = "89f7197b2d5b4c16154a5fc05f0b1fef";

    String api2 = "d776cb014c9cfa4df83f8468d0db699a";


    //居酒屋グループ
    private static final String IzakayaURL = "https://api.gnavi.co.jp/RestSearchAPI/v3/?keyid=89f7197b2d5b4c16154a5fc05f0b1fef" +
            "&category_l=RSFST09000&hit_per_page=30" +
            "&pref={pref_code}&name={name}";

    public GuruCodeDto IzakayaService(String pref_code, String name){
        return restguruTemplate.getForObject(IzakayaURL, GuruCodeDto.class, pref_code, name);
    }


//    //日本料理・郷土料理グループ
//    private static final String NihonRyouriURL = "https://api.gnavi.co.jp/RestSearchAPI/v3/?keyid=89f7197b2d5b4c16154a5fc05f0b1fef" +
//            "&category_l=RSFST02000&hit_per_page=30" +
//            "&pref={pref_code}&name={name}";
//
//    public GuruCodeDto NihonRyouriService(String pref_code, String name){
//        return restguruTemplate.getForObject(NihonRyouriURL, GuruCodeDto.class, pref_code, name);
//    }
//
//
//    //すし・魚料理・シーフードグループ
//    private static final String SushiSakanaSeafoodURL = "https://api.gnavi.co.jp/RestSearchAPI/v3/?keyid=89f7197b2d5b4c16154a5fc05f0b1fef" +
//            "&category_l=RSFST03000&hit_per_page=30" +
//            "&pref={pref_code}&name={name}";
//
//    public GuruCodeDto SushiService(String pref_code, String name){
//        return restguruTemplate.getForObject(SushiSakanaSeafoodURL, GuruCodeDto.class, pref_code, name);
//    }
//
//    //鍋グループ
//    private static final String NabeURL = "https://api.gnavi.co.jp/RestSearchAPI/v3/?keyid=89f7197b2d5b4c16154a5fc05f0b1fef" +
//            "&category_l=RSFST04000&hit_per_page=30" +
//            "&pref={pref_code}&name={name}";
//
//    public GuruCodeDto NabeService(String pref_code, String name){
//        return restguruTemplate.getForObject(NabeURL, GuruCodeDto.class, pref_code, name);
//    }
//
//    //焼肉・ホルモングループ
//    private static final String YakinikuHorumonURL = "https://api.gnavi.co.jp/RestSearchAPI/v3/?keyid=89f7197b2d5b4c16154a5fc05f0b1fef" +
//            "&category_l=RSFST05000&hit_per_page=30" +
//            "&pref={pref_code}&name={name}";
//
//    public GuruCodeDto YakinikuService(String pref_code, String name){
//        return restguruTemplate.getForObject(YakinikuHorumonURL, GuruCodeDto.class, pref_code, name);
//    }
//
//    //焼き鳥・肉料理・串料理グループ
//    private static final String YakitoriURL = "https://api.gnavi.co.jp/RestSearchAPI/v3/?keyid=89f7197b2d5b4c16154a5fc05f0b1fef" +
//            "&category_l=RSFST06000&hit_per_page=30" +
//            "&pref={pref_code}&name={name}";
//
//    public GuruCodeDto YakitoriService(String pref_code, String name){
//        return restguruTemplate.getForObject(YakitoriURL, GuruCodeDto.class, pref_code, name);
//    }
//
//    //和食グループ
//    private static final String WasyokuURL = "https://api.gnavi.co.jp/RestSearchAPI/v3/?keyid=89f7197b2d5b4c16154a5fc05f0b1fef" +
//            "&category_l=RSFST01000&hit_per_page=30" +
//            "&pref={pref_code}&name={name}";
//
//    public GuruCodeDto WasyokuService(String pref_code, String name){
//        return restguruTemplate.getForObject(WasyokuURL, GuruCodeDto.class, pref_code, name);
//    }
//
//    //お好み焼き・粉物グループ
//    private static final String OkonomiyakiURL = "https://api.gnavi.co.jp/RestSearchAPI/v3/?keyid=89f7197b2d5b4c16154a5fc05f0b1fef" +
//            "&category_l=RSFST07000&hit_per_page=30" +
//            "&pref={pref_code}&name={name}";
//
//    public GuruCodeDto OkonomiyakiService(String pref_code, String name){
//        return restguruTemplate.getForObject(OkonomiyakiURL, GuruCodeDto.class, pref_code, name);
//    }
//
//
//    //ラーメン・麺料理グループ
//    private static final String RamenURL = "https://api.gnavi.co.jp/RestSearchAPI/v3/?keyid=89f7197b2d5b4c16154a5fc05f0b1fef" +
//            "&category_l=RSFST08000&hit_per_page=30" +
//            "&pref={pref_code}&name={name}";
//
//    public GuruCodeDto RamenService(String pref_code, String name){
//        return restguruTemplate.getForObject(RamenURL, GuruCodeDto.class, pref_code, name);
//    }
//
//
//    //中華グループ
//    private static final String TyuukaURL = "https://api.gnavi.co.jp/RestSearchAPI/v3/?keyid=89f7197b2d5b4c16154a5fc05f0b1fef" +
//            "&category_l=RSFST14000&hit_per_page=30" +
//            "&pref={pref_code}&name={name}";
//
//    public GuruCodeDto TyuukaService(String pref_code, String name){
//        return restguruTemplate.getForObject(TyuukaURL, GuruCodeDto.class, pref_code, name);
//    }
//
//    //イタリアン・フレンチグループ
//    private static final String ItarianURL = "https://api.gnavi.co.jp/RestSearchAPI/v3/?keyid=89f7197b2d5b4c16154a5fc05f0b1fef" +
//            "&category_l=RSFST11000&hit_per_page=30" +
//            "&pref={pref_code}&name={name}";
//
//    public GuruCodeDto ItarianService(String pref_code, String name){
//        return restguruTemplate.getForObject(ItarianURL, GuruCodeDto.class, pref_code, name);
//    }
//
//
//    //洋食グループ
//    private static final String YousyokuURL = "https://api.gnavi.co.jp/RestSearchAPI/v3/?keyid=89f7197b2d5b4c16154a5fc05f0b1fef" +
//            "&category_l=RSFST13000&hit_per_page=30" +
//            "&pref={pref_code}&name={name}";
//
//    public GuruCodeDto YousyokuService(String pref_code, String name){
//        return restguruTemplate.getForObject(YousyokuURL, GuruCodeDto.class, pref_code, name);
//    }
//
//    //欧米・各国料理グループ
//    private static final String OubeiURL = "https://api.gnavi.co.jp/RestSearchAPI/v3/?keyid=89f7197b2d5b4c16154a5fc05f0b1fef" +
//            "&category_l=RSFST12000&hit_per_page=30" +
//            "&pref={pref_code}&name={name}";
//
//    public GuruCodeDto OubeiService(String pref_code, String name){
//        return restguruTemplate.getForObject(OubeiURL, GuruCodeDto.class, pref_code, name);
//    }
//
//    //カレーグループ
//    private static final String KareURL = "https://api.gnavi.co.jp/RestSearchAPI/v3/?keyid=89f7197b2d5b4c16154a5fc05f0b1fef" +
//            "&category_l=RSFST16000&hit_per_page=30" +
//            "&pref={pref_code}&name={name}";
//
//    public GuruCodeDto KareService(String pref_code, String name){
//        return restguruTemplate.getForObject(KareURL, GuruCodeDto.class, pref_code, name);
//    }
//
//    //アジア・エスニック料理グループ
//    private static final String AsiaURL = "https://api.gnavi.co.jp/RestSearchAPI/v3/?keyid=89f7197b2d5b4c16154a5fc05f0b1fef" +
//            "&category_l=RSFST15000&hit_per_page=30" +
//            "&pref={pref_code}&name={name}";
//
//    public GuruCodeDto AsiaService(String pref_code, String name){
//        return restguruTemplate.getForObject(AsiaURL, GuruCodeDto.class, pref_code, name);
//    }
//
//
//    //オーガニック・創作料理グループ
//    private static final String OrganicURL = "https://api.gnavi.co.jp/RestSearchAPI/v3/?keyid=89f7197b2d5b4c16154a5fc05f0b1fef" +
//            "&category_l=RSFST17000&hit_per_page=30" +
//            "&pref={pref_code}&name={name}";
//
//
//    public GuruCodeDto OrganicService(String pref_code, String name){
//        return restguruTemplate.getForObject(OrganicURL, GuruCodeDto.class, pref_code, name);
//    }
//
//
//    //ダイニングバー・バー・ビアホールグループ
//    private static final String DiningURL = "https://api.gnavi.co.jp/RestSearchAPI/v3/?keyid=89f7197b2d5b4c16154a5fc05f0b1fef" +
//            "&category_l=RSFST10000&hit_per_page=30" +
//            "&pref={pref_code}&name={name}";
//
//    public GuruCodeDto DiningService(String pref_code, String name){
//        return restguruTemplate.getForObject(DiningURL, GuruCodeDto.class, pref_code, name);
//    }
//
//
//    //お酒グループ
//    private static final String OsakeURL = "https://api.gnavi.co.jp/RestSearchAPI/v3/?keyid=89f7197b2d5b4c16154a5fc05f0b1fef" +
//            "&category_l=RSFST21000&hit_per_page=30" +
//            "&pref={pref_code}&name={name}";
//
//
//    public GuruCodeDto OsakeService(String pref_code, String name){
//        return restguruTemplate.getForObject(OsakeURL, GuruCodeDto.class, pref_code, name);
//    }
//
//
//    //カフェ・スイーツグループ
//    private static final String CafeURL = "https://api.gnavi.co.jp/RestSearchAPI/v3/?keyid=89f7197b2d5b4c16154a5fc05f0b1fef" +
//            "&category_l=RSFST18000&hit_per_page=30" +
//            "&pref={pref_code}&name={name}";
//
//    public GuruCodeDto CafeService(String pref_code, String name){
//        return restguruTemplate.getForObject(CafeURL, GuruCodeDto.class, pref_code, name);
//    }
//
//
//    //宴会・カラオケ・エンターテイメントグループ
//    private static final String EnkaiURL = "https://api.gnavi.co.jp/RestSearchAPI/v3/?keyid=89f7197b2d5b4c16154a5fc05f0b1fef" +
//            "&category_l=RSFST19000&hit_per_page=30" +
//            "&pref={pref_code}&name={name}";
//
//
//    public GuruCodeDto EnkaiService(String pref_code, String name){
//        return restguruTemplate.getForObject(EnkaiURL, GuruCodeDto.class, pref_code, name);
//    }
//
//    //ファミレス・ファーストフードグループ
//    private static final String FamilyURL = "https://api.gnavi.co.jp/RestSearchAPI/v3/?keyid=89f7197b2d5b4c16154a5fc05f0b1fef" +
//            "&category_l=RSFST20000&hit_per_page=30" +
//            "&pref={pref_code}&name={name}";
//
//    public GuruCodeDto FamilyService(String pref_code, String name){
//        return restguruTemplate.getForObject(FamilyURL, GuruCodeDto.class, pref_code, name);
//    }
//
//    //その他の料理グループ
//    private static final String OtherURL = "https://api.gnavi.co.jp/RestSearchAPI/v3/?keyid=89f7197b2d5b4c16154a5fc05f0b1fef" +
//            "&category_l=RSFST90000&hit_per_page=30" +
//            "&pref={pref_code}&name={name}";
//
//    public GuruCodeDto OtherService(String pref_code, String name){
//        return restguruTemplate.getForObject(OtherURL, GuruCodeDto.class, pref_code, name);
//    }


}



