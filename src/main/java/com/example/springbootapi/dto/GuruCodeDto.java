package com.example.springbootapi.dto;

import java.util.ArrayList;
import java.util.List;

public class GuruCodeDto  {

    // エラー
    List<ErrorCodeDateDto> error = new ArrayList<>();

    //該当件数
    Integer total_hit_count;

    //表示件数
    Integer hit_per_page;

    //表示ページ
    Integer page_offset;

    /** レストランリスト */
    List<GuruCodeDateDto> rest = new ArrayList<>();

    public List<ErrorCodeDateDto> getError() {
        return error;
    }

    public void setError(List<ErrorCodeDateDto> error) {
        this.error = error;
    }

    public Integer getTotal_hit_count() {
        return total_hit_count;
    }

    public void setTotal_hit_count(Integer total_hit_count) {
        this.total_hit_count = total_hit_count;
    }

    public Integer getHit_per_page() {
        return hit_per_page;
    }

    public void setHit_per_page(Integer hit_per_page) {
        this.hit_per_page = hit_per_page;
    }

    public Integer getPage_offset() {
        return page_offset;
    }

    public void setPage_offset(Integer page_offset) {
        this.page_offset = page_offset;
    }

    public List<GuruCodeDateDto> getRest() {
        return rest;
    }

    public void setRest(List<GuruCodeDateDto> rest) {
        this.rest = rest;
    }
}

