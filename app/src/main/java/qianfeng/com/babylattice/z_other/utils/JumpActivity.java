package qianfeng.com.babylattice.z_other.utils;

import android.app.Activity;
import android.content.Intent;

import qianfeng.com.babylattice.z_other.ui.GuideActivity;
import qianfeng.com.babylattice.z_other.ui.MainActivity;


/**
 * Created by Administrator on 2016/5/26 0026.
 *
 * 跳转工具类
 */
public class JumpActivity {

    public static void jumpToGuide(Activity activity) {
        Intent intent = new Intent(activity, GuideActivity.class);
        activity.startActivity(intent);
    }

    public static void jumpToMain(Activity activity) {
        Intent intent = new Intent(activity, MainActivity.class);
        activity.startActivity(intent);
    }
}
