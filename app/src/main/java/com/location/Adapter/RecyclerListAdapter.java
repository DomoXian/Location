package com.location.Adapter;

import android.content.Context;
import android.graphics.Color;
import android.support.v4.view.MotionEventCompat;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.location.R;
import com.location.dao.Item;
import com.location.itemHelperLib.ItemTouchHelperViewHolder;
import com.location.itemHelperLib.OnStartDragListener;

/**
 * Created by xianguo on 30/6/16.
 */
public class RecyclerListAdapter extends BaseRecyclerAdapter<Item, RecyclerListAdapter.ItemAdapterViewHolder> {
    private OnStartDragListener mListener;

    public RecyclerListAdapter(Context context) {
        super(context);
    }

    public void setListener(OnStartDragListener listener) {
        mListener = listener;
    }

    @Override
    public ItemAdapterViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.
                from(parent.getContext()).inflate(R.layout.item_helper,parent,false);
        ItemAdapterViewHolder holder = new ItemAdapterViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(final ItemAdapterViewHolder holder, int position) {
        holder.iv.setImageResource(R.mipmap.ic_launcher);
        holder.tv.setText(mList.get(position).text);
        holder.itemView.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if(MotionEventCompat.getActionMasked(event) == MotionEvent.ACTION_DOWN){
                    if(mListener!=null){
                        mListener.onStartDrag(holder);
                    }
                }
                return false;
            }
        });
    }

    public static class ItemAdapterViewHolder extends RecyclerView.ViewHolder implements ItemTouchHelperViewHolder {
        ImageView iv;
        TextView tv;
        public ItemAdapterViewHolder(View itemView) {
            super(itemView);
            iv = (ImageView) itemView.findViewById(R.id.iv_image);
            tv = (TextView) itemView.findViewById(R.id.tv_text);
        }

        @Override
        public void onItemSelected() {
            itemView.setBackgroundColor(Color.GRAY);
        }

        @Override
        public void ItemClear() {
            itemView.setBackgroundColor(0);
        }
    }
}
