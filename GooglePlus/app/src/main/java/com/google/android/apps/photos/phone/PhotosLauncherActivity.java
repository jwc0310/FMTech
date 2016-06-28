package com.google.android.apps.photos.phone;

import android.app.Activity;
import android.content.Intent;
import android.os.Build.VERSION;
import android.os.Bundle;
import bgp;
import com.google.android.apps.plus.phone.PhotosAppPromoActivity;
import duj;
import efj;

public class PhotosLauncherActivity
  extends Activity
{
  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    Intent localIntent;
    if (duj.b(this)) {
      localIntent = duj.f(this);
    }
    for (;;)
    {
      startActivity(localIntent);
      finish();
      return;
      if ((duj.a()) && (duj.c(this)) && (Build.VERSION.SDK_INT >= 23)) {}
      for (int i = 1;; i = 0)
      {
        if (i == 0) {
          break label78;
        }
        localIntent = efj.h(this, bgp.b(this));
        localIntent.addFlags(335544320);
        break;
      }
      label78:
      localIntent = PhotosAppPromoActivity.a(this);
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     com.google.android.apps.photos.phone.PhotosLauncherActivity
 * JD-Core Version:    0.7.0.1
 */