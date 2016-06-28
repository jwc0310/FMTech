package com.google.android.apps.plus.phone;

import aaw;
import android.app.Activity;
import android.content.Context;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AbsListView.RecyclerListener;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import bk;
import bn;
import bp;
import bu;
import bv;
import bw;
import cl;
import gxv;
import gxw;
import gxx;
import gya;
import iwj;
import lwo;
import mbb;

public class HostLayout
  extends RelativeLayout
  implements AbsListView.RecyclerListener
{
  public bw a = ((bp)getContext()).b.a.d;
  private FrameLayout b;
  
  public HostLayout(Context paramContext)
  {
    super(paramContext);
  }
  
  public HostLayout(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }
  
  public HostLayout(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
  }
  
  public final void a(bk parambk, bn parambn, boolean paramBoolean)
  {
    bk localbk = this.a.a("hosted");
    gya localgya1;
    gya localgya3;
    label43:
    gya localgya2;
    label47:
    cl localcl;
    if ((parambk instanceof gxv))
    {
      localgya1 = ((gxv)parambk).r_();
      if (localbk == null) {
        break label205;
      }
      if (!paramBoolean) {
        break label176;
      }
      localgya3 = gya.K;
      localgya2 = localgya3;
      if (parambn != null) {
        parambk.a(parambn);
      }
      localcl = this.a.a();
      localcl.b(aaw.dM, parambk, "hosted");
      if ((!paramBoolean) || (Build.VERSION.SDK_INT < 19)) {
        break label212;
      }
      localcl.a(4099);
    }
    for (;;)
    {
      localcl.c();
      this.a.b();
      if (localgya1 != null)
      {
        Context localContext = getContext();
        gxx localgxx = (gxx)mbb.a(localContext, gxx.class);
        gxw localgxw = new gxw(localContext);
        localgxw.d = localgya2;
        localgxw.e = localgya1;
        localgxx.a(localgxw);
      }
      return;
      localgya1 = null;
      break;
      label176:
      if ((localbk instanceof gxv))
      {
        localgya3 = ((gxv)localbk).r_();
        break label43;
      }
      localgya3 = null;
      break label43;
      label205:
      localgya2 = localgya1;
      break label47;
      label212:
      localcl.a(0);
    }
  }
  
  protected void onFinishInflate()
  {
    super.onFinishInflate();
    this.b = ((FrameLayout)findViewById(aaw.fD));
  }
  
  protected void onMeasure(int paramInt1, int paramInt2)
  {
    this.b.getLayoutParams().width = iwj.a((Activity)getContext());
    super.onMeasure(paramInt1, paramInt2);
  }
  
  public void onMovedToScrapHeap(View paramView)
  {
    lwo.f(paramView);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     com.google.android.apps.plus.phone.HostLayout
 * JD-Core Version:    0.7.0.1
 */