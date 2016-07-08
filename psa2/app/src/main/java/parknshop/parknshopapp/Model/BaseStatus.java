package parknshop.parknshopapp.Model;

/**
 * Created by kwongyuenpan on 11/4/16.
 */
public class BaseStatus {
    public Status status;

    public Status getStatus() {
        return status;
    }

    public class Status{
        public int code;
        public String message;
        public String systime;

        public int getCode() {
            return code;
        }

        public String getMessage() {
            return message;
        }

        public String getSystime() {
            return systime;
        }

    }

}
