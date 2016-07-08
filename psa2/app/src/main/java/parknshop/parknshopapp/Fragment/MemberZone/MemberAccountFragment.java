package parknshop.parknshopapp.Fragment.MemberZone;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.media.ExifInterface;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.provider.MediaStore;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;

import com.bumptech.glide.Glide;

import org.apache.commons.io.FileUtils;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;
import okhttp3.MediaType;
import okhttp3.RequestBody;
import parknshop.parknshopapp.Base.BaseFragment;
import parknshop.parknshopapp.EventUpdate.StringPickerAdapterOnItemClickEvent;
import parknshop.parknshopapp.Fragment.MemberZone.View.MemberZoneItem;
import parknshop.parknshopapp.Fragment.MemberZone.View.MemberZoneItemPicker;
import parknshop.parknshopapp.Fragment.MemberZone.View.MemberZoneProfileView;
import parknshop.parknshopapp.GATrackerHelper;
import parknshop.parknshopapp.Model.AddProfilePicForm;
import parknshop.parknshopapp.Model.MemberProfile;
import parknshop.parknshopapp.Model.UpdateProfile;
import parknshop.parknshopapp.MyApplication;
import parknshop.parknshopapp.R;
import parknshop.parknshopapp.Rest.event.AddProfilePicEvent;
import parknshop.parknshopapp.Rest.event.GetUserProfilePicEvent;
import parknshop.parknshopapp.Rest.event.UpdateProfileEvent;
import parknshop.parknshopapp.Rest.event.UploadImageEvent;
import parknshop.parknshopapp.Utils.LogUtil;
import parknshop.parknshopapp.Utils.ToastUtils;
import parknshop.parknshopapp.WebServiceModel;
import parknshop.parknshopapp.common.MemberHelper;

/**
 * Created by Gigi Wong on 2016年04月20日.
 */
public class MemberAccountFragment extends BaseFragment {

    public static final int GALLERY_PICTURE = 11;
    public static final int CAMERA_REQUEST = 12;

    public static final int TITLE = 1;
    public static final int STATUS = 2;
    public static final int CHILDREN = 3;
    public static final int REGION = 4;
    public static final int BIRTHDAY = 5;

    @Bind(R.id.profile_img) MemberZoneProfileView profileImg;

    @Bind(R.id.title_picker) MemberZoneItemPicker titlePicker;
    @Bind(R.id.birthday_picker) MemberZoneItemPicker birthdayPicker;
    @Bind(R.id.status_picker) MemberZoneItemPicker statusPicker;
    @Bind(R.id.children_picker) MemberZoneItemPicker childrenPicker;

    @Bind(R.id.first_name) MemberZoneItem firstName;
    @Bind(R.id.last_name) MemberZoneItem lastName;
    @Bind(R.id.region_picker) MemberZoneItem regionPicker;
    @Bind(R.id.email) MemberZoneItem email;

    String[] titleList;
    String[] titleCodeList;
    String[] statusList;
    String[] childList;
    String[] regionList;

    ImageButton btnTakePhoto;
    String selectedImagePath;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = getActivity().getLayoutInflater().inflate(R.layout.member_card_profile_layout, container, false);

        GATrackerHelper.getInstance(getActivity()).setGATracker("my-account/account-details");

        ButterKnife.bind(this, view);

        showBackButton();
        showToolbar();
        disableNavigationDrawer();
        setToolbarTitle(getString(R.string.account_detail));
        disableSecondRightButton();
        disableCartButton();

        titleList = getResources().getStringArray(R.array.profile_title);
        titleCodeList = getResources().getStringArray(R.array.profile_title_code);
        statusList = getResources().getStringArray(R.array.register_status);
        childList = getResources().getStringArray(R.array.register_children_count);
        birthdayPicker.setDatePicker(true);
        regionList = getResources().getStringArray(R.array.profile_region);

        titlePicker.setDataArray(titleList);
        statusPicker.setDataArray(statusList);
        childrenPicker.setDataArray(childList);

        titlePicker.setSuccessCode(TITLE);
        statusPicker.setSuccessCode(STATUS);
        childrenPicker.setSuccessCode(CHILDREN);

//        LogUtil.info("", "GsonGson:"+new Gson().toJson(MemberHelper.getMemberProfile()));

        setMemberInfo(MemberHelper.getMemberProfile());

        btnTakePhoto = profileImg.getBtnTakePhoto();

