package qianfeng.com.babylattice.a_homepage.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.List;

import qianfeng.com.babylattice.R;
import qianfeng.com.babylattice.a_homepage.bean.HomePageProductList;

/**
 * Created by Administrator on 2016/5/28 0028.
 */
public class ListViewAdapter extends BaseAdapter {

    private List<HomePageProductList> list;
    private Context context;

    public ListViewAdapter(Context context, List<HomePageProductList> list) {
        this.context = context;
        this.list = list;
    }

    public ListViewAdapter() {
    }

    @Override
    public int getCount() {
        return list == null ? 0 : list.size();
    }

    @Override
    public HomePageProductList getItem(int position) {
        return list.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            convertView = LayoutInflater.from(context).inflate(R.layout.home_page_listview_item, parent, false);
            new ViewHolder(convertView);
        }
        ViewHolder viewHolder = (ViewHolder) convertView.getTag();

        Glide.with(context).load(getItem(position).getImage_url()).into(viewHolder.imageView);
        viewHolder.tv_name.setText(getItem(position).getName());
        viewHolder.tv_store_price.setText("￥" + getItem(position).getStore_price());
        viewHolder.tv_market_price.setText(getItem(position).getCurrency_symbol() + getItem(position).getCurrency_market_price());
        viewHolder.tv_country_name.setText(getItem(position).getSellcountry_info().getName());
        viewHolder.tv_refer_text_url.setText(getItem(position).getRefer_text_url());
        return convertView;
    }

    class ViewHolder {
        ImageView imageView;
        TextView tv_name, tv_store_price, tv_market_price, tv_country_name, tv_refer_text_url;

        public ViewHolder(View view) {
            imageView = (ImageView) view.findViewById(R.id.homePage_bikan_listView_iv);
            tv_name = (TextView) view.findViewById(R.id.homePage_bikan_listView_tv_name);
            tv_store_price = (TextView) view.findViewById(R.id.homePage_bikan_listView_tv_store_price);
            tv_market_price = (TextView) view.findViewById(R.id.homePage_bikan_listView_tv_market_price);
            tv_country_name = (TextView) view.findViewById(R.id.homePage_bikan_listView_tv_country_name);
            tv_refer_text_url = (TextView) view.findViewById(R.id.homePage_bikan_listView_tv_refer_text_url);
            view.setTag(this);
        }
    }
}
