package com.google.android.apps.plus.phone;

import aau;
import android.app.Activity;
import android.content.ContentResolver;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore.Images.Media;
import android.provider.MediaStore.Video.Media;
import android.widget.Toast;
import com.google.android.apps.photos.phone.PhotosHomeActivity;

public class HostPhotoViewIntentActivity
  extends Activity
{
  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    Intent localIntent1 = getIntent();
    String str1 = localIntent1.getType();
    String str2;
    if (str1 != null) {
      if ("application/vnd.google.panorama360+jpg".equals(str1)) {
        str2 = "image/jpeg";
      }
    }
    while (str2 == null)
    {
      Toast.makeText(this, aau.lM, 1).show();
      finish();
      return;
      str2 = str1;
      continue;
      Uri localUri1 = localIntent1.getData();
      if (localUri1 != null) {
        str2 = getContentResolver().getType(localUri1);
      } else {
        str2 = null;
      }
    }
    Intent localIntent2 = new Intent(localIntent1);
    int i;
    if (("image/*".equals(str2)) || ("vnd.android.cursor.dir/image".equals(str2)))
    {
      i = 1;
      localIntent2.putExtra("filter", i);
      Uri localUri2 = localIntent1.getData();
      if ((localUri2 != null) && (!localUri2.equals(MediaStore.Images.Media.EXTERNAL_CONTENT_URI)) && (!localUri2.equals(MediaStore.Images.Media.INTERNAL_CONTENT_URI)) && (!localUri2.equals(MediaStore.Video.Media.EXTERNAL_CONTENT_URI)) && (!localUri2.equals(MediaStore.Video.Media.INTERNAL_CONTENT_URI))) {
        break label277;
      }
      if ((i & 0x2) == 0) {
        break label255;
      }
      localIntent2.setClass(this, HostPhotoViewIntentPhotoTileSearchActivity.class);
    }
    for (;;)
    {
      localIntent1.addFlags(33554432);
      startActivity(localIntent2);
      finish();
      return;
      if (!"video/*".equals(str2))
      {
        boolean bool = "vnd.android.cursor.dir/video".equals(str2);
        i = 0;
        if (!bool) {
          break;
        }
      }
      i = 2;
      break;
      label255:
      localIntent2.setClass(this, PhotosHomeActivity.class);
      localIntent2.putExtra("destination", 8);
      continue;
      label277:
      localIntent2.setClass(this, HostPhotoViewIntentPhotoOneUpActivity.class);
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     com.google.android.apps.plus.phone.HostPhotoViewIntentActivity
 * JD-Core Version:    0.7.0.1
 */