package com.google.android.apps.plus.permissions;

import android.annotation.TargetApi;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.view.View;
import cxh;
import efj;
import jpd;
import mbb;
import mbp;

public final class NoPermissionsActivity
  extends mbp
{
  private jpd d;
  
  protected final void a(Bundle paramBundle)
  {
    super.a(paramBundle);
    this.d = ((jpd)this.m.a(jpd.class));
  }
  
  @TargetApi(16)
  public final void onBackPressed()
  {
    if (Build.VERSION.SDK_INT >= 16)
    {
      finishAffinity();
      return;
    }
    finish();
  }
  
  protected final void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    setContentView(efj.AJ);
    findViewById(efj.AI).setOnClickListener(new cxh(this));
  }
  
  protected final void onResume()
  {
    super.onResume();
    jpd localjpd = this.d;
    if (localjpd.a(this, "android.permission.READ_EXTERNAL_STORAGE") == 0)
    {
      setResult(-1);
      finish();
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     com.google.android.apps.plus.permissions.NoPermissionsActivity
 * JD-Core Version:    0.7.0.1
 */