package parknshop.parknshopapp.Fragment.Checkout;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import com.orhanobut.hawk.Hawk;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;
import parknshop.parknshopapp.Base.BaseFragment;
import parknshop.parknshopapp.GATrackerHelper;
import parknshop.parknshopapp.Model.LoginResponse;
import parknshop.parknshopapp.Model.MemberProfile;
import parknshop.parknshopapp.R;
import parknshop.parknshopapp.Rest.event.CheckoutButtonGroupEvent;
import parknshop.parknshopapp.Rest.event.EmptyJsonEvent;
import parknshop.parknshopapp.Utils.ToastUtils;
import parknshop.parknshopapp.View.CheckoutButtonGroup;
import parknshop.parknshopapp.View.CheckoutEditText;
import parknshop.parknshopapp.WebServiceModel;
import parknshop.parknshopapp.common.MemberHelper;

/**
 * Created by chrisyu on 5/4/16.
 */
public class CheckoutYourDetailFragment extends BaseFragment {
    public boolean goBackToConfirmation;
    //@Bind(R.id.checkout_dot_1) LinearLayout dot1;
    //@Bind(R.id.checkout_dot_2) LinearLayout dot2;
    //Bind(R.id.checkout_dot_3) LinearLayout dot3;
    //@Bind(R.id.checkout_dot_4) LinearLayout dot4;

    @Bind (R.id.first_name) CheckoutEditText firstNameEditText;
    @Bind (R.id.last_name) CheckoutEditText lastNameEditText;
    @Bind (R.id.email) CheckoutEditText emailEditText;
    @Bind (R.id.contact_no) CheckoutEditText contactNoEditText;

    public @Bind(R.id.title_group) LinearLayout titleGroup;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout resource file
        View view = getActivity().getLayoutInflater().inflate(R.layout.checkout_your_detail_layout, container, false);

        GATrackerHelper.getInstance(getActivity()).setGATracker("my-cart/step01-your-detail");

        ButterKnife.bind(this, view);
        showToolbar();
        showBackButton();
        disableNavigationDrawer();
        hideShoppingCartButton();
        disableSecondRightButton();
        setToolbarTitle("Checkout");

        // new CheckOutDotViewHolder(dot1, 1, CURRENT, getBaseActivity());
        // new CheckOutDotViewHolder(dot2, 2, NOT_FINISH, getBaseActivity());
        // new CheckOutDotViewHolder(dot3, 3, NOT_FINISH, getBaseActivity());
        // new CheckOutDotViewHolder(dot4, 4, NOT_FINISH, getBaseActivity());


        CheckoutButtonGroup.handleGroup(titleGroup);
        //CartResponse cartResponse = Hawk.get(AppUtils.remote_shopping_cart);
        //CheckOutDetailAdapter checkOutDetailAdapter = new CheckOutDetailAdapter(getBaseActivity());
        //listview.addHeaderView(generateHeader());
        //listview.addFooterView(generateFooter());
        //listview.setAdapter(new RightSlidingListViewAdapter(cartResponse.getAllEntry(), getBaseActivity()));

