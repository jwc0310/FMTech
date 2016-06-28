package com.google.android.apps.plus.phone;

import aau;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.apps.plus.settings.InstantUploadSettingsLauncherActivity;
import efj;
import giu;
import giv;
import gjb;
import gwz;
import gxq;
import gxr;
import hba;
import ikt;
import ilf;
import ilm;
import iln;
import java.util.List;
import mbb;
import mcc;
import pjm;
import pjt;

public class AutoBackupSetupNotificationActivity
  extends mcc
  implements giv
{
  private final ikt d;
  
  public AutoBackupSetupNotificationActivity()
  {
    ikt localikt = new ikt(this, this.k);
    localikt.d = "active-photos-account";
    localikt.g.add(this);
    this.d = ((ikt)localikt);
  }
  
  protected final void a(Bundle paramBundle)
  {
    super.a(paramBundle);
    this.j.a("com.google.android.libraries.social.appid", Integer.valueOf(2));
  }
  
  public final void a(boolean paramBoolean, giu paramgiu1, giu paramgiu2, int paramInt1, int paramInt2)
  {
    if (paramInt2 != -1)
    {
      hba localhba = (hba)mbb.a(this, hba.class);
      ikt localikt1 = this.d;
      efj.k();
      if (!localhba.c(localikt1.e).c("auto_backup_enabled")) {
        break label72;
      }
      Intent localIntent = efj.d(this);
      localIntent.putExtra("skip_interstitials", true);
      startActivity(localIntent);
    }
    for (;;)
    {
      finish();
      return;
      label72:
      ikt localikt2 = this.d;
      efj.k();
      startActivity(InstantUploadSettingsLauncherActivity.a(this, localikt2.e));
    }
  }
  
  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    if (paramBundle == null)
    {
      gxr localgxr = new gxr();
      gxq localgxq1 = new gxq(pjm.m);
      localgxr.b.add(localgxq1);
      gxq localgxq2 = new gxq(pjt.e);
      localgxr.b.add(localgxq2);
      new gwz(4, localgxr).b(this);
    }
    hba localhba = (hba)mbb.a(this, hba.class);
    int i;
    if (localhba.e().size() > 0)
    {
      i = ((Integer)localhba.e().get(0)).intValue();
      if (i == -1) {
        break label146;
      }
      startActivity(InstantUploadSettingsLauncherActivity.a(this, i));
      finish();
    }
    label146:
    while (paramBundle != null)
    {
      return;
      i = -1;
      break;
    }
    ikt localikt = this.d;
    ilf localilf = new ilf();
    localilf.f = true;
    localilf.g = true;
    iln localiln = new iln();
    localiln.a = getString(aau.tE);
    Bundle localBundle = localiln.a();
    localilf.s = ilm.class;
    localilf.t = localBundle;
    localikt.a(localilf);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     com.google.android.apps.plus.phone.AutoBackupSetupNotificationActivity
 * JD-Core Version:    0.7.0.1
 */