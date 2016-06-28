package com.google.android.libraries.social.networkqueue.impl;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import efj;
import gjp;
import gpm;
import gpq;
import gpr;
import gxj;
import gxl;
import idy;
import lzw;
import mbp;
import pjv;
import tp;

public final class PendingItemsActivity
  extends mbp
  implements gpq
{
  public PendingItemsActivity()
  {
    new idy(this, this.n, "android_default");
    new gjp(this, this.n).a(this.m);
    new gxl(pjv.b).a(this.m);
    new gxj(this.n);
    new lzw(this, this.n);
  }
  
  protected final void a(Bundle paramBundle)
  {
    super.a(paramBundle);
    ((gpm)new gpm(this, this.n, efj.Qf).a(this.m).a(this));
  }
  
  public final void a(gpr paramgpr) {}
  
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
  
  public final void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    setTitle(efj.Qm);
    setContentView(efj.Qd);
  }
  
  protected final void onNewIntent(Intent paramIntent)
  {
    super.onNewIntent(paramIntent);
    setIntent(paramIntent);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     com.google.android.libraries.social.networkqueue.impl.PendingItemsActivity
 * JD-Core Version:    0.7.0.1
 */