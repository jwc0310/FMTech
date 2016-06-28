package com.google.android.libraries.social.sharekit.impl;

import aau;
import android.content.res.Resources;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import aw;
import bk;
import efj;
import et;
import fxb;
import guf;
import gug;
import gxn;
import gxq;
import java.util.ArrayList;
import java.util.List;
import jos;
import jov;
import jpd;
import jpe;
import kic;
import kji;
import kjk;
import kjs;
import kjt;
import kju;
import kjv;
import kjw;
import kjx;
import kmi;
import lmg;
import luu;
import mbb;
import mca;
import pkd;

public final class LocationSelectorFragment
  extends mca
  implements kjk, luu
{
  public jov Z;
  public lmg a = null;
  public jpd aa;
  private View ab;
  private View ac;
  private TextView ad;
  private View ae;
  private final guf af = new kjs(this);
  private jpe ag;
  public boolean b = false;
  public final gug c = new gug(this.bp, (byte)0).a(this.bo).a(aau.BF, this.af);
  public final List<kjx> d = new ArrayList();
  
  public LocationSelectorFragment()
  {
    if (Build.VERSION.SDK_INT < 23) {}
    for (Object localObject = new jos();; localObject = new kjt(this))
    {
      this.aa = ((jpd)localObject);
      this.ag = new kju(this);
      return;
    }
  }
  
  public final View a(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    this.ae = paramLayoutInflater.inflate(efj.UP, paramViewGroup, false);
    this.ab = this.ae.findViewById(aau.AU);
    this.ac = this.ae.findViewById(aau.AX);
    this.ad = ((TextView)this.ae.findViewById(16908310));
    kji localkji = (kji)this.bo.a(kji.class);
    View localView = this.ae.findViewById(aau.AT);
    if (localkji.b) {
      localView.setVisibility(8);
    }
    for (;;)
    {
      return this.ae;
      this.ac.setOnClickListener(new kjv(this, localkji));
      efj.a(localView, new gxq(pkd.b));
      localView.setOnClickListener(new gxn(new kjw(this, g())));
    }
  }
  
  public final void a()
  {
    kji localkji = (kji)this.bo.a(kji.class);
    if (localkji.b) {
      return;
    }
    lmg locallmg = localkji.c;
    if (locallmg != null)
    {
      String str = locallmg.c;
      if (TextUtils.isEmpty(str)) {
        str = locallmg.a(f());
      }
      View localView3 = this.ae;
      int m = et.j;
      Object[] arrayOfObject1 = { str };
      localView3.setContentDescription(g().getString(m, arrayOfObject1));
      this.ad.setText(str);
      this.ad.setTextColor(g().getColor(aw.dG));
      this.ab.setVisibility(4);
      this.ac.setVisibility(0);
      View localView4 = this.ac;
      int n = et.v;
      Object[] arrayOfObject2 = { str };
      localView4.setContentDescription(g().getString(n, arrayOfObject2));
      ((kmi)this.bo.a(kic.class)).a(locallmg);
      return;
    }
    View localView1 = this.ae;
    int i = et.C;
    localView1.setContentDescription(g().getString(i));
    TextView localTextView = this.ad;
    int j = et.E;
    localTextView.setText(g().getString(j));
    this.ad.setTextColor(g().getColor(aw.dF));
    this.ab.setVisibility(0);
    this.ac.setVisibility(4);
    View localView2 = this.ac;
    int k = et.u;
    localView2.setContentDescription(g().getString(k));
  }
  
  public final void a(int paramInt, Bundle paramBundle, String paramString) {}
  
  public final void a(int paramInt, boolean paramBoolean, Bundle paramBundle, String paramString) {}
  
  public final void a(Bundle paramBundle)
  {
    super.a(paramBundle);
    this.Z.a(aau.BG, this.ag);
  }
  
  public final void a(Bundle paramBundle, String paramString)
  {
    if (paramString.equals("dialog-loc-settings")) {
      ((fxb)mbb.a(f(), fxb.class)).a(f());
    }
  }
  
  public final void b(Bundle paramBundle, String paramString) {}
  
  protected final void c(Bundle paramBundle)
  {
    super.c(paramBundle);
    this.Z = ((jov)this.bo.a(jov.class));
  }
  
  public final void c(Bundle paramBundle, String paramString) {}
  
  public final void d_()
  {
    this.ab = null;
    this.ac = null;
    this.ad = null;
    super.d_();
  }
  
  public final void m()
  {
    super.m();
    this.b = false;
    kji localkji = (kji)this.bo.a(kji.class);
    localkji.o.add(this);
    if (this.a != null)
    {
      localkji.a(this.a);
      this.a = null;
      return;
    }
    a();
  }
  
  public final void n()
  {
    ((kji)this.bo.a(kji.class)).o.remove(this);
    super.n();
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     com.google.android.libraries.social.sharekit.impl.LocationSelectorFragment
 * JD-Core Version:    0.7.0.1
 */