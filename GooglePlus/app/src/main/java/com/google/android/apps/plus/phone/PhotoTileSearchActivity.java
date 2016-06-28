package com.google.android.apps.plus.phone;

import aau;
import aaw;
import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import anz;
import asl;
import aso;
import asr;
import atx;
import bhp;
import bk;
import cey;
import cij;
import cpb;
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
import idy;
import iot;
import java.util.ArrayList;
import java.util.List;
import jyj;
import lzw;
import mbb;
import mbp;
import tp;

public class PhotoTileSearchActivity
  extends mbp
  implements View.OnClickListener, gpq, gxv
{
  private final bhp d;
  private int e;
  private FrameLayout f;
  private FrameLayout g;
  private cey h;
  
  public PhotoTileSearchActivity()
  {
    new idy(this, this.n, "android_photos_gmh");
    new atx(this, this.n);
    new jyj(this, this.n);
    new iot(this, this.n, aaw.dM).a.add("com.google.android.libraries.social.notifications.FROM_ANDROID_NOTIFICATION");
    lzw locallzw = new lzw(this, this.n);
    this.m.a(lzw.class, locallzw);
    gjp localgjp = new gjp(this, this.n);
    this.m.a(git.class, localgjp);
    this.d = new bhp(this, aaw.dM);
  }
  
  private final void a(int paramInt)
  {
    this.e = paramInt;
    g();
    if (this.h != null) {
      h();
    }
  }
  
  private static void a(ViewGroup paramViewGroup)
  {
    paramViewGroup.findViewById(aaw.kL).setVisibility(0);
    int i = paramViewGroup.getContext().getResources().getColor(efj.jO);
    ((TextView)paramViewGroup.findViewById(aaw.kN)).setTextColor(i);
  }
  
  private static void b(ViewGroup paramViewGroup)
  {
    paramViewGroup.findViewById(aaw.kL).setVisibility(8);
    int i = paramViewGroup.getContext().getResources().getColor(efj.ko);
    ((TextView)paramViewGroup.findViewById(aaw.kN)).setTextColor(i);
  }
  
  private final void g()
  {
    if (this.e == 0)
    {
      a(this.f);
      b(this.g);
      return;
    }
    a(this.g);
    b(this.f);
  }
  
  private final void h()
  {
    switch (this.e)
    {
    default: 
      return;
    case 0: 
      this.h.b(1);
      return;
    }
    this.h.b(2);
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
    localmbb.a("com.google.android.libraries.social.appid", Integer.valueOf(2));
    localmbb.a(cij.class, new cij(this, this.n, new cpb()));
    localmbb.a(asl.class, new asl(this, this.n));
    localmbb.a(asr.class, new aso(this, this.n));
    anz localanz = (anz)this.m.a(anz.class);
    localanz.b = "PhotoSearch";
    localanz.c = 7;
  }
  
  public final void a(bk parambk)
  {
    super.a(parambk);
    if ((parambk instanceof cey))
    {
      this.h = ((cey)parambk);
      h();
    }
  }
  
  public final void a(gpr paramgpr)
  {
    paramgpr.a(aaw.jH, new dpq());
  }
  
  public final void a(tp paramtp)
  {
    efj.a(paramtp, true);
    paramtp.c(true);
  }
  
  public final boolean a(MenuItem paramMenuItem)
  {
    return false;
  }
  
  public final void b(Bundle paramBundle) {}
  
  public final void b(tp paramtp) {}
  
  public void onClick(View paramView)
  {
    if (paramView == this.f) {
      a(0);
    }
    while (paramView != this.g) {
      return;
    }
    a(1);
  }
  
  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    if (paramBundle == null)
    {
      cey localcey = new cey();
      this.d.a(localcey);
    }
    setContentView(efj.tX);
    if (paramBundle != null) {
      this.e = paramBundle.getInt("selected_tab");
    }
    this.f = ((FrameLayout)findViewById(aaw.kM));
    this.f.setOnClickListener(this);
    ((TextView)this.f.findViewById(aaw.kN)).setText(aau.sQ);
    this.g = ((FrameLayout)findViewById(aaw.kJ));
    this.g.setOnClickListener(this);
    ((TextView)this.g.findViewById(aaw.kN)).setText(aau.sP);
    g();
  }
  
  protected void onSaveInstanceState(Bundle paramBundle)
  {
    super.onSaveInstanceState(paramBundle);
    paramBundle.putInt("selected_tab", this.e);
  }
  
  public final gya r_()
  {
    return gya.I;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     com.google.android.apps.plus.phone.PhotoTileSearchActivity
 * JD-Core Version:    0.7.0.1
 */