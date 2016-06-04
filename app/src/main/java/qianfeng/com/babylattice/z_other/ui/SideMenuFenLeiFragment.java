package qianfeng.com.babylattice.z_other.ui;


import android.animation.ObjectAnimator;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioButton;
import android.widget.RadioGroup;

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
import qianfeng.com.babylattice.a_homepage.adapter.MyFragmentPagerAdapter;
import qianfeng.com.babylattice.z_other.bean.SideMenu;
import qianfeng.com.babylattice.z_other.constant.Constant;

/**
 * A simple {@link Fragment} subclass.
 */
public class SideMenuFenLeiFragment extends BaseFragment {

    private RadioGroup radioGroup;
    private View indexView;
    private float lastTop;
    private ViewPager viewPager;
    private MyFragmentPagerAdapter myFragmentPagerAdapter;

    @Override
    protected int getLayoutId() {
        return R.layout.fragment_side_menu_fen_lei;
    }

    @Override
    protected void initViews() {
        radioGroup = (RadioGroup) view.findViewById(R.id.side_menu_fenlei_rg);
        indexView = view.findViewById(R.id.side_menu_fenlei_indexView);
        viewPager = (ViewPager) view.findViewById(R.id.side_menu_fenlei_viewPager);
    }

    @Override
    protected void initEvents() {
        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                RadioButton radioButton = (RadioButton) radioGroup.getChildAt(checkedId);
                int top = radioButton.getTop();
                ObjectAnimator.ofFloat(indexView, "translationY", lastTop, top).setDuration(300).start();
                lastTop = top;

                viewPager.setCurrentItem(checkedId);
            }
        });

        viewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {
                RadioButton radioButton = (RadioButton) radioGroup.getChildAt(position);
                radioButton.setChecked(true);
            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });
    }

    private int counts;
    private List<SideMenu> sideMenus;

    @Override
    protected void initDatas() {
        new OkHttpRequest.Builder().url(Constant.SIDE_MENU_FENLEI_URL).get(
                new ResultCallback<String>() {
                    @Override
                    public void onError(Request request, Exception e) {
                        LL.d("侧边栏菜单分类数据加载失败.....");
                    }

                    @Override
                    public void onResponse(String response) {
                        LL.d("侧边栏菜单分类数据加载成功.....");
                        try {
                            JSONObject root = new JSONObject(response);
                            String msg = root.getString("msg");
                            if ("成功".equals(msg)) {
                                JSONObject data = root.getJSONObject("data");
                                JSONArray category_info_f = data.getJSONArray("category_info_f");
                                sideMenus = SideMenu.arraySideMenuFromData(category_info_f.toString());
                                counts = sideMenus.size();
                                initTab();
                                initFragment();
                            }
                        } catch (JSONException e) {
                            e.printStackTrace();
                        }
                    }
                });
    }

    private void initFragment() {

        List<Fragment> fragments = new ArrayList<>();
        fragments.add(new DaPaiNaiFenFragment(sideMenus.get(0)));
        fragments.add(new ZhiNiaoKuFragment(sideMenus.get(1)));
        fragments.add(new BaoBaoFuShiFragment(sideMenus.get(2)));
        fragments.add(new BaoBaoYongPinFragment(sideMenus.get(3)));
        fragments.add(new MeiShiBaoJianFragment(sideMenus.get(4)));
        fragments.add(new WanJuTuShuFragment(sideMenus.get(5)));
        fragments.add(new FuShiXieBaoFragment(sideMenus.get(6)));
        fragments.add(new LaMaZhuanQuFragment(sideMenus.get(7)));
        fragments.add(new NaiBaZhuanQuFragment(sideMenus.get(8)));

        myFragmentPagerAdapter = new MyFragmentPagerAdapter(getChildFragmentManager(), fragments);
        viewPager.setAdapter(myFragmentPagerAdapter);
    }

    private void initTab() {
        int height = radioGroup.getHeight();
        int width = radioGroup.getWidth();
//        LL.d("width = " + width + ",height = " + height);

        for (int i = 0; i < counts; i++) {
            RadioButton radioButton = (RadioButton) LayoutInflater.from(getContext()).inflate(R.layout.radiogroup_item, null);
            radioButton.setText(sideMenus.get(i).getNav_name());
            radioButton.setId(i);
            radioButton.setLayoutParams(new RadioGroup.LayoutParams(width, height / counts));
            radioGroup.addView(radioButton);
            if (i == 0) {
                radioButton.setChecked(true);
            }
        }
        ViewGroup.LayoutParams layoutParams = indexView.getLayoutParams();
        layoutParams.height = height / counts;
        indexView.setLayoutParams(layoutParams);
    }
}
