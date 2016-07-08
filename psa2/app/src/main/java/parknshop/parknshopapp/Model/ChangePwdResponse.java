package parknshop.parknshopapp.Model;

/**
 * Created by panther945 on 2015/6/3.
 */
public class ChangePwdResponse extends ErrorCode {
    private String returnString;

    public boolean isSuccess() {
        return returnString.equals("success");
    }
}
