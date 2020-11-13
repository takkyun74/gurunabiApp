//package com.example.springbootapi.controller;
//
//import com.example.springbootapi.dto.PrefCodeDto;
//import com.example.springbootapi.service.CategoryLargeService;
//import com.example.springbootapi.service.PrefService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.GetMapping;
//
//import javax.servlet.http.HttpSession;
//
//
//@Controller
//public class SerchApiController {
//
//
//    @Autowired
//    PrefService prefService;
//
//    @Autowired
//    CategoryLargeService categoryLargeService;
//
//    // 都道府県情報表示
//    @GetMapping(value = "/")
//    public String prefConfirm(HttpSession session, Model model) {
//        // ぐるなび都道府県APIサービス呼び出し
//        PrefCodeDto prefDto = prefService.prefService();
//
////        System.out.println(prefDto.getPref());
//        // thymeleafでリストを展開して表示する
//        model.addAttribute("prefList", prefDto.getPref());
//
////        // 大業態情報マスタAPIサービス呼び出し
////        CategoryCodeDto categoryDto = categoryLargeService.categoryService();
////
////        // thymeleafでリストを展開して表示する
////        model.addAttribute("categoryList", categoryDto.getCategory_l());
//
//        return "gurunabi-confirm";
//    }
//
//
////    @Autowired
////    CategoryLargeService categoryLargeService;
////
////    // 大業態情報取得
////    @RequestMapping(value = "/gurunabi", method = RequestMethod.GET)
////    public String categoryConfirm(HttpSession session, Model model) {
////        // 大業態情報マスタAPIサービス呼び出し
////        CategoryCodeDto categoryDto = categoryLargeService.categoryLargeService();
////
////        // thymeleafでリストを展開して表示する
////        model.addAttribute("categoryList", categoryDto.getCategory_l());
////
////        return "gurunabi";
////    }
//
//    // 都道府県情報表示
//    @GetMapping(value = "/gurunabi-confirm")
//    public String pref2Confirm(HttpSession session, Model model) {
//        // ぐるなび都道府県APIサービス呼び出し
//        PrefCodeDto prefDto = prefService.prefService();
//
////        System.out.println(prefDto.getPref());
//        // thymeleafでリストを展開して表示する
//        model.addAttribute("prefList", prefDto.getPref());
//
////        // 大業態情報マスタAPIサービス呼び出し
////        CategoryCodeDto categoryDto = categoryLargeService.categoryService();
////
////        // thymeleafでリストを展開して表示する
////        model.addAttribute("categoryList", categoryDto.getCategory_l());
//
//        return "gurunabi-confirm";
//    }
//
//
//}
