package parknshop.parknshopapp.Model;

import java.io.Serializable;
import java.util.ArrayList;

import parknshop.parknshopapp.GlobalConstant;

/**
 * Created by kwongyuenpan on 30/4/16.
 */
public class FAQResponse extends BaseStatus {

    public ArrayList<Data> data;

    public ArrayList<Data> getData() {
        if(data == null)
            data = new ArrayList<>();
        return data;
    }

    public void setData(ArrayList<Data> data) {
        this.data = data;
    }

    public static class Data implements Serializable{
        public int id;
        public String updateAt;
        public String titleTc;
        public String titleEn;
        public String contentTc;
        public String contentEn;
        public int sequence;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getUpdateAt() {
            return updateAt;
        }

        public void setUpdateAt(String updateAt) {
            this.updateAt = updateAt;
        }


        public void setTitleTc(String titleTc) {
            this.titleTc = titleTc;
        }

        public String getTitle() {
            if(GlobalConstant.language.equals(GlobalConstant.LANG_ZH))
                return titleTc;
            return titleEn;
        }

        public void setTitleEn(String titleEn) {
            this.titleEn = titleEn;
        }

        public String getContent() {
            if(GlobalConstant.language.equals(GlobalConstant.LANG_ZH))
                return contentTc;
            return contentEn;
        }

        public void setContentTc(String contentTc) {
            this.contentTc = contentTc;
        }

        public void setContentEn(String contentEn) {
            this.contentEn = contentEn;
        }

        public int getSequence() {
            return sequence;
        }

        public void setSequence(int sequence) {
            this.sequence = sequence;
        }
    }
}
