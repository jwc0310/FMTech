package com.google.android.apps.plus.phone;

import aaw;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.Window;
import bhp;
import bk;
import bwl;
import chu;
import cyf;
import dgl;
import djp;
import dpq;
import efj;
import git;
import gjp;
import gpl;
import gpm;
import gpq;
import gpr;
import gxv;
import gya;
import idy;
import iot;
import java.util.ArrayList;
import java.util.List;
import jyj;
import lzw;
import mbb;
import mbp;
import tp;

public class UnifiedSearchActivity
  extends mbp
  implements gpq, gxv
{
  private final bhp d;
  
  public UnifiedSearchActivity()
  {
    new idy(this, this.n, "android_default_gmh");
    new jyj(this, this.n);
    lzw locallzw = new lzw(this, this.n);
    this.m.a(lzw.class, locallzw);
    new iot(this, this.n, aaw.dM).a.add("com.google.android.libraries.social.notifications.FROM_ANDROID_NOTIFICATION");
    gjp localgjp = new gjp(this, this.n);
    this.m.a(git.class, localgjp);
    new bwl(new dgl(this)).a(this.m);
    this.d = new bhp(this, aaw.dM);
  }
  
  protected final void a(Bundle paramBundle)
  {
    super.a(paramBundle);
    gpm localgpm = new gpm(this, this.n, efj.wT);
    this.m.a(gpl.class, localgpm);
    if (localgpm.b.contains(this)) {
      throw new IllegalStateException("Attempt to add ActionBarListener twice");
    }
    localgpm.b.add(this);
    localgpm.c();
    ((gpm)localgpm);
    this.m.a(gxv.class, this);
  }
  
  public final void a(gpr paramgpr)
  {
    paramgpr.a(aaw.jH, new dpq());
  }
  
  public final void a(tp paramtp)
  {
    efj.a(paramtp, false);
    paramtp.c(true);
  }
  
  public final boolean a(MenuItem paramMenuItem)
  {
    return false;
  }
  
  public final void b(Bundle paramBundle) {}
  
  public final void b(tp paramtp) {}
  
  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    int i = ((git)this.m.a(git.class)).c();
    if (((djp)this.m.a(djp.class)).a(i))
    {
      setTheme(efj.yT);
      int j = getResources().getColor(efj.ka);
      if (Build.VERSION.SDK_INT >= 21)
      {
        Window localWindow = getWindow();
        localWindow.addFlags(-2147483648);
        localWindow.setStatusBarColor(j);
      }
    }
    if (paramBundle == null)
    {
      boolean bool = getIntent().getBooleanExtra("people_clear_cache", true);
      chu localchu = new chu();
      Bundle localBundle = new Bundle();
      localBundle.putBoolean("clear_people_suggestions", bool);
      localBundle.putParcelable("circle_info", new cyf(this, null, "v.whatshot", 0, 0L));
      localchu.f(localBundle);
      this.d.a(localchu);
    }
    setContentView(efj.tT);
  }
  
  public final gya r_()
  {
    return gya.I;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     com.google.android.apps.plus.phone.UnifiedSearchActivity
 * JD-Core Version:    0.7.0.1
 */