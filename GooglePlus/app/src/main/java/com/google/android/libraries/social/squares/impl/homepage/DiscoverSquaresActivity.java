package com.google.android.libraries.social.squares.impl.homepage;

import android.os.Bundle;
import az;
import bp;
import bu;
import bv;
import bw;
import bz;
import cl;
import do;
import efj;
import gjp;
import lcp;
import lcr;
import lzw;
import mbb;
import mbp;

public final class DiscoverSquaresActivity
  extends mbp
{
  public DiscoverSquaresActivity()
  {
    new gjp(this, this.n).a(this.m);
    lzw locallzw = new lzw(this, this.n);
    this.m.a(lzw.class, locallzw);
  }
  
  protected final void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    setContentView(efj.Xj);
    setTitle(do.M);
    bz localbz = this.b.a.d;
    if (localbz.a(16908290) == null)
    {
      lcr locallcr = new lcr();
      int i = az.K;
      locallcr.a.putInt("refreshMenuId", i);
      lcp locallcp = locallcr.a();
      localbz.a().a(16908290, locallcp).b();
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     com.google.android.libraries.social.squares.impl.homepage.DiscoverSquaresActivity
 * JD-Core Version:    0.7.0.1
 */