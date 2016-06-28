package com.google.android.apps.plus.settings;

import android.os.Bundle;
import android.view.MenuItem;
import dqf;
import efj;
import git;
import gjp;
import gpl;
import gpm;
import gpq;
import gpr;
import gxw;
import gxx;
import gxz;
import idy;
import java.util.ArrayList;
import kgl;
import lzw;
import mbb;
import mbp;
import tp;

public class PhotosAboutSettingsActivity
  extends mbp
  implements gpq, kgl
{
  private git d;
  
  public PhotosAboutSettingsActivity()
  {
    gjp localgjp = new gjp(this, this.n);
    this.m.a(git.class, localgjp);
    localgjp.b = false;
    this.d = localgjp;
    new idy(this, this.n, "android_settings_gmh");
    new lzw(this, this.n);
    new dqf(this, this, this.n);
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
    this.m.a(kgl.class, this);
    this.m.a("com.google.android.libraries.social.appid", Integer.valueOf(2));
  }
  
  public final void a(gpr paramgpr) {}
  
  public final void a(String paramString)
  {
    if (("about_terms_pref_key".equals(paramString)) && (this.d.e()))
    {
      int i = this.d.c();
      gxx localgxx = (gxx)this.m.a(gxx.class);
      gxw localgxw = new gxw(this, i);
      localgxw.c = gxz.e;
      localgxx.a(localgxw);
    }
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
 * Qualified Name:     com.google.android.apps.plus.settings.PhotosAboutSettingsActivity
 * JD-Core Version:    0.7.0.1
 */