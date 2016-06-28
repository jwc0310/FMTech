package com.google.android.apps.plus.phone;

import aau;
import aaw;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import bp;
import bu;
import bv;
import bw;
import cl;
import coh;
import dpq;
import efj;
import git;
import gjp;
import gpl;
import gpm;
import gpq;
import gpr;
import gxj;
import gxq;
import gxs;
import idy;
import java.util.ArrayList;
import lzw;
import mbb;
import mbp;
import pjo;
import tp;

public class ProfileSquareListActivity
  extends mbp
  implements gpq, gxs
{
  public ProfileSquareListActivity()
  {
    new idy(this, this.n, "android_communities_gmh");
    gjp localgjp = new gjp(this, this.n);
    this.m.a(git.class, localgjp);
    lzw locallzw = new lzw(this, this.n);
    this.m.a(lzw.class, locallzw);
    new gxj(this.n);
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
    this.m.a(gxs.class, this);
  }
  
  public final void a(gpr paramgpr)
  {
    paramgpr.d(aau.qd);
    paramgpr.a(aaw.jH, new dpq());
  }
  
  public final void a(tp paramtp) {}
  
  public final boolean a(MenuItem paramMenuItem)
  {
    return false;
  }
  
  public final void b(tp paramtp) {}
  
  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    setContentView(efj.tT);
    if (paramBundle == null)
    {
      cl localcl = this.b.a.d.a();
      int i = aaw.dM;
      String str = getIntent().getStringExtra("person_id");
      coh localcoh = new coh();
      Bundle localBundle = new Bundle();
      localBundle.putString("person_id", str);
      localcoh.f(localBundle);
      localcl.b(i, localcoh);
      localcl.b();
    }
  }
  
  public final gxq v()
  {
    return new gxq(pjo.d);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     com.google.android.apps.plus.phone.ProfileSquareListActivity
 * JD-Core Version:    0.7.0.1
 */