        btnTakePhoto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startDialog();
            }
        });

        return view;
    }

    @Override
    public void onResume() {
        super.onResume();
        showProgressDialog();
        getUserProfilePic();
    }

    public void getUserProfilePic(){
        WebServiceModel.getInstance(getActivity()).requestGetUserProfilePic(MemberHelper.getMemberProfile().getEmail());
    }

    private void startDialog() {
        AlertDialog.Builder myAlertDialog = new AlertDialog.Builder(
                getActivity());
//        myAlertDialog.setTitle("Upload Pictures Option");
//        myAlertDialog.setMessage("How do you want to set your picture?");

        myAlertDialog.setPositiveButton("Gallery",
                new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface arg0, int arg1) {
                        Intent pictureActionIntent = null;

                        pictureActionIntent = new Intent(
                                Intent.ACTION_PICK,
                                android.provider.MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
                        startActivityForResult(
                                pictureActionIntent,
                                GALLERY_PICTURE);

                    }
                });

        myAlertDialog.setNegativeButton("Camera",
                new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface arg0, int arg1) {

                        Intent intent = new Intent(
                                MediaStore.ACTION_IMAGE_CAPTURE);
                        File f = new File(android.os.Environment
                                .getExternalStorageDirectory(), "temp.jpg");
                        intent.putExtra(MediaStore.EXTRA_OUTPUT,
                                Uri.fromFile(f));

                        startActivityForResult(intent,
                                CAMERA_REQUEST);

                    }
                });
        myAlertDialog.show();
    }

    public void setMemberInfo(MemberProfile memberProfile){
        if(memberProfile != null) {
            profileImg.setName(memberProfile.getFirstName() + " " + memberProfile.getLastName());

            String title = memberProfile.getTitleCode() != null ? memberProfile.getTitleCode().substring(0, 1).toUpperCase() + memberProfile.getTitleCode().substring(1).toLowerCase() : "";

            if(title == null) {
                titlePicker.setItem(titleList[0]);
            }

            for(int i = 0 ; i < titleCodeList.length; i++){
                if(title.toLowerCase().equals(titleCodeList[i])){
                    titlePicker.setItem(titleList[i]);
                }
            }

            if(memberProfile.getChildrenNumber().getName().length() > 0){
                String noOfChildren = memberProfile.getChildrenNumber().getName().substring(0, 1).toUpperCase() + memberProfile.getChildrenNumber().getName().substring(1).toLowerCase();

                String[] childCodeList = getResources().getStringArray(R.array.register_children_count_code);
                for(int i = 0 ; i < childCodeList.length; i++){
                    if(noOfChildren.toLowerCase().contains(childCodeList[i])){
                        childrenPicker.setItem(childList[i]);
                    }
                }
            }else{
                childrenPicker.setItem("-");
            }

            firstName.setItem(memberProfile.getFirstName());
            lastName.setItem(memberProfile.getLastName());

            Date date = new Date(Integer.parseInt(memberProfile.getContactAddress().getYearOfBirth()) - 1900,
                    Integer.parseInt(memberProfile.getContactAddress().getMonthOfBirth()),
                    Integer.parseInt(memberProfile.getContactAddress().getDayOfBirth()));

            SimpleDateFormat format = new SimpleDateFormat("dd-MMM");
            StringPickerAdapterOnItemClickEvent stringPickerAdapterOnItemClickEvent = new StringPickerAdapterOnItemClickEvent();
            stringPickerAdapterOnItemClickEvent.setText(format.format(date));
            stringPickerAdapterOnItemClickEvent.setSuccessCode(BIRTHDAY);
            MyApplication.getInstance().mBus.post(stringPickerAdapterOnItemClickEvent);
            String birthday = format.format(date);
            birthdayPicker.setItem(birthday);
            statusPicker.setItem(memberProfile.getMaritalStatus().getName());
            regionPicker.setItem(memberProfile.getDefaultAddress().getRegionText());
            email.setItem(memberProfile.getEmail());
        }
    }

    public void onEvent(GetUserProfilePicEvent getUserProfilePicEvent) {
        hideProgressDialog();
        if(getUserProfilePicEvent.getSuccess()){
            Glide.with(getActivity()).load(getUserProfilePicEvent.getGetUserProfilePicResponse().getData().getImage()).into(profileImg.getIconView());
        }
    }

    public void onEvent(StringPickerAdapterOnItemClickEvent stringPickerAdapterOnItemClickEvent) {
        UpdateProfile updateProfile = getUpdateProfileForm();
        if(stringPickerAdapterOnItemClickEvent.getSuccessCode() == TITLE) {
            String selected = stringPickerAdapterOnItemClickEvent.getText();
            for (int i = 0; i < titleList.length; i++){
                if(selected.equals(titleList[i])){
                    updateProfile.getUpdateProfileForm().setTitle(titleCodeList[i]);
                }
            }
//            updateProfile.getUpdateProfileForm().setTitle(selected.toLowerCase());
        }else if(stringPickerAdapterOnItemClickEvent.getSuccessCode() == STATUS) {
            String selected = stringPickerAdapterOnItemClickEvent.getText();
            String status = "";
            if(stringPickerAdapterOnItemClickEvent.getPosition() == 0){
                status = "SINGLE";
            }else{
                status = "MARRIED";
            }
            updateProfile.getUpdateProfileForm().setMaritalStatus(status);
        }else if(stringPickerAdapterOnItemClickEvent.getSuccessCode() == CHILDREN) {
            String selected = stringPickerAdapterOnItemClickEvent.getText();
            updateProfile.getUpdateProfileForm().setChildrenNumber(selected);
        }else if(stringPickerAdapterOnItemClickEvent.getSuccessCode() == REGION) {
            String selected = stringPickerAdapterOnItemClickEvent.getText();

        }else if(stringPickerAdapterOnItemClickEvent.getSuccessCode() == BIRTHDAY){
            String selected = stringPickerAdapterOnItemClickEvent.getText();
            String[] tempDate = selected.split("-");
            updateProfile.getUpdateProfileForm().getDateOfBirth().setDay(tempDate[0]);
            updateProfile.getUpdateProfileForm().getDateOfBirth().setMonth(tempDate[1]);
            updateProfile.getUpdateProfileForm().getDateOfBirth().setYear(tempDate[2]);
            updateProfile.getUpdateProfileForm().setChildrenNumber(selected.toUpperCase());
        }
        showProgressDialog();
        WebServiceModel.getInstance(getActivity()).requestUpdateProfile(getActivity(), updateProfile);

    }

    public void onEvent(UpdateProfileEvent updateProfileEvent){
        hideProgressDialog();
        if(updateProfileEvent.getSuccess()){
            MemberHelper.setMemberProfile(updateProfileEvent.getMemberProfile());
            ToastUtils.show(getActivity(), getString(R.string.update_success));
        }else{
            ToastUtils.show(getActivity(), updateProfileEvent.getMessage());
        }

    }

    @OnClick(R.id.change_password)
    public void goToChangePasswordPage(){
        MemberChangePasswordFragment fragment = new MemberChangePasswordFragment();
        placeFragmentWithBackStack(fragment);
    }

    public UpdateProfile getUpdateProfileForm() {
        UpdateProfile updateProfile = new UpdateProfile();
        MemberProfile memberProfile = MemberHelper.getMemberProfile();
        updateProfile.getUpdateProfileForm().setTitle(memberProfile.getTitleCode());
        updateProfile.getUpdateProfileForm().setFirstName(memberProfile.getFirstName());
        updateProfile.getUpdateProfileForm().setLastName(memberProfile.getLastName());
        updateProfile.getUpdateProfileForm().setEmail(memberProfile.getEmail());
        updateProfile.getUpdateProfileForm().setMobile(memberProfile.getContactAddress().getMobilePhone());
        updateProfile.getUpdateProfileForm().setMaritalStatus(memberProfile.getMaritalStatus().code);
        updateProfile.getUpdateProfileForm().setChildrenNumber(memberProfile.getChildrenNumber().code);
        updateProfile.getUpdateProfileForm().setEmailFlag(memberProfile.isEmailFlag()+"");
        updateProfile.getUpdateProfileForm().getDateOfBirth().setDay(memberProfile.getContactAddress().getDayOfBirth());
        updateProfile.getUpdateProfileForm().getDateOfBirth().setMonth(memberProfile.getContactAddress().getMonthOfBirth());
        updateProfile.getUpdateProfileForm().getDateOfBirth().setYear(memberProfile.getContactAddress().getYearOfBirth());
        updateProfile.getUpdateProfileForm().setOldEmail(memberProfile.getEmail());
        updateProfile.getUpdateProfileForm().setPreferredDistrictCode("");
        updateProfile.getUpdateProfileForm().setCheckCardNumber("");
        updateProfile.getUpdateProfileForm().setNationalType("");
        updateProfile.getUpdateProfileForm().setPwd("");
        updateProfile.getUpdateProfileForm().setLanguage("");
        updateProfile.getUpdateProfileForm().setHomeBusinessNumber("");
        updateProfile.getUpdateProfileForm().setCardNumber("");
        return updateProfile;
    }

    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        Bitmap bitmap = null;
        selectedImagePath = null;

        if (resultCode == getActivity().RESULT_OK && requestCode == CAMERA_REQUEST) {

            File f = new File(Environment.getExternalStorageDirectory()
                    .toString());
            for (File temp : f.listFiles()) {
                if (temp.getName().equals("temp.jpg")) {
                    f = temp;
                    break;
                }
            }

            if (!f.exists()) {
                ToastUtils.show(getActivity(), "Error while capturing image");
                return;

            }

            try {

                bitmap = BitmapFactory.decodeFile(f.getAbsolutePath());

                bitmap = Bitmap.createScaledBitmap(bitmap, 400, 400, true);

                int rotate = 0;
                try {
                    ExifInterface exif = new ExifInterface(f.getAbsolutePath());
                    int orientation = exif.getAttributeInt(
                            ExifInterface.TAG_ORIENTATION,
                            ExifInterface.ORIENTATION_NORMAL);

                    switch (orientation) {
                        case ExifInterface.ORIENTATION_ROTATE_270:
                            rotate = 270;
                            break;
                        case ExifInterface.ORIENTATION_ROTATE_180:
                            rotate = 180;
                            break;
                        case ExifInterface.ORIENTATION_ROTATE_90:
                            rotate = 90;
                            break;
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
                Matrix matrix = new Matrix();
                matrix.postRotate(rotate);
                bitmap = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(),
                        bitmap.getHeight(), matrix, true);

//                profileImg.setIcon(bitmap);
                uploadImage(bitmap);
                //storeImageTosdCard(bitmap);
            } catch (Exception e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }

        } else if (resultCode == getActivity().RESULT_OK && requestCode == GALLERY_PICTURE) {
            if (data != null) {

                Uri selectedImage = data.getData();
                String[] filePath = { MediaStore.Images.Media.DATA };
                Cursor c = getActivity().getContentResolver().query(selectedImage, filePath,
                        null, null, null);
                c.moveToFirst();
                int columnIndex = c.getColumnIndex(filePath[0]);
                selectedImagePath = c.getString(columnIndex);
                c.close();

                bitmap = BitmapFactory.decodeFile(selectedImagePath); // load
                // preview image
                bitmap = Bitmap.createScaledBitmap(bitmap, 400, 400, false);

//                profileImg.setIcon(bitmap);
                uploadImage(bitmap);

            } else {
                ToastUtils.show(getActivity(), getString(R.string.upload_canceled));
            }
        }

    }

    public void uploadImage(Bitmap bitmap){
        File file = FileUtils.getFile(getRealPathFromURI(getImageUri(bitmap)));
        LogUtil.error("", "filepath:"+getRealPathFromURI(getImageUri(bitmap)));
//        String descriptionString = "profile pic";
//        RequestBody imgBody =
//                RequestBody.create(
//                        MediaType.parse("multipart/form-data"), descriptionString);
        RequestBody fbody = RequestBody.create(MediaType.parse("image/*"), file);

        Map<String, RequestBody> map = new HashMap<>();
        RequestBody requestBody = RequestBody.create(MediaType.parse("multipart/form-data"), file);
        map.put("file\"; filename=\"" + file.getName().trim(), requestBody);

        showProgressDialog();
        WebServiceModel.getInstance(getActivity()).requestUploadImage(map);
    }

    // Tranform Bitmap to Uri
    public Uri getImageUri(Bitmap inImage) {
        ByteArrayOutputStream bytes = new ByteArrayOutputStream();
        inImage.compress(Bitmap.CompressFormat.JPEG, 100, bytes);
        String path = MediaStore.Images.Media.insertImage(getActivity().getContentResolver(), inImage, inImage.toString(), null);
        return Uri.parse(path);
    }

    public String getRealPathFromURI(Uri contentUri) {
        Cursor cursor = null;
        try {
            String[] proj = { MediaStore.Images.Media.DATA };
            cursor = getActivity().getContentResolver().query(contentUri,  proj, null, null, null);
            int column_index = cursor.getColumnIndexOrThrow(MediaStore.Images.Media.DATA);
            cursor.moveToFirst();
            return cursor.getString(column_index);
        } finally {
            if (cursor != null) {
                cursor.close();
            }
        }
    }

    public void onEvent(UploadImageEvent uploadImageEvent) {

        GATrackerHelper.getInstance(getActivity()).setGATracker("account-details-profile-picture");

        if(uploadImageEvent.getSuccess()){
            MemberProfile memberFile = MemberHelper.getMemberProfile();
            AddProfilePicForm addProfilePicForm = new AddProfilePicForm();
            addProfilePicForm.setUserId(memberFile.getEmail());
            addProfilePicForm.setCardNo(memberFile.getMemberNumber());
            addProfilePicForm.setImage(uploadImageEvent.getUploadImageResponse().getData().get(0).getNewName());

            WebServiceModel.getInstance(getActivity()).requestAddProfilePic(addProfilePicForm);
        }else{
            hideProgressDialog();
            ToastUtils.show(getActivity(), uploadImageEvent.getMessage());
        }
    }

    public void onEvent(AddProfilePicEvent addProfilePicEvent) {
        hideProgressDialog();
        if(addProfilePicEvent.getSuccess()){
            ToastUtils.show(getActivity(), getString(R.string.upload_success));
            // Reload new image in image view
            getUserProfilePic();
        }else{
            ToastUtils.show(getActivity(), addProfilePicEvent.getMessage());
        }
    }
}
