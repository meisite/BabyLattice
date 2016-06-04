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
public class DaPaiNaiFenFragment extends BaseFragment {

    private SideMenu sideMenu;
    private LinearLayout ll;
    private List<SideMenu.CategoryInfoSBean> category_info_s;

    public DaPaiNaiFenFragment(SideMenu sideMenu) {
        this.sideMenu = sideMenu;
    }

    public DaPaiNaiFenFragment() {
    }

    @Override
    protected int getLayoutId() {
        return R.layout.fragment_da_pai_nai_fen;
    }

    @Override
    protected void initViews() {
        ll = (LinearLayout) view.findViewById(R.id.dapainaifen_ll);
    }

    @Override
    protected void initEvents() {

    }

    @Override
    protected void initDatas() {
        category_info_s = sideMenu.getCategory_info_s();
        for (int i = 0; i < category_info_s.size(); i++) {
            SideMenuFenLeiLayout sideMenuFenLeiLayout = new SideMenuFenLeiLayout(getActivity(), category_info_s, i);
            ll.addView(sideMenuFenLeiLayout);
        }
    }

}
