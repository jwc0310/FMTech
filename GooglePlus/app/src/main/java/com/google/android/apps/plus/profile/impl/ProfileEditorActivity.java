package com.google.android.apps.plus.profile.impl;

import android.content.Intent;
import android.os.Bundle;
import bk;
import bp;
import bu;
import bv;
import bw;
import bz;
import cl;
import dik;
import efj;
import git;
import gjp;
import gpl;
import gpm;
import gxj;
import gxl;
import gxs;
import idy;
import jyj;
import kvk;
import lzw;
import mbb;
import mbp;
import pka;

public final class ProfileEditorActivity
  extends mbp
{
  public ProfileEditorActivity()
  {
    new idy(this, this.n, "android_profile_gmh");
    gjp localgjp = new gjp(this, this.n);
    this.m.a(git.class, localgjp);
    new jyj(this, this.n);
    lzw locallzw = new lzw(this, this.n);
    this.m.a(lzw.class, locallzw);
    new gxj(this.n);
  }
  
  protected final void a(Bundle paramBundle)
  {
    super.a(paramBundle);
    gpm localgpm = new gpm(this, this.n, efj.Ba);
    this.m.a(gpl.class, localgpm);
    String str = getIntent().getExtras().getString("gaia_id");
    gxl localgxl = new gxl(new kvk(pka.j, str));
    this.m.a(gxs.class, localgxl);
  }
  
  public final void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    setContentView(efj.AT);
    bz localbz = this.b.a.d;
    if (localbz.a(16908290) == null)
    {
      dik localdik = new dik();
      localdik.f(getIntent().getExtras());
      localbz.a().a(16908290, localdik).b();
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     com.google.android.apps.plus.profile.impl.ProfileEditorActivity
 * JD-Core Version:    0.7.0.1
 */