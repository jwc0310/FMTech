package com.google.android.apps.plus.phone;

import aaw;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.MenuItem;
import atu;
import aud;
import bhp;
import bk;
import bwl;
import cdo;
import ddm;
import dhd;
import dpq;
import efj;
import gcc;
import git;
import giz;
import gjb;
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
import jjf;
import jyj;
import lzw;
import mbb;
import mbp;
import mcq;
import mfm;
import tp;

public final class OneProfileActivity
  extends mbp
  implements gpq, gxv
{
  public static final mcq d = new mcq(new mfm("debug.plus.gcore_add2circles", (byte)0).a, false);
  private final bhp e;
  private gcc f;
  private dhd g;
  
  public OneProfileActivity()
  {
    new idy(this, this.n, "android_profile_gmh");
    new jyj(this, this.n);
    lzw locallzw = new lzw(this, this.n);
    this.m.a(lzw.class, locallzw);
    new iot(this, this.n, aaw.dM).a.add("com.google.android.libraries.social.notifications.FROM_ANDROID_NOTIFICATION");
    gjp localgjp = new gjp(this, this.n);
    this.m.a(git.class, localgjp);
    new bwl(new ddm(this)).a(this.m);
    this.e = new bhp(this, aaw.dM);
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
    mbb localmbb = this.m;
    localmbb.a(gxv.class, this);
    localmbb.a(aud.class, new aud(this, this.n));
    localmbb.a(atu.class, new atu(this, this.n));
    this.g = ((dhd)this.m.b(dhd.class));
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
  
  public final void b(Bundle paramBundle)
  {
    String str1 = getIntent().getStringExtra("person_id");
    if (!TextUtils.isEmpty(str1))
    {
      String str2 = jjf.c(str1);
      if (!TextUtils.isEmpty(str2)) {
        paramBundle.putString("extra_gaia_id", str2);
      }
    }
  }
  
  public final void b(tp paramtp) {}
  
  protected final void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
  }
  
  protected final void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    if (paramBundle == null) {
      if ((this.g == null) || (!this.g.a(((git)this.m.a(git.class)).c()))) {
        break label187;
      }
    }
    label187:
    for (Object localObject = this.g.a();; localObject = new cdo())
    {
      this.e.a((bk)localObject);
      setContentView(efj.tT);
      if (this.f != null)
      {
        int i = getIntent().getIntExtra("account_id", -1);
        gjb localgjb = ((giz)this.m.a(giz.class)).a(i);
        String str1 = localgjb.b("account_name");
        String str2 = localgjb.b("effective_gaia_id");
        this.f.b(str1);
        this.f.c(str2);
        this.f.a("11");
        this.f.a(1);
        this.f.b(0);
      }
      return;
    }
  }
  
  public final gya r_()
  {
    return gya.i;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     com.google.android.apps.plus.phone.OneProfileActivity
 * JD-Core Version:    0.7.0.1
 */