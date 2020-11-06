package com.example.springbootapi.dto;

public class PrefCodeDateDto {

    // 都道府県コード
    String pref_code;

    // 都道府県名称
    String pref_name;

    // 所属エリアコード
    String area_code;

    public String getPref_code() {
        return pref_code;
    }

    public void setPref_code(String pref_code) {
        this.pref_code = pref_code;
    }

    public String getPref_name() {
        return pref_name;
    }

    public void setPref_name(String pref_name) {
        this.pref_name = pref_name;
    }

    public String getArea_code() {
        return area_code;
    }

    public void setArea_code(String area_code) {
        this.area_code = area_code;
    }
}
