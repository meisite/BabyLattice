package qianfeng.com.babylattice.z_other.ui;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import qianfeng.com.babylattice.R;
import qianfeng.com.babylattice.z_other.utils.ActivityAmin;

public class SideMenuActivity extends AppCompatActivity implements View.OnClickListener {

    private TextView back;
    private RadioGroup radioGroup;
    private RadioButton rb_fenlei, rb_pinpai;
    private EditText search_et;
    private TextView search_tv;
    private FragmentManager fragmentManager;
    private Fragment[] fragments;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_side_menu);
        initViews();
        initFragment();
        initEvents();
    }

    private void initFragment() {
        fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragments = new Fragment[]{new SideMenuFenLeiFragment(), new SideMenuPinPaiFragment()};
        for (int i = 0; i < fragments.length; i++) {
            Fragment fragment = fragments[i];
            fragmentTransaction.add(R.id.side_menu_fl, fragment, i + "");
            fragmentTransaction.hide(fragment);
        }
        fragmentTransaction.show(fragments[0]);
        fragmentTransaction.commit();
    }

    private int lastIndex;

    private void initEvents() {
        back.setOnClickListener(this);
        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                int currentIndex;
                FragmentTransaction transaction = fragmentManager.beginTransaction();
                switch (checkedId) {
                    case R.id.side_menu_rb_fenlei:
                        currentIndex = 0;
                        break;
                    case R.id.side_menu_rb_pinpai:
                        currentIndex = 1;
                        break;
                    default:
                        currentIndex = 0;
                }
                transaction.hide(fragments[lastIndex]);
                transaction.show(fragments[currentIndex]);
                transaction.commit();
                lastIndex = currentIndex;
            }
        });
    }

    private void initViews() {
        back = (TextView) findViewById(R.id.side_menu_back_tv);
        radioGroup = (RadioGroup) findViewById(R.id.side_menu_rg);
        rb_fenlei = (RadioButton) findViewById(R.id.side_menu_rb_fenlei);
        rb_fenlei.setChecked(true);
        rb_pinpai = (RadioButton) findViewById(R.id.side_menu_rb_pinpai);
        search_et = (EditText) findViewById(R.id.side_menu_search_et);
        search_tv = (TextView) findViewById(R.id.side_menu_search_tv);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.side_menu_back_tv:
                finish();
                break;
        }
    }
}
