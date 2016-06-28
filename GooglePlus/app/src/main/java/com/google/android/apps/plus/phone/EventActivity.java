package com.google.android.apps.plus.phone;

import aau;
import aaw;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import anz;
import asi;
import asl;
import aso;
import asr;
import atu;
import atx;
import aud;
import bhp;
import bk;
import cbs;
import cfy;
import cij;
import com.google.android.libraries.social.actionbar.ActionBarSpinner;
import cpb;
import dao;
import dpq;
import efj;
import git;
import gjp;
import gpl;
import gpm;
import gpq;
import gpr;
import gpw;
import gxv;
import gxw;
import gxx;
import gxz;
import gya;
import idy;
import iot;
import java.util.ArrayList;
import java.util.List;
import jeo;
import jer;
import jrf;
import jyj;
import lzw;
import mbb;
import mbp;
import tp;

public class EventActivity
  extends mbp
  implements gpq, gpw, gxv
{
  public int d;
  private final bhp e;
  private int f;
  private ArrayAdapter<String> g;
  private ActionBarSpinner h;
  private atu i;
  private jer<atu> j;
  
  public EventActivity()
  {
    new idy(this, this.n, "android_events_gmh");
    new atx(this, this.n);
    new jyj(this, this.n);
    lzw locallzw = new lzw(this, this.n);
    this.m.a(lzw.class, locallzw);
    new iot(this, this.n, aaw.dM).a.add("com.google.android.libraries.social.notifications.FROM_ANDROID_NOTIFICATION");
    gjp localgjp = new gjp(this, this.n);
    this.m.a(git.class, localgjp);
    this.e = new bhp(this, aaw.dM);
    this.d = 0;
  }
  
  private final bk g()
  {
    cbs localcbs = new cbs();
    Intent localIntent = getIntent();
    Bundle localBundle = new Bundle();
    localBundle.putString("event_id", localIntent.getStringExtra("event_id"));
    localBundle.putString("owner_id", localIntent.getStringExtra("owner_id"));
    localBundle.putString("invitation_token", localIntent.getStringExtra("invitation_token"));
    localBundle.putString("auth_key", localIntent.getStringExtra("auth_key"));
    localBundle.putInt("rsvp", localIntent.getIntExtra("rsvp", -2147483648));
    localBundle.putInt("external_action", this.d);
    localcbs.f(localBundle);
    return localcbs;
  }
  
  private final bk h()
  {
    anz localanz = (anz)mbb.a(this, anz.class);
    localanz.b = "Albums";
    localanz.c = 2;
    Bundle localBundle1 = getIntent().getExtras();
    cfy localcfy = new cfy();
    String str1 = localBundle1.getString("event_id");
    if (!TextUtils.isEmpty(str1))
    {
      String str2 = localBundle1.getString("owner_id");
      String str3 = localBundle1.getString("auth_key");
      String[] arrayOfString = new String[1];
      arrayOfString[0] = jrf.a(null, str2, str1, "PLUS_EVENT");
      String str4 = jrf.a(3, arrayOfString);
      Bundle localBundle2 = new Bundle();
      localBundle2.putString("cluster_id", str4);
      localBundle2.putString("auth_key", str3);
      localBundle2.putBoolean("show_title", false);
      localBundle2.putBoolean("hide_footer", true);
      localcfy.f(localBundle2);
    }
    return localcfy;
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
    this.i = new atu(this, this.n);
    mbb localmbb = this.m;
    localmbb.a(gxv.class, this);
    localmbb.a(aud.class, new aud(this, this.n));
    localmbb.a(atu.class, this.i);
    localmbb.a(cij.class, new cij(this, this.n, new cpb()));
    localmbb.a(asi.class, new asi(this.n));
    localmbb.a(asl.class, new asl(this, this.n));
    localmbb.a(asr.class, new aso(this, this.n));
  }
  
  public final void a(gpr paramgpr)
  {
    paramgpr.a(aaw.jH, new dpq());
  }
  
  public final void a(tp paramtp)
  {
    efj.a(paramtp, false);
    paramtp.c(true);
    View localView = View.inflate(this, efj.sv, null);
    this.h = ((ActionBarSpinner)localView.findViewById(aaw.hS));
    this.h.setAdapter(this.g);
    this.h.setSelection(this.f);
    this.h.a(this);
    paramtp.a(localView);
    if (this.j != null) {
      this.i.a.a(this.j);
    }
    this.j = new dao(this, paramtp);
    this.i.a.a(this.j, true);
  }
  
  public final boolean a(MenuItem paramMenuItem)
  {
    return false;
  }
  
  public final boolean a_(int paramInt)
  {
    if (this.f == paramInt) {
      return false;
    }
    bk localbk;
    switch (paramInt)
    {
    default: 
      localbk = null;
    }
    for (;;)
    {
      if (localbk != null)
      {
        this.f = paramInt;
        this.e.a(localbk);
      }
      return true;
      localbk = g();
      continue;
      gxx localgxx = (gxx)this.m.a(gxx.class);
      gxw localgxw = new gxw(this);
      localgxw.c = gxz.aF;
      localgxx.a(localgxw);
      localbk = h();
    }
  }
  
  public final void b(Bundle paramBundle) {}
  
  public final void b(tp paramtp)
  {
    if (this.j != null) {
      this.i.a.a(this.j);
    }
    this.j = null;
    paramtp.a(null);
    paramtp.e(false);
    paramtp.d(true);
    paramtp.c(true);
  }
  
  protected void onCreate(Bundle paramBundle)
  {
    this.g = new ArrayAdapter(this, efj.sw);
    this.g.setDropDownViewResource(17367049);
    this.g.add(getString(aau.gT));
    this.g.add(getString(aau.gU));
    bk localbk;
    if (paramBundle == null)
    {
      if (getIntent().getBooleanExtra("show_keyboard", false)) {
        this.d = 2;
      }
    }
    else
    {
      super.onCreate(paramBundle);
      if (paramBundle == null) {
        switch (getIntent().getExtras().getInt("destination", 1))
        {
        default: 
          localbk = g();
        }
      }
    }
    for (this.f = 0;; this.f = 1)
    {
      this.e.a(localbk);
      setContentView(efj.tT);
      return;
      this.d = getIntent().getIntExtra("external_action", 0);
      break;
      localbk = h();
    }
  }
  
  protected void onRestoreInstanceState(Bundle paramBundle)
  {
    super.onRestoreInstanceState(paramBundle);
    int k = paramBundle.getInt("spinnerIndex", 0);
    if ((ActionBarSpinner)findViewById(aaw.hS) != null) {
      a_(k);
    }
    for (;;)
    {
      this.h.setSelection(this.f);
      this.d = paramBundle.getInt("external_action", getIntent().getIntExtra("external_action", 0));
      return;
      this.f = k;
    }
  }
  
  protected void onSaveInstanceState(Bundle paramBundle)
  {
    super.onSaveInstanceState(paramBundle);
    paramBundle.putInt("spinnerIndex", this.f);
    paramBundle.putInt("external_action", this.d);
  }
  
  public final gya r_()
  {
    return gya.z;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     com.google.android.apps.plus.phone.EventActivity
 * JD-Core Version:    0.7.0.1
 */