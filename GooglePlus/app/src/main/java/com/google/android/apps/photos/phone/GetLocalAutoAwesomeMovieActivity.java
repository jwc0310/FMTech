package com.google.android.apps.photos.phone;

import aaw;
import android.annotation.TargetApi;
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
import bp;
import bu;
import bv;
import bw;
import bz;
import ccv;
import cij;
import cl;
import cpb;
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

@TargetApi(18)
public class GetLocalAutoAwesomeMovieActivity
  extends mbp
  implements gpq, gxv
{
  private final git d;
  private final bhp e;
  
  public GetLocalAutoAwesomeMovieActivity()
  {
    new idy(this, this.n, "android_photos_gmh");
    new atx(this, this.n);
    new jyj(this, this.n);
    lzw locallzw = new lzw(this, this.n);
    this.m.a(lzw.class, locallzw);
    new iot(this, this.n, aaw.dM).a.add("com.google.android.libraries.social.notifications.FROM_ANDROID_NOTIFICATION");
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
    localmbb.a("com.google.android.libraries.social.appid", Integer.valueOf(2));
    localmbb.a(cij.class, new cij(this, this.n, new cpb()));
    localmbb.a(asl.class, new asl(this, this.n));
    localmbb.a(asr.class, new aso(this, this.n));
    anz localanz = (anz)this.m.a(anz.class);
    localanz.b = "LocalAutoAwesomeMovies";
    localanz.c = 3;
  }
  
  public final void a(gpr paramgpr)
  {
    paramgpr.a(aaw.jH, new dpq());
  }
  
  public final void a(tp paramtp)
  {
    paramtp.b(true);
  }
  
  public final boolean a(MenuItem paramMenuItem)
  {
    return false;
  }
  
  public final void b(Bundle paramBundle) {}
  
  public final void b(tp paramtp) {}
  
  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    ccv localccv;
    bhp localbhp;
    int i;
    Object localObject;
    Bundle localBundle2;
    if (paramBundle == null)
    {
      Bundle localBundle1 = new Bundle();
      localccv = new ccv();
      localBundle1.putBoolean("hide_search_view", true);
      localBundle1.putInt("account_id", this.d.c());
      localccv.f(localBundle1);
      localbhp = this.e;
      i = localbhp.b;
      localObject = localbhp.a.getIntent().getExtras();
      localBundle2 = localccv.m;
      if (localBundle2 != null) {
        break label170;
      }
      if (localObject == null) {
        localObject = new Bundle();
      }
    }
    for (;;)
    {
      localccv.f((Bundle)localObject);
      bz localbz = localbhp.a.b.a.d;
      cl localcl = localbz.a();
      localcl.b(i, localccv, "default");
      localcl.a(0);
      localcl.c();
      localbz.b();
      setContentView(efj.tT);
      return;
      label170:
      if (localObject == null)
      {
        localObject = localBundle2;
      }
      else
      {
        Bundle localBundle3 = new Bundle(((Bundle)localObject).size() + localBundle2.size());
        localBundle3.putAll((Bundle)localObject);
        localBundle3.putAll(localBundle2);
        localObject = localBundle3;
      }
    }
  }
  
  public final gya r_()
  {
    return gya.g;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     com.google.android.apps.photos.phone.GetLocalAutoAwesomeMovieActivity
 * JD-Core Version:    0.7.0.1
 */