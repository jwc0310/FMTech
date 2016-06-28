package com.google.android.apps.plus.settings;

import android.os.Bundle;
import android.view.MenuItem;
import doj;
import dok;
import efj;
import git;
import gjp;
import gpl;
import gpm;
import gpq;
import gpr;
import htu;
import idy;
import java.util.ArrayList;
import lzw;
import mbb;
import mbp;
import tp;

public class GplusDeveloperSettingsActivity
  extends mbp
  implements gpq
{
  public GplusDeveloperSettingsActivity()
  {
    new idy(this, this.n, "android_settings_gmh");
    new lzw(this, this.n);
    gjp localgjp = new gjp(this, this.n);
    this.m.a(git.class, localgjp);
    new doj(this, this, this.n);
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
    this.m.a(htu.class, new dok(this));
  }
  
  public final void a(gpr paramgpr) {}
  
  public final void a(tp paramtp) {}
  
  public final boolean a(MenuItem paramMenuItem)
  {
    return false;
  }
  
  public final void b(tp paramtp) {}
  
  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    setContentView(efj.tl);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     com.google.android.apps.plus.settings.GplusDeveloperSettingsActivity
 * JD-Core Version:    0.7.0.1
 */