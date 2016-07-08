package parknshop.parknshopapp.Base.Json;

import android.util.Log;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.lang.reflect.Type;

/**
 * Created by chrisyu on 15/12/10.
 */
public class Parser<T> {
    Class<T> typeParameterClass;
    Type arraylistType = null;

    public Parser(Class<T> typeParameterClass) {
        this.typeParameterClass = typeParameterClass;
    }

    public Parser(Type arraylistType) {
        this.arraylistType = arraylistType;
    }
    private static Gson gson = new GsonBuilder().create();

    public T getObject(String jsonString) {
        try {
            if(arraylistType != null)
                return gson.fromJson(jsonString, arraylistType);

            return gson.fromJson(jsonString, typeParameterClass);
        } catch (Exception e) {
            //prompt error
            Log.i("jsonerror", "jsonerror " + e.getMessage());
            return null;
        }
    }
}
