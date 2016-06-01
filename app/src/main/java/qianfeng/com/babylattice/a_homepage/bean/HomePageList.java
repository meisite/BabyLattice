package qianfeng.com.babylattice.a_homepage.bean;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2016/5/31 0031.
 */
public class HomePageList {

    private String ad_id;
    private String ad_name;
    private String ad_link;
    private String ad_type;
    private String ad_area;
    private String ad_etime;
    private String ad_introduction;
    private int activity_id;
    private String product_id;
    private String event_id;
    private String h5_link_ios;
    private String h5_link_android;
    private String h5_name;
    private String ad_pic_400;
    private String ad_pic_250;
    private String ad_pic_100;
    private String ad_pic;
    private String search_keyword;
    private String category_id;
    private String category_name;
    private String brand_id;
    private String brand_name;
    private String event_type;
    private int left_time;
    private String pic;
    private String country_id;
    private int country_type;
    private String country_name;
    private String country_pic;
    private String country_pic_l;
    private String nav_name;
    private int rank;
    private String nav_link;
    private String id;
    private String name;
    private List<HomePageProductList> product_list;

    public static HomePageList objectFromData(String str) {

        return new Gson().fromJson(str, HomePageList.class);
    }

    public static List<HomePageList> arrayHomePageListFromData(String str) {

        Type listType = new TypeToken<ArrayList<HomePageList>>() {
        }.getType();

        return new Gson().fromJson(str, listType);
    }

    public String getAd_id() {
        return ad_id;
    }

    public void setAd_id(String ad_id) {
        this.ad_id = ad_id;
    }

    public String getAd_name() {
        return ad_name;
    }

    public void setAd_name(String ad_name) {
        this.ad_name = ad_name;
    }

    public String getAd_link() {
        return ad_link;
    }

    public void setAd_link(String ad_link) {
        this.ad_link = ad_link;
    }

    public String getAd_type() {
        return ad_type;
    }

    public void setAd_type(String ad_type) {
        this.ad_type = ad_type;
    }

    public String getAd_area() {
        return ad_area;
    }

    public void setAd_area(String ad_area) {
        this.ad_area = ad_area;
    }

    public String getAd_etime() {
        return ad_etime;
    }

    public void setAd_etime(String ad_etime) {
        this.ad_etime = ad_etime;
    }

    public String getAd_introduction() {
        return ad_introduction;
    }

    public void setAd_introduction(String ad_introduction) {
        this.ad_introduction = ad_introduction;
    }

    public int getActivity_id() {
        return activity_id;
    }

    public void setActivity_id(int activity_id) {
        this.activity_id = activity_id;
    }

    public String getProduct_id() {
        return product_id;
    }

    public void setProduct_id(String product_id) {
        this.product_id = product_id;
    }

    public String getEvent_id() {
        return event_id;
    }

    public void setEvent_id(String event_id) {
        this.event_id = event_id;
    }

    public String getH5_link_ios() {
        return h5_link_ios;
    }

    public void setH5_link_ios(String h5_link_ios) {
        this.h5_link_ios = h5_link_ios;
    }

    public String getH5_link_android() {
        return h5_link_android;
    }

    public void setH5_link_android(String h5_link_android) {
        this.h5_link_android = h5_link_android;
    }

    public String getH5_name() {
        return h5_name;
    }

    public void setH5_name(String h5_name) {
        this.h5_name = h5_name;
    }

    public String getAd_pic_400() {
        return ad_pic_400;
    }

    public void setAd_pic_400(String ad_pic_400) {
        this.ad_pic_400 = ad_pic_400;
    }

    public String getAd_pic_250() {
        return ad_pic_250;
    }

    public void setAd_pic_250(String ad_pic_250) {
        this.ad_pic_250 = ad_pic_250;
    }

    public String getAd_pic_100() {
        return ad_pic_100;
    }

    public void setAd_pic_100(String ad_pic_100) {
        this.ad_pic_100 = ad_pic_100;
    }

    public String getAd_pic() {
        return ad_pic;
    }

    public void setAd_pic(String ad_pic) {
        this.ad_pic = ad_pic;
    }

    public String getSearch_keyword() {
        return search_keyword;
    }

    public void setSearch_keyword(String search_keyword) {
        this.search_keyword = search_keyword;
    }

    public String getCategory_id() {
        return category_id;
    }

    public void setCategory_id(String category_id) {
        this.category_id = category_id;
    }

    public String getCategory_name() {
        return category_name;
    }

    public void setCategory_name(String category_name) {
        this.category_name = category_name;
    }

    public String getBrand_id() {
        return brand_id;
    }

    public void setBrand_id(String brand_id) {
        this.brand_id = brand_id;
    }

    public String getBrand_name() {
        return brand_name;
    }

    public void setBrand_name(String brand_name) {
        this.brand_name = brand_name;
    }

    public String getEvent_type() {
        return event_type;
    }

    public void setEvent_type(String event_type) {
        this.event_type = event_type;
    }

    public int getLeft_time() {
        return left_time;
    }

    public void setLeft_time(int left_time) {
        this.left_time = left_time;
    }

    public String getPic() {
        return pic;
    }

    public void setPic(String pic) {
        this.pic = pic;
    }


    public String getCountry_id() {
        return country_id;
    }

    public void setCountry_id(String country_id) {
        this.country_id = country_id;
    }

    public int getCountry_type() {
        return country_type;
    }

    public void setCountry_type(int country_type) {
        this.country_type = country_type;
    }

    public String getCountry_name() {
        return country_name;
    }

    public void setCountry_name(String country_name) {
        this.country_name = country_name;
    }

    public String getCountry_pic() {
        return country_pic;
    }

    public void setCountry_pic(String country_pic) {
        this.country_pic = country_pic;
    }

    public String getCountry_pic_l() {
        return country_pic_l;
    }

    public void setCountry_pic_l(String country_pic_l) {
        this.country_pic_l = country_pic_l;
    }

    public String getNav_name() {
        return nav_name;
    }

    public void setNav_name(String nav_name) {
        this.nav_name = nav_name;
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    public String getNav_link() {
        return nav_link;
    }

    public void setNav_link(String nav_link) {
        this.nav_link = nav_link;
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

    public List<HomePageProductList> getProduct_list() {
        return product_list;
    }

    public void setProduct_list(List<HomePageProductList> product_list) {
        this.product_list = product_list;
    }

}
