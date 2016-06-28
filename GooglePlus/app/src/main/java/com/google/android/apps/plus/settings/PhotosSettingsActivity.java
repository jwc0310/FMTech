package com.google.android.apps.plus.settings;

import aaw;
import android.os.Bundle;
import android.view.MenuItem;
import dqg;
import dqh;
import efj;
import git;
import gjp;
import gpl;
import gpm;
import gpq;
import gpr;
import hzv;
import hzw;
import iir;
import java.util.ArrayList;
import lzw;
import mbb;
import mbp;
import tp;

public class PhotosSettingsActivity
  extends mbp
  implements gpq
{
  public PhotosSettingsActivity()
  {
    gjp localgjp = new gjp(this, this.n);
    this.m.a(git.class, localgjp);
    new lzw(this, this.n);
    new dqh(this, this, this.n);
  }
  
  protected final void a(Bundle paramBundle)
  {
    super.a(paramBundle);
    gpm localgpm = new gpm(this, this.n, efj.wW);
    this.m.a(gpl.class, localgpm);
    if (localgpm.b.contains(this)) {
      throw new IllegalStateException("Attempt to add ActionBarListener twice");
    }
    localgpm.b.add(this);
    localgpm.c();
    ((gpm)localgpm);
    this.m.a("com.google.android.libraries.social.appid", Integer.valueOf(2));
  }
  
  public final void a(gpr paramgpr)
  {
    paramgpr.a(aaw.fd, new hzv(hzw.b));
    paramgpr.a(aaw.fe, new iir("plus_settings"));
    paramgpr.a(aaw.fa, new dqg());
  }
  
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
 * Qualified Name:     com.google.android.apps.plus.settings.PhotosSettingsActivity
 * JD-Core Version:    0.7.0.1
 */