package qianfeng.com.babylattice.z_other.widget;

import android.content.Context;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.List;

import qianfeng.com.babylattice.R;
import qianfeng.com.babylattice.z_other.adapter.SideMenuFenLeiAdapter;
import qianfeng.com.babylattice.z_other.bean.SideMenu;

/**
 * Created by Administrator on 2016/6/3 0003.
 */
public class SideMenuFenLeiLayout extends LinearLayout {

    private Context context;
    private List<SideMenu.CategoryInfoSBean> category_info_s;
    private int i;
    private TextView tv;
    private RecyclerView recyclerView;

    public SideMenuFenLeiLayout(Context context, List<SideMenu.CategoryInfoSBean> category_info_s, int i) {
        super(context);
        this.context = context;
        this.category_info_s = category_info_s;
        this.i = i;

        inflate(context, R.layout.widget_fenlei_layout, this);

        tv = (TextView) findViewById(R.id.fenlei_layout_tv);
        recyclerView = (RecyclerView) findViewById(R.id.fenlei_recyclerView);

        setLayout();
    }

    private void setLayout() {
        tv.setText(category_info_s.get(i).getCategory_name());

        GridLayoutManager gridLayoutManager = new GridLayoutManager(context, 3);
        recyclerView.setLayoutManager(gridLayoutManager);
        recyclerView.setAdapter(new SideMenuFenLeiAdapter(context, category_info_s, i));
    }

    public SideMenuFenLeiLayout(Context context, AttributeSet attrs) {
        super(context, attrs);
    }
}
