package qianfeng.com.babylattice.z_other.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.List;

import qianfeng.com.babylattice.R;
import qianfeng.com.babylattice.z_other.bean.SideMenu;

/**
 * Created by Administrator on 2016/6/3 0003.
 */
public class SideMenuFenLeiAdapter extends RecyclerView.Adapter<SideMenuFenLeiAdapter.FenLeiViewHolder> {

    private Context context;
    private List<SideMenu.CategoryInfoSBean> category_info_s;
    private int i;
    private LayoutInflater inflater;

    public SideMenuFenLeiAdapter(Context context, List<SideMenu.CategoryInfoSBean> category_info_s, int i) {
        this.context = context;
        this.category_info_s = category_info_s;
        this.i = i;
        inflater = LayoutInflater.from(context);
    }

    @Override
    public FenLeiViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.view_fenlei_recyclerview_item, null);
        return new FenLeiViewHolder(view);
    }

    @Override
    public void onBindViewHolder(FenLeiViewHolder holder, int position) {
        Glide.with(context).load(category_info_s.get(i).getChild_category().get(position).getCategory_pic_link()).into(holder.imageview);
        holder.textView.setText(category_info_s.get(i).getChild_category().get(position).getCategory_name());
    }

    @Override
    public int getItemCount() {
        return category_info_s.get(i).getChild_category().size();
    }


    class FenLeiViewHolder extends RecyclerView.ViewHolder {

        ImageView imageview;
        TextView textView;

        public FenLeiViewHolder(View itemView) {
            super(itemView);

            imageview = (ImageView) itemView.findViewById(R.id.item_imageView);
            textView = (TextView) itemView.findViewById(R.id.item_textView);
        }
    }
}
