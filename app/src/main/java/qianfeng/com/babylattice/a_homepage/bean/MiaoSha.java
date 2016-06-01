package qianfeng.com.babylattice.a_homepage.bean;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2016/5/27 0027.
 */
public class MiaoSha {

    private String product_id;
    private String product_pic;
    private String activity_price;
    private String ad_words;

    public static MiaoSha objectFromData(String str) {

        return new Gson().fromJson(str, MiaoSha.class);
    }

    public static List<MiaoSha> arrayMiaoShaFromData(String str) {

        Type listType = new TypeToken<ArrayList<MiaoSha>>() {
        }.getType();

        return new Gson().fromJson(str, listType);
    }

    public String getProduct_id() {
        return product_id;
    }

    public void setProduct_id(String product_id) {
        this.product_id = product_id;
    }

    public String getProduct_pic() {
        return product_pic;
    }

    public void setProduct_pic(String product_pic) {
        this.product_pic = product_pic;
    }

    public String getActivity_price() {
        return activity_price;
    }

    public void setActivity_price(String activity_price) {
        this.activity_price = activity_price;
    }

    public String getAd_words() {
        return ad_words;
    }

    public void setAd_words(String ad_words) {
        this.ad_words = ad_words;
    }
}
