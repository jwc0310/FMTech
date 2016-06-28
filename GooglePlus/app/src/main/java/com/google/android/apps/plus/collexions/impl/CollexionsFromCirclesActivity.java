package com.google.android.apps.plus.collexions.impl;

import aau;
import aaw;
import android.os.Bundle;
import android.view.MenuItem;
import bp;
import bu;
import bv;
import bw;
import bz;
import cl;
import dpq;
import efj;
import git;
import gjb;
import gjp;
import gpl;
import gpm;
import gpq;
import gpr;
import hit;
import idy;
import iot;
import java.util.ArrayList;
import java.util.List;
import jyj;
import lzw;
import mbb;
import mbp;
import tp;
import uo;
import uq;

public final class CollexionsFromCirclesActivity
  extends mbp
  implements gpq
{
  private final git d;
  
  public CollexionsFromCirclesActivity()
  {
    new idy(this, this.n, "android_collections_gmh");
    new jyj(this, this.n);
    new iot(this, this.n, efj.zu).a.add("com.google.android.libraries.social.notifications.FROM_ANDROID_NOTIFICATION");
    lzw locallzw = new lzw(this, this.n);
    this.m.a(lzw.class, locallzw);
    gjp localgjp = new gjp(this, this.n);
    this.m.a(git.class, localgjp);
    this.d = localgjp;
  }
  
  protected final void a(Bundle paramBundle)
  {
    super.a(paramBundle);
    gpm localgpm = new gpm(this, this.n, aaw.mT);
    this.m.a(gpl.class, localgpm);
    if (localgpm.b.contains(this)) {
      throw new IllegalStateException("Attempt to add ActionBarListener twice");
    }
    localgpm.b.add(this);
    localgpm.c();
    ((gpm)localgpm);
  }
  
  public final void a(gpr paramgpr)
  {
    paramgpr.a(efj.zz, new dpq());
  }
  
  public final void a(tp paramtp)
  {
    efj.a(paramtp, true);
  }
  
  public final boolean a(MenuItem paramMenuItem)
  {
    return false;
  }
  
  public final void b(tp paramtp) {}
  
  protected final void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    setContentView(aau.wm);
    e().a().b(hit.x());
    bz localbz = this.b.a.d;
    if (localbz.a(efj.zp) == null)
    {
      int i = efj.zx;
      String str = this.d.f().b("gaia_id");
      hit localhit = new hit();
      Bundle localBundle = new Bundle();
      localBundle.putInt("refreshMenuId", i);
      localBundle.putString("clx_gaiaId", str);
      localhit.f(localBundle);
      localbz.a().a(efj.zp, localhit).b();
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     com.google.android.apps.plus.collexions.impl.CollexionsFromCirclesActivity
 * JD-Core Version:    0.7.0.1
 */