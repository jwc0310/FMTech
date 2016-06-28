package com.google.android.libraries.social.collexions.impl.abuse;

import android.content.Intent;
import android.os.Bundle;
import bk;
import bp;
import bu;
import bv;
import bw;
import bz;
import cl;
import efj;
import hjg;
import lzw;
import mbb;
import mbp;

public final class CollexionAbuseAppealActivity
  extends mbp
{
  public CollexionAbuseAppealActivity()
  {
    lzw locallzw = new lzw(this, this.n);
    this.m.a(lzw.class, locallzw);
  }
  
  protected final void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    Bundle localBundle = getIntent().getExtras();
    if (localBundle == null) {
      throw new IllegalArgumentException("CollexionAbuseAppealActivity called without passing extras.");
    }
    setContentView(efj.HB);
    setTitle(null);
    bz localbz = this.b.a.d;
    if (localbz.a(efj.Hx) == null)
    {
      hjg localhjg = new hjg();
      localhjg.f(localBundle);
      localbz.a().a(efj.Hx, localhjg).b();
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     com.google.android.libraries.social.collexions.impl.abuse.CollexionAbuseAppealActivity
 * JD-Core Version:    0.7.0.1
 */