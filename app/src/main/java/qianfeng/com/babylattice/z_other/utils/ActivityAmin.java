package qianfeng.com.babylattice.z_other.utils;

import android.app.Activity;

import qianfeng.com.babylattice.R;

/**
 * Created by Administrator on 2016/6/2 0002.
 *
 * Activity跳转动画
 */
public class ActivityAmin {

    public static void startActivityAmin(Activity activity) {
        activity.overridePendingTransition(R.anim.slide_right_in, R.anim.slide_left_out);
    }

    public static void finishActivityAmin(Activity activity) {
        activity.overridePendingTransition(R.anim.slide_left_in, R.anim.slide_right_out);
    }
}
