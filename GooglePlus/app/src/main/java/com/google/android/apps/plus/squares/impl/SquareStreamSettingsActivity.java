package com.google.android.apps.plus.squares.impl;

import aaw;
import android.os.Bundle;
import android.view.MenuItem;
import dtm;
import efj;
import eyg;
import git;
import gjp;
import gpl;
import gpm;
import gpq;
import gpr;
import idy;
import java.util.ArrayList;
import lzw;
import mbb;
import mbp;
import tp;

public final class SquareStreamSettingsActivity
  extends mbp
  implements gpq
{
  public SquareStreamSettingsActivity()
  {
    gjp localgjp = new gjp(this, this.n);
    this.m.a(git.class, localgjp);
    new idy(this, this.n, "android_communities_gmh");
    new lzw(this, this.n);
    new dtm(this, this, this.n);
  }
  
  protected final void a(Bundle paramBundle)
  {
    super.a(paramBundle);
    gpm localgpm = new gpm(this, this.n, eyg.P);
    this.m.a(gpl.class, localgpm);
    if (localgpm.b.contains(this)) {
      throw new IllegalStateException("Attempt to add ActionBarListener twice");
    }
    localgpm.b.add(this);
    localgpm.c();
    ((gpm)localgpm);
  }
  
  public final void a(gpr paramgpr) {}
  
  public final void a(tp paramtp)
  {
    paramtp.b(efj.By);
  }
  
  public final boolean a(MenuItem paramMenuItem)
  {
    return false;
  }
  
  public final void b(tp paramtp) {}
  
  protected final void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    setContentView(aaw.nb);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     com.google.android.apps.plus.squares.impl.SquareStreamSettingsActivity
 * JD-Core Version:    0.7.0.1
 */