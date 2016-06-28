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
import kyh;
import kyp;
import kyr;
import lzw;
import mbb;
import mbp;
import tp;

public final class SquareMemberListActivity
  extends mbp
  implements gpq
{
  private final git d;
  private final bhp e;
  
  public SquareMemberListActivity()
  {
    new idy(this, this.n, "android_communities_gmh");
    new jyj(this, this.n);
    new iot(this, this.n, eyg.A).a.add("com.google.android.libraries.social.notifications.FROM_ANDROID_NOTIFICATION");
    lzw locallzw = new lzw(this, this.n);
    this.m.a(lzw.class, locallzw);
    gjp localgjp = new gjp(this, this.n);
    this.m.a(git.class, localgjp);
    this.d = localgjp;
    this.e = new bhp(this, eyg.A);
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
    paramgpr.b(eyg.r);
    paramgpr.a(eyg.J, new dpq());
  }
  
  public final void a(tp paramtp)
  {
    efj.a(paramtp, false);
    paramtp.c(true);
  }
  
  public final boolean a(MenuItem paramMenuItem)
  {
    if (paramMenuItem.getItemId() == eyg.r)
    {
      onSearchRequested();
      return true;
    }
    return false;
  }
  
  public final void b(tp paramtp) {}
  
  public final Intent b_()
  {
    String str = getIntent().getStringExtra("square_id");
    return ((kyp)mbb.a(getApplicationContext(), kyp.class)).a(this.d.c(), str, null);
  }
  
  protected final void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    Intent localIntent = getIntent();
    if (paramBundle == null)
    {
      bk localbk = ((kyr)this.m.a(kyr.class)).a(localIntent.getStringExtra("square_id"));
      this.e.a(localbk);
    }
    setContentView(aaw.nf);
  }
  
  public final boolean onSearchRequested()
  {
    Intent localIntent = getIntent();
    startActivity(((kyh)mbb.a(this, kyh.class)).a(this.d.c(), localIntent.getStringExtra("square_id"), localIntent.getIntExtra("square_membership", 0)));
    return true;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     com.google.android.apps.plus.squares.impl.SquareMemberListActivity
 * JD-Core Version:    0.7.0.1
 */