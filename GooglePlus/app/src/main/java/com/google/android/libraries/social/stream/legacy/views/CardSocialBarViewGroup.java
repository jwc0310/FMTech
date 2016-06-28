package com.google.android.libraries.social.stream.legacy.views;

import aau;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.widget.ImageButton;
import az;
import do;
import efj;
import ehr;
import gxn;
import gxq;
import hew;
import hfh;
import hfq;
import ied;
import java.text.NumberFormat;
import java.util.List;
import lot;
import lxj;
import pkh;

@Deprecated
public final class CardSocialBarViewGroup
  extends ViewGroup
  implements View.OnClickListener, lxj
{
  public hfh a;
  public hew b;
  public ied c;
  private final int d;
  private final int e;
  private final int f;
  private final int g;
  private hfq h;
  private hfq i;
  private lot j;
  private NumberFormat k;
  
  public CardSocialBarViewGroup(Context paramContext)
  {
    super(paramContext);
    Context localContext = getContext();
    Resources localResources = localContext.getResources();
    this.d = localResources.getDimensionPixelOffset(ehr.eY);
    this.e = localResources.getDimensionPixelOffset(ehr.eP);
    int m = localResources.getDimensionPixelOffset(ehr.dV);
    this.f = m;
    this.g = (m * 2 + this.d + this.f);
    int n = localResources.getDimensionPixelOffset(ehr.fa);
    int i1 = localResources.getDimensionPixelOffset(ehr.eZ);
    this.a = new hfh(localContext);
    addView(this.a);
    this.h = new hfq(localContext);
    this.h.a(ehr.gx);
    hfq localhfq1 = this.h;
    localhfq1.a.setPadding(m, 0, n, 0);
    localhfq1.requestLayout();
    efj.a(this.h, new gxq(pkh.F));
    addView(this.h);
    this.i = new hfq(localContext);
    this.i.a(ehr.gw);
    hfq localhfq2 = this.i;
    localhfq2.a.setPadding(m, i1, m, 0);
    localhfq2.requestLayout();
    efj.a(this.i, new gxq(pkh.j));
    addView(this.i);
    this.k = NumberFormat.getInstance();
  }
  
  public CardSocialBarViewGroup(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    Context localContext = getContext();
    Resources localResources = localContext.getResources();
    this.d = localResources.getDimensionPixelOffset(ehr.eY);
    this.e = localResources.getDimensionPixelOffset(ehr.eP);
    int m = localResources.getDimensionPixelOffset(ehr.dV);
    this.f = m;
    this.g = (m * 2 + this.d + this.f);
    int n = localResources.getDimensionPixelOffset(ehr.fa);
    int i1 = localResources.getDimensionPixelOffset(ehr.eZ);
    this.a = new hfh(localContext);
    addView(this.a);
    this.h = new hfq(localContext);
    this.h.a(ehr.gx);
    hfq localhfq1 = this.h;
    localhfq1.a.setPadding(m, 0, n, 0);
    localhfq1.requestLayout();
    efj.a(this.h, new gxq(pkh.F));
    addView(this.h);
    this.i = new hfq(localContext);
    this.i.a(ehr.gw);
    hfq localhfq2 = this.i;
    localhfq2.a.setPadding(m, i1, m, 0);
    localhfq2.requestLayout();
    efj.a(this.i, new gxq(pkh.j));
    addView(this.i);
    this.k = NumberFormat.getInstance();
  }
  
  public CardSocialBarViewGroup(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    Context localContext = getContext();
    Resources localResources = localContext.getResources();
    this.d = localResources.getDimensionPixelOffset(ehr.eY);
    this.e = localResources.getDimensionPixelOffset(ehr.eP);
    int m = localResources.getDimensionPixelOffset(ehr.dV);
    this.f = m;
    this.g = (m * 2 + this.d + this.f);
    int n = localResources.getDimensionPixelOffset(ehr.fa);
    int i1 = localResources.getDimensionPixelOffset(ehr.eZ);
    this.a = new hfh(localContext);
    addView(this.a);
    this.h = new hfq(localContext);
    this.h.a(ehr.gx);
    hfq localhfq1 = this.h;
    localhfq1.a.setPadding(m, 0, n, 0);
    localhfq1.requestLayout();
    efj.a(this.h, new gxq(pkh.F));
    addView(this.h);
    this.i = new hfq(localContext);
    this.i.a(ehr.gw);
    hfq localhfq2 = this.i;
    localhfq2.a.setPadding(m, i1, m, 0);
    localhfq2.requestLayout();
    efj.a(this.i, new gxq(pkh.j));
    addView(this.i);
    this.k = NumberFormat.getInstance();
  }
  
  public final void D_()
  {
    this.a.D_();
    this.b = null;
    this.j = null;
  }
  
  public final int a(hew paramhew, boolean paramBoolean1, boolean paramBoolean2, int paramInt1, int paramInt2, lot paramlot)
  {
    boolean bool = true;
    this.b = paramhew;
    this.j = paramlot;
    Resources localResources = getContext().getResources();
    if (paramBoolean2)
    {
      this.h.a();
      this.h.setVisibility(0);
      this.h.setOnClickListener(new gxn(this));
      if (paramInt2 > 0)
      {
        this.h.a(this.k.format(paramInt2));
        hfq localhfq2 = this.h;
        int n = aau.Df;
        Object[] arrayOfObject2 = new Object[bool];
        arrayOfObject2[0] = Integer.valueOf(paramInt2);
        localhfq2.setContentDescription(localResources.getQuantityString(n, paramInt2, arrayOfObject2));
        this.i.a();
        this.i.setVisibility(0);
        this.i.setOnClickListener(new gxn(this));
        if (paramInt1 <= 0) {
          break label358;
        }
        this.i.a(this.k.format(paramInt1));
        hfq localhfq1 = this.i;
        int m = aau.De;
        Object[] arrayOfObject1 = new Object[bool];
        arrayOfObject1[0] = Integer.valueOf(paramInt1);
        localhfq1.setContentDescription(localResources.getQuantityString(m, paramInt1, arrayOfObject1));
        label217:
        if (!paramBoolean1) {
          break label382;
        }
        hfh localhfh1 = this.a;
        localhfh1.a(0);
        localhfh1.a(false);
        if (localhfh1.f != null) {
          localhfh1.f.end();
        }
        hfh localhfh2 = this.a;
        if ((this.b == null) || (!this.b.b())) {
          break label376;
        }
        label280:
        localhfh2.a(bool);
        this.a.a(paramhew.a());
        this.a.setOnClickListener(new gxn(this));
        this.a.setVisibility(0);
      }
    }
    for (;;)
    {
      return this.g;
      this.h.setContentDescription(localResources.getString(do.aO));
      break;
      this.h.setVisibility(8);
      break;
      label358:
      this.i.setContentDescription(localResources.getString(do.an));
      break label217;
      label376:
      bool = false;
      break label280;
      label382:
      this.a.setVisibility(8);
    }
  }
  
  public final int b()
  {
    if (aau.a(getContext())) {
      return getRight() - this.a.getRight();
    }
    return this.a.getLeft();
  }
  
  public final void onClick(View paramView)
  {
    if (this.j == null) {
      return;
    }
    if (paramView == this.a)
    {
      if (efj.B(getContext()))
      {
        hew localhew = this.b;
        int m = 0;
        if (localhew != null)
        {
          boolean bool = this.b.b();
          m = 0;
          if (bool) {
            m = 1;
          }
        }
        if (m == 0) {
          break label136;
        }
      }
      label136:
      for (int n = do.az;; n = do.ay)
      {
        AccessibilityEvent localAccessibilityEvent = AccessibilityEvent.obtain(16384);
        localAccessibilityEvent.getText().add(getResources().getString(n));
        if (Build.VERSION.SDK_INT >= 14)
        {
          onInitializeAccessibilityEvent(localAccessibilityEvent);
          localAccessibilityEvent.setContentDescription(null);
          requestSendAccessibilityEvent(this, localAccessibilityEvent);
        }
        this.j.a();
        return;
      }
    }
    if (paramView == this.h) {
      if (Build.VERSION.SDK_INT < 16) {
        break label207;
      }
    }
    label207:
    for (Bundle localBundle = az.a(paramView, 0, 0, paramView.getWidth(), paramView.getHeight()).a();; localBundle = null)
    {
      this.j.a(localBundle);
      return;
      if (paramView != this.i) {
        break;
      }
      this.j.G_();
      return;
    }
  }
  
  protected final void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    int m = 1;
    boolean bool = aau.a(getContext());
    int n = paramInt3 - paramInt1;
    if (bool)
    {
      int i8 = this.f;
      int i9 = this.e;
      int i10;
      int i11;
      label127:
      int i13;
      if (this.h.getVisibility() != 8)
      {
        i10 = m;
        if (i10 != 0)
        {
          int i14 = i9 - this.h.getPaddingLeft();
          this.h.layout(i14, i8, i14 + this.h.getMeasuredWidth(), i8 + this.h.getMeasuredHeight());
          i9 = i14 + this.h.getMeasuredWidth();
        }
        if (this.i.getVisibility() == 8) {
          break label268;
        }
        i11 = m;
        if (i11 != 0)
        {
          if (this.h.getVisibility() == 8) {
            break label274;
          }
          i13 = m;
          label148:
          if (i13 == 0) {
            i9 -= this.i.getPaddingLeft();
          }
          this.i.layout(i9, i8, i9 + this.i.getMeasuredWidth(), i8 + this.i.getMeasuredHeight());
        }
        if (this.a.getVisibility() == 8) {
          break label280;
        }
      }
      for (;;)
      {
        if (m != 0)
        {
          int i12 = n - this.e - this.a.getPaddingRight();
          this.a.layout(i12 - this.a.getMeasuredWidth(), i8, i12, i8 + this.a.getMeasuredHeight());
        }
        return;
        i10 = 0;
        break;
        label268:
        i11 = 0;
        break label127;
        label274:
        i13 = 0;
        break label148;
        label280:
        m = 0;
      }
    }
    int i1 = this.f;
    int i2;
    label308:
    int i3;
    int i4;
    label383:
    int i5;
    if (this.a.getVisibility() != 8)
    {
      i2 = m;
      if (i2 != 0)
      {
        int i7 = this.e - this.a.getPaddingLeft();
        this.a.layout(i7, i1, i7 + this.a.getMeasuredWidth(), i1 + this.a.getMeasuredHeight());
      }
      i3 = n - this.e;
      if (this.h.getVisibility() == 8) {
        break label531;
      }
      i4 = m;
      if (i4 != 0)
      {
        int i6 = i3 + this.h.getPaddingRight();
        this.h.layout(i6 - this.h.getMeasuredWidth(), i1, i6, i1 + this.h.getMeasuredHeight());
        i3 = i6 - this.h.getMeasuredWidth();
      }
      if (this.i.getVisibility() == 8) {
        break label537;
      }
      i5 = m;
      label459:
      if (i5 == 0) {
        break label541;
      }
      if (this.h.getVisibility() == 8) {
        break label543;
      }
    }
    for (;;)
    {
      if (m == 0) {
        i3 += this.i.getPaddingRight();
      }
      this.i.layout(i3 - this.i.getMeasuredWidth(), i1, i3, i1 + this.i.getMeasuredHeight());
      return;
      i2 = 0;
      break label308;
      label531:
      i4 = 0;
      break label383;
      label537:
      i5 = 0;
      break label459;
      label541:
      break;
      label543:
      m = 0;
    }
  }
  
  protected final void onMeasure(int paramInt1, int paramInt2)
  {
    int m = 1;
    if (getVisibility() == 8)
    {
      setMeasuredDimension(0, 0);
      return;
    }
    int n = aau.a(getContext(), paramInt1);
    int i1 = n - 2 * this.e;
    int i2 = View.MeasureSpec.makeMeasureSpec(0, 0);
    int i3;
    int i4;
    label76:
    label88:
    int i11;
    label108:
    int i5;
    if (this.h.getVisibility() != 8)
    {
      i3 = m;
      if (this.i.getVisibility() == 8) {
        break label368;
      }
      i4 = m;
      if (this.a.getVisibility() == 8) {
        break label374;
      }
      if (m == 0) {
        break label441;
      }
      if ((i3 == 0) && (i4 == 0)) {
        break label434;
      }
      i11 = i1 / 2;
      int i12 = View.MeasureSpec.makeMeasureSpec(i11, -2147483648);
      this.a.measure(i12, i2);
      if (i1 >= this.a.getMeasuredWidth()) {
        break label379;
      }
      this.a.setVisibility(8);
      i5 = 0;
      label153:
      i1 -= this.a.getMeasuredWidth();
    }
    for (;;)
    {
      if ((i3 != 0) && (i4 != 0) && (i1 > 0)) {
        i1 /= 2;
      }
      label258:
      int i6;
      if ((i4 != 0) && (i1 > 0))
      {
        int i9 = i1 + this.i.getPaddingLeft() + this.i.getPaddingRight();
        int i10 = View.MeasureSpec.makeMeasureSpec(i9, -2147483648);
        this.i.measure(i10, i2);
        if (i9 < this.i.getMeasuredWidth()) {
          this.i.setVisibility(8);
        }
      }
      else
      {
        if ((i3 == 0) || (i1 <= 0)) {
          break label427;
        }
        int i7 = i1 + this.h.getPaddingLeft() + this.h.getPaddingRight();
        int i8 = View.MeasureSpec.makeMeasureSpec(i7, -2147483648);
        this.h.measure(i8, i2);
        if (i7 >= this.h.getMeasuredWidth()) {
          break label410;
        }
        this.h.setVisibility(8);
        i6 = i5;
      }
      for (;;)
      {
        if (i6 > 0)
        {
          i6 += this.f;
          setVisibility(0);
        }
        setMeasuredDimension(n, i6);
        return;
        i3 = 0;
        break;
        label368:
        i4 = 0;
        break label76;
        label374:
        m = 0;
        break label88;
        label379:
        i5 = 0 + this.a.getMeasuredHeight();
        break label153;
        i5 = Math.max(i5, this.i.getMeasuredHeight());
        break label258;
        label410:
        i6 = Math.max(i5, this.h.getMeasuredHeight());
        continue;
        label427:
        i6 = i5;
      }
      label434:
      i11 = i1;
      break label108;
      label441:
      i5 = 0;
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     com.google.android.libraries.social.stream.legacy.views.CardSocialBarViewGroup
 * JD-Core Version:    0.7.0.1
 */