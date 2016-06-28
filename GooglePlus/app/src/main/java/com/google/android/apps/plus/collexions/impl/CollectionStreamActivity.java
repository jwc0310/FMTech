package com.google.android.apps.plus.collexions.impl;

import aau;
import aaw;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import bhp;
import bou;
import bpk;
import bwk;
import bwl;
import cge;
import dpq;
import efj;
import git;
import gjp;
import gpl;
import gpm;
import gpq;
import gpr;
import idy;
import iot;
import java.util.ArrayList;
import java.util.List;
import jyj;
import lzw;
import mbb;
import mbp;
import tp;

public final class CollectionStreamActivity
  extends mbp
  implements gpq
{
  private final bhp d;
  private String e;
  private String f;
  
  public CollectionStreamActivity()
  {
    gjp localgjp = new gjp(this, this.n);
    this.m.a(git.class, localgjp);
    new idy(this, this.n, "android_collections_gmh");
    new jyj(this, this.n);
    lzw locallzw = new lzw(this, this.n);
    this.m.a(lzw.class, locallzw);
    iot localiot = new iot(this, this.n, efj.zu);
    localiot.a.add("com.google.android.libraries.social.notifications.FROM_ANDROID_NOTIFICATION");
    localiot.a.add("from_shortcut");
    bwl localbwl = new bwl(new bou(this));
    this.m.a(bwk.class, localbwl);
    this.d = new bhp(this, efj.zu);
  }
  
  public static Intent a(Context paramContext, int paramInt, String paramString1, String paramString2, String paramString3)
  {
    return new Intent(paramContext, CollectionStreamActivity.class).putExtra("account_id", paramInt).putExtra("clx_activity_id", paramString1).putExtra("clx_id", paramString2).putExtra("clx_name", paramString3);
  }
  
  protected final void a(Bundle paramBundle)
  {
    super.a(paramBundle);
    gpm localgpm = new gpm(this, this.n, aaw.mT);
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
    paramgpr.a(efj.zz, new dpq());
  }
  
  public final void a(tp paramtp)
  {
    paramtp.b(false);
    paramtp.c(true);
    paramtp.a(this.f);
  }
  
  public final boolean a(MenuItem paramMenuItem)
  {
    return false;
  }
  
  public final void b(tp paramtp) {}
  
  protected final void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    if (paramBundle == null)
    {
      Intent localIntent = getIntent();
      this.e = localIntent.getStringExtra("clx_id");
      this.f = localIntent.getStringExtra("clx_name");
      cge localcge = bpk.a(this.e, this.f);
      this.d.a(localcge);
    }
    for (;;)
    {
      setContentView(aau.wo);
      return;
      this.e = paramBundle.getString("clx_id");
      this.f = paramBundle.getString("clx_name");
    }
  }
  
  public final void onSaveInstanceState(Bundle paramBundle)
  {
    super.onSaveInstanceState(paramBundle);
    paramBundle.putString("clx_id", this.e);
    paramBundle.putString("clx_name", this.f);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     com.google.android.apps.plus.collexions.impl.CollectionStreamActivity
 * JD-Core Version:    0.7.0.1
 */