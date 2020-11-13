package com.example.springbootapi.controller;


import com.example.springbootapi.dto.GuruCodeDto;
import com.example.springbootapi.dto.PrefCodeDto;
import com.example.springbootapi.service.GuruService;
import com.example.springbootapi.service.PrefService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;

@Controller
public class TopController {

    @Autowired
    GuruService guruService;

    @Autowired
    PrefService prefService;
    // 都道府県情報表示
    @GetMapping(value = "/")
    public String prefConfirm(HttpSession session, Model model) {
        // ぐるなび都道府県APIサービス呼び出し
        PrefCodeDto prefDto = prefService.prefService();

//        System.out.println(prefDto.getPref());
        // thymeleafでリストを展開して表示する
        model.addAttribute("prefList", prefDto.getPref());

//        // 大業態情報マスタAPIサービス呼び出し
//        CategoryCodeDto categoryDto = categoryLargeService.categoryService();
//
//        // thymeleafでリストを展開して表示する
//        model.addAttribute("categoryList", categoryDto.getCategory_l());

        return "gurunabi-confirm";
    }

    // レストラン検索情報表示
    @PostMapping(value = "/")
    public String gurunabiConfirm(HttpSession session, Model model, @RequestParam("prefCode") String pref_code,
                                   @RequestParam("name") String name ) {
//    public String gurunabiConfirm(HttpSession session, Model model, @RequestParam("categoryCode") String category_code,
//                                  @RequestParam("prefCode") String pref_code, @RequestParam("name") String name ) throws UnsupportedEncodingException {


        PrefCodeDto prefDto = prefService.prefService();
        model.addAttribute("prefList", prefDto.getPref());

//        GuruCodeDto guruCodeDto = guruService.service(pref_code,name);

        //居酒屋グループ
        GuruCodeDto IzakayaCodeDto = guruService.IzakayaService(pref_code,name);
        //日本料理・郷土料理グループ
        GuruCodeDto NihonRyouriCodeDto = guruService.NihonRyouriService(pref_code,name);
        //すし・魚料理・シーフードグループ
        GuruCodeDto SushiCodeDto = guruService.SushiService(pref_code,name);
        //鍋グループ
        GuruCodeDto NabeCodeDto = guruService.NabeService(pref_code,name);
        //焼肉・ホルモングループ
        GuruCodeDto YakinikuCodeDto = guruService.YakinikuService(pref_code,name);
        //焼き鳥・肉料理・串料理グループ
        GuruCodeDto YakitoriCodeDto = guruService.YakitoriService(pref_code,name);
        //和食グループ
        GuruCodeDto WasyokuCodeDto = guruService.WasyokuService(pref_code,name);
        //お好み焼き・粉物グループ
        GuruCodeDto OkonomiyakiCodeDto = guruService.OkonomiyakiService(pref_code,name);
        //ラーメン・麺料理グループ
        GuruCodeDto RamenCodeDto = guruService.RamenService(pref_code,name);
        //中華グループ
        GuruCodeDto TyuukaCodeDto = guruService.TyuukaService(pref_code,name);
        //イタリアン・フレンチグループ
        GuruCodeDto ItarianCodeDto = guruService.ItarianService(pref_code,name);
        //洋食グループ
        GuruCodeDto YousyokuCodeDto = guruService.YousyokuService(pref_code,name);
        //欧米・各国料理グループ
        GuruCodeDto OubeiCodeDto = guruService.OubeiService(pref_code,name);
        //カレーグループ
        GuruCodeDto KareCodeDto = guruService.KareService(pref_code,name);
        //アジア・エスニック料理グループ
        GuruCodeDto AsiaCodeDto = guruService.AsiaService(pref_code,name);
        //オーガニック・創作料理グループ
        GuruCodeDto OrganicCodeDto = guruService.OrganicService(pref_code,name);
        //ダイニングバー・バー・ビアホールグループ
        GuruCodeDto DiningCodeDto = guruService.DiningService(pref_code,name);
        //お酒グループ
        GuruCodeDto OsakeCodeDto = guruService.OsakeService(pref_code,name);
        //カフェ・スイーツグループ
        GuruCodeDto CafeCodeDto = guruService.CafeService(pref_code,name);
        //宴会・カラオケ・エンターテイメントグループ
        GuruCodeDto EnkaiCodeDto = guruService.EnkaiService(pref_code,name);
        //ファミレス・ファーストフードグループ
        GuruCodeDto FamilyCodeDto = guruService.FamilyService(pref_code,name);
        //その他の料理グループ
        GuruCodeDto OtherCodeDto = guruService.OtherService(pref_code,name);





//        model.addAttribute("guruCodeList", guruCodeDto.getRest());
//        model.addAttribute("total_offset", guruCodeDto.getTotal_hit_count());
//        model.addAttribute("page_offset", IzakayaCodeDto.getPage_offset());


        //居酒屋グループ
        model.addAttribute("IzakayaCodeList", IzakayaCodeDto.getRest());
        //日本料理・郷土料理グループ
        model.addAttribute("NihonRyouriCodeList", NihonRyouriCodeDto.getRest());
        //すし・魚料理・シーフードグループ
        model.addAttribute("SushiCodeList", SushiCodeDto.getRest());
        //鍋グループ
        model.addAttribute("NabeCodeList", NabeCodeDto.getRest());
        //焼肉・ホルモングループ
        model.addAttribute("YakinikuCodeList", YakinikuCodeDto.getRest());
        //焼き鳥・肉料理・串料理グループ
        model.addAttribute("YakitoriCodeList", YakitoriCodeDto.getRest());
        //和食グループ
        model.addAttribute("WasyokuCodeList", WasyokuCodeDto.getRest());
        //お好み焼き・粉物グループ
        model.addAttribute("OkonomiyakiCodeList", OkonomiyakiCodeDto.getRest());
        //ラーメン・麺料理グループ
        model.addAttribute("RamenCodeList", RamenCodeDto.getRest());
        //中華グループ
        model.addAttribute("TyuukaCodeList", TyuukaCodeDto.getRest());
        //イタリアン・フレンチグループ
        model.addAttribute("ItarianCodeList", ItarianCodeDto.getRest());
        //洋食グループ
        model.addAttribute("YousyokuCodeList", YousyokuCodeDto.getRest());
        //欧米・各国料理グループ
        model.addAttribute("OubeiCodeList", OubeiCodeDto.getRest());
        //カレーグループ
        model.addAttribute("KareCodeList", KareCodeDto.getRest());
        //アジア・エスニック料理グループ
        model.addAttribute("AsiaCodeList", AsiaCodeDto.getRest());
        //オーガニック・創作料理グループ
        model.addAttribute("OrganicCodeList", OrganicCodeDto.getRest());
        //ダイニングバー・バー・ビアホールグループ
        model.addAttribute("DiningCodeList", DiningCodeDto.getRest());
        //お酒グループ
        model.addAttribute("OsakeCodeList", OsakeCodeDto.getRest());
        //カフェ・スイーツグループ
        model.addAttribute("CafeCodeList", CafeCodeDto.getRest());
        //宴会・カラオケ・エンターテイメントグループ
        model.addAttribute("EnkaiCodeList", EnkaiCodeDto.getRest());
        //ファミレス・ファーストフードグループ
        model.addAttribute("FamilyCodeList", FamilyCodeDto.getRest());
        //その他の料理グループ
        model.addAttribute("OtherCodeList", OtherCodeDto.getRest());


        return "gurunabi-confirm";
    }


}


