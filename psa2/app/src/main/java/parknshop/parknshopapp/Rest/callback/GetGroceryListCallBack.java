package parknshop.parknshopapp.Rest.callback;

import parknshop.parknshopapp.Model.GroceryList;
import parknshop.parknshopapp.MyApplication;
import parknshop.parknshopapp.Rest.event.GroceryListEvent;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by kwongyuenpan on 16/3/16.
 */
public class GetGroceryListCallBack implements Callback<GroceryList> {

    GroceryListEvent groceryListEvent = new GroceryListEvent();

    @Override
    public void onResponse(Call<GroceryList> call, Response<GroceryList> response) {
        if(response != null && response.isSuccess()){
            GroceryList groceryList = response.body();
            if (groceryList != null) {
                groceryListEvent.setGroceryList(groceryList);
                groceryListEvent.setSuccess(true);
            }
        } else {
            groceryListEvent.setMessage(response.message());
        }
        MyApplication.getInstance().mBus.post(groceryListEvent);

    }

    @Override
    public void onFailure(Call<GroceryList> call, Throwable t) {
        groceryListEvent.setMessage(t.getMessage());
        MyApplication.getInstance().mBus.post(groceryListEvent);
    }
}
