package parknshop.parknshopapp.Model;

/**
 * Created by Kate on 2015/4/14
 */
public class SaibeiResponse {

    public String RC;
    protected String body;
    protected String[] bodyArray;

    public String getRC() {
        return RC;
    }

    public SaibeiResponse(String body) {
        this.body = body;
        RC = "";
        if (body != null) {
            bodyArray = body.trim().split("&", -1);
            read();
        }
    }

    public void read() {
        RC = bodyArray[0];
    }
}
