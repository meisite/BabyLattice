package qianfeng.com.babylattice.a_homepage.ui;


import android.content.Context;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.TextView;

import com.bigkoo.convenientbanner.ConvenientBanner;
import com.bigkoo.convenientbanner.holder.CBViewHolderCreator;
import com.bigkoo.convenientbanner.holder.Holder;
import com.bigkoo.convenientbanner.listener.OnItemClickListener;
import com.bumptech.glide.Glide;
import com.orhanobut.logger.LL;
import com.squareup.okhttp.Request;
import com.zhy.http.okhttp.callback.ResultCallback;
import com.zhy.http.okhttp.request.OkHttpRequest;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

import qianfeng.com.babylattice.R;
import qianfeng.com.babylattice.a_homepage.bean.HomePage;
import qianfeng.com.babylattice.a_homepage.bean.HomePageAd;
import qianfeng.com.babylattice.a_homepage.bean.HomePageList;
import qianfeng.com.babylattice.a_homepage.bean.HomePageProductList;
import qianfeng.com.babylattice.a_homepage.bean.MiaoSha;
import qianfeng.com.babylattice.a_homepage.constant.HomePageURL;
import qianfeng.com.babylattice.z_other.ui.BaseFragment;
import qianfeng.com.babylattice.z_other.widget.GuideIndexView;
import qianfeng.com.babylattice.z_other.widget.HomePageMiaoShaLayout;
import qianfeng.com.babylattice.z_other.widget.MyScrollView;


/**
 * A simple {@link Fragment} subclass.
 * <p/>
 * 首页
 */
public class HomePageFragment extends BaseFragment {

    private RelativeLayout top_view;
    private TextView top_side_menu;
    private MyScrollView scrollView;
    private ConvenientBanner convenientBanner, small_banner02, small_banner03, small_banner04;
    private GuideIndexView index_view, index_view02, index_view03, index_view04;
    private RelativeLayout relativeLayout;
    private LinearLayout miaosha_ll;
    private ImageView pintuangou_left1_iv, pintuangou_right1_iv, pintuangou_right2_iv;
    private ImageView chaozhi_left1, chaozhi_left2, chaozhi_right1, chaozhi_right2, chaozhi_right3;
    private ImageView USA, AUSTRALIA, KOREA, JAPAN, GERMANY, UK, CANADA, BONDED, ITALY, NEW_ZEALAND, NETHERLANDS;
    private ImageView jingxuan_zhong4, jingxuan_left1, jingxuan_left2, jingxuan_zhong1, jingxuan_zhong2, jingxuan_right1, jingxuan_right2, jingxuan_right4, jingxuan_zhongright3;
    private ImageView remen_one, remen_two, remen_three, remen_four, remen_five;
    private TabLayout tab_Layout, gone_tab_Layout;
    private ListView listView;
    private ImageView fast_enter_iv1, fast_enter_iv2, fast_enter_iv3, fast_enter_iv4;
    private ImageView hot_msg_iv;
    private RelativeLayout viewpager04, viewpager03, viewpager02;

    @Override
    protected int getLayoutId() {
        return R.layout.fragment_home_page;
    }

