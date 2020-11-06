package com.example.springbootapi.dto;

import java.util.ArrayList;
import java.util.List;

public class CategoryCodeDto {

    // エラー
    List<ErrorCodeDateDto> error = new ArrayList<>();

    /** 大業態情報 */
    List<CategoryCodeDateDto> category_l = new ArrayList<>();

    public List<ErrorCodeDateDto> getError() {
        return error;
    }

    public void setError(List<ErrorCodeDateDto> error) {
        this.error = error;
    }

    public List<CategoryCodeDateDto> getCategory_l() {
        return category_l;
    }

    public void setCategory_l(List<CategoryCodeDateDto> category_l) {
        this.category_l = category_l;
    }
}