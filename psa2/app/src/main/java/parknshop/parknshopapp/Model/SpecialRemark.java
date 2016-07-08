package parknshop.parknshopapp.Model;

/**
 * Created by chrisyu on 11/5/16.
 */
public class SpecialRemark {
    private SpecialRemarkForm specialRemarkForm = new SpecialRemarkForm();

    public void setRemark(String remark) {
        specialRemarkForm.setRemark(remark);
    }

    public class SpecialRemarkForm {
        private String remark;

        public void setRemark(String remark) {
            this.remark = remark;
        }
    }
}
