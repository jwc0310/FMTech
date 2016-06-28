package com.google.android.libraries.social.login.ui;

import aau;
import android.content.Context;
import android.os.Handler;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import android.widget.TextView;
import efj;
import iow;
import lxj;

public final class CurrentAccountBannerView
  extends LinearLayout
  implements lxj
{
  public TextView a;
  public TextView b;
  public String c;
  public boolean d;
  public boolean e;
  
  public CurrentAccountBannerView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }
  
  public CurrentAccountBannerView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
  }
  
  public final void D_()
  {
    this.c = null;
    this.e = false;
  }
  
  public final void b()
  {
    if (efj.C(getContext())) {
      return;
    }
    iow localiow = new iow(this);
    efj.m().postDelayed(localiow, 2000L);
  }
  
  protected final void onAttachedToWindow()
  {
    super.onAttachedToWindow();
    this.d = true;
    if (this.e)
    {
      this.e = false;
      if (this.c != null) {
        b();
      }
    }
  }
  
  protected final void onDetachedFromWindow()
  {
    super.onDetachedFromWindow();
    this.d = false;
  }
  
  protected final void onFinishInflate()
  {
    super.onFinishInflate();
    this.a = ((TextView)findViewById(aau.Ai));
    this.b = ((TextView)findViewById(aau.Ah));
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     com.google.android.libraries.social.login.ui.CurrentAccountBannerView
 * JD-Core Version:    0.7.0.1
 */