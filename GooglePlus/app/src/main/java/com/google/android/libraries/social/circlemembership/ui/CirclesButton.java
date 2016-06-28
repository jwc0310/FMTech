package com.google.android.libraries.social.circlemembership.ui;

import aaw;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.text.TextUtils;
import android.text.TextUtils.TruncateAt;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.ProgressBar;
import android.widget.TextView;
import efj;
import gxq;
import gxs;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import pju;
import pkf;

public final class CirclesButton
  extends ViewGroup
  implements gxs
{
  private static boolean e;
  private static Drawable f;
  private static Drawable g;
  private static Drawable h;
  private static Drawable i;
  private static Drawable j;
  private static Drawable k;
  private static Drawable l;
  private static Drawable m;
  private static Drawable n;
  private static int o;
  private static int p;
  private static int q;
  private static int r;
  private Rect A = new Rect();
  private boolean B;
  private boolean C;
  private Rect D = new Rect();
  final TextView a;
  List<String> b;
  public boolean c = true;
  int d;
  private int s;
  private Drawable t;
  private boolean u;
  private final TextView v;
  private ProgressBar w;
  private Rect x = new Rect();
  private final StringBuilder y = new StringBuilder();
  private boolean z;
  
  public CirclesButton(Context paramContext)
  {
    super(paramContext);
    if (!e)
    {
      e = true;
      Resources localResources = getResources();
      o = localResources.getDimensionPixelSize(efj.Gz);
      p = localResources.getDimensionPixelSize(efj.GA);
      q = localResources.getDimensionPixelSize(efj.GC);
      r = localResources.getDimensionPixelSize(efj.GB);
      h = localResources.getDrawable(efj.GI);
      f = localResources.getDrawable(efj.GG);
      g = localResources.getDrawable(efj.GH);
      k = localResources.getDrawable(efj.GK);
      l = localResources.getDrawable(efj.GL);
      i = localResources.getDrawable(efj.GD);
      j = localResources.getDrawable(efj.GE);
      m = localResources.getDrawable(efj.GF);
      n = localResources.getDrawable(efj.GJ);
      h.setFilterBitmap(true);
      f.setFilterBitmap(true);
      g.setFilterBitmap(true);
      k.setFilterBitmap(true);
      i.setFilterBitmap(true);
      j.setFilterBitmap(true);
      m.setFilterBitmap(true);
    }
    Context localContext = getContext();
    this.a = new TextView(localContext);
    this.a.setTextAppearance(localContext, aaw.nL);
    this.a.setLayoutParams(new ViewGroup.LayoutParams(-2, -1));
    this.a.setSingleLine();
    this.a.setEllipsize(TextUtils.TruncateAt.END);
    this.a.setGravity(16);
    addView(this.a);
    this.v = new TextView(localContext);
    this.v.setTextAppearance(localContext, aaw.nJ);
    this.v.setLayoutParams(new ViewGroup.LayoutParams(-2, -1));
    this.v.setGravity(16);
    this.v.setSingleLine();
    this.v.setEllipsize(TextUtils.TruncateAt.END);
    addView(this.v);
    this.d = 0;
    a(this.d);
  }
  
  public CirclesButton(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    if (!e)
    {
      e = true;
      Resources localResources = getResources();
      o = localResources.getDimensionPixelSize(efj.Gz);
      p = localResources.getDimensionPixelSize(efj.GA);
      q = localResources.getDimensionPixelSize(efj.GC);
      r = localResources.getDimensionPixelSize(efj.GB);
      h = localResources.getDrawable(efj.GI);
      f = localResources.getDrawable(efj.GG);
      g = localResources.getDrawable(efj.GH);
      k = localResources.getDrawable(efj.GK);
      l = localResources.getDrawable(efj.GL);
      i = localResources.getDrawable(efj.GD);
      j = localResources.getDrawable(efj.GE);
      m = localResources.getDrawable(efj.GF);
      n = localResources.getDrawable(efj.GJ);
      h.setFilterBitmap(true);
      f.setFilterBitmap(true);
      g.setFilterBitmap(true);
      k.setFilterBitmap(true);
      i.setFilterBitmap(true);
      j.setFilterBitmap(true);
      m.setFilterBitmap(true);
    }
    Context localContext = getContext();
    this.a = new TextView(localContext);
    this.a.setTextAppearance(localContext, aaw.nL);
    this.a.setLayoutParams(new ViewGroup.LayoutParams(-2, -1));
    this.a.setSingleLine();
    this.a.setEllipsize(TextUtils.TruncateAt.END);
    this.a.setGravity(16);
    addView(this.a);
    this.v = new TextView(localContext);
    this.v.setTextAppearance(localContext, aaw.nJ);
    this.v.setLayoutParams(new ViewGroup.LayoutParams(-2, -1));
    this.v.setGravity(16);
    this.v.setSingleLine();
    this.v.setEllipsize(TextUtils.TruncateAt.END);
    addView(this.v);
    this.d = 0;
    a(this.d);
  }
  
  public CirclesButton(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    if (!e)
    {
      e = true;
      Resources localResources = getResources();
      o = localResources.getDimensionPixelSize(efj.Gz);
      p = localResources.getDimensionPixelSize(efj.GA);
      q = localResources.getDimensionPixelSize(efj.GC);
      r = localResources.getDimensionPixelSize(efj.GB);
      h = localResources.getDrawable(efj.GI);
      f = localResources.getDrawable(efj.GG);
      g = localResources.getDrawable(efj.GH);
      k = localResources.getDrawable(efj.GK);
      l = localResources.getDrawable(efj.GL);
      i = localResources.getDrawable(efj.GD);
      j = localResources.getDrawable(efj.GE);
      m = localResources.getDrawable(efj.GF);
      n = localResources.getDrawable(efj.GJ);
      h.setFilterBitmap(true);
      f.setFilterBitmap(true);
      g.setFilterBitmap(true);
      k.setFilterBitmap(true);
      i.setFilterBitmap(true);
      j.setFilterBitmap(true);
      m.setFilterBitmap(true);
    }
    Context localContext = getContext();
    this.a = new TextView(localContext);
    this.a.setTextAppearance(localContext, aaw.nL);
    this.a.setLayoutParams(new ViewGroup.LayoutParams(-2, -1));
    this.a.setSingleLine();
    this.a.setEllipsize(TextUtils.TruncateAt.END);
    this.a.setGravity(16);
    addView(this.a);
    this.v = new TextView(localContext);
    this.v.setTextAppearance(localContext, aaw.nJ);
    this.v.setLayoutParams(new ViewGroup.LayoutParams(-2, -1));
    this.v.setGravity(16);
    this.v.setSingleLine();
    this.v.setEllipsize(TextUtils.TruncateAt.END);
    addView(this.v);
    this.d = 0;
    a(this.d);
  }
  
  private final int a()
  {
    if (Build.VERSION.SDK_INT >= 21)
    {
      TypedValue localTypedValue1 = new TypedValue();
      getContext().getTheme().resolveAttribute(16843868, localTypedValue1, true);
      return localTypedValue1.resourceId;
    }
    TypedValue localTypedValue2 = new TypedValue();
    getContext().getTheme().resolveAttribute(16843534, localTypedValue2, true);
    return localTypedValue2.resourceId;
  }
  
  private final void a(StringBuilder paramStringBuilder, int paramInt)
  {
    int i1 = 0;
    int i2;
    Object localObject;
    if (this.b == null)
    {
      i2 = 0;
      if (paramInt != i2) {
        break label76;
      }
      localObject = this.b;
    }
    for (;;)
    {
      label76:
      ArrayList localArrayList;
      if (i1 < paramInt)
      {
        if (i1 > 0) {
          paramStringBuilder.append(", ");
        }
        paramStringBuilder.append((String)((List)localObject).get(i1));
        i1++;
        continue;
        i2 = this.b.size();
        break;
        localArrayList = new ArrayList(this.b);
        while (localArrayList.size() > paramInt)
        {
          int i3 = 0;
          int i4 = -1;
          int i5 = 0;
          while (i3 < localArrayList.size())
          {
            int i6 = ((String)localArrayList.get(i3)).length();
            if (i6 >= i5)
            {
              i4 = i3;
              i5 = i6;
            }
            i3++;
          }
          localArrayList.remove(i4);
        }
      }
      if (paramInt < i2) {
        paramStringBuilder.append(",…");
      }
      return;
      localObject = localArrayList;
      i1 = 0;
    }
  }
  
  public final void a(int paramInt)
  {
    this.d = paramInt;
    this.C = false;
    this.s = o;
    this.a.setVisibility(0);
    if (TextUtils.isEmpty(getContentDescription())) {
      setContentDescription(getResources().getString(efj.GP));
    }
    switch (paramInt)
    {
    default: 
      return;
    case 0: 
    case 14: 
      setBackgroundResource(efj.GN);
      this.a.setTextAppearance(getContext(), aaw.nK);
      this.c = true;
      this.t = g;
      this.C = true;
      return;
    case 1: 
      setBackgroundResource(efj.GN);
      this.a.setTextAppearance(getContext(), aaw.nK);
      this.c = true;
      this.t = f;
      this.C = true;
      this.a.setVisibility(8);
      this.v.setVisibility(8);
      return;
    case 2: 
      setBackgroundResource(efj.GN);
      this.a.setTextAppearance(getContext(), aaw.nK);
      this.c = true;
      this.t = h;
      this.C = true;
      this.a.setVisibility(8);
      this.v.setVisibility(8);
      return;
    case 3: 
      setBackgroundResource(a());
      this.c = true;
      this.t = n;
      this.a.setVisibility(8);
      this.v.setVisibility(8);
      setContentDescription(getResources().getString(efj.GS));
      return;
    case 4: 
    case 10: 
    case 13: 
      setBackgroundResource(efj.GM);
      this.a.setTextAppearance(getContext(), aaw.nL);
      this.c = true;
      this.t = j;
      return;
    case 5: 
      setBackgroundResource(efj.GN);
      this.a.setTextAppearance(getContext(), aaw.nL);
      this.c = true;
      this.t = k;
      return;
    case 6: 
      setBackgroundResource(efj.GM);
      this.a.setTextAppearance(getContext(), aaw.nL);
      this.c = true;
      this.t = j;
      this.s = p;
      return;
    case 7: 
      setBackgroundResource(efj.GM);
      this.a.setTextAppearance(getContext(), aaw.nL);
      this.c = true;
      this.t = j;
      return;
    case 8: 
      setBackgroundResource(efj.GM);
      this.a.setTextAppearance(getContext(), aaw.nL);
      this.c = true;
      this.t = j;
      this.a.setVisibility(8);
      this.v.setVisibility(8);
      return;
    case 9: 
      setBackgroundResource(a());
      this.c = true;
      this.t = l;
      this.a.setVisibility(8);
      this.v.setVisibility(8);
      return;
    case 11: 
      setBackgroundResource(efj.GN);
      a(getResources().getString(efj.GR));
      this.a.setTextAppearance(getContext(), aaw.nK);
      this.c = false;
      return;
    }
    TypedValue localTypedValue = new TypedValue();
    getContext().getTheme().resolveAttribute(16843534, localTypedValue, true);
    setBackgroundResource(localTypedValue.resourceId);
    a(getResources().getString(efj.GR));
    this.a.setTextAppearance(getContext(), aaw.nM);
    this.a.setAllCaps(true);
    this.c = false;
  }
  
  public final void a(String paramString)
  {
    if (!TextUtils.isEmpty(paramString)) {}
    for (boolean bool = true;; bool = false)
    {
      this.u = bool;
      if (!TextUtils.equals(this.a.getText(), paramString))
      {
        this.a.setText(paramString);
        setContentDescription(paramString);
        requestLayout();
      }
      return;
    }
  }
  
  public final void a(List<String> paramList)
  {
    a(null);
    this.b = paramList;
    if ((this.b != null) && (!this.b.isEmpty()))
    {
      Collections.sort(this.b, String.CASE_INSENSITIVE_ORDER);
      a(0);
    }
    for (;;)
    {
      requestLayout();
      return;
      a(4);
    }
  }
  
  public final void a(boolean paramBoolean)
  {
    if (this.z != paramBoolean)
    {
      this.z = paramBoolean;
      if (!paramBoolean) {
        break label68;
      }
      if (this.w == null)
      {
        this.w = new ProgressBar(getContext());
        this.w.setIndeterminate(true);
        addView(this.w);
      }
      this.w.setVisibility(0);
    }
    for (;;)
    {
      invalidate();
      return;
      label68:
      if (this.w != null) {
        this.w.setVisibility(8);
      }
    }
  }
  
  @Deprecated
  public final void b(boolean paramBoolean)
  {
    if (this.B != paramBoolean)
    {
      this.B = paramBoolean;
      requestLayout();
      invalidate();
    }
  }
  
  protected final void dispatchDraw(Canvas paramCanvas)
  {
    if (this.c)
    {
      this.t.setBounds(this.A);
      this.t.draw(paramCanvas);
    }
    if ((this.B) && (this.C))
    {
      m.setBounds(this.D);
      m.draw(paramCanvas);
    }
    super.dispatchDraw(paramCanvas);
  }
  
  protected final void onDetachedFromWindow()
  {
    super.onDetachedFromWindow();
  }
  
  protected final void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    int i1 = paramInt3 - paramInt1;
    int i2 = paramInt4 - paramInt2;
    int i3 = i1 - this.x.left - this.x.right;
    int i4 = i2 - this.x.top - this.x.bottom;
    int i5 = i1 - this.x.right;
    int i6 = i2 - this.x.bottom;
    int i7 = this.a.getMeasuredHeight();
    if (this.z)
    {
      int i23 = this.w.getMeasuredWidth();
      int i24 = this.w.getMeasuredHeight();
      int i25 = (i1 - i23) / 2;
      int i26 = (i2 - i24) / 2;
      this.w.layout(i25, i26, i25 + i23, i23 + i26);
    }
    boolean bool1 = this.c;
    int i8 = 0;
    if (bool1)
    {
      i8 = 0 + this.t.getIntrinsicWidth();
      if (this.a.getVisibility() == 0) {
        i8 += this.s;
      }
    }
    if (this.v.getVisibility() == 0) {
      i8 += this.v.getMeasuredWidth() + q;
    }
    int i9 = i8 + this.a.getMeasuredWidth();
    boolean bool2 = this.B;
    int i10 = 0;
    if (bool2)
    {
      boolean bool3 = this.C;
      i10 = 0;
      if (bool3)
      {
        i10 = m.getIntrinsicWidth();
        i9 += i10 + this.s;
      }
    }
    int i11 = this.x.left + (i3 - i9) / 2;
    if (i11 < this.x.left) {
      i11 = this.x.left;
    }
    int i12 = this.x.top + (i4 - i7) / 2;
    if (i12 < this.x.top) {
      i12 = this.x.top;
    }
    int i13 = i9 + i11;
    if (i13 > i5) {
      i13 = i5;
    }
    int i14 = i12 + Math.min(i2, i7);
    if (i14 > i6) {
      i14 = i6;
    }
    if (this.c)
    {
      int i20 = this.t.getIntrinsicHeight();
      int i21 = this.t.getIntrinsicWidth();
      int i22 = this.x.top + (i4 - i20) / 2;
      this.A.set(i11, i22, i11 + i21, i20 + i22);
      i11 += i21 + this.s;
    }
    if ((this.B) && (this.C))
    {
      int i17 = m.getIntrinsicHeight();
      int i18 = this.x.top + (i4 - i17) / 2;
      int i19 = i13 - i10;
      this.D.set(i19, i18, i10 + i19, i17 + i18);
      i13 = i19 - this.s;
    }
    if (this.v.getVisibility() == 0)
    {
      if (this.a.getVisibility() != 0) {
        break label635;
      }
      int i15 = this.v.getMeasuredWidth();
      int i16 = i13 - i15;
      this.v.layout(i16, i12, i15 + i16, i14);
      i13 = i16 - q;
    }
    for (;;)
    {
      if (this.a.getVisibility() == 0) {
        this.a.layout(i11, i12, i13, i14);
      }
      return;
      label635:
      this.v.layout(i11, i12, i13, i14);
    }
  }
  
  protected final void onMeasure(int paramInt1, int paramInt2)
  {
    Drawable localDrawable = getBackground();
    int i1 = localDrawable.getMinimumWidth();
    int i2 = localDrawable.getMinimumHeight();
    int i3;
    int i6;
    label92:
    int i8;
    label108:
    int i11;
    label192:
    int i12;
    label220:
    int i13;
    int i16;
    int i17;
    int i19;
    int i20;
    if (this.a.getVisibility() != 8)
    {
      i3 = 1;
      if (localDrawable != null) {
        localDrawable.getPadding(this.x);
      }
      Rect localRect1 = this.x;
      Rect localRect2 = this.x;
      int i4 = r;
      localRect2.right = i4;
      localRect1.left = i4;
      int i5 = View.MeasureSpec.getMode(paramInt1);
      if (i5 != 0) {
        break label600;
      }
      i6 = 2147483647;
      int i7 = View.MeasureSpec.getMode(paramInt2);
      if (i7 != 0) {
        break label609;
      }
      i8 = 2147483647;
      boolean bool = this.c;
      int i9 = 0;
      int i10 = 0;
      if (bool)
      {
        int i28 = this.t.getIntrinsicWidth();
        if (i3 != 0) {
          i28 += this.s;
        }
        int i29 = this.t.getIntrinsicHeight();
        i10 = i28;
        i9 = i29;
      }
      if ((!this.B) || (!this.C)) {
        break label618;
      }
      i11 = m.getIntrinsicWidth() + this.s;
      if (i3 == 0) {
        break label624;
      }
      i12 = i6 - i10 - this.x.left - this.x.right;
      i13 = View.MeasureSpec.makeMeasureSpec(i8, -2147483648);
      if ((i3 != 0) && (this.u))
      {
        this.v.setVisibility(8);
        this.a.measure(View.MeasureSpec.makeMeasureSpec(i12, -2147483648), i13);
        i12 = this.a.getMeasuredWidth();
      }
      if (i5 != 1073741824) {
        i6 = Math.max(i1, i11 + (i12 + i10)) + this.x.left + this.x.right;
      }
      if (i7 != 1073741824) {
        i8 = Math.max(i2, Math.max(i9, this.a.getMeasuredHeight())) + this.x.top + this.x.bottom;
      }
      int i14 = Math.max(i6, getSuggestedMinimumWidth());
      int i15 = Math.max(i8, getSuggestedMinimumHeight());
      i16 = resolveSize(i14, paramInt1);
      i17 = resolveSize(i15, paramInt2);
      if ((i3 != 0) && (!this.u))
      {
        i19 = i16 - i10 - this.x.left - this.x.right;
        if ((this.B) && (this.C)) {
          i19 -= i11 + this.s;
        }
        this.y.setLength(0);
        if (this.b != null) {
          break label630;
        }
        i20 = 0;
        label476:
        a(this.y, i20);
        String str1 = this.y.toString();
        this.a.setText(str1);
        setContentDescription(str1);
        this.a.measure(0, i13);
        if (this.a.getMeasuredWidth() > i19) {
          break label644;
        }
        this.v.setVisibility(8);
      }
    }
    for (;;)
    {
      if (this.z)
      {
        int i18 = View.MeasureSpec.makeMeasureSpec(i17 - this.x.top - this.x.bottom, 1073741824);
        this.w.measure(i18, i18);
      }
      setMeasuredDimension(i16, i17);
      return;
      i3 = 0;
      break;
      label600:
      i6 = View.MeasureSpec.getSize(paramInt1);
      break label92;
      label609:
      i8 = View.MeasureSpec.getSize(paramInt2);
      break label108;
      label618:
      i11 = 0;
      break label192;
      label624:
      i12 = 0;
      break label220;
      label630:
      i20 = this.b.size();
      break label476;
      label644:
      if (i20 == 1)
      {
        this.a.measure(View.MeasureSpec.makeMeasureSpec(i19, -2147483648), i13);
        this.v.setVisibility(8);
      }
      else
      {
        Resources localResources = getResources();
        this.v.setVisibility(0);
        int i21 = i20 - 1;
        int i22 = 2147483647;
        for (int i23 = i21; i23 > 0; i23--)
        {
          this.y.setLength(0);
          a(this.y, i23);
          String str3 = this.y.toString();
          this.a.setText(str3);
          setContentDescription(str3);
          this.a.measure(0, i13);
          int i25 = this.a.getMeasuredWidth();
          int i26 = i20 - i23;
          TextView localTextView = this.v;
          int i27 = efj.GO;
          Object[] arrayOfObject2 = new Object[1];
          arrayOfObject2[0] = Integer.valueOf(i26);
          localTextView.setText(localResources.getQuantityString(i27, i26, arrayOfObject2));
          this.v.measure(0, i13);
          i22 = this.v.getMeasuredWidth() + (i25 + q);
          if (i22 <= i19) {
            break;
          }
        }
        if (i22 > i19)
        {
          this.v.setVisibility(8);
          int i24 = efj.GQ;
          Object[] arrayOfObject1 = new Object[1];
          arrayOfObject1[0] = Integer.valueOf(i20);
          String str2 = localResources.getString(i24, arrayOfObject1);
          this.a.setText(str2);
          setContentDescription(str2);
          this.a.measure(View.MeasureSpec.makeMeasureSpec(i19, -2147483648), i13);
        }
      }
    }
  }
  
  public final gxq v()
  {
    switch (this.d)
    {
    case 12: 
    default: 
      return new gxq(pkf.e);
    case 11: 
      return new gxq(pkf.f);
    case 14: 
      return new gxq(pju.C);
    }
    return new gxq(pju.p);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     com.google.android.libraries.social.circlemembership.ui.CirclesButton
 * JD-Core Version:    0.7.0.1
 */