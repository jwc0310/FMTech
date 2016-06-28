package com.google.android.libraries.social.spaces;

import aaw;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build.VERSION;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.libraries.social.media.ui.MediaView;
import com.google.android.libraries.social.ui.views.linearavatarpileview.LinearAvatarPileView;
import do;
import efj;
import ipf;
import ipm;
import jr;
import lxj;
import mfx;

public final class SpaceListItemView
  extends ViewGroup
  implements lxj
{
  private static final Typeface m = Typeface.create("sans-serif-medium", 0);
  private int A;
  private int B;
  private final jr C = jr.a();
  public TextView a;
  public TextView b;
  public MediaView c;
  public Button d;
  public LinearLayout e;
  public CheckBox f;
  public TextView g;
  public ImageButton h;
  public TextView i;
  public int j;
  public CharSequence k;
  public String l;
  private LinearAvatarPileView n;
  private final int o;
  private final int p;
  private final int q;
  private final int r;
  private final int s;
  private final int t;
  private final int u;
  private boolean v = true;
  private boolean w = true;
  private boolean x = true;
  private int y;
  private int z;
  
  public SpaceListItemView(Context paramContext)
  {
    super(paramContext);
    Resources localResources = getContext().getResources();
    this.o = localResources.getDimensionPixelSize(efj.Wb);
    this.p = localResources.getDimensionPixelSize(efj.Wc);
    this.q = localResources.getDimensionPixelSize(efj.VY);
    this.r = localResources.getDimensionPixelSize(efj.Wd);
    this.t = localResources.getDimensionPixelSize(efj.VZ);
    this.u = localResources.getDimensionPixelSize(efj.Wa);
    TypedValue localTypedValue = new TypedValue();
    Context localContext = getContext();
    int i1 = localTypedValue.data;
    int[] arrayOfInt = new int[1];
    arrayOfInt[0] = aaw.qb;
    TypedArray localTypedArray = localContext.obtainStyledAttributes(i1, arrayOfInt);
    this.s = localTypedArray.getColor(0, 0);
    localTypedArray.recycle();
  }
  
  public SpaceListItemView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    Resources localResources = getContext().getResources();
    this.o = localResources.getDimensionPixelSize(efj.Wb);
    this.p = localResources.getDimensionPixelSize(efj.Wc);
    this.q = localResources.getDimensionPixelSize(efj.VY);
    this.r = localResources.getDimensionPixelSize(efj.Wd);
    this.t = localResources.getDimensionPixelSize(efj.VZ);
    this.u = localResources.getDimensionPixelSize(efj.Wa);
    TypedValue localTypedValue = new TypedValue();
    Context localContext = getContext();
    int i1 = localTypedValue.data;
    int[] arrayOfInt = new int[1];
    arrayOfInt[0] = aaw.qb;
    TypedArray localTypedArray = localContext.obtainStyledAttributes(i1, arrayOfInt);
    this.s = localTypedArray.getColor(0, 0);
    localTypedArray.recycle();
  }
  
  public SpaceListItemView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    Resources localResources = getContext().getResources();
    this.o = localResources.getDimensionPixelSize(efj.Wb);
    this.p = localResources.getDimensionPixelSize(efj.Wc);
    this.q = localResources.getDimensionPixelSize(efj.VY);
    this.r = localResources.getDimensionPixelSize(efj.Wd);
    this.t = localResources.getDimensionPixelSize(efj.VZ);
    this.u = localResources.getDimensionPixelSize(efj.Wa);
    TypedValue localTypedValue = new TypedValue();
    Context localContext = getContext();
    int i1 = localTypedValue.data;
    int[] arrayOfInt = new int[1];
    arrayOfInt[0] = aaw.qb;
    TypedArray localTypedArray = localContext.obtainStyledAttributes(i1, arrayOfInt);
    this.s = localTypedArray.getColor(0, 0);
    localTypedArray.recycle();
  }
  
  private final boolean a(TextView paramTextView, String paramString)
  {
    String str;
    if (paramString != null)
    {
      str = this.C.a(paramString);
      if (mfx.a(str, paramTextView.getText())) {
        break label45;
      }
    }
    label45:
    for (boolean bool = true;; bool = false)
    {
      if (bool) {
        paramTextView.setText(str);
      }
      return bool;
      str = null;
      break;
    }
  }
  
  public final void D_()
  {
    this.c.D_();
    efj.a(this.b, 0, 0, 0, 0);
    this.a.setText(null);
    this.b.setText(null);
    this.d.setText(null);
    this.g.setText(null);
    this.n.a(null);
  }
  
  public final void a(String paramString)
  {
    if ((a(this.a, paramString)) || (this.v)) {}
    for (boolean bool = true;; bool = false)
    {
      this.v = bool;
      if (this.v) {
        b();
      }
      return;
    }
  }
  
  public final void a(boolean paramBoolean)
  {
    if (paramBoolean)
    {
      this.h.setVisibility(0);
      return;
    }
    this.h.setVisibility(8);
  }
  
  public final void a(String[] paramArrayOfString)
  {
    String[] arrayOfString = this.n.a;
    int i4;
    int i1;
    label49:
    LinearAvatarPileView localLinearAvatarPileView;
    int i2;
    if ((arrayOfString != null) && (paramArrayOfString != null)) {
      if (arrayOfString.length == paramArrayOfString.length)
      {
        i4 = 0;
        if (i4 < arrayOfString.length) {
          if (!mfx.a(arrayOfString[i4], paramArrayOfString[i4]))
          {
            i1 = 1;
            if (i1 != 0)
            {
              this.n.a(paramArrayOfString);
              localLinearAvatarPileView = this.n;
              if (paramArrayOfString == null) {
                break label127;
              }
              int i3 = paramArrayOfString.length;
              i2 = 0;
              if (i3 <= 0) {
                break label127;
              }
            }
          }
        }
      }
    }
    for (;;)
    {
      localLinearAvatarPileView.setVisibility(i2);
      this.x = true;
      return;
      i4++;
      break;
      i1 = 0;
      break label49;
      i1 = 1;
      break label49;
      if (arrayOfString != paramArrayOfString)
      {
        i1 = 1;
        break label49;
      }
      i1 = 0;
      break label49;
      label127:
      i2 = 8;
    }
  }
  
  public final void b()
  {
    if (!TextUtils.isEmpty(this.k))
    {
      setContentDescription(this.k);
      return;
    }
    Resources localResources = getResources();
    int i1 = efj.Ws;
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this.a.getText();
    arrayOfObject[1] = this.b.getText();
    setContentDescription(localResources.getString(i1, arrayOfObject));
  }
  
  public final void b(String paramString)
  {
    if (!TextUtils.isEmpty(paramString))
    {
      this.c.E = 2;
      this.c.a(ipf.a(getContext(), paramString, ipm.a));
      return;
    }
    this.c.a(null);
  }
  
  public final void c(String paramString)
  {
    this.d.setText(paramString);
    Button localButton = this.d;
    if (TextUtils.isEmpty(paramString)) {}
    for (int i1 = 8;; i1 = 0)
    {
      localButton.setVisibility(i1);
      return;
    }
  }
  
  public final void d(String paramString)
  {
    if ((a(this.b, paramString)) || (this.w)) {}
    for (boolean bool = true;; bool = false)
    {
      this.w = bool;
      if (this.w) {
        b();
      }
      return;
    }
  }
  
  protected final void onFinishInflate()
  {
    super.onFinishInflate();
    this.a = ((TextView)findViewById(do.x));
    this.b = ((TextView)findViewById(do.r));
    this.d = ((Button)findViewById(do.t));
    this.d.setTypeface(m);
    this.e = ((LinearLayout)findViewById(do.h));
    this.f = ((CheckBox)findViewById(do.j));
    this.g = ((TextView)findViewById(do.i));
    this.g.setTypeface(m);
    this.h = ((ImageButton)findViewById(do.n));
    this.c = ((MediaView)findViewById(do.s));
    this.n = ((LinearAvatarPileView)findViewById(do.f));
    this.i = ((TextView)findViewById(do.y));
    setPadding(0, 0, 0, 0);
    this.j = ((this.a.getLineHeight() << 1) + this.b.getLineHeight() + this.d.getLineHeight() + Math.max(this.f.getHeight(), this.g.getLineHeight()) + (this.r << 1));
  }
  
  protected final void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    int i1;
    int i2;
    label27:
    int i3;
    int i4;
    int i27;
    label183:
    int i10;
    label255:
    int i14;
    label325:
    int i23;
    label388:
    int i20;
    label451:
    int i15;
    int i16;
    if (Build.VERSION.SDK_INT >= 17)
    {
      i1 = 1;
      if ((i1 == 0) || (getLayoutDirection() != 1)) {
        break label538;
      }
      i2 = 1;
      i3 = getMeasuredWidth();
      i4 = getMeasuredHeight();
      int i5 = this.c.getMeasuredWidth();
      int i6 = this.c.getMeasuredHeight();
      this.c.layout(0, 0, i5, i6);
      if (this.i.getVisibility() != 8) {
        this.i.layout(i5 - this.i.getMeasuredWidth() - this.u, this.u, i5 - this.u, this.i.getMeasuredHeight() + this.u);
      }
      if (this.n.getVisibility() != 8)
      {
        int i24 = this.n.getMeasuredWidth();
        int i25 = this.n.getMeasuredHeight();
        int i26 = i6 - i25 / 2;
        if (i2 == 0) {
          break label544;
        }
        i27 = i3 - this.p - i24;
        this.n.layout(i27, i26, i24 + i27, i25 + i26);
      }
      int i7 = this.a.getMeasuredWidth();
      int i8 = this.a.getMeasuredHeight();
      int i9 = i6 + this.q / 2 + this.r - this.z;
      if (i2 == 0) {
        break label553;
      }
      i10 = i3 - i7;
      this.a.layout(i10, i9, i7 + i10, i8 + i9);
      int i11 = this.b.getMeasuredWidth();
      int i12 = this.b.getMeasuredHeight();
      int i13 = i9 + this.A + this.r - this.B;
      if (i2 == 0) {
        break label559;
      }
      i14 = i3 - i11;
      this.b.layout(i14, i13, i11 + i14, i12 + i13);
      if (this.d.getVisibility() != 8)
      {
        int i21 = this.d.getMeasuredWidth();
        int i22 = this.d.getMeasuredHeight();
        if (i2 == 0) {
          break label565;
        }
        i23 = i3 - i21;
        this.d.layout(i23, i4 - i22, i21 + i23, i4);
      }
      if (this.e.getVisibility() != 8)
      {
        int i18 = this.e.getMeasuredWidth();
        int i19 = this.e.getMeasuredHeight();
        if (i2 == 0) {
          break label571;
        }
        i20 = i3 - i18;
        this.e.layout(i20, i4 - i19, i18 + i20, i4);
      }
      if (this.h.getVisibility() != 8)
      {
        i15 = this.h.getMeasuredWidth();
        i16 = this.h.getMeasuredHeight();
        if (i2 == 0) {
          break label577;
        }
      }
    }
    label538:
    label544:
    label553:
    label559:
    label565:
    label571:
    label577:
    for (int i17 = 0;; i17 = i3 - i15)
    {
      this.h.layout(i17, i4 - i16, i15 + i17, i4);
      return;
      i1 = 0;
      break;
      i2 = 0;
      break label27;
      i27 = this.p;
      break label183;
      i10 = 0;
      break label255;
      i14 = 0;
      break label325;
      i23 = 0;
      break label388;
      i20 = 0;
      break label451;
    }
  }
  
  protected final void onMeasure(int paramInt1, int paramInt2)
  {
    int i1 = View.MeasureSpec.getSize(paramInt1);
    int i2;
    int i3;
    label24:
    int i10;
    int i11;
    int i12;
    int i13;
    if (i1 != this.y)
    {
      i2 = 1;
      if (i2 == 0) {
        break label481;
      }
      i3 = paramInt1;
      int i4 = View.MeasureSpec.makeMeasureSpec(0, 0);
      if ((i2 != 0) || (this.v))
      {
        this.a.measure(i3, i4);
        if (this.a.getLayout() != null)
        {
          this.z = this.a.getBaseline();
          int i15 = -1 + Math.min(this.a.getLineCount(), 2);
          this.A = this.a.getLineBounds(i15, null);
        }
        this.v = false;
      }
      if ((i2 != 0) || (this.w))
      {
        this.b.measure(i3, i4);
        if (this.a.getLayout() != null)
        {
          this.B = this.b.getBaseline();
          this.w = false;
        }
      }
      if (this.d.getVisibility() != 8) {
        this.d.measure(i4, i4);
      }
      if (this.e.getVisibility() != 8) {
        this.e.measure(i4, i4);
      }
      if (this.h.getVisibility() != 8) {
        this.h.measure(i4, i4);
      }
      if (this.i.getVisibility() != 8)
      {
        int i14 = View.MeasureSpec.makeMeasureSpec(this.t, 1073741824);
        this.i.measure(i14, i14);
      }
      if ((this.n.getVisibility() != 8) && (this.x))
      {
        this.n.measure(i4, View.MeasureSpec.makeMeasureSpec(this.q, 1073741824));
        this.x = false;
      }
      if ((i2 == 0) || (View.MeasureSpec.getMode(paramInt1) != 0)) {
        break label508;
      }
      i10 = this.a.getMeasuredWidth();
      i11 = this.b.getMeasuredWidth();
      i12 = this.d.getMeasuredWidth();
      i13 = this.e.getMeasuredWidth();
    }
    label481:
    label508:
    for (int i5 = Math.max(Math.max(Math.max(i10, i11), Math.max(i12, i13)), this.o);; i5 = i1)
    {
      int i6 = (int)(0.5625D * i5);
      if (i2 != 0) {
        this.c.measure(View.MeasureSpec.makeMeasureSpec(i5, 1073741824), View.MeasureSpec.makeMeasureSpec(i6, 1073741824));
      }
      int i7 = i6 + this.j;
      int i9;
      int i8;
      if (i2 != 0)
      {
        i9 = View.MeasureSpec.getMode(paramInt2);
        i8 = View.MeasureSpec.getSize(paramInt2);
        if (i9 == -2147483648) {
          i8 = Math.min(i8, i7);
        }
      }
      for (;;)
      {
        setMeasuredDimension(i5, i8);
        this.y = i5;
        return;
        i2 = 0;
        break;
        i3 = View.MeasureSpec.makeMeasureSpec(i1, 1073741824);
        break label24;
        if (i9 != 1073741824) {
          i8 = i7;
        }
      }
    }
  }
  
  public final void setBackgroundColor(int paramInt)
  {
    if (Build.VERSION.SDK_INT < 21) {
      super.setBackgroundColor(paramInt);
    }
    while (Build.VERSION.SDK_INT < 21) {
      return;
    }
    setBackground(new RippleDrawable(ColorStateList.valueOf(this.s), new ColorDrawable(paramInt), null));
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     com.google.android.libraries.social.spaces.SpaceListItemView
 * JD-Core Version:    0.7.0.1
 */