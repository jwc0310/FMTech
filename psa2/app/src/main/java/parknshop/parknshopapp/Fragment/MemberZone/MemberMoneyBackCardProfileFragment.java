package parknshop.parknshopapp.Fragment.MemberZone;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import butterknife.Bind;
import butterknife.ButterKnife;
import parknshop.parknshopapp.Base.BaseFragment;
import parknshop.parknshopapp.Fragment.MemberZone.View.MemberZoneItem;
import parknshop.parknshopapp.Fragment.MemberZone.View.MemberZoneItemPicker;
import parknshop.parknshopapp.Fragment.MemberZone.View.MoneyBackCardProfileItem;
import parknshop.parknshopapp.GATrackerHelper;
import parknshop.parknshopapp.GlobalConstant;
import parknshop.parknshopapp.Model.MemberProfile;
import parknshop.parknshopapp.R;
import parknshop.parknshopapp.common.MemberHelper;

/**
 * Created by Gigi Wong on 2016年04月20日.
 */
public class MemberMoneyBackCardProfileFragment extends BaseFragment {
    @Bind(R.id.txtTitle)
    MemberZoneItem txtTitle;
    @Bind (R.id.txtFamilyName)
    MemberZoneItem txtFamilyName;
    @Bind (R.id.txtGivenName)
    MemberZoneItem txtGivenName;
    @Bind (R.id.txtChineseName)
    MemberZoneItem txtChineseName;
    @Bind (R.id.txtDateOfBirth)
    MemberZoneItemPicker txtDateOfBirth;
    @Bind (R.id.txtEmail)
    MemberZoneItem txtEmail;
    @Bind (R.id.txtMobileNo)
    MemberZoneItem txtMobileNo;
    @Bind (R.id.txtTelNo)
    MemberZoneItem txtTelNo;
    @Bind (R.id.txtFlat)
    MemberZoneItem txtFlat;
    @Bind (R.id.txtFloor)
    MemberZoneItem txtFloor;
    @Bind (R.id.txtBlock)
    MemberZoneItem txtBlock;
    @Bind (R.id.txtBuilding)
    MemberZoneItem txtBuilding;
    @Bind (R.id.txtEstateName)
    MemberZoneItem txtEstateName;
    @Bind (R.id.txtStreetNo)
    MemberZoneItem txtStreetNo;
    @Bind (R.id.txtStreetName)
    MemberZoneItem txtStreetName;
    @Bind (R.id.txtDistrict)
    MemberZoneItem txtDistrict;
    @Bind (R.id.txtArea)
    MemberZoneItem txtArea;
    @Bind (R.id.txtLanguage)
    MemberZoneItemPicker txtLanguage;
    @Bind (R.id.txtMaritalStatus)
    MemberZoneItemPicker txtMaritalStatus;
    @Bind (R.id.switchSMS)
    MoneyBackCardProfileItem switchSMS;
    @Bind (R.id.switchEmails)
    MoneyBackCardProfileItem switchEmails;
    @Bind (R.id.switchDirMail)
    MoneyBackCardProfileItem switchDirMail;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = getActivity().getLayoutInflater().inflate(R.layout.member_moneyback_card_profile_layout, container, false);
        ButterKnife.bind(this, view);

        GATrackerHelper.getInstance(getActivity()).setGATracker("moneybackcard-profile");

        showBackButton();
        showToolbar();
        disableNavigationDrawer();
        setToolbarTitle(getString(R.string.myaccount_page_my_information));
        disableSecondRightButton();
        disableCartButton();


        txtDateOfBirth.setDatePicker(true);

        if(MemberHelper.getMemberProfile() != null){
            updateLayout(MemberHelper.getMemberProfile());
        }

        return view;
    }

    public void updateLayout(MemberProfile memberProfile){

        txtEmail.setItemEnable(true);
        txtMobileNo.setItemEnable(true);
        txtTelNo.setItemEnable(true);
        txtFlat.setItemEnable(true);
        txtFloor.setItemEnable(true);
        txtBlock.setItemEnable(true);
        txtBuilding.setItemEnable(true);
        txtEstateName.setItemEnable(true);
        txtStreetNo.setItemEnable(true);
        txtStreetName.setItemEnable(true);
        txtDistrict.setItemEnable(true);
        txtArea.setItemEnable(true);

        txtTitle.setItem(memberProfile.getTitleCode());
        txtFamilyName.setItem(memberProfile.getFirstName());
        txtGivenName.setItem(memberProfile.getLastName());
        txtChineseName.setItem(memberProfile.getFirstName());
        txtDateOfBirth.setItem(memberProfile.getContactAddress().getDayOfBirth() + "/" + memberProfile.getContactAddress().getMonthOfBirth() + "/" + memberProfile.getContactAddress().getYearOfBirth());
        txtEmail.setItem(memberProfile.getEmail());
        txtMobileNo.setItem(memberProfile.getContactAddress().getMobilePhone());
        txtTelNo.setItem(memberProfile.getContactAddress().getPhone());
        txtFlat.setItem(memberProfile.getContactAddress().getRoom());
        txtFloor.setItem(memberProfile.getContactAddress().getFloor());
        txtBlock.setItem(memberProfile.getContactAddress().getLine3());
        txtBuilding.setItem(memberProfile.getContactAddress().getAlley());
        txtEstateName.setItem(memberProfile.getContactAddress().getLane());
        txtStreetNo.setItem(memberProfile.getContactAddress().getStreetNumber());
        txtStreetName.setItem(memberProfile.getContactAddress().getStreetName());
        txtDistrict.setItem(memberProfile.getContactAddress().getDistrictText());
        txtArea.setItem(memberProfile.getContactAddress().getRegion());

        String language;
        if(GlobalConstant.language.equals(GlobalConstant.LANG_ZH)){
            language = getResources().getStringArray(R.array.setting_language)[1];
        } else {
            language = getResources().getStringArray(R.array.setting_language)[0];
        }
        txtLanguage.setItem(language);
        txtMaritalStatus.setItem(memberProfile.getMaritalStatus().name);
        switchSMS.setSwitch(true);
    }

    public void setMemberInfo(MemberProfile memberProfile){
        if(memberProfile != null) {
            txtTitle.setItem(memberProfile.getTitleCode());
            txtFamilyName.setItem(memberProfile.getFirstName());
            txtGivenName.setItem(memberProfile.getLastName());
            String birthday = memberProfile.getContactAddress().getDayOfBirth() + "/" + memberProfile.getContactAddress().getMonthOfBirth() + "/" + memberProfile.getContactAddress().getYearOfBirth();
            txtDateOfBirth.setItem(birthday);
            txtEmail.setItem(memberProfile.getEmail());
            txtMobileNo.setItem(memberProfile.getContactAddress().getMobilePhone());
//            txtLanguage.setItem(memberProfile.getLanguage().);
//            email.setItem(memberProfile.getEmail());
        }
    }
}