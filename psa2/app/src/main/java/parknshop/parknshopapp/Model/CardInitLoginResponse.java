package parknshop.parknshopapp.Model;

/**
 * Created by Kate on 2015/4/14
 */
public class CardInitLoginResponse extends SaibeiResponse {
    public String mobile;
    public int cardStatus;

    public CardInitLoginResponse(String body) {
        super(body);
    }

    @Override
    public void read() {
        super.read();

        if (bodyArray.length > 2) {
            mobile = bodyArray[1];
            cardStatus = Integer.parseInt(bodyArray[2]);
        }
    }
}
