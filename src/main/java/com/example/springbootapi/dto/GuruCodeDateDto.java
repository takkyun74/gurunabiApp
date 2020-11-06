package com.example.springbootapi.dto;


import java.util.Date;
import java.util.HashMap;
import java.util.Map;


public class GuruCodeDateDto {


    //店舗ID
    String id;

    //情報更新日時
    Date update_date;

    //店舗名称
    String name;

    //店舗名称(カタカナ)
    String name_kana;

    //緯度
    Number latitude;

    //経度
    Number longitude;

    //フリーワードカテゴリー
    String category;

    //PCサイトURL
    String url;

    //携帯サイトURL
    String url_mobile;

    //クーポンURL
    Map<String, Object> coupon_url= new HashMap<>();

    public Map<String, Object> getCoupon_url() {
        return coupon_url;
    }

    public void setCoupon_url(Map<String, Object> coupon_url) {
        this.coupon_url = coupon_url;
    }

    public static  class coupon_url {
        //PC用URL
        String pc;

        //携帯用URL
        String mobile;

        public String getPc() {
            return pc;
        }

        public void setPc(String pc) {
            this.pc = pc;
        }

        public String getMobile() {
            return mobile;
        }

        public void setMobile(String mobile) {
            this.mobile = mobile;
        }
    }

    //店舗画像
    Map<String, Object> image_url= new HashMap<>();

    public Map<String, Object> getImage_url() {
        return image_url;
    }

    public void setImage_url(Map<String, Object> image_url) {
        this.image_url = image_url;
    }

    public static  class image_url {
        //店舗画像1のURL
        String shop_image1;

        //店舗画像2のURL
        String shop_image2;

        //QRコード画像のURL
        String qrcode;

        public String getShop_image1() {
            return shop_image1;
        }

        public void setShop_image1(String shop_image1) {
            this.shop_image1 = shop_image1;
        }

        public String getShop_image2() {
            return shop_image2;
        }

        public void setShop_image2(String shop_image2) {
            this.shop_image2 = shop_image2;
        }

        public String getQrcode() {
            return qrcode;
        }

        public void setQrcode(String qrcode) {
            this.qrcode = qrcode;
        }
    }



    //住所
    String address;

    //電話番号
    String tel;

    //電話番号(サブ)
    String tel_sub;

    //FAX番号
    String fax;

    //営業時間
    String opentime;

    //休業日
    String holiday;

    //アクセス
    Map<String, Object> access= new HashMap<>();

    public Map<String, Object> getAccess() {
        return access;
    }

    public void setAccess(Map<String, Object> access) {
        this.access = access;
    }

    public static class access {
        //路線名
        String line;

        //駅名
        String station;

        //駅出口
        String station_exit;

        //徒歩（分）
        Integer walk;

        //備考
        String note;

        public String getLine() {
            return line;
        }

        public void setLine(String line) {
            this.line = line;
        }

        public String getStation() {
            return station;
        }

        public void setStation(String station) {
            this.station = station;
        }

        public String getStation_exit() {
            return station_exit;
        }

        public void setStation_exit(String station_exit) {
            this.station_exit = station_exit;
        }

        public Integer getWalk() {
            return walk;
        }

        public void setWalk(Integer walk) {
            this.walk = walk;
        }

        public String getNote() {
            return note;
        }

        public void setNote(String note) {
            this.note = note;
        }
    }

    //駐車場台数
    Integer parking_lots;

    //PR文
    Map <String, Object> pr = new HashMap<>();

    public Map<String, Object> getPr() {
        return pr;
    }

    public void setPr(Map<String, Object> pr) {
        this.pr = pr;
    }

    public class pr {
        //PR文(短い)
        String pr_short;

        //PR文（長い）
        String pr_long;

        public String getPr_short() {
            return pr_short;
        }

        public void setPr_short(String pr_short) {
            this.pr_short = pr_short;
        }

        public String getPr_long() {
            return pr_long;
        }

        public void setPr_long(String pr_long) {
            this.pr_long = pr_long;
        }
    }

    //コード類
    Map<String, Object> code = new HashMap<>();

    public Map<String, Object> getCode() {
        return code;
    }

    public void setCode(Map<String, Object> code) {
        this.code = code;
    }

    public class code {
        //地方コード
        String areacode;

        //地方名称
        String areaname;

        //都道府県コード
        String prefcode;

        //都道府県名称
        String prefname;

        //エリアSコード
        String areacode_s;

        //エリアS名
        String areaname_s;

        //大業態コード
        String category_code_l;

        //大業態名称
        String category_name_l;

        //小業態コード
        String category_code_s;

        //小業態名称
        String category_name_s;

