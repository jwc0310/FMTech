package com.google.android.apps.plus.phone;

import aaw;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import bhp;
import bk;
import byl;
import byv;
import cie;
import cip;
import cir;
import ciu;
import ciy;
import cjd;
import cjm;
import cjo;
import cjq;
import cjx;
import ckf;
import cld;
import clh;
import clo;
import dpq;
import efj;
import git;
import gjp;
import gpl;
import gpm;
import gpq;
import gpr;
import gxl;
import gxs;
import gxv;
import gya;
import idy;
import iot;
import java.util.ArrayList;
import java.util.List;
import jiw;
import jkz;
import jyj;
import kbn;
import lzw;
import mbb;
import mbp;
import pkh;
import tp;

public class PeopleListActivity
  extends mbp
  implements gpq, gxv
{
  private final git d;
  private final bhp e;
  private cjx f;
  private int g;
  private boolean h;
  private boolean i;
  
  public PeopleListActivity()
  {
    new idy(this, this.n, "android_circles_gmh");
    new jyj(this, this.n);
    new iot(this, this.n, aaw.dM).a.add("com.google.android.libraries.social.notifications.FROM_ANDROID_NOTIFICATION");
    gxl localgxl = new gxl(pkh.A);
    this.m.a(gxs.class, localgxl);
    gjp localgjp = new gjp(this, this.n);
    this.m.a(git.class, localgjp);
    this.d = localgjp;
    this.e = new bhp(this, aaw.dM);
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
    localmbb.a(jiw.class, new jkz(this, this.n));
    if (!getIntent().getBooleanExtra("disable_up_button", false)) {
      this.m.a(lzw.class, new lzw(this, this.n));
    }
  }
  
  public final void a(bk parambk)
  {
    if ((parambk instanceof cjx)) {
      this.f = ((cjx)parambk);
    }
    super.a(parambk);
  }
  
  public final void a(gpr paramgpr)
  {
    paramgpr.a(aaw.jH, new dpq());
  }
  
  public final void a(tp paramtp)
  {
    efj.a(paramtp, false);
    paramtp.d(false);
    if (!getIntent().getExtras().getBoolean("disable_up_button", false)) {
      paramtp.c(true);
    }
  }
  
  public final boolean a(MenuItem paramMenuItem)
  {
    return false;
  }
  
  public final void b(Bundle paramBundle) {}
  
  public final void b(tp paramtp) {}
  
  public final Intent b_()
  {
    switch (this.g)
    {
    default: 
      return super.b_();
    }
    return ((kbn)this.m.a(kbn.class)).a(this, this.d.c());
  }
  
  public void onBackPressed()
  {
    if (this.f.K()) {}
    for (int j = 1;; j = -1)
    {
      setResult(j);
      finish();
      return;
    }
  }
  
  protected void onCreate(Bundle paramBundle)
  {
    Intent localIntent = getIntent();
    this.g = localIntent.getIntExtra("people_view_type", 1);
    this.h = localIntent.getBooleanExtra("people_clear_cache", false);
    this.i = localIntent.getBooleanExtra("white_action_bar", false);
    if (this.i) {
      setTheme(efj.yS);
    }
    super.onCreate(paramBundle);
    if (paramBundle == null) {
      switch (this.g)
      {
      }
    }
    for (;;)
    {
      cjx localcjx = this.f;
      this.e.a(localcjx);
      setContentView(efj.tU);
      return;
      this.f = new cip();
      continue;
      this.f = new cjo();
      continue;
      this.f = new clo(this.h);
      continue;
      this.f = new cir(1);
      continue;
      this.f = new cir(0);
      continue;
      this.f = new cjm();
      continue;
      this.f = new ciy();
      continue;
      this.f = new ciu();
      continue;
      this.f = new cjd();
      continue;
      this.f = new byl();
      continue;
      this.f = new cld(getIntent().getStringExtra("query"), getIntent().getBooleanExtra("is_for_unified_search", false));
      continue;
      this.f = new cie();
      continue;
      this.f = new clh();
      continue;
      this.f = new ckf(this.h);
      continue;
      this.f = new byv(this.h);
      continue;
      this.f = new cjq();
    }
  }
  
  public final gya r_()
  {
    switch (this.g)
    {
    case 9: 
    case 10: 
    case 11: 
    default: 
      return gya.W;
    case 8: 
      return gya.j;
    case 12: 
      return gya.v;
    }
    return gya.t;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     com.google.android.apps.plus.phone.PeopleListActivity
 * JD-Core Version:    0.7.0.1
 */