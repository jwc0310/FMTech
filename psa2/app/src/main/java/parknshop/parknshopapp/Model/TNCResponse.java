package parknshop.parknshopapp.Model;

import java.io.Serializable;
import java.util.ArrayList;

import parknshop.parknshopapp.GlobalConstant;

/**
 * Created by kwongyuenpan on 30/4/16.
 */
public class TNCResponse extends BaseStatus {

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
        public String noticeType;
        public String title_tc;
        public String title_en;
        public String content_tc;
        public String content_en;
        public int sequence;

        public String getNoticeType() {
            return noticeType;
        }

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

        public String getTitle() {
            if(GlobalConstant.language.equals(GlobalConstant.LANG_ZH))
                return title_tc;
            return title_en;
        }

        public String getContent() {
            if(GlobalConstant.language.equals(GlobalConstant.LANG_ZH))
                return content_tc;
            return content_en;
        }

        public int getSequence() {
            return sequence;
        }

        public void setSequence(int sequence) {
            this.sequence = sequence;
        }
    }
}
