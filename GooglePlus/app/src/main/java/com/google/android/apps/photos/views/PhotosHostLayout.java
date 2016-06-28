package com.google.android.apps.photos.views;

import aaw;
import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;
import android.widget.AbsListView.RecyclerListener;
import android.widget.RelativeLayout;
import bfy;
import bk;
import bn;
import bp;
import bu;
import bv;
import bw;
import cl;
import com.google.android.apps.plus.views.EsDrawerLayout;
import efj;
import gxv;
import gxw;
import gxx;
import gya;
import hdr;
import hdt;
import java.util.List;
import lwo;
import mbb;
import rf;
import rl;

public class PhotosHostLayout
  extends RelativeLayout
  implements AbsListView.RecyclerListener, hdt, rl
{
  private static int h = -1;
  private static int i = -1;
  private static int j = -1;
  public rl a;
  public SelectedAccountNavigationView b;
  public NavigationBarLayout c;
  public EsDrawerLayout d;
  public bw e;
  public bfy f;
  public boolean g;
  private final hdr k;
  
  public PhotosHostLayout(Context paramContext)
  {
    super(paramContext);
    bp localbp = (bp)getContext();
    this.e = localbp.b.a.d;
    this.k = ((hdr)mbb.b(localbp, hdr.class));
  }
  
  public PhotosHostLayout(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    bp localbp = (bp)getContext();
    this.e = localbp.b.a.d;
    this.k = ((hdr)mbb.b(localbp, hdr.class));
  }
  
  public PhotosHostLayout(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    bp localbp = (bp)getContext();
    this.e = localbp.b.a.d;
    this.k = ((hdr)mbb.b(localbp, hdr.class));
  }
  
  public final void a()
  {
    if (this.d.g(this.c)) {
      this.d.f(this.c);
    }
  }
  
  public final void a(int paramInt) {}
  
  public final void a(View paramView)
  {
    if (paramView != null)
    {
      if (this.a != null) {
        this.a.a(this.d);
      }
      if (this.f != null) {
        this.f.b(true);
      }
      if (this.k != null) {
        this.k.a(this);
      }
    }
  }
  
  public final void a(View paramView, float paramFloat)
  {
    if (this.a != null) {
      this.a.a(paramView, paramFloat);
    }
  }
  
  public final void a(bk parambk, bn parambn, boolean paramBoolean)
  {
    bk localbk = this.e.a("hosted");
    gya localgya1 = ((gxv)parambk).r_();
    gya localgya3;
    gya localgya2;
    label40:
    cl localcl;
    if (localbk != null) {
      if (paramBoolean)
      {
        localgya3 = gya.K;
        localgya2 = localgya3;
        if (parambn != null) {
          parambk.a(parambn);
        }
        localcl = this.e.a();
        localcl.b(aaw.dM, parambk, "hosted");
        if (!paramBoolean) {
          break label191;
        }
        localcl.a(4099);
      }
    }
    for (;;)
    {
      localcl.c();
      this.e.b();
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
      if ((localbk instanceof gxv))
      {
        localgya3 = ((gxv)localbk).r_();
        break;
      }
      localgya3 = null;
      break;
      localgya2 = localgya1;
      break label40;
      label191:
      localcl.a(0);
    }
  }
  
  public final void b(View paramView)
  {
    EsDrawerLayout localEsDrawerLayout = this.d;
    localEsDrawerLayout.a(0, 3);
    localEsDrawerLayout.a(0, 5);
    if (paramView != null)
    {
      if (this.a != null) {
        this.a.b(this.d);
      }
      if (this.f != null) {
        this.f.b(false);
      }
      if (this.k != null) {
        this.k.a.remove(this);
      }
    }
  }
  
  protected void onFinishInflate()
  {
    super.onFinishInflate();
    this.b = ((SelectedAccountNavigationView)findViewById(aaw.jA));
    this.c = ((NavigationBarLayout)findViewById(aaw.fB));
    this.d = ((EsDrawerLayout)findViewById(aaw.cM));
    this.d.g = this;
    Resources localResources = getResources();
    if (h < 0)
    {
      h = localResources.getDimensionPixelSize(efj.mf);
      i = localResources.getDimensionPixelSize(efj.me);
      j = localResources.getInteger(efj.sl);
    }
  }
  
  protected void onMeasure(int paramInt1, int paramInt2)
  {
    int m = Math.min(Math.max(View.MeasureSpec.getSize(paramInt1) * j / 100, h), i);
    this.c.getLayoutParams().width = m;
    super.onMeasure(paramInt1, paramInt2);
  }
  
  public void onMovedToScrapHeap(View paramView)
  {
    lwo.f(paramView);
  }
  
  public final boolean t_()
  {
    if (this.d.g(this.c))
    {
      a();
      return true;
    }
    return false;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     com.google.android.apps.photos.views.PhotosHostLayout
 * JD-Core Version:    0.7.0.1
 */