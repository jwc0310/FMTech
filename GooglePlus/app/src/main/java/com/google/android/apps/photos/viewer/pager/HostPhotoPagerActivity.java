package com.google.android.apps.photos.viewer.pager;

import aaw;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.MenuItem;
import asg;
import asl;
import aso;
import asr;
import bdl;
import bdn;
import bdp;
import bfp;
import bhp;
import bk;
import bp;
import bu;
import bv;
import bw;
import bz;
import cij;
import cl;
import com.google.android.apps.plus.phone.HostStreamSingleAlbumTileActivity;
import dpq;
import efj;
import fe;
import git;
import gjb;
import gjp;
import gpl;
import gpm;
import gpq;
import gpr;
import gxl;
import gxs;
import gxv;
import gya;
import gzj;
import idy;
import iot;
import java.util.ArrayList;
import java.util.List;
import jqa;
import jqb;
import jrf;
import jyj;
import lzw;
import mbb;
import mbp;
import pjx;
import tp;

public class HostPhotoPagerActivity
  extends mbp
  implements gpq, gxv
{
  private final lzw d;
  private final git e;
  private final bhp f;
  
  public HostPhotoPagerActivity()
  {
    new idy(this, this.n, "android_photos_gmh");
    new jyj(this, this.n);
    new iot(this, this.n, aaw.dM).a.add("com.google.android.libraries.social.notifications.FROM_ANDROID_NOTIFICATION");
    gxl localgxl = new gxl(pjx.g);
    this.m.a(gxs.class, localgxl);
    lzw locallzw = new lzw(this, this.n);
    this.m.a(lzw.class, locallzw);
    this.d = locallzw;
    gjp localgjp = new gjp(this, this.n);
    this.m.a(git.class, localgjp);
    localgjp.b = false;
    this.e = localgjp;
    this.f = new bhp(this, aaw.dM);
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
    localmbb.a("com.google.android.libraries.social.appid", Integer.valueOf(g()));
    localmbb.a(cij.class, new cij(this, this.n, new bfp()));
    localmbb.a(bdl.class, new bdl());
    localmbb.a(asl.class, new asl(this, this.n));
    if (jrf.i(getIntent().getStringExtra("cluster_id"))) {}
    for (Object localObject = new asg();; localObject = new aso(this, this.n))
    {
      localmbb.a(asr.class, localObject);
      localmbb.a(gzj.class, new gzj(this, this.n));
      return;
    }
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
  
  public final void b(fe paramfe)
  {
    String str1 = getIntent().getStringExtra("view_id");
    int i = this.e.c();
    if (str1 != null)
    {
      String str2 = jrf.c(str1);
      String str3;
      String str7;
      if (str2 != null)
      {
        str3 = jrf.d(str1);
        if (!TextUtils.equals(str3, "profile")) {
          break label192;
        }
        Intent localIntent9 = efj.b(this, i);
        paramfe.a.add(localIntent9);
        String str6 = String.valueOf(str2);
        if (str6.length() == 0) {
          break label178;
        }
        str7 = "g:".concat(str6);
        label92:
        Intent localIntent10 = efj.a(this, i, str7, null, 2, false);
        paramfe.a.add(localIntent10);
      }
      for (;;)
      {
        switch (jrf.a(str1))
        {
        default: 
          jqa localjqa = new jqa(this, HostStreamSingleAlbumTileActivity.class, i);
          localjqa.a = str1;
          Intent localIntent4 = localjqa.a();
          paramfe.a.add(localIntent4);
          return;
          label178:
          str7 = new String("g:");
          break label92;
          label192:
          if (TextUtils.equals(str3, "posts"))
          {
            Intent localIntent7 = efj.b(this, i);
            paramfe.a.add(localIntent7);
            String str4 = String.valueOf(str2);
            if (str4.length() != 0) {}
            for (String str5 = "g:".concat(str4);; str5 = new String("g:"))
            {
              Intent localIntent8 = efj.a(this, i, str5, null, 0, false);
              paramfe.a.add(localIntent8);
              break;
            }
          }
          if (TextUtils.equals(this.e.f().b("gaia_id"), str2))
          {
            Intent localIntent6 = efj.h(this, i);
            paramfe.a.add(localIntent6);
          }
          else
          {
            Intent localIntent5 = efj.b(this, i);
            paramfe.a.add(localIntent5);
          }
          break;
        }
      }
      Intent localIntent3 = efj.a(this, i, 0);
      paramfe.a.add(localIntent3);
      return;
      Intent localIntent2 = efj.a(this, i, 0);
      paramfe.a.add(localIntent2);
      return;
    }
    Intent localIntent1 = efj.b(this, i);
    paramfe.a.add(localIntent1);
  }
  
  public final void b(tp paramtp) {}
  
  public boolean dispatchKeyEvent(KeyEvent paramKeyEvent)
  {
    jqb localjqb = (jqb)mbb.a(this, jqb.class);
    if (!localjqb.b()) {
      return super.dispatchKeyEvent(paramKeyEvent);
    }
    int i = paramKeyEvent.getAction();
    switch (paramKeyEvent.getKeyCode())
    {
    default: 
      return super.dispatchKeyEvent(paramKeyEvent);
    case 24: 
      if (i == 0) {
        localjqb.f();
      }
      return true;
    }
    if (i == 0) {
      localjqb.g();
    }
    return true;
  }
  
  public int g()
  {
    return 2;
  }
  
  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    bdp localbdp;
    bhp localbhp;
    int i;
    Object localObject;
    Bundle localBundle1;
    if (paramBundle == null)
    {
      localbdp = new bdp();
      localbhp = this.f;
      i = localbhp.b;
      localObject = localbhp.a.getIntent().getExtras();
      localBundle1 = localbdp.m;
      if (localBundle1 != null) {
        break label148;
      }
      if (localObject == null) {
        localObject = new Bundle();
      }
    }
    for (;;)
    {
      localbdp.f((Bundle)localObject);
      bz localbz = localbhp.a.b.a.d;
      cl localcl = localbz.a();
      localcl.b(i, localbdp, "default");
      localcl.a(0);
      localcl.c();
      localbz.b();
      setContentView(efj.tT);
      this.d.a(new bdn(this));
      return;
      label148:
      if (localObject == null)
      {
        localObject = localBundle1;
      }
      else
      {
        Bundle localBundle2 = new Bundle(((Bundle)localObject).size() + localBundle1.size());
        localBundle2.putAll((Bundle)localObject);
        localBundle2.putAll(localBundle1);
        localObject = localBundle2;
      }
    }
  }
  
  public final gya r_()
  {
    return gya.ad;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     com.google.android.apps.photos.viewer.pager.HostPhotoPagerActivity
 * JD-Core Version:    0.7.0.1
 */