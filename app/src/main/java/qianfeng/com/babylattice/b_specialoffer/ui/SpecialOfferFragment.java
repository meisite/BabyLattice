package qianfeng.com.babylattice.b_specialoffer.ui;


import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.view.View;

import qianfeng.com.babylattice.R;
import qianfeng.com.babylattice.z_other.ui.BaseFragment;


/**
 * A simple {@link Fragment} subclass.
 * <p/>
 * 特卖
 */
public class SpecialOfferFragment extends BaseFragment {

    private TabLayout tabLayout;

    @Override
    protected int getLayoutId() {
        return R.layout.fragment_special_offer;
    }

    @Override
    protected void initViews() {
        tabLayout = (TabLayout) view.findViewById(R.id.special_offer_tabLayout);
    }

    @Override
    protected void initEvents() {

    }

    @Override
    protected void initDatas() {
        tabLayout.addTab(tabLayout.newTab().setText("最新上线"));
        tabLayout.addTab(tabLayout.newTab().setText("即将上线"));
    }

}
