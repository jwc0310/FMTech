package com.google.android.apps.plus.fragments;

import aau;
import aaw;
import android.app.Activity;
import android.content.Intent;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ProgressBar;
import bk;
import bzr;
import ckm;
import ckx;
import ckz;
import clc;
import com.google.android.apps.plus.views.SearchViewAdapterV11;
import com.google.android.apps.plus.views.SearchViewAdapterV12;
import czf;
import dun;
import dzd;
import dzf;
import efj;
import gxw;
import gxx;
import gxz;
import java.util.HashSet;
import jgs;
import jjd;
import jop;
import joq;
import mbb;

public class PeopleSearchFragment
  extends bzr
  implements ckx, dzf, joq
{
  public clc Z;
  public ckz aa;
  public boolean ab;
  public boolean ac;
  public boolean ad;
  public boolean ae;
  public boolean af;
  public ProgressBar ag;
  public String b;
  public int c = -1;
  public dzd d;
  
  protected final boolean A()
  {
    return (this.Z == null) || (this.Z.b());
  }
  
  public final void D()
  {
    this.d.a(null);
    this.Z.b(null);
  }
  
  public final int R_()
  {
    return 77;
  }
  
  public final void T_()
  {
    View localView = this.N;
    if (localView != null) {
      e(localView);
    }
  }
  
  protected final View a(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup)
  {
    return paramLayoutInflater.inflate(efj.vz, paramViewGroup, false);
  }
  
  public final View a(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    View localView1 = super.a(paramLayoutInflater, paramViewGroup, paramBundle);
    View localView2 = localView1.findViewById(aaw.jq);
    Object localObject;
    if (Build.VERSION.SDK_INT >= 12) {
      localObject = new SearchViewAdapterV12(localView2);
    }
    for (;;)
    {
      this.d = ((dzd)localObject);
      this.d.a(aau.sH);
      this.d.c.add(this);
      e(localView1);
      return localView1;
      if (Build.VERSION.SDK_INT >= 11) {
        localObject = new SearchViewAdapterV11(localView2);
      } else {
        localObject = new dzd(localView2);
      }
    }
  }
  
  public final void a(Activity paramActivity)
  {
    super.a(paramActivity);
    this.Z = new clc(paramActivity, this.x, k(), v());
    this.Z.l = this.ab;
    this.Z.j = this.ac;
    this.Z.q = this.ad;
    this.Z.e = this.c;
    this.Z.r = this.ae;
    this.Z.c(this.af);
    this.Z.k = false;
    this.Z.v = paramActivity.getIntent().getBooleanExtra("filter_null_gaia_ids", false);
    this.Z.n = this;
    this.Z.b(this.b);
  }
  
  public final void a(Bundle paramBundle)
  {
    if (paramBundle != null) {
      this.b = paramBundle.getString("query");
    }
    super.a(paramBundle);
  }
  
  public final void a(CharSequence paramCharSequence)
  {
    if (paramCharSequence == null) {}
    for (String str = null;; str = paramCharSequence.toString().trim())
    {
      this.b = str;
      if ((dun.b()) && (paramCharSequence != null)) {
        czf.a(f(), paramCharSequence);
      }
      if (this.Z != null) {
        this.Z.b(this.b);
      }
      return;
    }
  }
  
  public final void a(String paramString1, String paramString2, String paramString3)
  {
    c(paramString1, null, null);
  }
  
  public final void a(String paramString1, String paramString2, jjd paramjjd, Bundle paramBundle)
  {
    if (paramBundle != null)
    {
      int i = v();
      gxx localgxx = (gxx)this.bo.a(gxx.class);
      gxw localgxw = new gxw(this.bn, i);
      localgxw.c = gxz.ed;
      if (paramBundle != null) {
        localgxw.h.putAll(paramBundle);
      }
      localgxx.a(localgxw);
    }
    View localView = this.N;
    if (localView != null) {
      efj.k(localView);
    }
    this.aa.a(paramString1, paramString2, paramjjd);
  }
  
  public final void a(String paramString, jgs paramjgs)
  {
    this.aa.a(paramString, paramjgs);
  }
  
  public final void a(jop paramjop, int paramInt) {}
  
  public final void b(String paramString1, String paramString2, String paramString3)
  {
    c(paramString1, paramString2, null);
  }
  
  public final void e(Bundle paramBundle)
  {
    super.e(paramBundle);
    if (this.Z != null) {
      this.Z.b(paramBundle);
    }
    paramBundle.putString("query", this.b);
  }
  
  protected final void e(View paramView)
  {
    if (this.Z == null) {
      return;
    }
    if (this.Z.b())
    {
      paramView.findViewById(16908298).setVisibility(0);
      paramView.findViewById(aaw.jT).setVisibility(0);
      a(paramView);
      return;
    }
    if (!TextUtils.isEmpty(this.b))
    {
      paramView.findViewById(16908298).setVisibility(0);
      paramView.findViewById(aaw.jT).setVisibility(8);
      d(paramView);
      return;
    }
    paramView.findViewById(16908298).setVisibility(8);
    paramView.findViewById(aaw.jT).setVisibility(8);
    d(paramView);
  }
  
  protected final void h(Bundle paramBundle)
  {
    this.Z.a(paramBundle);
  }
  
  public void onItemClick(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    this.Z.d_(paramInt);
  }
  
  public final void p_()
  {
    super.p_();
    this.Z.f();
  }
  
  public final void q_()
  {
    super.p_();
    this.Z.x.removeMessages(0);
  }
  
  protected final ListAdapter w()
  {
    return this.Z;
  }
  
  protected final boolean x()
  {
    return this.Z.c();
  }
  
  protected final boolean z()
  {
    clc localclc = this.Z;
    return (localclc.f) || (localclc.g) || (localclc.h);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     com.google.android.apps.plus.fragments.PeopleSearchFragment
 * JD-Core Version:    0.7.0.1
 */