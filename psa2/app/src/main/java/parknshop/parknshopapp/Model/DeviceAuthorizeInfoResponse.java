package parknshop.parknshopapp.Model;

import java.util.List;

/**
 * Created by Kate on 2015/4/17
 */
public class DeviceAuthorizeInfoResponse extends BackendResponse {
    public Results results;

    public class Results {
        public DeviceAuthorizeInfo device_authorize_info;
    }

    public class DeviceAuthorizeInfo {
        public int id;
        public String card_number;
        public List<DeviceInfo> authorize_device;
        public int authorize_count;
        public String edit_datetime;
    }

    public class DeviceInfo {
        public String uuid;
        public String model;
        public String platform;
    }
}