    @Override
    protected void initViews() {
        miaosha_ll = (LinearLayout) view.findViewById(R.id.homePage_miaosha_ll);
        relativeLayout = (RelativeLayout) view.findViewById(R.id.homePage_relativeLayout);
        top_view = (RelativeLayout) view.findViewById(R.id.homePage_top_view);

        top_side_menu = (TextView) view.findViewById(R.id.homePage_top_side_menu);
        scrollView = (MyScrollView) view.findViewById(R.id.homePage_scrollView);

        convenientBanner = (ConvenientBanner) view.findViewById(R.id.homePage_convenientBanner);
        index_view = (GuideIndexView) view.findViewById(R.id.homePage_index_view);

        small_banner02 = (ConvenientBanner) view.findViewById(R.id.small_banner02);
        index_view02 = (GuideIndexView) view.findViewById(R.id.index_view02);

        pintuangou_left1_iv = (ImageView) view.findViewById(R.id.homePage_pintuangou_left1_iv);
        pintuangou_right1_iv = (ImageView) view.findViewById(R.id.homePage_pintuangou_right1_iv);
        pintuangou_right2_iv = (ImageView) view.findViewById(R.id.homePage_pintuangou_right2_iv);

        chaozhi_left1 = (ImageView) view.findViewById(R.id.homePage_chaozhi_left1_iv);
        chaozhi_left2 = (ImageView) view.findViewById(R.id.homePage_chaozhi_left2_iv);
        chaozhi_right1 = (ImageView) view.findViewById(R.id.homePage_chaozhi_right1_iv);
        chaozhi_right2 = (ImageView) view.findViewById(R.id.homePage_chaozhi_right2_iv);
        chaozhi_right3 = (ImageView) view.findViewById(R.id.homePage_chaozhi_right3_iv);

        small_banner03 = (ConvenientBanner) view.findViewById(R.id.small_banner03);
        index_view03 = (GuideIndexView) view.findViewById(R.id.index_view03);

        USA = (ImageView) view.findViewById(R.id.USA_iv);
        AUSTRALIA = (ImageView) view.findViewById(R.id.AUSTRALIA_iv);
        KOREA = (ImageView) view.findViewById(R.id.KOREA_iv);
        JAPAN = (ImageView) view.findViewById(R.id.JAPAN_iv);
        GERMANY = (ImageView) view.findViewById(R.id.GERMANY_iv);
        UK = (ImageView) view.findViewById(R.id.UK_iv);
        CANADA = (ImageView) view.findViewById(R.id.CANADA_iv);
        BONDED = (ImageView) view.findViewById(R.id.BONDED_iv);
        ITALY = (ImageView) view.findViewById(R.id.ITALY_iv);
        NEW_ZEALAND = (ImageView) view.findViewById(R.id.NEW_ZEALAND_iv);
        NETHERLANDS = (ImageView) view.findViewById(R.id.NETHERLANDS_iv);

        small_banner04 = (ConvenientBanner) view.findViewById(R.id.small_banner04);
        index_view04 = (GuideIndexView) view.findViewById(R.id.index_view04);

        jingxuan_left1 = (ImageView) view.findViewById(R.id.homePage_jingxuan_left1_iv);
        jingxuan_left2 = (ImageView) view.findViewById(R.id.homePage_jingxuan_left2_iv);
        jingxuan_zhong1 = (ImageView) view.findViewById(R.id.homePage_jingxuan_zhong1_iv);
        jingxuan_zhong2 = (ImageView) view.findViewById(R.id.homePage_jingxuan_zhong2_iv);
        jingxuan_zhong4 = (ImageView) view.findViewById(R.id.homePage_jingxuan_zhong4_iv);
        jingxuan_right1 = (ImageView) view.findViewById(R.id.homePage_jingxuan_right1_iv);
        jingxuan_right2 = (ImageView) view.findViewById(R.id.homePage_jingxuan_right2_iv);
        jingxuan_right4 = (ImageView) view.findViewById(R.id.homePage_jingxuan_right4_iv);
        jingxuan_zhongright3 = (ImageView) view.findViewById(R.id.homePage_jingxuan_zhongright3_iv);

        remen_one = (ImageView) view.findViewById(R.id.homePage_remen_one_iv);
        remen_two = (ImageView) view.findViewById(R.id.homePage_remen_two_iv);
        remen_three = (ImageView) view.findViewById(R.id.homePage_remen_three_iv);
        remen_four = (ImageView) view.findViewById(R.id.homePage_remen_four_iv);
        remen_five = (ImageView) view.findViewById(R.id.homePage_remen_five_iv);

        tab_Layout = (TabLayout) view.findViewById(R.id.homePage_bikan_tabLayout);
        gone_tab_Layout = (TabLayout) view.findViewById(R.id.homePage_gone_tabLayout);
        listView = (ListView) view.findViewById(R.id.homePage_bikan_listView);

        fast_enter_iv1 = (ImageView) view.findViewById(R.id.homePage_fast_enter_iv1);
        fast_enter_iv2 = (ImageView) view.findViewById(R.id.homePage_fast_enter_iv2);
        fast_enter_iv3 = (ImageView) view.findViewById(R.id.homePage_fast_enter_iv3);
        fast_enter_iv4 = (ImageView) view.findViewById(R.id.homePage_fast_enter_iv4);

        hot_msg_iv = (ImageView) view.findViewById(R.id.homePage_hot_msg_iv);

        viewpager04 = (RelativeLayout) view.findViewById(R.id.homePage_viewpager04);
        viewpager03 = (RelativeLayout) view.findViewById(R.id.homePage_viewpager03);
        viewpager02 = (RelativeLayout) view.findViewById(R.id.homePage_viewpager02);

    }

