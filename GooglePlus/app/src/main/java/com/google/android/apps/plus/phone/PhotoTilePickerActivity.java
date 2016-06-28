package com.google.android.apps.plus.phone;

import aaw;
import android.os.Bundle;
import android.view.MenuItem;
import asl;
import aso;
import asr;
import atu;
import atx;
import bhp;
import ceu;
import cij;
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

public class PhotoTilePickerActivity
  extends mbp
  implements gpq, gxv
{
  private final bhp d;
  
  public PhotoTilePickerActivity()
  {
    new idy(this, this.n, "android_photos_gmh");
    new atx(this, this.n);
    new jyj(this, this.n);
    lzw locallzw = new lzw(this, this.n);
    this.m.a(lzw.class, locallzw);
    new iot(this, this.n, aaw.dM).a.add("com.google.android.libraries.social.notifications.FROM_ANDROID_NOTIFICATION");
    gjp localgjp = new gjp(this, this.n);
    this.m.a(git.class, localgjp);
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
    mbb localmbb = this.m;
    localmbb.a(gxv.class, this);
    localmbb.a("com.google.android.libraries.social.appid", Integer.valueOf(2));
    localmbb.a(cij.class, new cij(this, this.n, new cpb()));
    localmbb.a(asl.class, new asl(this, this.n));
    localmbb.a(asr.class, new aso(this, this.n));
    localmbb.a(atu.class, new atu(this, this.n));
  }
  
  public final void a(gpr paramgpr)
  {
    paramgpr.a(aaw.jH, new dpq());
  }
  
  public final void a(tp paramtp)
  {
    efj.a(paramtp, true);
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
      ceu localceu = new ceu();
      this.d.a(localceu);
    }
    setContentView(efj.tT);
  }
  
  public final gya r_()
  {
    return gya.l;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     com.google.android.apps.plus.phone.PhotoTilePickerActivity
 * JD-Core Version:    0.7.0.1
 */