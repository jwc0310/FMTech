package com.google.android.libraries.social.profile.viewer.flair;

import android.content.Intent;
import android.os.Bundle;
import bk;
import bp;
import bu;
import bv;
import bw;
import cl;
import efj;
import gjp;
import gpm;
import gxj;
import gxl;
import idy;
import jyj;
import jzm;
import kvk;
import lzw;
import mbb;
import mbp;
import pka;

public final class ProfileFlairHomeActivity
  extends mbp
{
  public ProfileFlairHomeActivity()
  {
    new idy(this, this.n, "android_profile_gmh");
    new gjp(this, this.n).a(this.m);
    new jyj(this, this.n);
    lzw locallzw = new lzw(this, this.n);
    this.m.a(lzw.class, locallzw);
    new gxj(this.n);
  }
  
  protected final void a(Bundle paramBundle)
  {
    super.a(paramBundle);
    new gpm(this, this.n, efj.TZ).a(this.m);
    String str = getIntent().getExtras().getString("profile_gaia_id");
    new gxl(new kvk(pka.t, str)).a(this.m);
  }
  
  public final void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    setContentView(efj.TW);
    Intent localIntent = getIntent();
    int i = efj.Ub;
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = localIntent.getStringExtra("profile_name");
    setTitle(getString(i, arrayOfObject));
    if (paramBundle == null)
    {
      jzm localjzm = new jzm();
      localjzm.f(localIntent.getExtras());
      this.b.a.d.a().b(16908290, localjzm).b();
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     com.google.android.libraries.social.profile.viewer.flair.ProfileFlairHomeActivity
 * JD-Core Version:    0.7.0.1
 */