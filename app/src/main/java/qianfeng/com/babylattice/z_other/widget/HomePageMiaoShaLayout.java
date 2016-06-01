package qianfeng.com.babylattice.z_other.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;

import java.util.List;

import qianfeng.com.babylattice.R;
import qianfeng.com.babylattice.a_homepage.bean.MiaoSha;


/**
 * Created by Administrator on 2016/5/27 0027.
 */
public class HomePageMiaoShaLayout extends LinearLayout {

    private HomePageMiaoShaItem miaosha01, miaosha02, miaosha03, miaosha04;

    public HomePageMiaoShaLayout(Context context, List<MiaoSha> list) {
        super(context);

        inflate(context, R.layout.widget_home_page_miaosha_layout, this);
        miaosha01 = (HomePageMiaoShaItem) findViewById(R.id.miaoshao_item01);
        miaosha02 = (HomePageMiaoShaItem) findViewById(R.id.miaoshao_item02);
        miaosha03 = (HomePageMiaoShaItem) findViewById(R.id.miaoshao_item03);
        miaosha04 = (HomePageMiaoShaItem) findViewById(R.id.miaoshao_item04);

        setMiaoShaLayout(list);
    }

    private void setMiaoShaLayout(List<MiaoSha> list) {
        miaosha01.setMiaoShaItem(list.get(0));
        miaosha02.setMiaoShaItem(list.get(1));
        miaosha03.setMiaoShaItem(list.get(2));
        miaosha04.setMiaoShaItem(list.get(3));
    }

    public HomePageMiaoShaLayout(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

}
