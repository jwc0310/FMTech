package com.google.android.apps.plus.collexions.impl;

import aau;
import aaw;
import android.os.Bundle;
import android.view.MenuItem;
import bk;
import boy;
import bp;
import bu;
import bv;
import bw;
import bz;
import cl;
import dpq;
import efj;
import git;
import gjp;
import gpl;
import gpm;
import gpq;
import gpr;
import gxi;
import gxp;
import idy;
import iot;
import java.util.ArrayList;
import java.util.List;
import jxu;
import jxz;
import jyj;
import lzw;
import mbb;
import mbp;
import tp;

public final class CollexionHomePageActivity
  extends mbp
  implements gpq, jxu
{
  private bk d;
  
  public CollexionHomePageActivity()
  {
    new idy(this, this.n, "android_collections_gmh");
    new jyj(this, this.n);
    new iot(this, this.n, 16908290).a.add("com.google.android.libraries.social.notifications.FROM_ANDROID_NOTIFICATION");
    lzw locallzw = new lzw(this, this.n);
    this.m.a(lzw.class, locallzw);
    gjp localgjp = new gjp(this, this.n);
    this.m.a(git.class, localgjp);
    gxi localgxi = new gxi(this, this.n);
    this.m.a(gxp.class, localgxi);
    new jxz(this, this.n, this).a(this.m);
  }
  
  public final bk H_()
  {
    return this.d;
  }
  
  protected final void a(Bundle paramBundle)
  {
    super.a(paramBundle);
    gpm localgpm = new gpm(this, this.n, aaw.mS);
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
    paramtp.a(0.0F);
  }
  
  public final boolean a(MenuItem paramMenuItem)
  {
    return false;
  }
  
  public final void b(tp paramtp) {}
  
  protected final void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    setContentView(aau.wi);
    bz localbz = this.b.a.d;
    this.d = localbz.a(16908290);
    if (this.d == null)
    {
      this.d = boy.a(true);
      localbz.a().a(16908290, this.d).b();
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     com.google.android.apps.plus.collexions.impl.CollexionHomePageActivity
 * JD-Core Version:    0.7.0.1
 */