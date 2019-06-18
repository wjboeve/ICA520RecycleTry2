package com.example.ica520recycletry2;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.LinkedList;

public class IntListAdapter extends
        RecyclerView.Adapter<IntListAdapter.IntViewHolder> {

    private final LinkedList<String> mIntList;
    private LayoutInflater mInflater;

    public IntListAdapter(Context context,LinkedList<String> intList){
        mInflater = LayoutInflater.from(context);
        this.mIntList = intList;
    }

    @NonNull
    @Override
    public IntViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View mItemView = mInflater.inflate(R.layout.list_item,viewGroup,false);
        return new IntViewHolder(mItemView,this);
    }

    @Override
    public void onBindViewHolder(@NonNull IntViewHolder intViewHolder, int i) {
        String mCurrent = mIntList.get(i);
        intViewHolder.intItemView.setText(mCurrent);
    }

    @Override
    public int getItemCount() {
        return mIntList.size();
    }

    class IntViewHolder extends RecyclerView.ViewHolder{

        public final TextView intItemView;
        final IntListAdapter mAdapter;

        public IntViewHolder(View itemView,IntListAdapter adapter) {
            super(itemView);
            intItemView = itemView.findViewById(R.id.number);
            this.mAdapter = adapter;
        }
    }
}
