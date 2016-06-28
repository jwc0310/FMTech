package com.google.android.libraries.social.help;

import aaw;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Matrix;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.text.Html;
import android.text.TextUtils;
import android.text.TextUtils.TruncateAt;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import android.widget.TextView;
import efj;
import gxn;
import gxq;
import gxs;
import ied;
import iei;
import iek;
import java.util.ArrayList;
import java.util.List;
import pkh;
import x;

public final class TooltipView
  extends ViewGroup
  implements View.OnClickListener, gxs
{
  private static int g;
  private static int h;
  private static int i;
  private static int j;
  public int a;
  public int b;
  public int c;
  public ied d;
  public List<iek> e;
  public List<x> f;
  private int k;
  private int l;
  private boolean m;
  private boolean n;
  private TextView o;
  private TextView p;
  private TextView q;
  private ImageView r;
  private ImageView s;
  
  public TooltipView(Context paramContext)
  {
    super(paramContext);
    b();
  }
  
  public TooltipView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    b();
  }
  
  public TooltipView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    b();
  }
  
  private final void b()
  {
    Context localContext = getContext();
    Resources localResources = getResources();
    if (i == 0)
    {
      g = localResources.getDimensionPixelSize(efj.MB);
      h = localResources.getDimensionPixelSize(efj.MC);
      i = localResources.getDimensionPixelSize(efj.MA);
      j = localResources.getDimensionPixelSize(efj.Mz);
    }
    this.r = new ImageView(localContext);
    this.r.setBackgroundResource(efj.MD);
    this.s = new ImageView(getContext());
    this.s.setImageResource(efj.ME);
    this.k = this.s.getDrawable().getIntrinsicHeight();
    this.a = this.s.getDrawable().getIntrinsicWidth();
    a(0);
    this.c = 2;
    this.p = new TextView(localContext);
    this.p.setMaxLines(1);
    this.p.setTextAppearance(localContext, aaw.oN);
    this.p.setAlpha(0.54F);
    this.p.setEllipsize(TextUtils.TruncateAt.END);
    this.p.setPadding(g, 0, g, 0);
    this.p.setGravity(16);
    this.p.setAllCaps(true);
    this.o = new TextView(localContext);
    this.o.setMaxLines(5);
    this.o.setTextAppearance(localContext, aaw.oO);
    this.o.setPadding(g, 0, g, 0);
    this.q = new TextView(localContext);
    this.q.setMaxLines(1);
    this.q.setTextAppearance(localContext, aaw.oP);
    this.q.setEllipsize(TextUtils.TruncateAt.END);
    this.q.setPadding(g, 0, g, 0);
    this.q.setMinHeight(j);
    efj.a(this.q, new gxq(pkh.P));
    this.q.setOnClickListener(new gxn(new iei(this)));
    this.q.setGravity(16);
    addView(this.r);
    addView(this.s);
    addView(this.p);
    addView(this.o);
    addView(this.q);
    setOnClickListener(new gxn(this));
    this.e = new ArrayList();
    this.f = new ArrayList();
  }
  
  public final void a(int paramInt)
  {
    this.l = paramInt;
    if (paramInt == 1)
    {
      Matrix localMatrix = new Matrix();
      localMatrix.postRotate(180.0F, this.a / 2, this.k / 2);
      this.s.setScaleType(ImageView.ScaleType.MATRIX);
      this.s.setImageMatrix(localMatrix);
    }
  }
  
  public final void a(ied paramied)
  {
    if (paramied != null)
    {
      String str1 = paramied.d;
      this.o.setText(efj.y(str1));
      this.o.setContentDescription(Html.fromHtml(str1).toString());
      this.p.setText(paramied.e);
      String str2 = paramied.f;
      if (TextUtils.isEmpty(str2)) {
        break label79;
      }
      this.q.setVisibility(0);
      this.q.setText(str2);
    }
    for (;;)
    {
      this.d = paramied;
      return;
      label79:
      this.q.setVisibility(8);
    }
  }
  
  public final void a(boolean paramBoolean)
  {
    if (!this.m)
    {
      this.m = true;
      setVisibility(8);
      int i1 = this.e.size();
      for (int i2 = 0; i2 < i1; i2++) {
        ((iek)this.e.get(i2)).a(this, paramBoolean);
      }
    }
  }
  
  @TargetApi(17)
  public final boolean a()
  {
    if (Build.VERSION.SDK_INT >= 17) {}
    for (int i1 = 1; (i1 != 0) && (getResources().getConfiguration().getLayoutDirection() == 1); i1 = 0) {
      return true;
    }
    return false;
  }
  
  @Deprecated
  public final void b(int paramInt)
  {
    this.b = (paramInt - this.a / 2);
    this.c = 2;
  }
  
  public final void c(int paramInt)
  {
    this.b = (paramInt - this.a / 2);
    this.c = 0;
  }
  
  public final void onClick(View paramView)
  {
    a(true);
  }
  
  protected final void onDetachedFromWindow()
  {
    super.onDetachedFromWindow();
    if (!this.m)
    {
      int i1 = this.e.size();
      for (int i2 = 0; i2 < i1; i2++) {
        ((iek)this.e.get(i2)).a(this);
      }
    }
  }
  
  protected final void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    if (this.d == null) {
      return;
    }
    int i1 = this.b;
    if ((i1 <= 0) || (getMeasuredWidth() < i1)) {
      i1 = (getMeasuredWidth() - this.a) / 2;
    }
    if (this.l == 0) {
      if (((this.c == 0) && (a())) || ((this.c == 1) && (!a())))
      {
        int i15 = getMeasuredWidth() - i1 - this.a;
        this.s.layout(i15, 0, i15 + this.a, 0 + this.k);
      }
    }
    for (int i2 = 0 + this.k;; i2 = 0)
    {
      this.r.layout(0, i2, this.r.getMeasuredWidth(), i2 + this.r.getMeasuredHeight());
      int i3 = i2 + h;
      int i10;
      int i11;
      if (a())
      {
        i10 = this.r.getMeasuredWidth();
        this.o.layout(i10 - this.o.getMeasuredWidth(), i3, i10, i3 + this.o.getMeasuredHeight());
        i11 = i3 + this.o.getMeasuredHeight();
        if (this.q.getVisibility() != 8) {
          if (this.n)
          {
            if (this.p.getMeasuredHeight() > 0)
            {
              int i14 = i11 + i;
              this.p.layout(i10 - this.p.getMeasuredWidth(), i14, i10, i14 + this.p.getMeasuredHeight());
              i11 = i14 + this.p.getMeasuredHeight();
            }
            this.q.layout(i10 - this.q.getMeasuredWidth(), i11, i10, i11 + this.q.getMeasuredHeight());
          }
        }
      }
      for (;;)
      {
        if (this.l != 1) {
          break label852;
        }
        if (((this.c != 0) || (!a())) && ((this.c != 1) || (a()))) {
          break label854;
        }
        int i7 = getMeasuredWidth() - i1 - this.a;
        this.s.layout(i7, this.r.getMeasuredHeight(), i7 + this.a, this.r.getMeasuredHeight() + this.k);
        return;
        this.s.layout(i1, 0, i1 + this.a, 0 + this.k);
        break;
        int i13 = Math.max(this.p.getMeasuredHeight(), this.q.getMeasuredHeight());
        if (this.p.getMeasuredHeight() > 0) {
          this.p.layout(i10 - this.p.getMeasuredWidth(), i11, i10, i11 + i13);
        }
        this.q.layout(0, i11, this.q.getMeasuredWidth(), i13 + i11);
        continue;
        if (this.p.getMeasuredHeight() > 0)
        {
          int i12 = i11 + i;
          this.p.layout(i10 - this.p.getMeasuredWidth(), i12, i10, i12 + this.p.getMeasuredHeight());
          continue;
          int i4 = this.r.getMeasuredWidth();
          this.o.layout(0, i3, this.o.getMeasuredWidth(), i3 + this.o.getMeasuredHeight());
          int i5 = i3 + this.o.getMeasuredHeight();
          if (this.q.getVisibility() != 8)
          {
            if (this.n)
            {
              if (this.p.getMeasuredHeight() > 0)
              {
                int i9 = i5 + i;
                this.p.layout(0, i9, this.p.getMeasuredWidth(), i9 + this.p.getMeasuredHeight());
                i5 = i9 + this.p.getMeasuredHeight();
              }
              this.q.layout(0, i5, this.q.getMeasuredWidth(), i5 + this.q.getMeasuredHeight());
            }
            else
            {
              int i8 = Math.max(this.p.getMeasuredHeight(), this.q.getMeasuredHeight());
              if (this.p.getMeasuredHeight() > 0) {
                this.p.layout(0, i5, this.p.getMeasuredWidth(), i5 + i8);
              }
              this.q.layout(i4 - this.q.getMeasuredWidth(), i5, i4, i8 + i5);
            }
          }
          else if (this.p.getMeasuredHeight() > 0)
          {
            int i6 = i5 + i;
            this.p.layout(0, i6, this.p.getMeasuredWidth(), i6 + this.p.getMeasuredHeight());
          }
        }
      }
      label852:
      break;
      label854:
      this.s.layout(i1, this.r.getMeasuredHeight(), i1 + this.a, this.r.getMeasuredHeight() + this.k);
      return;
    }
  }
  
  protected final void onMeasure(int paramInt1, int paramInt2)
  {
    int i1 = 0;
    int i2 = View.MeasureSpec.makeMeasureSpec(0, 0);
    if (this.d == null)
    {
      setMeasuredDimension(i2, i2);
      return;
    }
    this.n = false;
    int i3 = View.MeasureSpec.getSize(paramInt1);
    int i4 = View.MeasureSpec.makeMeasureSpec(i3, -2147483648);
    this.o.measure(i4, 0);
    this.p.measure(i4, i2);
    int i8;
    int i6;
    if (this.q.getVisibility() != 8)
    {
      this.q.measure(i4, i2);
      int i11 = i3 / 2;
      if ((this.p.getMeasuredWidth() > i11) || (this.q.getMeasuredWidth() > i11)) {
        this.n = true;
      }
    }
    else
    {
      if (this.q.getVisibility() == 8) {
        break label338;
      }
      if (!this.n) {
        break label297;
      }
      i8 = this.p.getMeasuredHeight() + this.q.getMeasuredHeight() + i;
      i6 = Math.max(this.p.getMeasuredWidth(), this.q.getMeasuredWidth());
    }
    for (;;)
    {
      int i9 = Math.max(this.o.getMeasuredWidth(), i6);
      int i10 = resolveSize(i1 + (i8 + (this.o.getMeasuredHeight() + this.k) + h), paramInt2);
      this.s.measure(i2, i2);
      this.r.measure(View.MeasureSpec.makeMeasureSpec(i9, 1073741824), View.MeasureSpec.makeMeasureSpec(i10 - this.k, 1073741824));
      setMeasuredDimension(i9, i10);
      return;
      this.p.setMinHeight(j);
      this.p.measure(i4, i2);
      break;
      label297:
      i8 = Math.max(this.p.getMeasuredHeight(), this.q.getMeasuredHeight());
      i6 = this.p.getMeasuredWidth() + this.q.getMeasuredWidth();
      i1 = 0;
      continue;
      label338:
      int i5 = this.p.getMeasuredHeight();
      if (i5 > 0) {
        i5 += i;
      }
      i6 = this.p.getMeasuredWidth();
      int i7 = h;
      i8 = i5;
      i1 = i7;
    }
  }
  
  public final gxq v()
  {
    if (this.d == null) {
      return null;
    }
    return new gxq(this.d.a);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     com.google.android.libraries.social.help.TooltipView
 * JD-Core Version:    0.7.0.1
 */