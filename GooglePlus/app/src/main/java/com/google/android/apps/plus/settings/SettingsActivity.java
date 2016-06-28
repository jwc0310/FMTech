package com.google.android.apps.plus.settings;

import aaw;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.MenuItem;
import doi;
import dqu;
import efj;
import git;
import gjb;
import gjp;
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
import uo;
import uq;

public class SettingsActivity
  extends mbp
  implements gpq
{
  private git d;
  
  public SettingsActivity()
  {
    gjp localgjp = new gjp(this, this.n);
    this.m.a(git.class, localgjp);
    this.d = localgjp;
    new lzw(this, this.n);
    new dqu(this, this, this.n);
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
  }
  
  public final void a(gpr paramgpr)
  {
    paramgpr.a(aaw.fd, new hzv());
    paramgpr.a(aaw.fe, new iir("plus_settings"));
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
    gjb localgjb = this.d.f();
    tp localtp = e().a();
    String str1 = localgjb.b("display_name");
    String str2 = localgjb.b("account_name");
    int i;
    if (getResources().getConfiguration().fontScale > 1.0D) {
      i = 1;
    }
    while (localtp != null) {
      if ((TextUtils.isEmpty(str1)) || (i != 0))
      {
        localtp.a(str2);
        return;
        i = 0;
      }
      else
      {
        localtp.a(str1);
        localtp.b(str2);
        return;
      }
    }
    setTitle(str2);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     com.google.android.apps.plus.settings.SettingsActivity
 * JD-Core Version:    0.7.0.1
 */