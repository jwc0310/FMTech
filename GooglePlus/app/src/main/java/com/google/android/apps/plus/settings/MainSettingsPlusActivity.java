package com.google.android.apps.plus.settings;

import aaw;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import com.google.android.apps.plus.phone.HomeActivity;
import doi;
import dpo;
import efj;
import git;
import gjp;
import gpl;
import gpm;
import gpq;
import gpr;
import idy;
import ios;
import java.util.ArrayList;
import lzw;
import mbb;
import mbp;
import tp;

public class MainSettingsPlusActivity
  extends mbp
  implements gpq, ios
{
  public MainSettingsPlusActivity()
  {
    gjp localgjp = new gjp(this, this.n);
    this.m.a(git.class, localgjp);
    localgjp.b = false;
    new idy(this, this.n, "android_settings_gmh");
    new lzw(this, this.n);
    new dpo(this, this, this.n);
  }
  
  private final void b(int paramInt)
  {
    Intent localIntent = new Intent(this, HomeActivity.class);
    localIntent.addFlags(603979776);
    localIntent.putExtra("account_id", paramInt);
    startActivity(localIntent);
    finish();
  }
  
  public final void a(int paramInt)
  {
    b(paramInt);
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
    this.m.a(ios.class, this);
  }
  
  public final void a(gpr paramgpr)
  {
    paramgpr.a(aaw.b, new doi());
  }
  
  public final void a(tp paramtp) {}
  
  public final boolean a(MenuItem paramMenuItem)
  {
    return false;
  }
  
  public final void b(tp paramtp) {}
  
  public final void f()
  {
    b(-1);
  }
  
  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    setContentView(efj.tl);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     com.google.android.apps.plus.settings.MainSettingsPlusActivity
 * JD-Core Version:    0.7.0.1
 */