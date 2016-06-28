package com.google.android.apps.plus.phone;

import aaw;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import bhp;
import bwl;
import chr;
import dgh;
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

public class TopicStreamActivity
  extends mbp
  implements gpq, gxv
{
  private final bhp d;
  
  public TopicStreamActivity()
  {
    new idy(this, this.n, "android_default_gmh");
    new jyj(this, this.n);
    lzw locallzw = new lzw(this, this.n);
    this.m.a(lzw.class, locallzw);
    new iot(this, this.n, aaw.dM).a.add("com.google.android.libraries.social.notifications.FROM_ANDROID_NOTIFICATION");
    gjp localgjp = new gjp(this, this.n);
    this.m.a(git.class, localgjp);
    new bwl(new dgh(this)).a(this.m);
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
    paramtp.c(true);
    paramtp.a(getIntent().getStringExtra("query"));
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
      chr localchr = new chr();
      this.d.a(localchr);
    }
    setContentView(efj.wB);
  }
  
  public final gya r_()
  {
    return gya.e;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     com.google.android.apps.plus.phone.TopicStreamActivity
 * JD-Core Version:    0.7.0.1
 */