package com.example.springbootapi.dto;

import java.util.ArrayList;
import java.util.List;

public class PrefCodeDto {

    // エラー
    List<ErrorCodeDateDto> error = new ArrayList<>();

    /** 都道府県リスト */
    List<PrefCodeDateDto> pref = new ArrayList<>();


    public List<ErrorCodeDateDto> getError() {
        return error;
    }

    public void setError(List<ErrorCodeDateDto> error) {
        this.error = error;
    }

    public List<PrefCodeDateDto> getPref() {
        return pref;
    }

    public void setPref(List<PrefCodeDateDto> pref) {
        this.pref = pref;
    }
}