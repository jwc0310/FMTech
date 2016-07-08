package parknshop.parknshopapp.Model;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Kate on 2015/4/14
 */
public class StoreRecordsResponse extends SaibeiResponse {
    public List<StoreRecord> storeRecords;
    public List<StoreRecord> stores;

    public StoreRecordsResponse(String body) {
        super(body);
    }

    @Override
    public void read() {
        super.read();

        if (bodyArray.length > 1) {
            String[] storeRecordBodyArray = body.substring(RC.length() + 1).trim().split("＄", -1);

            storeRecords = new ArrayList<StoreRecord>();

            for (String storeRecordBody : storeRecordBodyArray) {
                StoreRecord tmp = new StoreRecord(storeRecordBody);
                if (tmp.isValid()) {
                    storeRecords.add(tmp);
                }
            }
        }
    }

    public static class StoreRecord {
        protected String[] bodyArray;

        public String name;
        public String transDate;
        public String transNo;
        public String store;
        public String price;
        public String cate;
        public String cardNumber;
        public String[] products;
        public String[] amounts;

        public StoreRecord(String body) {
            if (body != null) {
                bodyArray = body.trim().split("&", -1);
                read();
            }
        }

        public void read() {
            if (bodyArray.length > 1) {
                name = bodyArray[0];
                transDate = bodyArray[1];
                if (isValid()) {
                    transNo = bodyArray[2];
                    store = bodyArray[3];
                    price = bodyArray[4];
                    cate = bodyArray[5];
                    cardNumber = bodyArray[6];
                    products = bodyArray[7].split(",", -1);
                    amounts = bodyArray[8].split(",", -1);
                }
            }
        }

        public String getTransDate() {
            return Utility.formatSaibeiTime(transDate);
        }

        public boolean isValid() {
            return transDate != null && !transDate.isEmpty();
        }
    }
}
