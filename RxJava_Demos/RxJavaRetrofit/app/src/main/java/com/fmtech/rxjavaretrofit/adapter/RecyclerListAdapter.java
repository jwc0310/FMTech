package com.fmtech.rxjavaretrofit.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.fmtech.rxjavaretrofit.R;
import com.fmtech.rxjavaretrofit.model.Image;

import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * ==================================================================
 * Copyright (C) 2016 FMTech All Rights Reserved.
 *
 * @author Drew.Chiang
 * @version v1.0.0
 * @email chiangchuna@gmail.com
 * @create_date 2016/7/3 20:33
 * @description ${todo}
 * <p/>
 * ==================================================================
 */

public class RecyclerListAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    private List<Image> mImages;

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.grid_item, parent, false);
        return new RecyclerViewHolder(view);
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        RecyclerViewHolder viewHolder = (RecyclerViewHolder)holder;
        Image image = mImages.get(position);
        viewHolder.description.setText(image.description);
        Glide.with(viewHolder.imageView.getContext()).load(image.image_url).into(viewHolder.imageView);
    }

    @Override
    public int getItemCount() {
        return null == mImages ? 0:mImages.size();
    }

    public void setImages(List<Image> images){
        mImages = images;
        notifyDataSetChanged();
    }

    class RecyclerViewHolder extends RecyclerView.ViewHolder{
        @Bind(R.id.imageIv)
        ImageView imageView;

        @Bind(R.id.descriptionTv)
        TextView description;

        public RecyclerViewHolder(View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
        }
    }
}
