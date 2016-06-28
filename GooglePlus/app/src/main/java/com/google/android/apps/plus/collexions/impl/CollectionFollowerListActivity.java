package com.google.android.apps.plus.collexions.impl;

import aau;
import aaw;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import bhp;
import dpq;
import efj;
import git;
import gjp;
import gpl;
import gpm;
import gpq;
import gpr;
import hij;
import idy;
import iot;
import java.util.ArrayList;
import java.util.List;
import jyj;
import lzw;
import mbb;
import mbp;
import tp;

public final class CollectionFollowerListActivity
  extends mbp
  implements gpq
{
  private final bhp d;
  
  public CollectionFollowerListActivity()
  {
    new idy(this, this.n, "android_collections_gmh");
    new jyj(this, this.n);
    new iot(this, this.n, efj.zu).a.add("com.google.android.libraries.social.notifications.FROM_ANDROID_NOTIFICATION");
    lzw locallzw = new lzw(this, this.n);
    this.m.a(lzw.class, locallzw);
    gjp localgjp = new gjp(this, this.n);
    this.m.a(git.class, localgjp);
    this.d = new bhp(this, efj.zu);
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
    efj.a(paramtp, false);
    paramtp.c(true);
  }
  
  public final boolean a(MenuItem paramMenuItem)
  {
    return false;
  }
  
  public final void b(tp paramtp) {}
  
  protected final void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    if (paramBundle == null)
    {
      String str = getIntent().getStringExtra("clx_id");
      bhp localbhp = this.d;
      int i = efj.zx;
      hij localhij = new hij();
      Bundle localBundle = new Bundle();
      localBundle.putString("clx_id", str);
      localBundle.putInt("refreshMenuId", i);
      localhij.f(localBundle);
      localbhp.a(localhij);
    }
    setContentView(aau.wp);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     com.google.android.apps.plus.collexions.impl.CollectionFollowerListActivity
 * JD-Core Version:    0.7.0.1
 */