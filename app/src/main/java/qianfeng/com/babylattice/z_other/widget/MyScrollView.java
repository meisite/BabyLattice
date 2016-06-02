package qianfeng.com.babylattice.z_other.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ScrollView;

import com.orhanobut.logger.LL;

/**
 * Created by Administrator on 2016/6/1 0001.
 */
public class MyScrollView extends ScrollView {

    public MyScrollView(Context context) {
        super(context);
    }

    public MyScrollView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    protected void onScrollChanged(int l, int t, int oldl, int oldt) {
        super.onScrollChanged(l, t, oldl, oldt);

        if (iScrollViewCallBack != null) {
            iScrollViewCallBack.distance(l, t, oldl, oldt);
        }
    }

    public interface IScrollViewCallBack {
        void distance(int l, int t, int oldl, int oldt);
    }

    private IScrollViewCallBack iScrollViewCallBack;

    public void setiScrollViewCallBack(IScrollViewCallBack iScrollViewCallBack) {
        this.iScrollViewCallBack = iScrollViewCallBack;
    }
}