        return view;
    }

    public void onResume() {
        super.onResume();
        resetFieldIfNeeded(firstNameEditText, MemberHelper.getLoginResponse().getMemberProfile().getFirstName());
        resetFieldIfNeeded(lastNameEditText, MemberHelper.getLoginResponse().getMemberProfile().getLastName());
        resetFieldIfNeeded(emailEditText, MemberHelper.getLoginResponse().getMemberProfile().getEmail());

        if(MemberHelper.getLoginResponse().getMemberProfile().getDefaultAddress() != null)
            resetFieldIfNeeded(contactNoEditText, MemberHelper.getLoginResponse().getMemberProfile().getDefaultAddress().phone);

        if(MemberHelper.getLoginResponse().getMemberProfile().getTitleCode() != null) {
            //Log.i("title Code", "title Code" + MemberHelper.getLoginResponse().getMemberProfile().getTitleCode());
            String titleCode = MemberHelper.getLoginResponse().getMemberProfile().getTitleCode();
            if(titleCode.equals("mr"))
                CheckoutButtonGroup.manualOnClickButton(titleGroup, 0);
            if(titleCode.equals("ms"))
                CheckoutButtonGroup.manualOnClickButton(titleGroup, 1);
            if(titleCode.equals("mrs"))
                CheckoutButtonGroup.manualOnClickButton(titleGroup, 2);
            if(titleCode.equals("miss"))
                CheckoutButtonGroup.manualOnClickButton(titleGroup, 3);
            //CheckoutButtonGroup.manualOnClickButton
        }
    }

    @OnClick(R.id.con)
    public void nextPage() {
        Hawk.put(CHECKOUT_DETAIL_FIRST_NAME, firstNameEditText.getText().toString());
        Hawk.put(CHECKOUT_DETAIL_LAST_NAME, lastNameEditText.getText().toString());
        Hawk.put(CHECKOUT_DETAIL_EMAIL, emailEditText.getText().toString());
        Hawk.put(CHECKOUT_DETAIL_CONTACT_NO, contactNoEditText.getText().toString());

        if(firstNameEditText.getText().toString().length() == 0 || lastNameEditText.getText().toString().length() == 0 || emailEditText.getText().toString().length() == 0 || contactNoEditText.getText().toString().length() == 0) {
            ToastUtils.show(getBaseActivity(), "Can't be Empty");
            return;
        }

        //handle case for update data
        if( MemberHelper.getLoginResponse().getMemberProfile() != null && (!MemberHelper.getLoginResponse().getMemberProfile().getFirstName().equals(firstNameEditText.getText().toString()) ||
                !MemberHelper.getLoginResponse().getMemberProfile().getLastName().equals(lastNameEditText.getText().toString()) ||
                !MemberHelper.getLoginResponse().getMemberProfile().getEmail().equals(emailEditText.getText().toString()) ||
                !MemberHelper.getLoginResponse().getMemberProfile().getDefaultAddress().getPhone().equals(contactNoEditText.getText().toString()))) {

            UpdateForm updateForm = new UpdateForm();
            WebServiceModel.getInstance(getBaseActivity()).postUpdateProfile(getBaseActivity(), updateForm.generateUpdateFormViaMemberHelper());

            LoginResponse loginResponse = MemberHelper.getLoginResponse();
            loginResponse.getMemberProfile().setFirstName(firstNameEditText.getText().toString());
            loginResponse.getMemberProfile().setLastName(lastNameEditText.getText().toString());
            loginResponse.getMemberProfile().setEmail(emailEditText.getText().toString());
            loginResponse.getMemberProfile().getDefaultAddress().setPhone(contactNoEditText.getText().toString());
            MemberHelper.saveLoginResponse(loginResponse);
            showProgressDialog();
        }
        else {
            if(goBackToConfirmation) {
                getBaseActivity().placeFragmentWithBackStack(new CheckoutConfirmationFragment());
            } else {
                getBaseActivity().placeFragmentWithBackStack(new CheckoutDeliveryMethodFragment());
            }
        }
    }


    public void onEvent(EmptyJsonEvent event) {
        hideProgressDialog();
        if(event.getType().equals("updateProfile") && event.getSuccess()) {
            if(goBackToConfirmation) {
                getBaseActivity().placeFragmentWithBackStack(new CheckoutConfirmationFragment());
            } else {
                getBaseActivity().placeFragmentWithBackStack(new CheckoutDeliveryMethodFragment());
            }
        } else {
            ToastUtils.show(getBaseActivity(), "error");
        }
    }

    public class UpdateForm {
        UpdateProfileForm updateProfileForm = new UpdateProfileForm();
        class UpdateProfileForm {
            public String title;
            public String firstName;
            public String lastName;
            public String email;
            public String oldEmail;
            public String homeBusinessNumber;
            public String mobile;
            public String cardNumber;
            public String checkCardNumber;
            public String pwd;
            public DateOfBirth dateOfBirth;
            public String nationalType;
            public String maritalStatus;
            public String numberOfChildren;
            public String language;
            public String emailFlag;
            public String preferredDistrictCode;
            class DateOfBirth {
                String day;
                String month;
            }
        }

        public UpdateForm generateUpdateFormViaMemberHelper() {
            UpdateForm updateForm = new UpdateForm();
            MemberProfile memberProfile = MemberHelper.getLoginResponse().getMemberProfile();
            updateForm.updateProfileForm.title = titleSelected;
            updateForm.updateProfileForm.firstName = firstNameEditText.getText().toString();
            updateForm.updateProfileForm.lastName = lastNameEditText.getText().toString();
            updateForm.updateProfileForm.email = emailEditText.getText().toString();
            updateForm.updateProfileForm.mobile = contactNoEditText.getText().toString();
            return updateForm;
        }
    }
    /*{
  "updateProfileForm": {
    "title": "ms",
    "firstName": "Essing SITy1u",
    "lastName": "3u",
    "email": "pnshksit04@outlook.com",
    "oldEmail": "pnshksit04@outlook.com",
    "homeBusinessNumber": "91234567",
    "mobile": "91234567",
    "cardNumber": "2599040709199",
    "checkCardNumber": "",
    "pwd": "",
    "dateOfBirth": {
      "day": "25",
      "month": "4"
    },
    "nationalType": "CHINESE",
    "maritalStatus": "WIDOWED",
    "numberOfChildren": "TWO",
    "language": "ENGLISH",
    "emailFlag": false,
    "preferredDistrictCode": "shatin"
  }
}*/
    String titleSelected;
    public void onEvent(CheckoutButtonGroupEvent checkoutButtonGroupEvent) {
        if(CheckoutButtonGroup.checkSource(checkoutButtonGroupEvent, titleGroup)) {
            if(checkoutButtonGroupEvent.getPosition() == 0)
                titleSelected = "mr";
            else if(checkoutButtonGroupEvent.getPosition() == 1)
                titleSelected = "ms";
            else if(checkoutButtonGroupEvent.getPosition() == 2)
                titleSelected = "mrs";
            else if(checkoutButtonGroupEvent.getPosition() == 3)
                titleSelected = "miss";
        }
    }

    public void resetFieldIfNeeded(CheckoutEditText editText, String value) {
       // Log.i("abcd", "abcd" + editText.getText() + " " + (String)Hawk.get(key));
        //Log.i("abcd", "abcd" + value);
        editText.setText(value);
    }

    public static String CHECKOUT_DETAIL_FIRST_NAME = "CHECKOUT_DETAIL_FIRST_NAME";
    public static String CHECKOUT_DETAIL_LAST_NAME = "CHECKOUT_DETAIL_LAST_NAME";
    public static String CHECKOUT_DETAIL_EMAIL = "CHECKOUT_DETAIL_EMAIL";
    public static String CHECKOUT_DETAIL_CONTACT_NO = "CHECKOUT_DETAIL_CONTACT_NO";

    public static int NOT_FINISH = 0;
    public static int FINISH = 1;
    public static int CURRENT = 2;
}