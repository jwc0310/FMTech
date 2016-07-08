package parknshop.parknshopapp.Model;

import java.io.Serializable;

/**
 * Created by Howard Chang on 2015/11/4
 */
public class EdmDetailSectionInfo implements Serializable{
    private String title;
    private int start_page;
    private int end_page;

    public String getTitle() {
        return title!=null?title:"";
    }

    public int getStartPage() {
        return start_page;
    }

    public int getEndPage() {
        return end_page;
    }
}
