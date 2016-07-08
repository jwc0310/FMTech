package parknshop.parknshopapp.Rest.event;

import parknshop.parknshopapp.Model.RecipeDetailResponse;
import parknshop.parknshopapp.Model.RecipeSuggestionResponse;

/**
 * Created by chrisyu on 5/5/16.
 */
public class RecipeSuggestionEvent extends BaseEvent{
    RecipeSuggestionResponse response;
    RecipeDetailResponse recipeDetailResponse;

    public void setRecipeDetailResponse(RecipeDetailResponse recipeDetailResponse) {
        this.recipeDetailResponse = recipeDetailResponse;
    }

    public RecipeDetailResponse getRecipeDetailResponse() {
        return this.recipeDetailResponse;
    }

    public void setResponse(RecipeSuggestionResponse response) {
        this.response = response;
    }

    public RecipeSuggestionResponse getResponse() {
        return response;
    }
}
