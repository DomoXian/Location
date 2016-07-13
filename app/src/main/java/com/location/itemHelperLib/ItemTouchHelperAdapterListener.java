package com.location.itemHelperLib;

/**
 * Created by xianguo on 30/6/16.
 */
public interface ItemTouchHelperAdapterListener {


    boolean onItemMove(int fromPosition,int toPosition);

    void onItemDismiss(int position);
}