        public String getAreacode() {
            return areacode;
        }

        public void setAreacode(String areacode) {
            this.areacode = areacode;
        }

        public String getAreaname() {
            return areaname;
        }

        public void setAreaname(String areaname) {
            this.areaname = areaname;
        }

        public String getPrefcode() {
            return prefcode;
        }

        public void setPrefcode(String prefcode) {
            this.prefcode = prefcode;
        }

        public String getPrefname() {
            return prefname;
        }

        public void setPrefname(String prefname) {
            this.prefname = prefname;
        }

        public String getAreacode_s() {
            return areacode_s;
        }

        public void setAreacode_s(String areacode_s) {
            this.areacode_s = areacode_s;
        }

        public String getAreaname_s() {
            return areaname_s;
        }

        public void setAreaname_s(String areaname_s) {
            this.areaname_s = areaname_s;
        }

        public String getCategory_code_l() {
            return category_code_l;
        }

        public void setCategory_code_l(String category_code_l) {
            this.category_code_l = category_code_l;
        }

        public String getCategory_name_l() {
            return category_name_l;
        }

        public void setCategory_name_l(String category_name_l) {
            this.category_name_l = category_name_l;
        }

        public String getCategory_code_s() {
            return category_code_s;
        }

        public void setCategory_code_s(String category_code_s) {
            this.category_code_s = category_code_s;
        }

        public String getCategory_name_s() {
            return category_name_s;
        }

        public void setCategory_name_s(String category_name_s) {
            this.category_name_s = category_name_s;
        }
    }


    //平均予算
    Integer budget;

    //宴会・パーティ平均予算
    Integer party;

    //ランチタイム平均予算
    Integer lunch;

    //クレジットカード名称
    String credit_card;

    //電子マネー名称
    String e_money;


    //フラグ類
    Map<String, Object> flags = new HashMap<>();

    public Map<String, Object> getFlags() {
        return flags;
    }

    public void setFlags(Map<String, Object> flags) {
        this.flags = flags;
    }

    public class flags {
        //モバイルサイトありフラグ
        Integer mobile_site;

        //モバイルクーポンありフラグ
        Integer mobile_coupon;

        //PCクーポンありフラグ
        Integer pc_coupon;

        public Integer getMobile_site() {
            return mobile_site;
        }

        public void setMobile_site(Integer mobile_site) {
            this.mobile_site = mobile_site;
        }

        public Integer getMobile_coupon() {
            return mobile_coupon;
        }

        public void setMobile_coupon(Integer mobile_coupon) {
            this.mobile_coupon = mobile_coupon;
        }

        public Integer getPc_coupon() {
            return pc_coupon;
        }

        public void setPc_coupon(Integer pc_coupon) {
            this.pc_coupon = pc_coupon;
        }
    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Date getUpdate_date() {
        return update_date;
    }

    public void setUpdate_date(Date update_date) {
        this.update_date = update_date;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName_kana() {
        return name_kana;
    }

    public void setName_kana(String name_kana) {
        this.name_kana = name_kana;
    }

    public Number getLatitude() {
        return latitude;
    }

    public void setLatitude(Number latitude) {
        this.latitude = latitude;
    }

    public Number getLongitude() {
        return longitude;
    }

    public void setLongitude(Number longitude) {
        this.longitude = longitude;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUrl_mobile() {
        return url_mobile;
    }

    public void setUrl_mobile(String url_mobile) {
        this.url_mobile = url_mobile;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getTel_sub() {
        return tel_sub;
    }

    public void setTel_sub(String tel_sub) {
        this.tel_sub = tel_sub;
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    public String getOpentime() {
        return opentime;
    }

    public void setOpentime(String opentime) {
        this.opentime = opentime;
    }

    public String getHoliday() {
        return holiday;
    }

    public void setHoliday(String holiday) {
        this.holiday = holiday;
    }


    public Integer getParking_lots() {
        return parking_lots;
    }

    public void setParking_lots(Integer parking_lots) {
        this.parking_lots = parking_lots;
    }


    public Integer getBudget() {
        return budget;
    }

    public void setBudget(Integer budget) {
        this.budget = budget;
    }

    public Integer getParty() {
        return party;
    }

    public void setParty(Integer party) {
        this.party = party;
    }

    public Integer getLunch() {
        return lunch;
    }

    public void setLunch(Integer lunch) {
        this.lunch = lunch;
    }

    public String getCredit_card() {
        return credit_card;
    }

    public void setCredit_card(String credit_card) {
        this.credit_card = credit_card;
    }

    public String getE_money() {
        return e_money;
    }

    public void setE_money(String e_money) {
        this.e_money = e_money;
    }


}


