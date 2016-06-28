package com.google.android.apps.plus.squares.impl;

import aaw;
import android.os.Bundle;
import android.view.MenuItem;
import bhp;
import bwl;
import dpq;
import dsx;
import dsy;
import efj;
import eyg;
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
import kzv;
import lzw;
import mbb;
import mbp;
import tp;

public final class HostSquareStreamActivity
  extends mbp
  implements gpq, gxv, kzv
{
  private final bhp d;
  
  public HostSquareStreamActivity()
  {
    new idy(this, this.n, "android_communities_gmh");
    new jyj(this, this.n);
    lzw locallzw = new lzw(this, this.n);
    this.m.a(lzw.class, locallzw);
    iot localiot = new iot(this, this.n, eyg.A);
    localiot.a.add("com.google.android.libraries.social.notifications.FROM_ANDROID_NOTIFICATION");
    localiot.a.add("from_shortcut");
    gjp localgjp = new gjp(this, this.n);
    this.m.a(git.class, localgjp);
    new bwl(new dsx(this)).a(this.m);
    this.d = new bhp(this, eyg.A);
  }
  
  protected final void a(Bundle paramBundle)
  {
    super.a(paramBundle);
    gpm localgpm = new gpm(this, this.n, eyg.P);
    this.m.a(gpl.class, localgpm);
    if (localgpm.b.contains(this)) {
      throw new IllegalStateException("Attempt to add ActionBarListener twice");
    }
    localgpm.b.add(this);
    localgpm.c();
    ((gpm)localgpm);
    this.m.a(gxv.class, this);
    this.m.a(kzv.class, this);
  }
  
  public final void a(gpr paramgpr)
  {
    paramgpr.a(eyg.J, new dpq());
  }
  
  public final void a(tp paramtp)
  {
    efj.a(paramtp, false);
    paramtp.c(true);
  }
  
  public final boolean a(MenuItem paramMenuItem)
  {
    return false;
  }
  
  public final void b(Bundle paramBundle) {}
  
  public final void b(tp paramtp) {}
  
  public final void g()
  {
    finish();
  }
  
  protected final void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    if (paramBundle == null)
    {
      dsy localdsy = new dsy();
      this.d.a(localdsy);
    }
    setContentView(aaw.ne);
  }
  
  public final gya r_()
  {
    return gya.E;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     com.google.android.apps.plus.squares.impl.HostSquareStreamActivity
 * JD-Core Version:    0.7.0.1
 */