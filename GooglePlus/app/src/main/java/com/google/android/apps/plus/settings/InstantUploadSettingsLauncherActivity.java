package com.google.android.apps.plus.settings;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import bp;
import gbg;
import gbh;
import gbj;
import hbj;
import mbb;

public class InstantUploadSettingsLauncherActivity
  extends bp
{
  public gbg d;
  
  public static Intent a(Context paramContext, int paramInt)
  {
    Intent localIntent = new Intent(paramContext, InstantUploadSettingsLauncherActivity.class);
    localIntent.putExtra("account_id", paramInt);
    if (mbb.a(paramContext, "com.google.android.libraries.social.appid", 300) == 2) {}
    for (boolean bool = true;; bool = false)
    {
      localIntent.putExtra("is_in_photo_app", bool);
      return localIntent;
    }
  }
  
  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    int i = getIntent().getIntExtra("account_id", -1);
    if (hbj.a(this))
    {
      this.d = ((gbj)mbb.a(this, gbj.class)).a(this, new gbh(this));
      this.d.a();
      return;
    }
    Intent localIntent = new Intent(this, InstantUploadSettingsActivity.class);
    localIntent.setAction("android.intent.action.VIEW");
    localIntent.putExtra("account_id", i);
    localIntent.putExtra("is_in_photo_app", getIntent().getBooleanExtra("is_in_photo_app", true));
    startActivity(localIntent);
    finish();
  }
  
  protected void onPause()
  {
    super.onPause();
    if (this.d != null) {
      this.d.b();
    }
  }
  
  protected void onResume()
  {
    super.onResume();
    if ((this.d != null) && (!this.d.c())) {
      this.d.a();
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     com.google.android.apps.plus.settings.InstantUploadSettingsLauncherActivity
 * JD-Core Version:    0.7.0.1
 */