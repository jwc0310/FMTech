package com.google.android.libraries.social.onboarding;

import android.os.Bundle;
import android.view.MenuItem;
import bk;
import bp;
import bu;
import bv;
import bw;
import bz;
import cl;
import efj;
import git;
import giz;
import gjc;
import gjp;
import gpl;
import gpm;
import gpq;
import gpr;
import java.util.List;
import jes;
import jet;
import jev;
import jew;
import mbb;
import mbp;
import tp;

public final class InterstitialsActivity
  extends mbp
  implements gpq, jev
{
  private final git d = new gjp(this, this.n).a(this.m);
  private List<jes> e;
  private int f = -1;
  private jew g;
  
  private void g()
  {
    this.f = (1 + this.f);
    if (this.f >= this.e.size())
    {
      finish();
      return;
    }
    jes localjes = (jes)this.e.get(this.f);
    bz localbz = this.b.a.d;
    int i = this.d.c();
    if (!jew.a(this, i)) {}
    for (boolean bool = true; localjes.a(this, i, bool) == jet.a; bool = false)
    {
      bk localbk = localjes.a();
      cl localcl = localbz.a();
      localcl.b(efj.QK, localbk, "fragment_tag");
      localcl.b();
      return;
    }
  }
  
  protected final void a(Bundle paramBundle)
  {
    super.a(paramBundle);
    ((gpm)new gpm(this, this.n, efj.QM).a(this.m).a(this));
    this.m.a(jev.class, this);
    this.e = this.m.c(jes.class);
    this.g = ((jew)this.m.a(jew.class));
  }
  
  public final void a(gpr paramgpr) {}
  
  public final void a(tp paramtp)
  {
    paramtp.e();
  }
  
  public final boolean a(MenuItem paramMenuItem)
  {
    return false;
  }
  
  public final void b(tp paramtp) {}
  
  public final void f()
  {
    g();
  }
  
  public final void finish()
  {
    int i = this.d.c();
    if (i != -1)
    {
      int j = -1 + this.e.size();
      int k = 0;
      if (j >= 0)
      {
        if (((jes)this.e.get(j)).a(this, i, true) == jet.c) {}
        for (int m = 1;; m = 0)
        {
          k |= m;
          j--;
          break;
        }
      }
      if (k == 0) {
        ((giz)mbb.a(this, giz.class)).b(i).b("ONBOARDING_COMPLETED", true).d();
      }
    }
    super.finish();
  }
  
  protected final void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    setContentView(efj.QL);
    if (paramBundle == null)
    {
      g();
      return;
    }
    this.f = paramBundle.getInt("interstitial_index");
  }
  
  public final void onDestroy()
  {
    ((gpl)this.m.a(gpl.class)).b(this);
    super.onDestroy();
  }
  
  protected final void onSaveInstanceState(Bundle paramBundle)
  {
    super.onSaveInstanceState(paramBundle);
    paramBundle.putInt("interstitial_index", this.f);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     com.google.android.libraries.social.onboarding.InterstitialsActivity
 * JD-Core Version:    0.7.0.1
 */