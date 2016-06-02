package qianfeng.com.babylattice.a_homepage.ui;


import android.annotation.SuppressLint;
import android.support.v4.app.Fragment;
import android.view.View;
import android.widget.ListView;

import java.util.List;

import qianfeng.com.babylattice.R;
import qianfeng.com.babylattice.a_homepage.adapter.ListViewAdapter;
import qianfeng.com.babylattice.a_homepage.bean.HomePageProductList;
import qianfeng.com.babylattice.z_other.ui.BaseFragment;

/**
 * A simple {@link Fragment} subclass.
 */
@SuppressLint("ValidFragment")
public class MeiJiaFragment extends BaseFragment {

    private ListView listView;
    private List<HomePageProductList> list;
    private ListViewAdapter listViewAdapter;

    public MeiJiaFragment(List<HomePageProductList> list) {
        this.list = list;
    }

    public MeiJiaFragment() {
    }

    @Override
    protected int getLayoutId() {
        return R.layout.fragment_mei_jia;
    }

    @Override
    protected void initViews() {
        listView = (ListView) view.findViewById(R.id.meijia_listView);
    }

    @Override
    protected void initEvents() {

    }

    @Override
    protected void initDatas() {
        listViewAdapter = new ListViewAdapter(getActivity(), list);
        listView.setAdapter(listViewAdapter);
    }

}
