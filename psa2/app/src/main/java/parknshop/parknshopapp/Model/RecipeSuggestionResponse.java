package parknshop.parknshopapp.Model;

import java.util.ArrayList;

/**
 * Created by chrisyu on 5/5/16.
 */
public class RecipeSuggestionResponse {

    public ArrayList<RecipeSuggestionData> data = new ArrayList<RecipeSuggestionData>();

    public class RecipeSuggestionData {
        int id;
        String updatedAt;
        int recipeId;
        String productId;
        int sequence;

        public String getProductId() {
            return productId;
        }
    }

    public ArrayList<RecipeSuggestionData> getData() {
        return data;
    }
}

/*{
  "status": {
    "code": 200,
    "message": "Success",
    "systime": 1462362956
  },
  "data": [
    {
      "id": 4,
      "updatedAt": "2016-04-01 10:18:46",
      "recipeId": 1,
      "productId": "116155",
      "sequence": 1
    },
    {
      "id": 5,
      "updatedAt": "2016-04-01 10:18:46",
      "recipeId": 1,
      "productId": "118122",
      "sequence": 1
    },
    {
      "id": 6,
      "updatedAt": "2016-04-01 10:18:46",
      "recipeId": 1,
      "productId": "116094",
      "sequence": 1
    }
  ]
}*/