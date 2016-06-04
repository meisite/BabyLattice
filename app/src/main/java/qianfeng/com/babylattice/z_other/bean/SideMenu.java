package qianfeng.com.babylattice.z_other.bean;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2016/6/2 0002.
 */
public class SideMenu {

    private String category_id;
    private String nav_name;
    private String rank;
    private List<CategoryInfoSBean> category_info_s;

    public static SideMenu objectFromData(String str) {

        return new Gson().fromJson(str, SideMenu.class);
    }

    public static List<SideMenu> arraySideMenuFromData(String str) {

        Type listType = new TypeToken<ArrayList<SideMenu>>() {
        }.getType();

        return new Gson().fromJson(str, listType);
    }

    public String getCategory_id() {
        return category_id;
    }

    public void setCategory_id(String category_id) {
        this.category_id = category_id;
    }

    public String getNav_name() {
        return nav_name;
    }

    public void setNav_name(String nav_name) {
        this.nav_name = nav_name;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    public List<CategoryInfoSBean> getCategory_info_s() {
        return category_info_s;
    }

    public void setCategory_info_s(List<CategoryInfoSBean> category_info_s) {
        this.category_info_s = category_info_s;
    }

    public static class CategoryInfoSBean {
        private String category_id;
        private String category_name;
        private String rank;
        private String category_pic_link;
        private List<ChildCategoryBean> child_category;

        public static CategoryInfoSBean objectFromData(String str) {

            return new Gson().fromJson(str, CategoryInfoSBean.class);
        }

        public static List<CategoryInfoSBean> arrayCategoryInfoSBeanFromData(String str) {

            Type listType = new TypeToken<ArrayList<CategoryInfoSBean>>() {
            }.getType();

            return new Gson().fromJson(str, listType);
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

        public String getRank() {
            return rank;
        }

        public void setRank(String rank) {
            this.rank = rank;
        }

        public String getCategory_pic_link() {
            return category_pic_link;
        }

        public void setCategory_pic_link(String category_pic_link) {
            this.category_pic_link = category_pic_link;
        }

        public List<ChildCategoryBean> getChild_category() {
            return child_category;
        }

        public void setChild_category(List<ChildCategoryBean> child_category) {
            this.child_category = child_category;
        }

        public static class ChildCategoryBean {
            private String category_id;
            private String category_name;
            private String rank;
            private String category_pic_link;

            public static ChildCategoryBean objectFromData(String str) {

                return new Gson().fromJson(str, ChildCategoryBean.class);
            }

            public static List<ChildCategoryBean> arrayChildCategoryBeanFromData(String str) {

                Type listType = new TypeToken<ArrayList<ChildCategoryBean>>() {
                }.getType();

                return new Gson().fromJson(str, listType);
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

            public String getRank() {
                return rank;
            }

            public void setRank(String rank) {
                this.rank = rank;
            }

            public String getCategory_pic_link() {
                return category_pic_link;
            }

            public void setCategory_pic_link(String category_pic_link) {
                this.category_pic_link = category_pic_link;
            }
        }
    }
}
