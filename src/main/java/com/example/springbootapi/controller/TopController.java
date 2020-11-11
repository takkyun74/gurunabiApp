package com.example.springbootapi.controller;


import com.example.springbootapi.dto.GuruCodeDto;
import com.example.springbootapi.service.GuruService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;
import java.io.UnsupportedEncodingException;

@Controller
public class TopController {

    @Autowired
    GuruService guruService;

    @RequestMapping("/gurunabi")
    public String gurunabiForm(HttpSession session, Model model){
        return "gurunabi";
    }

    // レストラン検索情報表示
    @PostMapping(value = "/gurunabi/confirm")
    public String gurunabiConfirm(HttpSession session, Model model, @RequestParam("categoryCode") String category_code,
                                  @RequestParam("prefCode") String pref_code, @RequestParam("name") String name ) throws UnsupportedEncodingException {

        GuruCodeDto guruCodeDto = guruService.service(pref_code,category_code,name);
        GuruCodeDto IzakayaCodeDto = guruService.IzakayaService(pref_code,name);
        GuruCodeDto NihonRyouriCodeDto = guruService.NihonRyouriService(pref_code,name);
        GuruCodeDto SushiCodeDto = guruService.SushiService(pref_code,name);
        GuruCodeDto NabeCodeDto = guruService.NabeService(pref_code,name);
        GuruCodeDto YakinikuCodeDto = guruService.YakinikuService(pref_code,name);
        GuruCodeDto YakitoriCodeDto = guruService.YakitoriService(pref_code,name);
        GuruCodeDto WasyokuCodeDto = guruService.WasyokuService(pref_code,name);
        GuruCodeDto OkonomiyakiCodeDto = guruService.OkonomiyakiService(pref_code,name);





//        model.addAttribute("guruCodeList", guruCodeDto.getRest());
//        model.addAttribute("total_offset", guruCodeDto.getTotal_hit_count());
        model.addAttribute("IzakayaCodeList", IzakayaCodeDto.getRest());
        model.addAttribute("NihonRyouriCodeList", NihonRyouriCodeDto.getRest());
        model.addAttribute("SushiCodeList", SushiCodeDto.getRest());
        model.addAttribute("NabeCodeList", NabeCodeDto.getRest());
        model.addAttribute("YakinikuCodeList", YakinikuCodeDto.getRest());
        model.addAttribute("YakitoriCodeList", YakitoriCodeDto.getRest());
        model.addAttribute("OkonomiyakiCodeList", OkonomiyakiCodeDto.getRest());


        return "gurunabi-confirm";
    }


}


