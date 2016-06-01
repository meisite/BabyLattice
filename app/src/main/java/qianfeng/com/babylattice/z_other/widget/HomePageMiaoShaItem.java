package qianfeng.com.babylattice.z_other.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import qianfeng.com.babylattice.R;
import qianfeng.com.babylattice.a_homepage.bean.MiaoSha;


/**
 * Created by Administrator on 2016/5/27 0027.
 *
 * 首页秒杀的单个View
 */
public class HomePageMiaoShaItem extends LinearLayout {

    private ImageView iv;
    private TextView price_tv;
    private TextView tag_tv;

    public HomePageMiaoShaItem(Context context) {
        super(context);
    }

    public HomePageMiaoShaItem(Context context, AttributeSet attrs) {
        super(context, attrs);

        inflate(context, R.layout.widget_home_page_miaosha_item, this);
        iv = (ImageView) findViewById(R.id.homePage_miaosha_item_iv);
        price_tv = (TextView) findViewById(R.id.homePage_miaosha_item_price_tv);
        tag_tv = (TextView) findViewById(R.id.homePage_miaosha_item_tag_tv);
    }

    public void setMiaoShaItem(MiaoSha miaoSha) {
        Glide.with(getContext()).load(miaoSha.getProduct_pic()).into(iv);
        price_tv.setText("￥" + miaoSha.getActivity_price());
        tag_tv.setText(miaoSha.getAd_words());
    }
}
