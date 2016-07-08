package parknshop.parknshopapp.Model;

/**
 * Created by kwongyuenpan on 27/4/16.
 */
public class GetUserProfilePicResponse extends BaseStatus {
    public Data data;

    public Data getData() {
        return data;
    }

    public class Data {
        public int id;
        public String updateAt;
        public String userId;
        public String cardNo;
        public String image;

        public int getId() {
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
