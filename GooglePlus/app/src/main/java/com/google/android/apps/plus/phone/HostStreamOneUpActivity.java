package com.google.android.apps.plus.phone;

import aaw;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import bhp;
import bk;
import cgr;
import com.google.android.apps.plus.views.StreamOneUpViewGroup;
import dfk;
import dpq;
import efj;
import git;
import gjp;
import gpl;
import gpm;
import gpq;
import gpr;
import gxv;
import gya;
import iot;
import java.util.ArrayList;
import java.util.List;
import jyj;
import lvj;
import lzw;
import mbb;
import mbp;
import tp;

public class HostStreamOneUpActivity
  extends mbp
  implements View.OnClickListener, gpq, gxv
{
  private final bhp d;
  private int e;
  
  public HostStreamOneUpActivity()
  {
    new jyj(this, this.n);
    lzw locallzw = new lzw(this, this.n);
    this.m.a(lzw.class, locallzw);
    new iot(this, this.n, aaw.dM).a.add("com.google.android.libraries.social.notifications.FROM_ANDROID_NOTIFICATION");
    dfk localdfk = new dfk(this, this.n);
    localdfk.a = 2;
    localdfk.b = "profile_picture_springboard";
    lvj locallvj = new lvj(this, this.n);
    this.m.a(lvj.class, locallvj);
    gjp localgjp = new gjp(this, this.n);
    this.m.a(git.class, localgjp);
    this.d = new bhp(this, aaw.dM);
  }
  
  public static bk b(int paramInt)
  {
    int i = 1;
    cgr localcgr = new cgr();
    Bundle localBundle = new Bundle();
    localBundle.putInt("host_mode", i);
    if (paramInt != 0) {}
    for (;;)
    {
      localBundle.putBoolean("force_full_bleed", i);
      localcgr.f(localBundle);
      return localcgr;
      int j = 0;
    }
  }
  
  public final void a(int paramInt)
  {
    ((StreamOneUpViewGroup)findViewById(aaw.ey)).a(paramInt);
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
    localmbb.a("com.google.android.libraries.social.appid", Integer.valueOf(h()));
  }
  
  public final void a(gpr paramgpr)
  {
    paramgpr.a(aaw.jH, new dpq());
  }
  
  public final void a(tp paramtp)
  {
    if (mbb.a(this, "com.google.android.libraries.social.appid", 300) == 2) {}
    for (boolean bool = true;; bool = false)
    {
      efj.a(paramtp, bool);
      paramtp.c(true);
      paramtp.d(false);
      return;
    }
  }
  
  public final boolean a(MenuItem paramMenuItem)
  {
    return false;
  }
  
  public final void b(Bundle paramBundle) {}
  
  public final void b(tp paramtp) {}
  
  public int g()
  {
    return efj.tY;
  }
  
  protected int h()
  {
    return 1;
  }
  
  public void onClick(View paramView)
  {
    if (paramView.getId() == 16908290) {
      onBackPressed();
    }
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    if (paramBundle == null) {
      if (!efj.L(this)) {
        break label48;
      }
    }
    label48:
    for (int i = 0;; i = efj.K(this).widthPixels)
    {
      this.e = i;
      bk localbk = b(this.e);
      this.d.a(localbk);
      setContentView(g());
      return;
    }
  }
  
  protected void onPostCreate(Bundle paramBundle)
  {
    super.onPostCreate(paramBundle);
    if (this.e != 0)
    {
      a(this.e);
      return;
    }
    findViewById(16908290).setOnClickListener(this);
    findViewById(aaw.kw).setClickable(true);
  }
  
  public final gya r_()
  {
    return gya.l;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     com.google.android.apps.plus.phone.HostStreamOneUpActivity
 * JD-Core Version:    0.7.0.1
 */