    @Override
    protected void initEvents() {

        tab_Layout.setOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                switch (tab.getPosition()) {
                    case 0:
                        break;
                    case 1:
                        break;
                    case 2:
                        break;
                    case 3:
                        break;
                    case 4:
                        break;
                    case 5:
                        break;
                }
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });
    }

    @Override
    protected void initDatas() {

        gone_tab_Layout.addTab(gone_tab_Layout.newTab().setText("美加"));
        gone_tab_Layout.addTab(gone_tab_Layout.newTab().setText("德意"));
        gone_tab_Layout.addTab(gone_tab_Layout.newTab().setText("日韩"));
        gone_tab_Layout.addTab(gone_tab_Layout.newTab().setText("英荷"));
        gone_tab_Layout.addTab(gone_tab_Layout.newTab().setText("澳新"));
        gone_tab_Layout.addTab(gone_tab_Layout.newTab().setText("保税"));

        /**
         * OkHttp加载首页数据
         */
        new OkHttpRequest.Builder().url(HomePageURL.HOME_PAGE_URL).get(
                new ResultCallback<String>() {
                    @Override
                    public void onError(Request request, Exception e) {
                        LL.d("首页数据加载失败.....");
                    }

                    @Override
                    public void onResponse(String response) {
                        LL.d("首页数据加载成功.....");
                        try {
                            JSONObject root = new JSONObject(response);
                            String msg = root.getString("msg");
                            if ("操作成功".equals(msg)) {
                                JSONArray data = root.getJSONArray("data");
                                List<HomePage> list_data = HomePage.arrayHomePageFromData(data.toString());

                                //首页轮播图板块
                                showBanner(list_data.get(0));

                                //首页快捷入口板块
                                showFastEnter(list_data.get(1));

                                //首页热门消息板块
                                showHotMsg(list_data.get(3));

                                //首页秒杀板块
                                showMiaoSha(list_data.get(5));

                                //首页拼团购板块
                                showPinTuanGou(list_data.get(6));

                                //首页超值专区板块
                                showChaoZhiZhuanQu(list_data.get(7));

                                //首页国家馆板块
                                showGuoJiaGuan(list_data.get(8));

                                //首页精选市场板块
                                showJingXuanShiChang(list_data.get(9));

                                //首页热门品牌板块
                                showReMenPinPai(list_data.get(10));

                                //首页每日必看板块
                                showMeiRiBiKan(list_data.get(11));
                            }
                        } catch (JSONException e) {
                            e.printStackTrace();
                        }
                    }
                });
    }


    /**
     * 每日必看
     */
    private void showMeiRiBiKan(HomePage homePage) {
        List<HomePageList> list = homePage.getData().getList();
        tab_Layout.addTab(tab_Layout.newTab().setText(list.get(0).getName()));
        tab_Layout.addTab(tab_Layout.newTab().setText(list.get(1).getName()));
        tab_Layout.addTab(tab_Layout.newTab().setText(list.get(2).getName()));
        tab_Layout.addTab(tab_Layout.newTab().setText(list.get(3).getName()));
        tab_Layout.addTab(tab_Layout.newTab().setText(list.get(4).getName()));
        tab_Layout.addTab(tab_Layout.newTab().setText(list.get(5).getName()));

        List<HomePageProductList> product_list = list.get(0).getProduct_list();
    }


    /**
     * 热门品牌
     */
    private void showReMenPinPai(HomePage homePage) {
        List<HomePageList> list = homePage.getData().getList();

        if (list.size() == 5) {
            Glide.with(this).load(list.get(0).getAd_pic()).into(remen_one);
            Glide.with(this).load(list.get(1).getAd_pic()).into(remen_two);
            Glide.with(this).load(list.get(2).getAd_pic()).into(remen_three);
            Glide.with(this).load(list.get(3).getAd_pic()).into(remen_four);
            Glide.with(this).load(list.get(4).getAd_pic()).into(remen_five);
        } else if (list.size() == 4) {
            Glide.with(this).load(list.get(0).getAd_pic()).into(remen_one);
            Glide.with(this).load(list.get(1).getAd_pic()).into(remen_two);
            Glide.with(this).load(list.get(2).getAd_pic()).into(remen_three);
            Glide.with(this).load(list.get(3).getAd_pic()).into(remen_four);
            remen_five.setVisibility(View.GONE);
        }

    }


    /**
     * 精选市场
     */
    private void showJingXuanShiChang(HomePage homePage) {
        List<HomePageList> list = homePage.getData().getList();
        Glide.with(this).load(list.get(0).getNav_link()).into(jingxuan_left1);
        Glide.with(this).load(list.get(1).getNav_link()).into(jingxuan_zhong1);
        Glide.with(this).load(list.get(2).getNav_link()).into(jingxuan_right1);
        Glide.with(this).load(list.get(3).getNav_link()).into(jingxuan_zhong2);
        Glide.with(this).load(list.get(4).getNav_link()).into(jingxuan_right2);
        Glide.with(this).load(list.get(5).getNav_link()).into(jingxuan_left2);
        Glide.with(this).load(list.get(6).getNav_link()).into(jingxuan_zhongright3);
        Glide.with(this).load(list.get(7).getNav_link()).into(jingxuan_zhong4);
        Glide.with(this).load(list.get(8).getNav_link()).into(jingxuan_right4);
    }


    /**
     * 国家馆
     */
    private void showGuoJiaGuan(HomePage homePage) {
        List<String> images = new ArrayList<>();

        HomePage.DataBean data = homePage.getData();
        final List<HomePageAd> ad = data.getAd();
        List<HomePageList> list = data.getList();
        Glide.with(this).load(list.get(0).getCountry_pic_l()).into(USA);
        Glide.with(this).load(list.get(1).getCountry_pic()).into(AUSTRALIA);
        Glide.with(this).load(list.get(2).getCountry_pic()).into(KOREA);
        Glide.with(this).load(list.get(3).getCountry_pic()).into(JAPAN);
        Glide.with(this).load(list.get(4).getCountry_pic()).into(GERMANY);
        Glide.with(this).load(list.get(5).getCountry_pic_l()).into(UK);
        Glide.with(this).load(list.get(6).getCountry_pic()).into(CANADA);
        Glide.with(this).load(list.get(7).getCountry_pic()).into(BONDED);
        Glide.with(this).load(list.get(8).getCountry_pic()).into(ITALY);
        Glide.with(this).load(list.get(9).getCountry_pic()).into(NEW_ZEALAND);
        Glide.with(this).load(list.get(10).getCountry_pic_l()).into(NETHERLANDS);

        if (ad != null && ad.size() > 0) {

            index_view04.drawCount(ad.size());

            for (int i = 0; i < ad.size(); i++) {
                String image = ad.get(i).getAd_pic();
                images.add(image);
            }

            small_banner04.setPages(new CBViewHolderCreator<NetworkImageHolderView>() {

                @Override
                public NetworkImageHolderView createHolder() {
                    return new NetworkImageHolderView();
                }
            }, images).setOnItemClickListener(new OnItemClickListener() {
                @Override
                public void onItemClick(int position) {
                    LL.d("position = " + position);
                }
            }).setOnPageChangeListener(new ViewPager.OnPageChangeListener() {
                @Override
                public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

                }

                @Override
                public void onPageSelected(int position) {
                    index_view04.changeIndex(position);
                }

                @Override
                public void onPageScrollStateChanged(int state) {

                }
            });
        } else {
            viewpager04.setVisibility(View.GONE);
        }

    }


    /**
     * 超值专区
     */
    private void showChaoZhiZhuanQu(HomePage homePage) {
        List<String> images = new ArrayList<>();

        HomePage.DataBean data = homePage.getData();
        final List<HomePageAd> ad = data.getAd();
        List<HomePageList> list = data.getList();
        Glide.with(this).load(list.get(0).getAd_pic()).into(chaozhi_left1);
        Glide.with(this).load(list.get(1).getAd_pic()).into(chaozhi_right1);
        Glide.with(this).load(list.get(2).getAd_pic()).into(chaozhi_right2);
        Glide.with(this).load(list.get(3).getAd_pic()).into(chaozhi_right3);
        Glide.with(this).load(list.get(4).getAd_pic()).into(chaozhi_left2);

        if (ad != null && ad.size() > 0) {

            index_view03.drawCount(ad.size());

            for (int i = 0; i < ad.size(); i++) {
                String image = ad.get(i).getAd_pic();
                images.add(image);
            }

            small_banner03.setPages(new CBViewHolderCreator<NetworkImageHolderView>() {

                @Override
                public NetworkImageHolderView createHolder() {
                    return new NetworkImageHolderView();
                }
            }, images).setOnItemClickListener(new OnItemClickListener() {
                @Override
                public void onItemClick(int position) {
                    LL.d("position = " + position);
                }
            }).setOnPageChangeListener(new ViewPager.OnPageChangeListener() {
                @Override
                public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

                }

                @Override
                public void onPageSelected(int position) {
                    index_view03.changeIndex(position);
                }

                @Override
                public void onPageScrollStateChanged(int state) {

                }
            });
        } else {
            viewpager03.setVisibility(View.GONE);
        }

    }


    /**
     * 拼团购
     */
    private void showPinTuanGou(HomePage homePage) {
        HomePage.DataBean data = homePage.getData();
        List<HomePageList> list = data.getList();
        Glide.with(this).load(list.get(0).getAd_pic()).into(pintuangou_left1_iv);
        Glide.with(this).load(list.get(1).getAd_pic()).into(pintuangou_right1_iv);
        Glide.with(this).load(list.get(2).getAd_pic()).into(pintuangou_right2_iv);
    }


    /**
     * 秒杀
     */
    private void showMiaoSha(HomePage homePage) {
        new OkHttpRequest.Builder().url(HomePageURL.HOME_PAGE_MIAOSHA_URL).get(
                new ResultCallback<String>() {
                    @Override
                    public void onError(Request request, Exception e) {
                        LL.d("首页秒杀数据加载失败.....");
                    }

                    @Override
                    public void onResponse(String response) {
                        LL.d("首页秒杀数据加载成功.....");
                        try {
                            JSONObject root = new JSONObject(response);
                            String msg = root.getString("msg");
                            if ("操作成功".equals(msg)) {
                                JSONObject data = root.getJSONObject("data");
                                JSONArray list = data.getJSONArray("list");
                                List<MiaoSha> miaoShas = MiaoSha.arrayMiaoShaFromData(list.toString());
                                showMiaoShaView(miaoShas);
                            }
                        } catch (JSONException e) {
                            e.printStackTrace();
                        }
                    }
                });
        List<String> images = new ArrayList<>();

        HomePage.DataBean data = homePage.getData();
        final List<HomePageAd> ad = data.getAd();

        if (ad != null && ad.size() > 0) {

            index_view02.drawCount(ad.size());

            for (int i = 0; i < ad.size(); i++) {
                String image = ad.get(i).getAd_pic();
                images.add(image);
            }

            small_banner02.setPages(new CBViewHolderCreator<NetworkImageHolderView>() {

                @Override
                public NetworkImageHolderView createHolder() {
                    return new NetworkImageHolderView();
                }
            }, images).setOnItemClickListener(new OnItemClickListener() {
                @Override
                public void onItemClick(int position) {
                    LL.d("position = " + position);
                }
            }).setOnPageChangeListener(new ViewPager.OnPageChangeListener() {
                @Override
                public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

                }

                @Override
                public void onPageSelected(int position) {
                    index_view02.changeIndex(position);
                }

                @Override
                public void onPageScrollStateChanged(int state) {

                }
            });
        } else {
            viewpager02.setVisibility(View.GONE);
        }

    }

    private void showMiaoShaView(List<MiaoSha> lists) {
        HomePageMiaoShaLayout homePageMiaoShaLayout = new HomePageMiaoShaLayout(getActivity(), lists);
        miaosha_ll.addView(homePageMiaoShaLayout);
    }


    /**
     * 热门消息
     */
    private void showHotMsg(HomePage homePage) {
        HomePage.DataBean data = homePage.getData();
        Glide.with(this).load(data.getIcon()).into(hot_msg_iv);
        List<HomePageList> list = data.getList();
    }


    /**
     * 快捷入口
     */
    private void showFastEnter(HomePage homePage) {
        HomePage.DataBean data = homePage.getData();
        List<HomePageList> list = data.getList();
        Glide.with(this).load(list.get(0).getPic()).into(fast_enter_iv1);
        Glide.with(this).load(list.get(1).getPic()).into(fast_enter_iv2);
        Glide.with(this).load(list.get(2).getPic()).into(fast_enter_iv3);
        Glide.with(this).load(list.get(3).getPic()).into(fast_enter_iv4);
    }


    /**
     * 轮播图
     */
    private void showBanner(HomePage homePage) {

        List<String> images = new ArrayList<>();

        HomePage.DataBean data = homePage.getData();
        List<HomePageList> list = data.getList();

        for (int i = 0; i < list.size(); i++) {
            String image = list.get(i).getAd_pic();
            images.add(image);
        }

        index_view.drawCount(list.size());

        convenientBanner.setPages(new CBViewHolderCreator<NetworkImageHolderView>() {

            @Override
            public NetworkImageHolderView createHolder() {
                return new NetworkImageHolderView();
            }
        }, images).setOnItemClickListener(new OnItemClickListener() {
            @Override
            public void onItemClick(int position) {
//                LL.d("position = " + position);
            }
        }).setOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {
                index_view.changeIndex(position);
            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });
    }


    /**
     * OkHttp
     */
    class NetworkImageHolderView implements Holder<String> {

        private ImageView imageView;

        @Override
        public View createView(Context context) {

            int height = relativeLayout.getHeight();
            imageView = new ImageView(context);

            ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, height);
            imageView.setLayoutParams(layoutParams);

            imageView.setScaleType(ImageView.ScaleType.FIT_XY);

            return imageView;
        }

        @Override
        public void UpdateUI(Context context, int position, String data) {
            Glide.with(HomePageFragment.this).load(data).placeholder(R.mipmap.no_collection_icon).into(imageView);
        }
    }

    @Override
    public void onPause() {
        super.onPause();
        convenientBanner.stopTurning();
        small_banner02.stopTurning();
        small_banner03.stopTurning();
        small_banner04.stopTurning();
    }

    @Override
    public void onResume() {
        super.onResume();
        convenientBanner.startTurning(5000);
        small_banner02.startTurning(5000);
        small_banner03.startTurning(5000);
        small_banner04.startTurning(5000);
    }

}
