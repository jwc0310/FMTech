package parknshop.parknshopapp.Model;

/**
 * Created by Kate on 2015/4/14
 */
public class CardLoginResponse extends SaibeiResponse {
    public String cardNumber;
    public int cardStatus;
    public String name;
    public String mobile;
    public String points;
    public String pointThisYear;
    public String dateThisYear;
    public String pointNextYear;
    public String dateNextYear;

    public CardLoginResponse(String body) {
        super(body);
    }

    @Override
    public void read() {
        super.read();

        if (bodyArray.length > 2) {
            cardNumber = bodyArray[1];
            cardStatus = Integer.parseInt(bodyArray[2]);

            if (bodyArray.length > 9) {
                name = bodyArray[3];
                mobile = bodyArray[4];
                points = bodyArray[5];
                pointThisYear = bodyArray[6];
                dateThisYear = bodyArray[7];
                pointNextYear = bodyArray[8];
                dateNextYear = bodyArray[9];
            }
        }
    }
}
