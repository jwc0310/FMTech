package com.google.android.apps.plus.phone;

import aaw;
import android.os.Bundle;
import android.view.MenuItem;
import bhp;
import cap;
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

public class AddToAlbumActivity
  extends mbp
  implements gpq, gxv
{
  private final bhp d;
  
  public AddToAlbumActivity()
  {
    new idy(this, this.n, "android_photos_gmh");
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
      cap localcap = new cap();
      this.d.a(localcap);
    }
    setContentView(efj.tT);
  }
  
  public final gya r_()
  {
    return gya.l;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     com.google.android.apps.plus.phone.AddToAlbumActivity
 * JD-Core Version:    0.7.0.1
 */