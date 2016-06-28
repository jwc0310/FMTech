package com.google.android.apps.photos.phone;

import aau;
import android.app.WallpaperManager;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;
import dtz;
import hwg;
import mbb;
import mbm;

public class SetWallpaperActivity
  extends mbm
{
  private int c = 0;
  private Uri d;
  
  protected final void a(Bundle paramBundle)
  {
    super.a(paramBundle);
    this.a.a("com.google.android.libraries.social.appid", Integer.valueOf(2));
  }
  
  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
    if ((paramInt2 != -1) || (paramIntent.getData() == null))
    {
      setResult(paramInt2);
      finish();
    }
    do
    {
      return;
      this.c = paramInt1;
    } while (this.c != 1);
    this.d = paramIntent.getData();
  }
  
  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    if (paramBundle != null)
    {
      this.c = paramBundle.getInt("activity-state");
      this.d = ((Uri)paramBundle.getParcelable("picked-item"));
    }
  }
  
  protected void onResume()
  {
    super.onResume();
    Intent localIntent1 = getIntent();
    switch (this.c)
    {
    default: 
      return;
    case 0: 
      this.d = localIntent1.getData();
      if (this.d == null)
      {
        startActivityForResult(new Intent("android.intent.action.GET_CONTENT").setClass(this, GetContentActivity.class).setType("image/*").putExtra("filter", 1), 1);
        return;
      }
      this.c = 1;
    }
    for (;;)
    {
      try
      {
        if ((!dtz.a()) || (!"content".equals(this.d.getScheme()))) {
          continue;
        }
        localObject = WallpaperManager.getInstance(getApplicationContext()).getCropAndSetWallpaperIntent(this.d);
        startActivity((Intent)localObject);
      }
      catch (IllegalStateException localIllegalStateException)
      {
        Object localObject;
        int i;
        int j;
        Intent localIntent2;
        Log.e("SetWallpaper", "Unable to set wallpaper", localIllegalStateException);
        continue;
      }
      catch (IllegalArgumentException localIllegalArgumentException)
      {
        Toast.makeText(this, aau.oR, 0).show();
        continue;
      }
      finish();
      return;
      i = getWallpaperDesiredMinimumWidth();
      j = getWallpaperDesiredMinimumHeight();
      localIntent2 = new Intent("com.android.camera.action.CROP").setClassName(getApplicationContext(), hwg.a).setDataAndType(this.d, "image/*").addFlags(33554432).putExtra("outputX", i).putExtra("outputY", j).putExtra("aspectX", i).putExtra("aspectY", j).putExtra("scale", true).putExtra("scaleUpIfNeeded", true).putExtra("set-as-wallpaper", true);
      localObject = localIntent2;
    }
  }
  
  protected void onSaveInstanceState(Bundle paramBundle)
  {
    super.onSaveInstanceState(paramBundle);
    paramBundle.putInt("activity-state", this.c);
    if (this.d != null) {
      paramBundle.putParcelable("picked-item", this.d);
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     com.google.android.apps.photos.phone.SetWallpaperActivity
 * JD-Core Version:    0.7.0.1
 */