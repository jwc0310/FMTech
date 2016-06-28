package com.google.android.apps.plus.phone;

import aaw;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import anz;
import asl;
import aso;
import asr;
import atx;
import bhp;
import bk;
import cfp;
import cij;
import cpb;
import dfk;
import dpq;
import efj;
import git;
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
import jyj;
import lzw;
import mbb;
import mbp;
import tp;

public class SelectFromHomePhotosActivity
  extends mbp
  implements gpq, gxv
{
  public final git d;
  private final bhp e;
  
  public SelectFromHomePhotosActivity()
  {
    new idy(this, this.n, "android_photos_gmh");
    new atx(this, this.n);
    new jyj(this, this.n);
    lzw locallzw = new lzw(this, this.n);
    this.m.a(lzw.class, locallzw);
    new iot(this, this.n, aaw.dM).a.add("com.google.android.libraries.social.notifications.FROM_ANDROID_NOTIFICATION");
    dfk localdfk = new dfk(this, this.n);
    localdfk.a = 1;
    localdfk.b = "com.google.android.libraries.social.notifications.FROM_ANDROID_NOTIFICATION";
    gjp localgjp = new gjp(this, this.n);
    this.m.a(git.class, localgjp);
    localgjp.b = false;
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
    localmbb.a(asr.class, new aso(this, this.n));
    anz localanz = (anz)this.m.a(anz.class);
    localanz.b = "Photos";
    localanz.c = 1;
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
      return;
    }
  }
  
  public final boolean a(MenuItem paramMenuItem)
  {
    return false;
  }
  
  public final void b(Bundle paramBundle) {}
  
  public final void b(tp paramtp) {}
  
  public Intent b_()
  {
    return efj.a(this, this.d.c(), 0);
  }
  
  protected int g()
  {
    return 2;
  }
  
  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    cfp localcfp;
    Bundle localBundle;
    if (paramBundle == null)
    {
      localcfp = new cfp();
      localBundle = new Bundle();
      if (mbb.a(this, "com.google.android.libraries.social.appid", 300) != 2) {
        break label70;
      }
    }
    label70:
    for (boolean bool = true;; bool = false)
    {
      localBundle.putBoolean("disable_up_button", bool);
      localcfp.f(localBundle);
      this.e.a(localcfp);
      setContentView(efj.tT);
      return;
    }
  }
  
  public final gya r_()
  {
    return null;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     com.google.android.apps.plus.phone.SelectFromHomePhotosActivity
 * JD-Core Version:    0.7.0.1
 */