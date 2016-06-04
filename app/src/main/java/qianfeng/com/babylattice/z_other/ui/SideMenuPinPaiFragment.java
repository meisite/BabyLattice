package qianfeng.com.babylattice.z_other.ui;


import android.support.v4.app.Fragment;
import android.view.View;
import android.widget.ListView;

import com.orhanobut.logger.LL;
import com.squareup.okhttp.Request;
import com.zhy.http.okhttp.callback.ResultCallback;
import com.zhy.http.okhttp.request.OkHttpRequest;

import org.json.JSONException;
import org.json.JSONObject;

import qianfeng.com.babylattice.R;
import qianfeng.com.babylattice.z_other.constant.Constant;

/**
 * A simple {@link Fragment} subclass.
 */
public class SideMenuPinPaiFragment extends BaseFragment {

    private ListView listView;

    @Override
    protected int getLayoutId() {
        return R.layout.fragment_side_menu_pin_pai;
    }

    @Override
    protected void initViews() {
        listView = (ListView) view.findViewById(R.id.side_menu_pinpai_listView);
    }

    @Override
    protected void initEvents() {

    }

    @Override
    protected void initDatas() {
        new OkHttpRequest.Builder().url(Constant.SIDE_MENU_PINPAI_URL).get(
                new ResultCallback<String>() {
                    @Override
                    public void onError(Request request, Exception e) {
                        LL.d("侧边栏菜单品牌数据加载失败.....");
                    }

                    @Override
                    public void onResponse(String response) {
                        LL.d("侧边栏菜单品牌数据加载成功.....");
                        try {
                            JSONObject root = new JSONObject(response);
                            String msg = root.getString("msg");
                            if ("成功".equals(msg)) {
                                
                            }
                        } catch (JSONException e) {
                            e.printStackTrace();
                        }
                    }
                });
    }

}
