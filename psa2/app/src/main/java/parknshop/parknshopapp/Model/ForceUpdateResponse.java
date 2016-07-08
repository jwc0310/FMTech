package parknshop.parknshopapp.Model;

/**
 * Created by kwongyuenpan on 10/5/16.
 */
public class ForceUpdateResponse extends BaseStatus {
    public Data data;

    public Data getData() {
        return data;
    }

    public class Data {
        public int id;
        public String updatedAt;
        public String os;
        public String device;
        public boolean forceUpdate;
        public String url;
        public String soft_version;

        public int getId() {
            return id;
        }

        public String getDevice() {
            return device;
        }

        public String getOS() {
            return os;
        }

        public String getSoft_version() {
            return soft_version;
        }

        public String getUpdatedAt() {
            return updatedAt;
        }

        public String getUrl() {
            return url;
        }

        public boolean isForceUpdate() {
            return forceUpdate;
        }
    }
}
