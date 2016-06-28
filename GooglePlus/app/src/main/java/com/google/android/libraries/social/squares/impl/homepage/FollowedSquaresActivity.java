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
import lcs;
import lct;
import lzw;
import mbb;
import mbp;

public final class FollowedSquaresActivity
  extends mbp
{
  public FollowedSquaresActivity()
  {
    new gjp(this, this.n).a(this.m);
    lzw locallzw = new lzw(this, this.n);
    this.m.a(lzw.class, locallzw);
  }
  
  protected final void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    setContentView(efj.Xk);
    setTitle(do.L);
    if (paramBundle == null)
    {
      bz localbz = this.b.a.d;
      if (localbz.a(16908290) == null)
      {
        lct locallct = new lct();
        int i = az.K;
        locallct.a.putInt("refreshMenuId", i);
        lcs locallcs = locallct.a();
        localbz.a().a(16908290, locallcs).b();
      }
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     com.google.android.libraries.social.squares.impl.homepage.FollowedSquaresActivity
 * JD-Core Version:    0.7.0.1
 */