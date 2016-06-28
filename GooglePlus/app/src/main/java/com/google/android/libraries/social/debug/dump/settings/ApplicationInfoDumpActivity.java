package com.google.android.libraries.social.debug.dump.settings;

import aau;
import android.os.Bundle;
import bp;
import bu;
import bv;
import bw;
import bz;
import cl;
import efj;
import gjp;
import htg;
import mbp;

public final class ApplicationInfoDumpActivity
  extends mbp
{
  public ApplicationInfoDumpActivity()
  {
    new gjp(this, this.n).a(this.m);
  }
  
  public final void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    setContentView(efj.Kk);
    bz localbz = this.b.a.d;
    if (localbz.a(aau.zH) == null)
    {
      htg localhtg = new htg();
      localbz.a().a(aau.zH, localhtg).b();
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     com.google.android.libraries.social.debug.dump.settings.ApplicationInfoDumpActivity
 * JD-Core Version:    0.7.0.1
 */