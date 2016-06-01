package qianfeng.com.babylattice.b_specialoffer.bean;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2016/5/31 0031.
 */
public class SpecialOffer {

    private String id;
    private String event_name;
    private String page_position;
    private String asort;
    private String activity_id;
    private String begin_time;
    private String end_time;
    private String brand_id;
    private Object brand_url;
    private String event_status;
    private String create_user;
    private String create_time;
    private String check_user;
    private String check_time;
    private String brief;
    private String instruction;
    private String first_pic;
    private String sec_pic;
    private String is_relation;
    private String product_id;
    private String event_id;
    private String advert_id;
    private String ad_name;
    private String is_newActivity;
    private String app_version_isNew;
    private Object share_topic;
    private int end_left_time;
    private String sec_pic_src;
    private String first_pic_src;
    private boolean user_booking;
    private String activity_range_name;

    public static SpecialOffer objectFromData(String str) {

        return new Gson().fromJson(str, SpecialOffer.class);
    }

    public static List<SpecialOffer> arraySpecialOfferFromData(String str) {

        Type listType = new TypeToken<ArrayList<SpecialOffer>>() {
        }.getType();

        return new Gson().fromJson(str, listType);
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getEvent_name() {
        return event_name;
    }

    public void setEvent_name(String event_name) {
        this.event_name = event_name;
    }

    public String getPage_position() {
        return page_position;
    }

    public void setPage_position(String page_position) {
        this.page_position = page_position;
    }

    public String getAsort() {
        return asort;
    }

    public void setAsort(String asort) {
        this.asort = asort;
    }

    public String getActivity_id() {
        return activity_id;
    }

    public void setActivity_id(String activity_id) {
        this.activity_id = activity_id;
    }

    public String getBegin_time() {
        return begin_time;
    }

    public void setBegin_time(String begin_time) {
        this.begin_time = begin_time;
    }

    public String getEnd_time() {
        return end_time;
    }

    public void setEnd_time(String end_time) {
        this.end_time = end_time;
    }

    public String getBrand_id() {
        return brand_id;
    }

    public void setBrand_id(String brand_id) {
        this.brand_id = brand_id;
    }

    public Object getBrand_url() {
        return brand_url;
    }

    public void setBrand_url(Object brand_url) {
        this.brand_url = brand_url;
    }

    public String getEvent_status() {
        return event_status;
    }

    public void setEvent_status(String event_status) {
        this.event_status = event_status;
    }

    public String getCreate_user() {
        return create_user;
    }

    public void setCreate_user(String create_user) {
        this.create_user = create_user;
    }

    public String getCreate_time() {
        return create_time;
    }

    public void setCreate_time(String create_time) {
        this.create_time = create_time;
    }

    public String getCheck_user() {
        return check_user;
    }

    public void setCheck_user(String check_user) {
        this.check_user = check_user;
    }

    public String getCheck_time() {
        return check_time;
    }

    public void setCheck_time(String check_time) {
        this.check_time = check_time;
    }

    public String getBrief() {
        return brief;
    }

    public void setBrief(String brief) {
        this.brief = brief;
    }

    public String getInstruction() {
        return instruction;
    }

    public void setInstruction(String instruction) {
        this.instruction = instruction;
    }

    public String getFirst_pic() {
        return first_pic;
    }

    public void setFirst_pic(String first_pic) {
        this.first_pic = first_pic;
    }

    public String getSec_pic() {
        return sec_pic;
    }

    public void setSec_pic(String sec_pic) {
        this.sec_pic = sec_pic;
    }

    public String getIs_relation() {
        return is_relation;
    }

    public void setIs_relation(String is_relation) {
        this.is_relation = is_relation;
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

    public String getAdvert_id() {
        return advert_id;
    }

    public void setAdvert_id(String advert_id) {
        this.advert_id = advert_id;
    }

    public String getAd_name() {
        return ad_name;
    }

    public void setAd_name(String ad_name) {
        this.ad_name = ad_name;
    }

    public String getIs_newActivity() {
        return is_newActivity;
    }

    public void setIs_newActivity(String is_newActivity) {
        this.is_newActivity = is_newActivity;
    }

    public String getApp_version_isNew() {
        return app_version_isNew;
    }

    public void setApp_version_isNew(String app_version_isNew) {
        this.app_version_isNew = app_version_isNew;
    }

    public Object getShare_topic() {
        return share_topic;
    }

    public void setShare_topic(Object share_topic) {
        this.share_topic = share_topic;
    }

    public int getEnd_left_time() {
        return end_left_time;
    }

    public void setEnd_left_time(int end_left_time) {
        this.end_left_time = end_left_time;
    }

    public String getSec_pic_src() {
        return sec_pic_src;
    }

    public void setSec_pic_src(String sec_pic_src) {
        this.sec_pic_src = sec_pic_src;
    }

    public String getFirst_pic_src() {
        return first_pic_src;
    }

    public void setFirst_pic_src(String first_pic_src) {
        this.first_pic_src = first_pic_src;
    }

    public boolean isUser_booking() {
        return user_booking;
    }

    public void setUser_booking(boolean user_booking) {
        this.user_booking = user_booking;
    }

    public String getActivity_range_name() {
        return activity_range_name;
    }

    public void setActivity_range_name(String activity_range_name) {
        this.activity_range_name = activity_range_name;
    }
}
