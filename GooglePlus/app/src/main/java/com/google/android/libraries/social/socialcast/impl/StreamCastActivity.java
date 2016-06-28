package com.google.android.libraries.social.socialcast.impl;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import efj;
import eyg;
import gjp;
import gko;
import gpm;
import gpq;
import gpr;
import gxq;
import gxs;
import idy;
import java.util.HashSet;
import kwa;
import kwo;
import kwp;
import kwq;
import kwr;
import kws;
import lzw;
import mbb;
import mbp;
import pke;
import tp;

public final class StreamCastActivity
  extends mbp
  implements gpq, gxs
{
  public kwq d;
  public kwa e;
  private kwr f;
  private String g;
  private String h;
  private boolean i;
  
  public StreamCastActivity()
  {
    new idy(this, this.n, "android_default");
    new lzw(this, this.n);
    new gjp(this, this.n).a(this.m);
  }
  
  protected final void a(Bundle paramBundle)
  {
    super.a(paramBundle);
    ((gpm)new gpm(this, this.n, efj.VT).a(this.m).a(this));
    this.m.a(gxs.class, this);
    this.m.a("com.google.android.libraries.social.appid", Integer.valueOf(14));
  }
  
  public final void a(gpr paramgpr)
  {
    paramgpr.a(eyg.bo, new kws(paramgpr.c(eyg.bo), this.i, this.e));
  }
  
  public final void a(tp paramtp)
  {
    efj.a(paramtp, true);
    paramtp.c(true);
    paramtp.d(false);
  }
  
  public final boolean a(MenuItem paramMenuItem)
  {
    return false;
  }
  
  public final void b(tp paramtp) {}
  
  public final void f()
  {
    Intent localIntent = new Intent(this, CastService.class);
    localIntent.putExtra("data_source", this.g);
    localIntent.putExtra("selected_route_id", this.h);
    bindService(localIntent, this.f, 1);
  }
  
  public final void g()
  {
    if (this.e != null) {
      if (this.e.b()) {
        this.e.a.h = true;
      }
    }
    for (;;)
    {
      finish();
      return;
      Intent localIntent = new Intent(this, CastService.class);
      localIntent.putExtra("shutdown", true);
      bindService(localIntent, this.f, 1);
    }
  }
  
  protected final void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    this.f = new kwr(this);
    this.d = new kwq(this);
    if (paramBundle != null)
    {
      this.g = paramBundle.getString("data_source");
      this.h = paramBundle.getString("selected_route_id");
    }
    Bundle localBundle;
    do
    {
      return;
      localBundle = getIntent().getExtras();
    } while (localBundle == null);
    this.g = localBundle.getString("data_source");
    this.h = localBundle.getString("selected_route_id");
  }
  
  protected final void onSaveInstanceState(Bundle paramBundle)
  {
    paramBundle.putString("data_source", this.g);
    paramBundle.putString("selected_route_id", this.h);
    super.onSaveInstanceState(paramBundle);
  }
  
  protected final void onStart()
  {
    super.onStart();
    kwo localkwo = new kwo(this);
    kwp localkwp = new kwp(this);
    if (gko.a(this))
    {
      gko.a(this, localkwo, localkwp);
      return;
    }
    f();
  }
  
  protected final void onStop()
  {
    if (this.e != null)
    {
      kwa localkwa = this.e;
      kwq localkwq = this.d;
      localkwa.a.a.remove(localkwq);
      unbindService(this.f);
      this.e = null;
    }
    super.onStop();
  }
  
  public final gxq v()
  {
    return new gxq(pke.i);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     com.google.android.libraries.social.socialcast.impl.StreamCastActivity
 * JD-Core Version:    0.7.0.1
 */