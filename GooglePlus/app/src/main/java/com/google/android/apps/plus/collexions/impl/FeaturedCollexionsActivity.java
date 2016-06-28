package com.google.android.apps.plus.collexions.impl;

import aau;
import android.os.Bundle;
import bp;
import bu;
import bv;
import bw;
import bz;
import cl;
import efj;
import ehr;
import git;
import gjp;
import hiy;
import jyj;
import lzw;
import mbb;
import mbp;

public final class FeaturedCollexionsActivity
  extends mbp
{
  public FeaturedCollexionsActivity()
  {
    gjp localgjp = new gjp(this, this.n);
    this.m.a(git.class, localgjp);
    new jyj(this, this.n);
    lzw locallzw = new lzw(this, this.n);
    this.m.a(lzw.class, locallzw);
  }
  
  protected final void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    setContentView(aau.wn);
    setTitle(ehr.g);
    bz localbz = this.b.a.d;
    if (localbz.a(efj.zt) == null)
    {
      hiy localhiy = hiy.a(efj.zx, true);
      localbz.a().a(efj.zt, localhiy).b();
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     com.google.android.apps.plus.collexions.impl.FeaturedCollexionsActivity
 * JD-Core Version:    0.7.0.1
 */