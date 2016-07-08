package parknshop.parknshopapp.Rest.event;

import java.util.ArrayList;

/**
 * Created by kwongyuenpan on 14/3/16.
 */
public class BaseEvent<T> {

    private String result;
    private String message;
    private boolean success;
    private String errorCode;
    private String[] errorCodes;

    private T dataObject;
    private String className;

    int successCode;
    ArrayList<String> errorList;

    public void setFieldErrorList(ArrayList<String> errorList) {
        this.errorList = errorList;
    }

    public ArrayList<String> getFieldErrorList() {
        return errorList;
    }

    public void setSuccessCode(int successCode) {
        this.successCode = successCode;
    }

    public int getSuccessCode() {
        return successCode;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public String getResult() {
        return result;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public boolean getSuccess() {
        return success;
    }

    public void setErrorCodes(String[] errorCodes) {
        this.errorCodes = errorCodes;
    }

    public String[] getErrorCodes() {
        return errorCodes;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    public String getErrorCode() {
        return errorCode;
    }

    public void setDataObject(T dataObject) {
        this.dataObject = dataObject;
    }

    public T getDataObject() {
        return this.dataObject;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String getClassName() {
        return this.className;
    }
}
