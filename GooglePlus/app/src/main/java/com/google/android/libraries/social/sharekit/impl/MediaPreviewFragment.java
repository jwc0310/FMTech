package com.google.android.libraries.social.sharekit.impl;

import aau;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.Display;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.WindowManager;
import android.widget.BaseAdapter;
import bp;
import com.google.android.libraries.social.ui.views.RecyclingViewGroup;
import efj;
import ipa;
import iqt;
import irp;
import irq;
import java.util.ArrayList;
import kic;
import kjz;
import kka;
import kmi;
import mbb;
import mca;

public final class MediaPreviewFragment
  extends mca
  implements irq
{
  private static int Z;
  public irp a;
  public BaseAdapter b;
  public final View.OnClickListener c = new kjz(this);
  private RecyclingViewGroup d;
  
  public static int a(WindowManager paramWindowManager, Resources paramResources, boolean paramBoolean)
  {
    int i = paramWindowManager.getDefaultDisplay().getWidth();
    int j = (int)paramResources.getDimension(efj.UG);
    int k = (int)paramResources.getDimension(efj.UF);
    int m = i - j * 2;
    if (paramBoolean) {
      m -= k;
    }
    if (Z == 0) {
      Z = (int)paramResources.getDimension(efj.UE);
    }
    return Math.min(Z, m);
  }
  
  private final void v()
  {
    int i = 1;
    if (this.a.a())
    {
      this.d.setVisibility(8);
      this.b.notifyDataSetChanged();
      return;
    }
    this.d.setVisibility(0);
    WindowManager localWindowManager = f().getWindowManager();
    Resources localResources = g();
    if (this.a.a.size() > i) {}
    for (;;)
    {
      int k = a(localWindowManager, localResources, i);
      ViewGroup.LayoutParams localLayoutParams = this.d.getLayoutParams();
      localLayoutParams.width = -1;
      localLayoutParams.height = k;
      this.d.setLayoutParams(localLayoutParams);
      break;
      int j = 0;
    }
  }
  
  public final View a(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    View localView = paramLayoutInflater.inflate(efj.UQ, paramViewGroup, false);
    this.d = ((RecyclingViewGroup)localView.findViewById(aau.Bz));
    this.d.h = true;
    RecyclingViewGroup localRecyclingViewGroup = this.d;
    iqt localiqt = new iqt();
    localRecyclingViewGroup.c.a = localiqt;
    if (this.a.h != null) {}
    for (Object localObject = ((kmi)this.bo.a(kic.class)).o();; localObject = new kka(this, f(), 17367043, this.a.a))
    {
      this.b = ((BaseAdapter)localObject);
      this.d.a(this.b, 0, 0);
      return localView;
    }
  }
  
  public final void a(Bundle paramBundle)
  {
    super.a(paramBundle);
    this.a = ((irp)this.bo.a(irp.class));
  }
  
  public final void a(ArrayList<ipa> paramArrayList, Object paramObject)
  {
    v();
  }
  
  public final void aJ_() {}
  
  public final void d_()
  {
    this.d = null;
    super.d_();
  }
  
  public final void m()
  {
    super.m();
    this.a.b.add(this);
    v();
  }
  
  public final void n()
  {
    this.a.b.remove(this);
    super.n();
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     com.google.android.libraries.social.sharekit.impl.MediaPreviewFragment
 * JD-Core Version:    0.7.0.1
 */