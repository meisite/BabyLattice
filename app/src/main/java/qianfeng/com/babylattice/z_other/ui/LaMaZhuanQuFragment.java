package qianfeng.com.babylattice.z_other.ui;


import android.annotation.SuppressLint;
import android.support.v4.app.Fragment;
import android.view.View;
import android.widget.LinearLayout;

import java.util.List;

import qianfeng.com.babylattice.R;
import qianfeng.com.babylattice.z_other.bean.SideMenu;
import qianfeng.com.babylattice.z_other.widget.SideMenuFenLeiLayout;

/**
 * A simple {@link Fragment} subclass.
 */
@SuppressLint("ValidFragment")
public class LaMaZhuanQuFragment extends BaseFragment {

    private SideMenu sideMenu;
    private LinearLayout ll;

    public LaMaZhuanQuFragment(SideMenu sideMenu) {
        this.sideMenu = sideMenu;
    }

    public LaMaZhuanQuFragment() {
    }

    @Override
    protected int getLayoutId() {
        return R.layout.fragment_la_ma_zhuan_qu;
    }

    @Override
    protected void initViews() {
        ll = (LinearLayout) view.findViewById(R.id.lamazhuanqu_ll);
    }

    @Override
    protected void initEvents() {

    }

    @Override
    protected void initDatas() {
    }

}
