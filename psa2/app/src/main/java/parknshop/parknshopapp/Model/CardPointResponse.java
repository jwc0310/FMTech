package parknshop.parknshopapp.Model;

import android.util.Log;

import java.util.*;

/**
 * Created by Kate on 2015/4/14
 */
public class CardPointResponse extends SaibeiResponse {
    public List<CardPoint> cardPoints;

    public CardPointResponse(String body) {
        super(body);
    }

    @Override
    public void read() {
        super.read();

        if (bodyArray.length > 1) {
            String[] CardPointBodyArray = body.substring(RC.length() + 1).trim().split("\\$", -1);

            cardPoints = new ArrayList<CardPoint>();

            Map<String, Integer> map = new HashMap<String, Integer>();

            for (String CardPointBody : CardPointBodyArray) {
                CardPoint tmp = new CardPoint(CardPointBody);
                Log.d("runt0", tmp.pointChange + ", " + tmp.trans_point + ", " + tmp.get_point);
                if (tmp.isValid()) {
                    Integer index = map.get(tmp.transNo);
                    if (index == null) {
                        map.put(tmp.transNo, cardPoints.size());
                        cardPoints.add(tmp);
                    }
                    else {

                        CardPoint cardPoint = cardPoints.get(index);
                        cardPoint.trans_point += tmp.trans_point;
                        cardPoint.get_point += tmp.get_point;
                        cardPoint.cateSet.add(tmp.cateChange);
//                        cardPoint.cate = cardPoint.cate + "\n" + tmp.cateChange;
                        cardPoints.set(index, cardPoint);
                        Log.d("runt1", cardPoint.pointChange + ", " + cardPoint.trans_point + ", " + cardPoint.get_point);
                    }
                }
            }
        }
    }

    public static class CardPoint {
        protected String[] bodyArray;

        public String name;
        public String givenDate;
        public String transDate;
        public String transNo;
        private String cateChange;
        private int pointChange;
        public String info;

        public int trans_point;
        public int get_point;
//        public String cate;
        private Set<String> cateSet = new HashSet<String>();

        public CardPoint(String body) {
            if (body != null) {
                bodyArray = body.trim().split("&", -1);
                read();
            }
        }

        public void read() {

            if (bodyArray.length > 1) {
                name = bodyArray[0];
                givenDate = bodyArray[1];
                if (isValid()) {
                    transDate = bodyArray[2];
                    transNo = bodyArray[3];
                    cateChange = bodyArray[4];
//                    cate = cateChange;
                    pointChange = Integer.parseInt(bodyArray[5]);
                    if (pointChange > 0) {
                        trans_point = 0;
                        get_point = pointChange;
                    }
                    else {
                        trans_point = -pointChange;
                        get_point = 0;
                    }
                    if (bodyArray.length > 6) {
                        info = bodyArray[6];
                    }
                }
            }
        }

        public String getCateSet() {
            StringBuilder builder = new StringBuilder();
            int i = 0;
            for (String cate : cateSet) {
                builder.append(cate);
                if (i++ < cateSet.size() - 1) {
                    builder.append("\n");
                }
            }

            return builder.toString();
        }

        public String getGivenDate() {
            return Utility.formatSaibeiDate(transDate);
        }
        public String getTransDate() {
            return Utility.formatSaibeiDate(transDate);
        }

        public boolean isValid() {
            return givenDate !=null && !givenDate.isEmpty();
        }
    }
}
