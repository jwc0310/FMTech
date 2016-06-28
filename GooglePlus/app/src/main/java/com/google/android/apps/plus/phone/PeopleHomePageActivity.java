package com.google.android.apps.plus.phone;

import aau;
import aaw;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.view.MenuItem;
import bk;
import bp;
import bu;
import bv;
import com.google.android.libraries.social.ui.views.slidingtab.SlidingTabLayout;
import ddw;
import djp;
import dpq;
import efj;
import git;
import gjp;
import gpl;
import gpm;
import gpq;
import gpr;
import gwz;
import gxi;
import gxp;
import gxq;
import gxr;
import gzj;
import hyi;
import idy;
import java.util.ArrayList;
import java.util.List;
import jik;
import jiw;
import jkz;
import jxt;
import jxu;
import jxz;
import lzw;
import mbb;
import mbp;
import pkb;
import tp;

public class PeopleHomePageActivity
  extends mbp
  implements gpq, jxu
{
  private static int i;
  public final git d;
  public final jxt e;
  public bk f;
  public boolean g;
  public boolean h;
  
  public PeopleHomePageActivity()
  {
    gxi localgxi = new gxi(this, this.n);
    this.m.a(gxp.class, localgxi);
    new idy(this, this.n, "android_circles_gmh");
    gzj localgzj = new gzj(this, this.n);
    this.m.a(gzj.class, localgzj);
    gjp localgjp = new gjp(this, this.n);
    this.m.a(git.class, localgjp);
    this.d = localgjp;
    this.e = new jxz(this, this.n, this).a(this.m);
  }
  
  public final bk H_()
  {
    return this.f;
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
    localmbb.a(lzw.class, new lzw(this, this.n));
    localmbb.a(jiw.class, new jkz(this, this.n));
  }
  
  public final void a(gpr paramgpr)
  {
    paramgpr.b(aaw.H);
    paramgpr.b(aaw.aH);
    paramgpr.a(aaw.jH, new dpq());
  }
  
  public final void a(tp paramtp)
  {
    efj.a(paramtp, true);
    paramtp.c(true);
    paramtp.a(0.0F);
  }
  
  public final boolean a(MenuItem paramMenuItem)
  {
    int j = paramMenuItem.getItemId();
    if (j == aaw.H)
    {
      int k = this.d.c();
      Intent localIntent2;
      if (((djp)this.m.a(djp.class)).c(k)) {
        localIntent2 = efj.b(this, k, "", null);
      }
      for (;;)
      {
        gxr localgxr = new gxr();
        gxq localgxq = new gxq(pkb.d);
        localgxr.b.add(localgxq);
        new gwz(4, localgxr.a(this)).b(this);
        startActivity(localIntent2);
        return true;
        localIntent2 = efj.e(this, this.d.c(), null);
        localIntent2.putExtra("white_action_bar", true);
      }
    }
    if (j == aaw.aH)
    {
      Intent localIntent1 = efj.a(this, this.d.c(), "15", getString(aau.jl));
      localIntent1.putExtra("people_view_type", 7);
      localIntent1.putExtra("white_action_bar", true);
      startActivity(localIntent1);
      return true;
    }
    return false;
  }
  
  public final void b(tp paramtp) {}
  
  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    hyi localhyi = (hyi)this.m.a(hyi.class);
    int j = this.d.c();
    this.g = localhyi.b(jik.a, j);
    this.h = localhyi.b(jik.b, j);
    setContentView(efj.vr);
    Resources localResources = getResources();
    if (i == 0) {
      i = localResources.getDimensionPixelSize(efj.mC);
    }
    ddw localddw = new ddw(this, this, this.b.a.d);
    ViewPager localViewPager = (ViewPager)findViewById(aaw.gX);
    localViewPager.c(2);
    localViewPager.a(localddw);
    ((SlidingTabLayout)findViewById(aaw.gW)).a(localViewPager);
    localViewPager.b(getIntent().getIntExtra("peopleTabIndex", 0));
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     com.google.android.apps.plus.phone.PeopleHomePageActivity
 * JD-Core Version:    0.7.0.1
 */