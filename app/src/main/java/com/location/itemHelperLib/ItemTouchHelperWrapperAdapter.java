package com.location.itemHelperLib;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;

import com.location.Adapter.BaseRecyclerAdapter;

import java.util.Collections;

/**
 * Created by xianguo on 30/6/16.
 * 包装类
 */
public class ItemTouchHelperWrapperAdapter extends BaseRecyclerAdapter implements ItemTouchHelperAdapterListener {

    private BaseRecyclerAdapter mAdapter;


    public ItemTouchHelperWrapperAdapter(Context context, BaseRecyclerAdapter adapter) {
        super(context);
        this.mAdapter = adapter;
    }


    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return mAdapter.onCreateViewHolder(parent, viewType);
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        mAdapter.onBindViewHolder(holder, position);
    }

    @Override
    public int getItemCount() {
        return mAdapter.getItemCount();
    }

    @Override
    public boolean onItemMove(int fromPosition, int toPosition) {
        Collections.swap(mAdapter.getData(), fromPosition, toPosition);
        notifyItemMoved(fromPosition, toPosition);
        return true;
    }

    @Override
    public void onItemDismiss(int position) {
        mAdapter.getData().remove(position);
        notifyItemRemoved(position);
    }
}
