package com.google.android.libraries.social.squares.impl.homepage;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import az;
import bk;
import bp;
import bu;
import bv;
import bw;
import bz;
import cl;
import efj;
import git;
import gjp;
import gpm;
import gpq;
import gpr;
import gxi;
import idy;
import jxu;
import jxz;
import kyi;
import kyj;
import lcy;
import lzw;
import mbb;
import mbp;
import tp;

public final class SquareHomePageActivity
  extends mbp
  implements gpq, jxu
{
  private final git d = new gjp(this, this.n).a(this.m);
  private kyi e;
  
  public SquareHomePageActivity()
  {
    new idy(this, this.n, "android_communities_gmh");
    lzw locallzw = new lzw(this, this.n);
    this.m.a(lzw.class, locallzw);
    new gxi(this, this.n).a(this.m);
  }
  
  public final bk H_()
  {
    bk localbk = this.b.a.d.a(16908290);
    if ((localbk instanceof jxu)) {
      localbk = ((jxu)localbk).H_();
    }
    return localbk;
  }
  
  protected final void a(Bundle paramBundle)
  {
    super.a(paramBundle);
    ((gpm)new gpm(this, this.n, efj.Xo).a(this.m).a(this));
    new jxz(this, this.n, this).a(this.m);
    this.e = ((kyi)this.m.a(kyi.class));
  }
  
  public final void a(gpr paramgpr)
  {
    paramgpr.b(az.H);
    paramgpr.a(az.M, this.e.a());
  }
  
  public final void a(tp paramtp)
  {
    efj.a(paramtp, true);
    paramtp.c(true);
    paramtp.a(0.0F);
  }
  
  public final boolean a(MenuItem paramMenuItem)
  {
    if (paramMenuItem.getItemId() == az.H)
    {
      startActivity(((kyj)this.m.a(kyj.class)).a(this, this.d.c()));
      return true;
    }
    return false;
  }
  
  public final void b(tp paramtp) {}
  
  protected final void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    setContentView(efj.Xm);
    bz localbz = this.b.a.d;
    if (localbz.a(16908290) == null)
    {
      lcy locallcy = lcy.a(getIntent().getIntExtra("squareTabIndex", 0));
      localbz.a().a(16908290, locallcy).b();
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     com.google.android.libraries.social.squares.impl.homepage.SquareHomePageActivity
 * JD-Core Version:    0.7.0.1
 */