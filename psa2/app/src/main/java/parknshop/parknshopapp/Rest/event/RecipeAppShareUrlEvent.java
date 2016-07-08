package parknshop.parknshopapp.Rest.event;

/**
 * Created by chrisyu on 14/5/16.
 */
public class RecipeAppShareUrlEvent extends BaseEvent {
    public String htmlData;

    public String getHtmlData() {
        return htmlData;
    }

    public void setHtmlData(String htmlData) {
        this.htmlData = htmlData;
    }
}
