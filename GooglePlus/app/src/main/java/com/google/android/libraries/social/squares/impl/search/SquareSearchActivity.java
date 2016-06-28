package com.google.android.libraries.social.squares.impl.search;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import bp;
import bu;
import bv;
import bw;
import cl;
import da;
import efj;
import gjp;
import gpm;
import gpq;
import gpr;
import gxl;
import idy;
import kyi;
import ldl;
import lzw;
import mbb;
import mbp;
import pjo;
import tp;

public final class SquareSearchActivity
  extends mbp
  implements gpq
{
  private kyi d;
  
  public SquareSearchActivity()
  {
    new gxl(pjo.s).a(this.m);
    lzw locallzw = new lzw(this, this.n);
    this.m.a(lzw.class, locallzw);
    new gjp(this, this.n).a(this.m);
    new idy(this, this.n, "android_communities_gmh");
  }
  
  protected final void a(Bundle paramBundle)
  {
    super.a(paramBundle);
    ((gpm)new gpm(this, this.n, efj.Xu).a(this.m).a(this));
    this.d = ((kyi)this.m.a(kyi.class));
  }
  
  public final void a(gpr paramgpr)
  {
    paramgpr.a(da.ag, this.d.a());
  }
  
  public final void a(tp paramtp)
  {
    efj.a(paramtp, true);
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
      Bundle localBundle = new Bundle();
      localBundle.putString("query", getIntent().getExtras().getString("query"));
      ldl localldl = new ldl();
      localldl.f(localBundle);
      this.b.a.d.a().a(16908290, localldl).b();
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     com.google.android.libraries.social.squares.impl.search.SquareSearchActivity
 * JD-Core Version:    0.7.0.1
 */