package parknshop.parknshopapp.Model;

import java.util.ArrayList;

/**
 * Created by kwongyuenpan on 13/5/16.
 */
public class ProductRatingRequest {
    public IwaOrderRatingForm iwaOrderRatingForm;

    public void  setIwaOrderRatingForm(IwaOrderRatingForm iwaOrderRatingForm) {
        this.iwaOrderRatingForm = iwaOrderRatingForm;
    }

    public static class IwaOrderRatingForm {
        public ArrayList<IwaProductRatings> iwaProductRatings;

        public void setIwaProductRatings(ArrayList<IwaProductRatings> iwaProductRatings) {
            this.iwaProductRatings = iwaProductRatings;
        }

        public static class IwaProductRatings {
            public String productCode;
            public String comment;
            public String rating;

            public void setProductCode(String productCode) {
                this.productCode = productCode;
            }

            public void setComment(String comment) {
                this.comment = comment;
            }

            public void setRating(String rating) {
                this.rating = rating;
            }
        }
    }
}
