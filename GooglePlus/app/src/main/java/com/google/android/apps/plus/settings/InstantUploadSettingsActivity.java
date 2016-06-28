package com.google.android.apps.plus.settings;

import aaw;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import doi;
import doo;
import dqg;
import efj;
import gpl;
import gpm;
import gpq;
import gpr;
import hzv;
import iir;
import java.util.ArrayList;
import lzw;
import mbb;
import mbp;
import tp;

public class InstantUploadSettingsActivity
  extends mbp
  implements gpq
{
  public InstantUploadSettingsActivity()
  {
    new lzw(this, this.n);
    new doo(this, this, this.n);
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
    if (getIntent().getBooleanExtra("is_in_photo_app", false)) {
      this.m.a("com.google.android.libraries.social.appid", Integer.valueOf(2));
    }
  }
  
  public final void a(gpr paramgpr)
  {
    paramgpr.a(aaw.fd, new hzv());
    paramgpr.a(aaw.fe, new iir("auto_backup"));
    if (getIntent().getBooleanExtra("is_in_photo_app", false))
    {
      paramgpr.a(aaw.fa, new dqg());
      return;
    }
    paramgpr.a(aaw.fb, new doi());
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
 * Qualified Name:     com.google.android.apps.plus.settings.InstantUploadSettingsActivity
 * JD-Core Version:    0.7.0.1
 */