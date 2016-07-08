package parknshop.parknshopapp.Model;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Howard Chang on 2015/11/3
 */
public class EdmDetailInfo {


    private List<EdmDetailSectionInfo> edm_detail_section_info;
    private List<EdmDetailPageInfo> edm_detail_page_info;


    public List<EdmDetailSectionInfo> getEdmDetailSectionInfo() {
        return edm_detail_section_info!=null?edm_detail_section_info:new ArrayList<EdmDetailSectionInfo>();
    }

    public List<EdmDetailPageInfo> getEdmDetailPageInfo() {
        return edm_detail_page_info!=null?edm_detail_page_info:new ArrayList<EdmDetailPageInfo>();
    }
}
