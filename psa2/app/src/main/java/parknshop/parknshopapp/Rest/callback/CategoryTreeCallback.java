package parknshop.parknshopapp.Rest.callback;

/**
 * Created by kwongyuenpan on 14/3/16.
 */

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.orhanobut.hawk.Hawk;

import parknshop.parknshopapp.Model.Category.CategoryTree;
import parknshop.parknshopapp.MyApplication;
import parknshop.parknshopapp.Rest.event.CategoryTreeEvent;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class CategoryTreeCallback implements Callback<JsonElement> {

    CategoryTreeEvent mCategoryTreeEvent = new CategoryTreeEvent();

    @Override
    public void onResponse(Call<JsonElement> call, Response<JsonElement> response) {
        if(response != null && response.isSuccess()){
            CategoryTree categoryTree = new Gson().fromJson(response.body(), CategoryTree.class);
            if (categoryTree != null) {
                mCategoryTreeEvent.setCategoryTree(categoryTree);
                mCategoryTreeEvent.setSuccess(true);
                Hawk.put("categoryTree", categoryTree);
            }
        }else{
            mCategoryTreeEvent.setMessage(response.message());
        }
        MyApplication.getInstance().mBus.post(mCategoryTreeEvent);

    }

    @Override
    public void onFailure(Call<JsonElement> call, Throwable t) {
        mCategoryTreeEvent.setMessage(t.getMessage());
        MyApplication.getInstance().mBus.post(mCategoryTreeEvent);
    }
}
