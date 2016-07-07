package com.fmtech.rxjavaretrofit.modules.cache;

import com.fmtech.rxjavaretrofit.FMApplication;
import com.fmtech.rxjavaretrofit.model.Image;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
import java.util.List;

/**
 * ==================================================================
 * Copyright (C) 2016 FMTech All Rights Reserved.
 *
 * @author Drew.Chiang
 * @version v1.0.0
 * @email chiangchuna@gmail.com
 * @create_date 2016/7/7 21:37
 * @description ${todo}
 * <p/>
 * ==================================================================
 */

public class DataBase {
    private static String DATA_BASE_NAME = "data.db";

    private static DataBase sInstance;

    File mDataFile = new File(FMApplication.instance().getFilesDir(), DATA_BASE_NAME);
    Gson mGson = new Gson();

    private DataBase(){

    }

    public static DataBase instance(){
        if(null == sInstance){
            sInstance = new DataBase();
        }
        return sInstance;
    }


    public List<Image> readImagesInfos(){
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        try {
            Reader reader = new FileReader(mDataFile);
            return mGson.fromJson(reader, new TypeToken<List<Image>>(){}.getType());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            return null;
        }
    }

    public void writeImagesInfos(List<Image> imageList){
        String json = mGson.toJson(imageList);
        try {
            if(!mDataFile.exists()){
                try {
                    mDataFile.createNewFile();
                } catch (IOException e) {
                    e.printStackTrace();
                }

                Writer writer = new FileWriter(mDataFile);
                writer.write(json);
                writer.flush();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void deleteDataBase(){
        mDataFile.delete();
    }
}
