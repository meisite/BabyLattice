package qianfeng.com.babylattice.a_homepage.bean;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2016/5/31 0031.
 */
public class HomePageProductList {

    private String product_id;
    private String market_price;
    private String store_price;
    private String name;
    private String is_oversea;
    private String image_url_400;
    private String image_url_250;
    private String image_url_100;
    private String image_url_50;
    private String image_url;
    private String currency_market_price;
    private String currency_symbol;
    private SellcountryInfoBean sellcountry_info;
    private String refer_icon;
    private String refer_text;
    private String refer_text_url;
    private String activity_icon;
    private int is_nostock;
    private int is_new;
    private String is_new_icon;
    private String activity_price;

    public static HomePageProductList objectFromData(String str) {

        return new Gson().fromJson(str, HomePageProductList.class);
    }

    public static List<HomePageProductList> arrayHomePageProductListFromData(String str) {

        Type listType = new TypeToken<ArrayList<HomePageProductList>>() {
        }.getType();

        return new Gson().fromJson(str, listType);
    }

    public String getProduct_id() {
        return product_id;
    }

    public void setProduct_id(String product_id) {
        this.product_id = product_id;
    }

    public String getMarket_price() {
        return market_price;
    }

    public void setMarket_price(String market_price) {
        this.market_price = market_price;
    }

    public String getStore_price() {
        return store_price;
    }

    public void setStore_price(String store_price) {
        this.store_price = store_price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIs_oversea() {
        return is_oversea;
    }

    public void setIs_oversea(String is_oversea) {
        this.is_oversea = is_oversea;
    }

    public String getImage_url_400() {
        return image_url_400;
    }

    public void setImage_url_400(String image_url_400) {
        this.image_url_400 = image_url_400;
    }

    public String getImage_url_250() {
        return image_url_250;
    }

    public void setImage_url_250(String image_url_250) {
        this.image_url_250 = image_url_250;
    }

    public String getImage_url_100() {
        return image_url_100;
    }

    public void setImage_url_100(String image_url_100) {
        this.image_url_100 = image_url_100;
    }

    public String getImage_url_50() {
        return image_url_50;
    }

    public void setImage_url_50(String image_url_50) {
        this.image_url_50 = image_url_50;
    }

    public String getImage_url() {
        return image_url;
    }

    public void setImage_url(String image_url) {
        this.image_url = image_url;
    }

    public String getCurrency_market_price() {
        return currency_market_price;
    }

    public void setCurrency_market_price(String currency_market_price) {
        this.currency_market_price = currency_market_price;
    }

    public String getCurrency_symbol() {
        return currency_symbol;
    }

    public void setCurrency_symbol(String currency_symbol) {
        this.currency_symbol = currency_symbol;
    }

    public SellcountryInfoBean getSellcountry_info() {
        return sellcountry_info;
    }

    public void setSellcountry_info(SellcountryInfoBean sellcountry_info) {
        this.sellcountry_info = sellcountry_info;
    }

    public String getRefer_icon() {
        return refer_icon;
    }

    public void setRefer_icon(String refer_icon) {
        this.refer_icon = refer_icon;
    }

    public String getRefer_text() {
        return refer_text;
    }

    public void setRefer_text(String refer_text) {
        this.refer_text = refer_text;
    }

    public String getRefer_text_url() {
        return refer_text_url;
    }

    public void setRefer_text_url(String refer_text_url) {
        this.refer_text_url = refer_text_url;
    }

    public String getActivity_icon() {
        return activity_icon;
    }

    public void setActivity_icon(String activity_icon) {
        this.activity_icon = activity_icon;
    }

    public int getIs_nostock() {
        return is_nostock;
    }

    public void setIs_nostock(int is_nostock) {
        this.is_nostock = is_nostock;
    }

    public int getIs_new() {
        return is_new;
    }

    public void setIs_new(int is_new) {
        this.is_new = is_new;
    }

    public String getIs_new_icon() {
        return is_new_icon;
    }

    public void setIs_new_icon(String is_new_icon) {
        this.is_new_icon = is_new_icon;
    }

    public String getActivity_price() {
        return activity_price;
    }

    public void setActivity_price(String activity_price) {
        this.activity_price = activity_price;
    }

    public static class SellcountryInfoBean {
        private String id;
        private String name;
        private String sell_image;
        private String is_sell;
        private String sort;
        private String en_name;
        private String storehouse_sn;
        private String storehouse_name;
        private String create_time;
        private String create_user;
        private String update_time;
        private String update_user;
        private String country_id;
        private String country_name;
        private String group_name;
        private String type;
        private String image_url;
        private String mobi_image_url;

        public static SellcountryInfoBean objectFromData(String str) {

            return new Gson().fromJson(str, SellcountryInfoBean.class);
        }

        public static List<SellcountryInfoBean> arraySellcountryInfoBeanFromData(String str) {

            Type listType = new TypeToken<ArrayList<SellcountryInfoBean>>() {
            }.getType();

            return new Gson().fromJson(str, listType);
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getSell_image() {
            return sell_image;
        }

        public void setSell_image(String sell_image) {
            this.sell_image = sell_image;
        }

        public String getIs_sell() {
            return is_sell;
        }

        public void setIs_sell(String is_sell) {
            this.is_sell = is_sell;
        }

        public String getSort() {
            return sort;
        }

        public void setSort(String sort) {
            this.sort = sort;
        }

        public String getEn_name() {
            return en_name;
        }

        public void setEn_name(String en_name) {
            this.en_name = en_name;
        }

        public String getStorehouse_sn() {
            return storehouse_sn;
        }

        public void setStorehouse_sn(String storehouse_sn) {
            this.storehouse_sn = storehouse_sn;
        }

        public String getStorehouse_name() {
            return storehouse_name;
        }

        public void setStorehouse_name(String storehouse_name) {
            this.storehouse_name = storehouse_name;
        }

        public String getCreate_time() {
            return create_time;
        }

        public void setCreate_time(String create_time) {
            this.create_time = create_time;
        }

        public String getCreate_user() {
            return create_user;
        }

        public void setCreate_user(String create_user) {
            this.create_user = create_user;
        }

        public String getUpdate_time() {
            return update_time;
        }

        public void setUpdate_time(String update_time) {
            this.update_time = update_time;
        }

        public String getUpdate_user() {
            return update_user;
        }

        public void setUpdate_user(String update_user) {
            this.update_user = update_user;
        }

        public String getCountry_id() {
            return country_id;
        }

        public void setCountry_id(String country_id) {
            this.country_id = country_id;
        }

        public String getCountry_name() {
            return country_name;
        }

        public void setCountry_name(String country_name) {
            this.country_name = country_name;
        }

        public String getGroup_name() {
            return group_name;
        }

        public void setGroup_name(String group_name) {
            this.group_name = group_name;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public String getImage_url() {
            return image_url;
        }

        public void setImage_url(String image_url) {
            this.image_url = image_url;
        }

        public String getMobi_image_url() {
            return mobi_image_url;
        }

        public void setMobi_image_url(String mobi_image_url) {
            this.mobi_image_url = mobi_image_url;
        }
    }
}
