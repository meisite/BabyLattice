package qianfeng.com.babylattice.z_other.ui;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.ImageView;

import com.orhanobut.logger.LL;

import java.util.ArrayList;
import java.util.List;

import qianfeng.com.babylattice.R;
import qianfeng.com.babylattice.z_other.constant.Constant;
import qianfeng.com.babylattice.z_other.utils.JumpActivity;
import qianfeng.com.babylattice.z_other.widget.GuideIndexView;


/**
 * 引导页
 */
public class GuideActivity extends AppCompatActivity implements ViewPager.OnPageChangeListener {

    private SharedPreferences sharedPreferences;
    private GuideIndexView guide_index;
    private ViewPager viewPager;
    private GuideAdapter guideAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_guide);

        LL.init();

        sharedPreferences = getSharedPreferences(Constant.FIRST_OPEN_APP, Context.MODE_PRIVATE);
        SharedPreferences.Editor edit = sharedPreferences.edit();
        edit.putBoolean(Constant.IS_FIRST, false);
        edit.commit();

        initData();
        initView();

    }

    private float currentX;
    private float lastX;

    private void initData() {

        list = new ArrayList<>();
        for (int i = 0; i < imageIds.length; i++) {
            ImageView imageView = new ImageView(this);
            imageView.setImageResource(imageIds[i]);
            if (i == 4) {
                imageView.setOnTouchListener(new View.OnTouchListener() {

                    @Override
                    public boolean onTouch(View v, MotionEvent event) {
                        lastX = currentX;
                        if (event.getAction() == MotionEvent.ACTION_MOVE) {
                            currentX = event.getX();
                            if (currentX < lastX) {
                                JumpActivity.jumpToMain(GuideActivity.this);
                                finish();
                                LL.d("ggggggggggggggggg");
                            }
                        }
                        return true;
                    }
                });
            }
            imageView.setScaleType(ImageView.ScaleType.FIT_XY);
            list.add(imageView);
        }
    }

    private int[] imageIds = new int[]{R.mipmap.g_1, R.mipmap.g_2, R.mipmap.g_3, R.mipmap.g_4, R.mipmap.g_5};
    private List<ImageView> list;

    private void initView() {
        guide_index = (GuideIndexView) findViewById(R.id.guide_index_view);
        viewPager = (ViewPager) findViewById(R.id.guide_view_pager);
        viewPager.addOnPageChangeListener(this);
        guideAdapter = new GuideAdapter();
        viewPager.setAdapter(guideAdapter);
    }

    @Override
    public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

    }

    @Override
    public void onPageSelected(int position) {
        guide_index.changeIndex(position);
    }

    @Override
    public void onPageScrollStateChanged(int state) {

    }


    class GuideAdapter extends PagerAdapter {

        @Override
        public int getCount() {
            return list == null ? 0 : list.size();
        }

        @Override
        public boolean isViewFromObject(View view, Object object) {
            return view == object;
        }

        @Override
        public Object instantiateItem(ViewGroup container, int position) {
            ImageView imageView = list.get(position);
            container.addView(imageView);
            return imageView;
        }

        @Override
        public void destroyItem(ViewGroup container, int position, Object object) {
            container.removeView(list.get(position));
        }
    }
}
