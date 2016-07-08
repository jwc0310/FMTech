package parknshop.parknshopapp.Model;

/**
 * Created by kwongyuenpan on 27/4/16.
 */
public class AddProfilePicResponse extends BaseStatus {
    public Data data;

    public Data getData() {
        return data;
    }

    public class Data {
        String id;
        String updateAt;
        String userId;
        String cardNo;
        String image;

        public String getId() {
            return id;
        }

        public String getUpdateAt() {
            return updateAt;
        }

        public String getUserId() {
            return userId;
        }

        public String getCardNo() {
            return cardNo;
        }

        public String getImage() {
            return image;
        }
    }
}
