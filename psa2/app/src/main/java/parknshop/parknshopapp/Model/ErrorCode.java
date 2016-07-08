package parknshop.parknshopapp.Model;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by panther945 on 2015/7/23.
 */
public class ErrorCode {
    private String field;
    private String errorCode;
    private List<FieldErrors> fieldErrors;

    public String getErrorCode() {
        return errorCode != null ? errorCode : "";
    }

    public List<FieldErrors> getFieldErrors() {
        return fieldErrors != null ? fieldErrors : new ArrayList<FieldErrors>();
    }

}

