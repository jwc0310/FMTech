package com.google.android.apps.plus.widget;

import aau;
import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.Toast;
import bp;
import com.google.android.apps.plus.service.EsService;
import dme;
import eam;
import efj;
import gnb;
import ipf;
import ipm;
import java.util.HashSet;
import java.util.Map;
import jpu;

public class EsWidgetCameraLauncherActivity
  extends bp
{
  public Integer d;
  private dme e = new eam(this);
  
  public final void a(String paramString)
  {
    if (paramString != null)
    {
      jpu localjpu = new jpu(ipf.a(this, Uri.parse(paramString), ipm.a));
      Intent localIntent1 = new Intent("android.intent.action.SEND");
      localIntent1.setPackage(getPackageName());
      localIntent1.putExtra("android.intent.extra.STREAM", localjpu);
      localIntent1.setType("image/jpg");
      localIntent1.putExtra("is_internal", true);
      Intent localIntent2 = getIntent();
      if (localIntent2.hasExtra("extra_acl")) {
        localIntent1.putExtra("extra_acl", (gnb)localIntent2.getParcelableExtra("extra_acl"));
      }
      startActivity(localIntent1);
    }
    for (;;)
    {
      dismissDialog(2131361854);
      finish();
      return;
      Toast.makeText(this, getString(aau.cL), 1).show();
    }
  }
  
  public void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    switch (paramInt1)
    {
    default: 
      return;
    }
    if (paramInt2 == -1)
    {
      showDialog(2131361854);
      this.d = EsService.a(this, getIntent().getIntExtra("account_id", -1), "camera-p.jpg");
      return;
    }
    finish();
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    if (paramBundle == null) {
      startActivityForResult(efj.b("camera-p.jpg"), 1);
    }
    while (!paramBundle.containsKey("insert_camera_photo_req_id")) {
      return;
    }
    this.d = Integer.valueOf(paramBundle.getInt("insert_camera_photo_req_id"));
  }
  
  public Dialog onCreateDialog(int paramInt, Bundle paramBundle)
  {
    if (paramInt == 2131361854)
    {
      ProgressDialog localProgressDialog = new ProgressDialog(this);
      localProgressDialog.setProgressStyle(0);
      localProgressDialog.setCancelable(false);
      localProgressDialog.setMessage(getString(aau.fa));
      return localProgressDialog;
    }
    return super.onCreateDialog(paramInt, paramBundle);
  }
  
  public void onPause()
  {
    super.onPause();
    dme localdme = this.e;
    EsService.d.remove(localdme);
  }
  
  public void onResume()
  {
    super.onResume();
    EsService.a(this, this.e);
    if (this.d != null)
    {
      int i = this.d.intValue();
      if (!EsService.b.containsKey(Integer.valueOf(i)))
      {
        EsService.a(this.d.intValue());
        a(EsService.a);
        this.d = null;
      }
    }
  }
  
  public void onSaveInstanceState(Bundle paramBundle)
  {
    super.onSaveInstanceState(paramBundle);
    if (this.d != null) {
      paramBundle.putInt("insert_camera_photo_req_id", this.d.intValue());
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     com.google.android.apps.plus.widget.EsWidgetCameraLauncherActivity
 * JD-Core Version:    0.7.0.1
 */