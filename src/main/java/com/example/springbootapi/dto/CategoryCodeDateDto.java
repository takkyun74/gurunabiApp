package com.example.springbootapi.dto;

public class CategoryCodeDateDto {

    // 大業態コード
    String category_l_code;

    //大業態名称
    String category_l_name;

    public String getCategory_l_code() {
        return category_l_code;
    }

    public void setCategory_l_code(String category_l_code) {
        this.category_l_code = category_l_code;
    }

    public String getCategory_l_name() {
        return category_l_name;
    }

    public void setCategory_l_name(String category_l_name) {
        this.category_l_name = category_l_name;
    }
}
