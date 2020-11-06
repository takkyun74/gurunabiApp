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
                                  @RequestParam("prefCode") String pref_code  )  {
//        System.out.println(name);
//        System.out.println(pref_code);
//        String encoding = "UTF-8";
//        String encodedString = URLEncoder.encode(name,encoding);

        GuruCodeDto guruCodeDto = guruService.service(pref_code,category_code);

        model.addAttribute("guruCodeList", guruCodeDto.getRest());
        model.addAttribute("total_offset", guruCodeDto.getTotal_hit_count());

        return "gurunabi-confirm";
    }


}


