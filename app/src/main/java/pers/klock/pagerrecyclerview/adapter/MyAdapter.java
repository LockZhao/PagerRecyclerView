package pers.klock.pagerrecyclerview.adapter;

import android.graphics.Color;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import pers.klock.pagerrecyclerview.R;

/**
 * Created by ZhaoRongZhi on 2017-04-25
 *
 * @descr
 */

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder> {

    private static List<String> data = new ArrayList<>();

    private static int[] colors;

    static {
        for (int i = 1; i <= 47; i++) {
            data.add(i + "");
        }

        colors = new int[]{Color.parseColor("#f69988"),
                Color.parseColor("#72d572"),
                Color.parseColor("#ffe082")};
    }

    @Override
    public MyViewHolder onCreateViewHolder (ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.layout_item, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder (MyViewHolder holder, int position) {
        final String title = data.get(position);
        holder.tv_title.setText(title);
        holder.tv_title.setBackgroundColor(colors[position % 3]);
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View v) {
                Toast.makeText(v.getContext(), "item" + title + " 被点击了", Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public int getItemCount () {
        return data.size();
    }


    class MyViewHolder extends RecyclerView.ViewHolder {
        TextView tv_title;

        public MyViewHolder (View itemView) {
            super(itemView);
            tv_title = (TextView) itemView.findViewById(R.id.tv_title);
        }
    }
}
