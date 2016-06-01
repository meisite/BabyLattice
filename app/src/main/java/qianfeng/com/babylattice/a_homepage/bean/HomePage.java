package qianfeng.com.babylattice.a_homepage.bean;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2016/5/31 0031.
 */
public class HomePage {

    private String module_type;
    private String module_name;
    private MoreBean more;
    private int rank;
    private String template;
    private DataBean data;

    public static HomePage objectFromData(String str) {

        return new Gson().fromJson(str, HomePage.class);
    }

    public static List<HomePage> arrayHomePageFromData(String str) {

        Type listType = new TypeToken<ArrayList<HomePage>>() {
        }.getType();

        return new Gson().fromJson(str, listType);
    }

    public String getModule_type() {
        return module_type;
    }

    public void setModule_type(String module_type) {
        this.module_type = module_type;
    }

    public String getModule_name() {
        return module_name;
    }

    public void setModule_name(String module_name) {
        this.module_name = module_name;
    }

    public MoreBean getMore() {
        return more;
    }

    public void setMore(MoreBean more) {
        this.more = more;
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    public String getTemplate() {
        return template;
    }

    public void setTemplate(String template) {
        this.template = template;
    }

    public DataBean getData() {
        return data;
    }

    public void setData(DataBean data) {
        this.data = data;
    }

    public static class MoreBean {
        private String event_type;
        private boolean is_show;
        private String h5_link_ios;
        private String h5_link_android;
        private String h5_name;
        private H5ShareBean h5_share;

        public static MoreBean objectFromData(String str) {

            return new Gson().fromJson(str, MoreBean.class);
        }

        public static List<MoreBean> arrayMoreBeanFromData(String str) {

            Type listType = new TypeToken<ArrayList<MoreBean>>() {
            }.getType();

            return new Gson().fromJson(str, listType);
        }

        public String getEvent_type() {
            return event_type;
        }

        public void setEvent_type(String event_type) {
            this.event_type = event_type;
        }

        public boolean isIs_show() {
            return is_show;
        }

        public void setIs_show(boolean is_show) {
            this.is_show = is_show;
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

        public H5ShareBean getH5_share() {
            return h5_share;
        }

        public void setH5_share(H5ShareBean h5_share) {
            this.h5_share = h5_share;
        }

        public static class H5ShareBean {
            private String h5_share_title;
            private String h5_share_content;
            private String h5_share_pic;

            public static H5ShareBean objectFromData(String str) {

                return new Gson().fromJson(str, H5ShareBean.class);
            }

            public static List<H5ShareBean> arrayH5ShareBeanFromData(String str) {

                Type listType = new TypeToken<ArrayList<H5ShareBean>>() {
                }.getType();

                return new Gson().fromJson(str, listType);
            }

            public String getH5_share_title() {
                return h5_share_title;
            }

            public void setH5_share_title(String h5_share_title) {
                this.h5_share_title = h5_share_title;
            }

            public String getH5_share_content() {
                return h5_share_content;
            }

            public void setH5_share_content(String h5_share_content) {
                this.h5_share_content = h5_share_content;
            }

            public String getH5_share_pic() {
                return h5_share_pic;
            }

            public void setH5_share_pic(String h5_share_pic) {
                this.h5_share_pic = h5_share_pic;
            }
        }
    }

    public static class DataBean {
        private String icon;
        private int page;
        private int total_page;
        private List<HomePageList> list;
        private List<HomePageAd> ad;

        public static DataBean objectFromData(String str) {

            return new Gson().fromJson(str, DataBean.class);
        }

        public static List<DataBean> arrayDataBeanFromData(String str) {

            Type listType = new TypeToken<ArrayList<DataBean>>() {
            }.getType();

            return new Gson().fromJson(str, listType);
        }

        public String getIcon() {
            return icon;
        }

        public void setIcon(String icon) {
            this.icon = icon;
        }

        public int getPage() {
            return page;
        }

        public void setPage(int page) {
            this.page = page;
        }

        public int getTotal_page() {
            return total_page;
        }

        public void setTotal_page(int total_page) {
            this.total_page = total_page;
        }

        public List<HomePageList> getList() {
            return list;
        }

        public void setList(List<HomePageList> list) {
            this.list = list;
        }

        public List<HomePageAd> getAd() {
            return ad;
        }

        public void setAd(List<HomePageAd> ad) {
            this.ad = ad;
        }
    }
}
