package com.google.android.apps.plus.phone;

import aaw;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.MenuItem;
import anz;
import asg;
import asl;
import aso;
import asr;
import atx;
import bhp;
import cfy;
import cij;
import cpb;
import dpq;
import efj;
import fe;
import git;
import gjb;
import gjp;
import gpl;
import gpm;
import gpq;
import gpr;
import gxv;
import gya;
import idy;
import iot;
import java.util.ArrayList;
import java.util.List;
import jrf;
import jyj;
import lzw;
import mbb;
import mbp;
import tp;

public class HostSingleAlbumTileActivity
  extends mbp
  implements gpq, gxv
{
  private final git d;
  private final bhp e;
  
  public HostSingleAlbumTileActivity()
  {
    new idy(this, this.n, "android_photos_gmh");
    new atx(this, this.n);
    new jyj(this, this.n);
    lzw locallzw = new lzw(this, this.n);
    this.m.a(lzw.class, locallzw);
    new iot(this, this.n, aaw.dM).a.add("com.google.android.libraries.social.notifications.FROM_ANDROID_NOTIFICATION");
    gjp localgjp = new gjp(this, this.n);
    this.m.a(git.class, localgjp);
    this.d = localgjp;
    this.e = new bhp(this, aaw.dM);
  }
  
  protected final void a(Bundle paramBundle)
  {
    super.a(paramBundle);
    gpm localgpm = new gpm(this, this.n, efj.wT);
    this.m.a(gpl.class, localgpm);
    if (localgpm.b.contains(this)) {
      throw new IllegalStateException("Attempt to add ActionBarListener twice");
    }
    localgpm.b.add(this);
    localgpm.c();
    ((gpm)localgpm);
    mbb localmbb = this.m;
    localmbb.a(gxv.class, this);
    localmbb.a("com.google.android.libraries.social.appid", Integer.valueOf(g()));
    localmbb.a(cij.class, new cij(this, this.n, new cpb()));
    localmbb.a(asl.class, new asl(this, this.n));
    if (jrf.i(getIntent().getStringExtra("cluster_id"))) {}
    for (Object localObject = new asg();; localObject = new aso(this, this.n))
    {
      localmbb.a(asr.class, localObject);
      anz localanz = (anz)this.m.a(anz.class);
      localanz.b = "Albums";
      localanz.c = 2;
      return;
    }
  }
  
  public final void a(gpr paramgpr)
  {
    paramgpr.a(aaw.jH, new dpq());
  }
  
  public final void a(tp paramtp)
  {
    if (mbb.a(this, "com.google.android.libraries.social.appid", 300) == 2) {}
    for (boolean bool = true;; bool = false)
    {
      efj.a(paramtp, bool);
      paramtp.c(true);
      return;
    }
  }
  
  public final boolean a(MenuItem paramMenuItem)
  {
    return false;
  }
  
  public final void b(Bundle paramBundle) {}
  
  public final void b(fe paramfe)
  {
    String str1 = getIntent().getStringExtra("cluster_id");
    int i = this.d.c();
    if (str1 != null)
    {
      String str2 = jrf.c(str1);
      String str3 = jrf.d(str1);
      if ((TextUtils.equals(str3, "profile")) && (str2 != null))
      {
        Intent localIntent6 = efj.b(this, i);
        paramfe.a.add(localIntent6);
        String str6 = String.valueOf(str2);
        if (str6.length() != 0) {}
        for (String str7 = "g:".concat(str6);; str7 = new String("g:"))
        {
          Intent localIntent7 = efj.a(this, i, str7, null, 2, false);
          paramfe.a.add(localIntent7);
          return;
        }
      }
      if ((TextUtils.equals(str3, "posts")) && (str2 != null))
      {
        Intent localIntent4 = efj.b(this, i);
        paramfe.a.add(localIntent4);
        String str4 = String.valueOf(str2);
        if (str4.length() != 0) {}
        for (String str5 = "g:".concat(str4);; str5 = new String("g:"))
        {
          Intent localIntent5 = efj.a(this, i, str5, null, 0, false);
          paramfe.a.add(localIntent5);
          return;
        }
      }
      if (TextUtils.equals(this.d.f().b("gaia_id"), str2))
      {
        Intent localIntent3 = efj.h(this, i);
        paramfe.a.add(localIntent3);
        return;
      }
      Intent localIntent2 = efj.b(this, i);
      paramfe.a.add(localIntent2);
      return;
    }
    Intent localIntent1 = efj.b(this, i);
    paramfe.a.add(localIntent1);
  }
  
  public final void b(tp paramtp) {}
  
  protected int g()
  {
    return 2;
  }
  
  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    if (paramBundle == null)
    {
      cfy localcfy = new cfy();
      this.e.a(localcfy);
    }
    setContentView(efj.tT);
  }
  
  public final gya r_()
  {
    return gya.ac;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     com.google.android.apps.plus.phone.HostSingleAlbumTileActivity
 * JD-Core Version:    0.7.0.1
 */