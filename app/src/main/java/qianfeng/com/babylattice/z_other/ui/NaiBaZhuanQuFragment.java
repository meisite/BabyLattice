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
public class NaiBaZhuanQuFragment extends BaseFragment {

    private SideMenu sideMenu;
    private LinearLayout ll;

    public NaiBaZhuanQuFragment(SideMenu sideMenu) {
        this.sideMenu = sideMenu;
    }

    public NaiBaZhuanQuFragment() {
    }

    @Override
    protected int getLayoutId() {
        return R.layout.fragment_nai_ba_zhuan_qu;
    }

    @Override
    protected void initViews() {
        ll = (LinearLayout) view.findViewById(R.id.naibazhuanqu_ll);
    }

    @Override
    protected void initEvents() {

    }

    @Override
    protected void initDatas() {
    }

}
