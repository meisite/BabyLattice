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
public class MeiShiBaoJianFragment extends BaseFragment {

    private SideMenu sideMenu;
    private LinearLayout ll;

    public MeiShiBaoJianFragment(SideMenu sideMenu) {
        this.sideMenu = sideMenu;
    }

    public MeiShiBaoJianFragment() {
    }

    @Override
    protected int getLayoutId() {
        return R.layout.fragment_mei_shi_bao_jian;
    }

    @Override
    protected void initViews() {
        ll = (LinearLayout) view.findViewById(R.id.meishibaojian_ll);
    }

    @Override
    protected void initEvents() {

    }

    @Override
    protected void initDatas() {
    }

}
