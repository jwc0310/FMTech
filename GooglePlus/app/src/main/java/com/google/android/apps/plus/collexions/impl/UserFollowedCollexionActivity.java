package com.google.android.apps.plus.collexions.impl;

import aau;
import android.content.Intent;
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
import hjb;
import jyj;
import lzw;
import mbb;
import mbp;

public final class UserFollowedCollexionActivity
  extends mbp
{
  public UserFollowedCollexionActivity()
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
    setContentView(aau.wq);
    setTitle(ehr.x);
    bz localbz = this.b.a.d;
    if (localbz.a(efj.zB) == null)
    {
      Intent localIntent = getIntent();
      hjb localhjb = hjb.a(efj.zx, localIntent.getStringExtra("clx_gaiaId"), localIntent.getBooleanExtra("disableViewCollexionsFromCircles", false), true);
      localbz.a().a(efj.zB, localhjb).b();
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     com.google.android.apps.plus.collexions.impl.UserFollowedCollexionActivity
 * JD-Core Version:    0.7.0.1
 */