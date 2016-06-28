package com.google.android.libraries.social.profile.viewer.flair;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.Resources;
import android.os.Build.VERSION;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.View.MeasureSpec;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;
import aw;
import efj;
import git;
import gxq;
import hgz;
import hha;
import kxq;
import led;
import lej;
import lxj;
import mbb;
import pka;

public final class ProfileFlairView
  extends LinearLayout
  implements lxj
{
  public LinearLayout a;
  public LinearLayout b;
  public TextView c;
  public TextView d;
  public final kxq e;
  public final hha f;
  public final lej g;
  public final led h;
  public final hgz i;
  public final int j;
  public final LinearLayout.LayoutParams k;
  public final LinearLayout.LayoutParams l;
  public final int m;
  private final int n;
  
  public ProfileFlairView(Context paramContext)
  {
    super(paramContext);
    Context localContext = getContext();
    this.e = ((kxq)mbb.a(localContext, kxq.class));
    this.f = ((hha)mbb.a(localContext, hha.class));
    this.i = ((hgz)mbb.a(localContext, hgz.class));
    this.g = ((lej)mbb.a(localContext, lej.class));
    this.h = ((led)mbb.a(localContext, led.class));
    this.j = ((git)mbb.a(localContext, git.class)).c();
    this.k = new LinearLayout.LayoutParams(-2, -2);
    this.l = new LinearLayout.LayoutParams(-2, -2);
    int i1 = localContext.getResources().getDimensionPixelSize(efj.TV);
    this.k.setMargins(i1, 0, i1, 0);
    if (b()) {
      this.l.setMargins(i1, 0, 0, 0);
    }
    for (;;)
    {
      this.n = (i1 / 2);
      this.m = efj.v(localContext, efj.K(localContext).widthPixels);
      return;
      this.l.setMargins(0, 0, i1, 0);
    }
  }
  
  public ProfileFlairView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    Context localContext = getContext();
    this.e = ((kxq)mbb.a(localContext, kxq.class));
    this.f = ((hha)mbb.a(localContext, hha.class));
    this.i = ((hgz)mbb.a(localContext, hgz.class));
    this.g = ((lej)mbb.a(localContext, lej.class));
    this.h = ((led)mbb.a(localContext, led.class));
    this.j = ((git)mbb.a(localContext, git.class)).c();
    this.k = new LinearLayout.LayoutParams(-2, -2);
    this.l = new LinearLayout.LayoutParams(-2, -2);
    int i1 = localContext.getResources().getDimensionPixelSize(efj.TV);
    this.k.setMargins(i1, 0, i1, 0);
    if (b()) {
      this.l.setMargins(i1, 0, 0, 0);
    }
    for (;;)
    {
      this.n = (i1 / 2);
      this.m = efj.v(localContext, efj.K(localContext).widthPixels);
      return;
      this.l.setMargins(0, 0, i1, 0);
    }
  }
  
  public ProfileFlairView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    Context localContext = getContext();
    this.e = ((kxq)mbb.a(localContext, kxq.class));
    this.f = ((hha)mbb.a(localContext, hha.class));
    this.i = ((hgz)mbb.a(localContext, hgz.class));
    this.g = ((lej)mbb.a(localContext, lej.class));
    this.h = ((led)mbb.a(localContext, led.class));
    this.j = ((git)mbb.a(localContext, git.class)).c();
    this.k = new LinearLayout.LayoutParams(-2, -2);
    this.l = new LinearLayout.LayoutParams(-2, -2);
    int i1 = localContext.getResources().getDimensionPixelSize(efj.TV);
    this.k.setMargins(i1, 0, i1, 0);
    if (b()) {
      this.l.setMargins(i1, 0, 0, 0);
    }
    for (;;)
    {
      this.n = (i1 / 2);
      this.m = efj.v(localContext, efj.K(localContext).widthPixels);
      return;
      this.l.setMargins(0, 0, i1, 0);
    }
  }
  
  @TargetApi(17)
  private final boolean b()
  {
    if (Build.VERSION.SDK_INT >= 17) {}
    for (int i1 = 1; (i1 != 0) && (getLayoutDirection() == 1); i1 = 0) {
      return true;
    }
    return false;
  }
  
  public final void D_()
  {
    this.a.removeAllViews();
    this.b.removeAllViews();
    this.c.setVisibility(8);
    this.d.setVisibility(8);
  }
  
  public final void a(String paramString)
  {
    TextView localTextView = this.c;
    if (TextUtils.isEmpty(paramString)) {}
    for (;;)
    {
      localTextView.setText(paramString);
      return;
      paramString = getContext().getString(efj.Ub, new Object[] { paramString });
    }
  }
  
  protected final void onFinishInflate()
  {
    super.onFinishInflate();
    this.c = ((TextView)findViewById(aw.dz));
    this.d = ((TextView)findViewById(aw.dA));
    efj.a(this.d, new gxq(pka.I));
    this.a = ((LinearLayout)findViewById(aw.dx));
    this.b = ((LinearLayout)findViewById(aw.dy));
  }
  
  protected final void onMeasure(int paramInt1, int paramInt2)
  {
    int i1 = 0;
    int i2 = (int)(View.MeasureSpec.getSize(paramInt1) / this.m);
    int i3 = this.a.getChildCount();
    for (int i4 = 0; i4 < i3; i4++) {
      this.a.getChildAt(i4).getLayoutParams().width = (i2 - this.n);
    }
    int i5 = this.b.getChildCount();
    while (i1 < i5)
    {
      this.b.getChildAt(i1).getLayoutParams().width = (i2 - this.n);
      i1++;
    }
    super.onMeasure(paramInt1, paramInt2);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     com.google.android.libraries.social.profile.viewer.flair.ProfileFlairView
 * JD-Core Version:    0.7.0.1
 */