package com.google.android.libraries.social.experiments.debug;

import android.os.Bundle;
import android.os.Process;
import efj;
import gjp;
import gxv;
import gya;
import hyz;
import jyj;
import lzw;
import mbb;
import mbp;
import tp;
import uo;
import uq;

public final class ExperimentsBrowserActivity
  extends mbp
  implements gxv, hyz
{
  private boolean d = false;
  
  public ExperimentsBrowserActivity()
  {
    new jyj(this, this.n);
    new gjp(this, this.n).a(this.m);
    lzw locallzw = new lzw(this, this.n);
    this.m.a(lzw.class, locallzw);
  }
  
  protected final void a(Bundle paramBundle)
  {
    super.a(paramBundle);
    this.m.a(gxv.class, this);
    this.m.b(hyz.class, this);
  }
  
  public final void aC_()
  {
    this.d = true;
  }
  
  public final void b(Bundle paramBundle) {}
  
  public final void onBackPressed()
  {
    super.onBackPressed();
    if (this.d) {
      Process.killProcess(Process.myPid());
    }
  }
  
  public final void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    setContentView(efj.Mx);
    e().a().c(true);
  }
  
  public final gya r_()
  {
    return gya.n;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     com.google.android.libraries.social.experiments.debug.ExperimentsBrowserActivity
 * JD-Core Version:    0.7.0.1
 */