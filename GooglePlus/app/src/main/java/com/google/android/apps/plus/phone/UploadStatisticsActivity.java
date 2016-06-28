package com.google.android.apps.plus.phone;

import aaw;
import android.os.Bundle;
import android.view.MenuItem;
import bhp;
import cpm;
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
import java.util.ArrayList;
import lzw;
import mbb;
import mbp;
import tp;

public class UploadStatisticsActivity
  extends mbp
  implements gpq, gxv
{
  private final bhp d;
  
  public UploadStatisticsActivity()
  {
    new idy(this, this.n, "android_default_gmh");
    lzw locallzw = new lzw(this, this.n);
    this.m.a(lzw.class, locallzw);
    gjp localgjp = new gjp(this, this.n);
    this.m.a(git.class, localgjp);
    localgjp.b = false;
    this.d = new bhp(this, aaw.dM);
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
    this.m.a(gxv.class, this);
  }
  
  public final void a(gpr paramgpr)
  {
    paramgpr.a(aaw.jH, new dpq());
  }
  
  public final void a(tp paramtp)
  {
    efj.a(paramtp, false);
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
    if (paramBundle == null)
    {
      cpm localcpm = new cpm();
      this.d.a(localcpm);
    }
    setContentView(efj.tT);
  }
  
  public final gya r_()
  {
    return gya.M;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     com.google.android.apps.plus.phone.UploadStatisticsActivity
 * JD-Core Version:    0.7.0.1
 */