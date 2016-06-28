package com.google.android.apps.plus.squares.impl;

import aaw;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import bhp;
import bk;
import dpq;
import efj;
import eyg;
import git;
import gjp;
import gpl;
import gpm;
import gpq;
import gpr;
import idy;
import iot;
import java.util.ArrayList;
import java.util.List;
import jyj;
import kyq;
import lzw;
import mbb;
import mbp;
import tp;

public final class HostSquareMemberSearchActivity
  extends mbp
  implements gpq
{
  private final bhp d;
  
  public HostSquareMemberSearchActivity()
  {
    new idy(this, this.n, "android_communities_gmh");
    new jyj(this, this.n);
    lzw locallzw = new lzw(this, this.n);
    this.m.a(lzw.class, locallzw);
    new iot(this, this.n, eyg.A).a.add("com.google.android.libraries.social.notifications.FROM_ANDROID_NOTIFICATION");
    gjp localgjp = new gjp(this, this.n);
    this.m.a(git.class, localgjp);
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
  
  public final void b(tp paramtp) {}
  
  protected final void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    if (paramBundle == null)
    {
      bk localbk = ((kyq)this.m.a(kyq.class)).a(getIntent().getStringExtra("square_id"), getIntent().getIntExtra("square_membership", -1));
      this.d.a(localbk);
    }
    setContentView(aaw.nf);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     com.google.android.apps.plus.squares.impl.HostSquareMemberSearchActivity
 * JD-Core Version:    0.7.0.1
 */