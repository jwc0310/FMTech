package com.google.android.libraries.social.gateway;

import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.net.Uri.Builder;
import android.os.Bundle;
import android.text.TextUtils;
import bp;
import bu;
import bv;
import git;
import hyf;
import hyi;
import hym;
import ibw;
import ibx;
import iby;
import ibz;
import ica;
import icb;
import ikt;
import java.util.Iterator;
import java.util.List;
import mbb;
import mcc;

public final class GatewayActivity
  extends mcc
  implements ibw
{
  private static hyf d = new hyf("debug.plus.deep_link_logging", "false", "9a19393", hym.b);
  private ikt e = new ikt(this, this.k).a(this.j);
  private ica f;
  
  private final void a(Intent paramIntent, boolean paramBoolean)
  {
    if (!((hyi)mbb.a(this, hyi.class)).b(d, ((git)mbb.a(this, git.class)).c())) {
      break label34;
    }
    label34:
    label173:
    label193:
    for (;;)
    {
      return;
      if (paramIntent != null)
      {
        iby localiby = (iby)mbb.b(this, iby.class);
        if (localiby == null) {
          break;
        }
        String str1 = paramIntent.getDataString();
        if ((str1 != null) && (str1.length() > 256)) {
          str1 = str1.substring(0, 256);
        }
        String str2;
        int i;
        if (!TextUtils.isEmpty(paramIntent.getStringExtra("android.intent.extra.REFERRER_NAME")))
        {
          str2 = paramIntent.getStringExtra("android.intent.extra.REFERRER_NAME");
          if ((str2 == null) || (!str2.contains("android-app:"))) {
            break label173;
          }
          i = 3;
        }
        for (;;)
        {
          if (!paramBoolean) {
            break label193;
          }
          localiby.a(i, str1, this);
          return;
          boolean bool = TextUtils.isEmpty(paramIntent.getStringExtra("android.intent.extra.REFERRER"));
          str2 = null;
          if (bool) {
            break;
          }
          str2 = paramIntent.getStringExtra("android.intent.extra.REFERRER").toString();
          break;
          String str3 = paramIntent.getStringExtra("com.android.browser.application_id");
          i = 0;
          if (str3 != null) {
            i = 2;
          }
        }
      }
    }
  }
  
  private final void e()
  {
    a(getIntent(), false);
    Uri localUri = getIntent().getData();
    Intent localIntent2;
    int i;
    if (localUri != null)
    {
      String str1 = getIntent().getStringExtra("viewerid");
      if (str1 != null)
      {
        Uri.Builder localBuilder = localUri.buildUpon();
        localBuilder.appendQueryParameter("viewerid", str1);
        String str2 = getIntent().getStringExtra("effectiveid");
        if (str2 != null) {
          localBuilder.appendQueryParameter("effectiveid", str2);
        }
        localUri = localBuilder.build();
      }
      localIntent2 = new Intent("android.intent.action.VIEW", localUri);
      localIntent2.addFlags(524288);
      List localList = getPackageManager().queryIntentActivities(localIntent2, 65536);
      i = 0;
      if (localList != null) {
        if (i < localList.size())
        {
          ActivityInfo localActivityInfo = ((ResolveInfo)localList.get(i)).activityInfo;
          if ((localActivityInfo != null) && (!getPackageName().equals(localActivityInfo.packageName))) {
            localIntent2.setComponent(new ComponentName(localActivityInfo.packageName, localActivityInfo.name));
          }
        }
      }
    }
    for (Intent localIntent1 = localIntent2;; localIntent1 = null)
    {
      a(localIntent1);
      return;
      i++;
      break;
    }
  }
  
  public final void a()
  {
    e();
  }
  
  public final void a(int paramInt)
  {
    a(getIntent(), false);
    setResult(paramInt);
    finish();
  }
  
  public final void a(int paramInt, String paramString)
  {
    if (paramString != null)
    {
      a(getIntent(), false);
      ibx localibx = new ibx();
      Bundle localBundle = new Bundle();
      localBundle.putInt("result_code", 0);
      localBundle.putString("error_message", paramString);
      localibx.f(localBundle);
      localibx.a(this.b.a.d, "error");
      return;
    }
    a(0);
  }
  
  public final void a(Intent paramIntent)
  {
    label158:
    label164:
    ComponentName localComponentName;
    String str1;
    if (paramIntent != null)
    {
      int i;
      ActivityInfo localActivityInfo;
      if (paramIntent.getPackage() == null)
      {
        List localList = getPackageManager().queryIntentActivities(paramIntent, 65664);
        if (localList == null) {
          break label164;
        }
        i = 0;
        if (i >= localList.size()) {
          break label164;
        }
        localActivityInfo = ((ResolveInfo)localList.get(i)).activityInfo;
        Bundle localBundle = localActivityInfo.metaData;
        if ((localBundle == null) || (!localBundle.getBoolean("native_handler"))) {
          break label158;
        }
      }
      for (String str2 = localActivityInfo.packageName;; str2 = null)
      {
        if (str2 != null) {
          paramIntent.setPackage(str2);
        }
        paramIntent.addFlags(33619968);
        Iterator localIterator = this.j.c(icb.class).iterator();
        while (localIterator.hasNext()) {
          ((icb)localIterator.next()).a(getIntent(), paramIntent);
        }
        i++;
        break;
      }
      localComponentName = paramIntent.getComponent();
      if (localComponentName != null) {
        break label246;
      }
      str1 = "";
      if ((!"com.google.android.apps.plus".equals(paramIntent.getPackage())) && ((!str1.startsWith("com.google.android.apps.plus")) || (str1.contains("sandbox")))) {
        break label256;
      }
      a(getIntent(), true);
    }
    for (;;)
    {
      startActivity(paramIntent);
      overridePendingTransition(0, 0);
      finish();
      return;
      label246:
      str1 = localComponentName.flattenToShortString();
      break;
      label256:
      a(getIntent(), false);
    }
  }
  
  protected final void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    Intent localIntent = getIntent();
    List localList = this.j.c(ibz.class);
    int i = localList.size();
    int j = 0;
    ica localica;
    if (j < i)
    {
      localica = ((ibz)localList.get(j)).a(localIntent);
      if (localica != null)
      {
        label63:
        this.f = localica;
        if (this.f != null) {
          break label93;
        }
        e();
      }
    }
    label93:
    do
    {
      return;
      j++;
      break;
      localica = null;
      break label63;
      this.f.a(this, this.k, this, this.e);
    } while (paramBundle != null);
    this.f.a();
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     com.google.android.libraries.social.gateway.GatewayActivity
 * JD-Core Version:    0.7.0.1
 */