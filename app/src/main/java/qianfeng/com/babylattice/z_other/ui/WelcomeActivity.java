package qianfeng.com.babylattice.z_other.ui;

import android.content.Context;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.WindowManager;

import qianfeng.com.babylattice.R;
import qianfeng.com.babylattice.z_other.constant.Constant;
import qianfeng.com.babylattice.z_other.utils.JumpActivity;


/**
 * 欢迎页
 */
public class WelcomeActivity extends AppCompatActivity {

    private SharedPreferences sharedPreferences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_welcome);

        sharedPreferences = getSharedPreferences(Constant.FIRST_OPEN_APP, Context.MODE_PRIVATE);
        boolean isFirst = sharedPreferences.getBoolean(Constant.IS_FIRST, true);

        if (isFirst) {
            JumpActivity.jumpToGuide(this);
            finish();
        } else {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    JumpActivity.jumpToMain(WelcomeActivity.this);
                    finish();
                }
            }).start();
        }

    }
}
