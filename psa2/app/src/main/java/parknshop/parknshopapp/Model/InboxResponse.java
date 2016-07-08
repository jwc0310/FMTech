package parknshop.parknshopapp.Model;

import java.util.ArrayList;

import parknshop.parknshopapp.GlobalConstant;

/**
 * Created by kwongyuenpan on 4/5/16.
 */
public class InboxResponse extends BaseStatus {
    public ArrayList<Data> data;

    public ArrayList<Data> getData() {
        if(data == null)
            data = new ArrayList<>();
            return data;
    }

    public class Data{
        public Message message;
        public String status;

        public Message getMessage() {
            return message;
        }

        public class Message{
            public String id;
            public String postDate;
            public String refId;
            public msg message;

            public String getId() {
                return id;
            }

            public String getPostDate() {
                return postDate;
            }

            public String getRefId() {
                return refId;
            }

            public String getMessage() {
                if(GlobalConstant.language.equals(GlobalConstant.LANG_ZH))
                    return message.getZt().getMessage();
                return message.getEn().getMessage();
            }

            public String getInbox() {
                if(GlobalConstant.language.equals(GlobalConstant.LANG_ZH))
                    return message.getZt().getInbox();
                return message.getEn().getInbox();
            }

            public class msg{
                public ZT zt;
                public EN en;

                public ZT getZt() {
                    return zt;
                }

                public EN getEn() {
                    return en;
                }

                public class ZT{
                    public String message;
                    public String inbox;

                    public String getInbox() {
                        if(inbox == null)
                            inbox = "";
                        return inbox;
                    }

                    public String getMessage() {
                        return message;
                    }
                }

                public class EN{
                    public String message;
                    public String inbox;

                    public String getInbox() {
                        if(inbox == null)
                            inbox = "";
                        return inbox;
                    }

                    public String getMessage() {
                        return message;
                    }
                }

            }
        }

        public String getStatus() {
            return status;
        }
    }
}
