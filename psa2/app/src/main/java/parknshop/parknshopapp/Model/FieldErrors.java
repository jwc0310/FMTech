package parknshop.parknshopapp.Model;

/**
 * Created by Howard Chang on 2015/10/13
 */
public class FieldErrors {
    private String field;
    private String message;

    public String getRC() {
        return message != null ? "RC_" + message : null;
    }

    public String getField() {
        return field;
    }

    public String getMessage() {
        return message;
    }
}
