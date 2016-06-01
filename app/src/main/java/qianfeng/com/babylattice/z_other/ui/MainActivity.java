package qianfeng.com.babylattice.z_other.ui;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.RadioGroup;

import com.orhanobut.logger.LL;

import qianfeng.com.babylattice.R;
import qianfeng.com.babylattice.a_homepage.ui.HomePageFragment;
import qianfeng.com.babylattice.b_specialoffer.ui.SpecialOfferFragment;
import qianfeng.com.babylattice.c_latticezone.ui.LatticeZoneFragment;
import qianfeng.com.babylattice.d_shoppingcart.ui.ShoppingCartFragment;
import qianfeng.com.babylattice.e_me.ui.MeFragment;

/**
 * 主页
 */
public class MainActivity extends AppCompatActivity implements RadioGroup.OnCheckedChangeListener {

    private RadioGroup radioGroup;
    private FragmentManager fragmentManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        LL.init();
        fragmentManager = getSupportFragmentManager();

        initView();
        initFragment();
        initEvent();
    }

    private Fragment[] fragments = new Fragment[]{new HomePageFragment(), new SpecialOfferFragment(),
            new LatticeZoneFragment(), new ShoppingCartFragment(), new MeFragment()};

    private void initFragment() {
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

        for (int i = 0; i < fragments.length; i++) {
            Fragment fragment = fragments[i];
            fragmentTransaction.add(R.id.homePage_frameLayout, fragment, "" + i);
            fragmentTransaction.hide(fragment);
        }

        fragmentTransaction.show(fragments[0]);
        fragmentTransaction.commit();
    }

    private void initEvent() {
        radioGroup.setOnCheckedChangeListener(this);
    }

    private void initView() {
        radioGroup = (RadioGroup) findViewById(R.id.homePage_radioGroup);
    }

    private int lastIndex;

    @Override
    public void onCheckedChanged(RadioGroup group, int checkedId) {

        int currentIndex;

        FragmentTransaction transaction = fragmentManager.beginTransaction();

        switch (checkedId) {
            case R.id.rb_homePage:
                currentIndex = 0;
                break;
            case R.id.rb_specialOffer:
                currentIndex = 1;
                break;
            case R.id.rb_latticeZone:
                currentIndex = 2;
                break;
            case R.id.rb_shoppingCart:
                currentIndex = 3;
                break;
            case R.id.rb_me:
                currentIndex = 4;
                break;
            default:
                currentIndex = 0;
                break;
        }

        transaction.hide(fragments[lastIndex]);
        transaction.show(fragments[currentIndex]);
        transaction.commit();
        lastIndex = currentIndex;
    }
}

