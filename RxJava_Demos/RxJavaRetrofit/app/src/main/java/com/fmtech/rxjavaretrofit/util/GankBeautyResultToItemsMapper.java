package com.fmtech.rxjavaretrofit.util;

import com.fmtech.rxjavaretrofit.model.GankBeauty;
import com.fmtech.rxjavaretrofit.model.GankBeautyResult;
import com.fmtech.rxjavaretrofit.model.Image;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import rx.functions.Func1;

/**
 * ==================================================================
 * Copyright (C) 2016 FMTech All Rights Reserved.
 *
 * @author Drew.Chiang
 * @version v1.0.0
 * @email chiangchuna@gmail.com
 * @create_date 2016/7/4 23:09
 * @description ${todo}
 * <p/>
 * ==================================================================
 */

public class GankBeautyResultToItemsMapper implements Func1<GankBeautyResult, List<Image>> {

    private static GankBeautyResultToItemsMapper sInstance = new GankBeautyResultToItemsMapper();

    private GankBeautyResultToItemsMapper(){

    }

    public static GankBeautyResultToItemsMapper getInstance(){
        return sInstance;
    }

    @Override
    public List<Image> call(GankBeautyResult gankBeautyResult) {
        List<GankBeauty> beauties = gankBeautyResult.beauties;
        List<Image> images = new ArrayList<>();
        SimpleDateFormat inputFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SS'Z'");
        SimpleDateFormat outputFormat = new SimpleDateFormat("yy/MM/dd HH:mm:ss");
        for(GankBeauty beauty : beauties){
            Image image = new Image();
            try {
                Date date = inputFormat.parse(beauty.createdAt);
                image.description = outputFormat.format(date);
            } catch (ParseException e) {
                e.printStackTrace();
                image.description = "Fantastic baby.";
            }
            image.image_url = beauty.url;
            images.add(image);
        }
        return images;
    }
}
