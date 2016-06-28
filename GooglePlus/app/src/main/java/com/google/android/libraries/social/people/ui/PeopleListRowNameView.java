package com.google.android.libraries.social.people.ui;

import aaw;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.text.TextUtils;
import android.text.TextUtils.TruncateAt;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.TextView;
import android.widget.TextView.BufferType;
import efj;
import ehr;
import jor;

public final class PeopleListRowNameView
  extends RelativeLayout
{
  private static int d;
  private static Drawable e;
  private static Drawable f;
  public TextView a;
  public TextView b;
  public boolean c;
  private ImageView g;
  private boolean h;
  private boolean i;
  private CharSequence j;
  
  public PeopleListRowNameView(Context paramContext)
  {
    this(paramContext, null);
  }
  
  public PeopleListRowNameView(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }
  
  public PeopleListRowNameView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    TypedArray localTypedArray = paramContext.obtainStyledAttributes(paramAttributeSet, jor.a);
    boolean bool = localTypedArray.getBoolean(jor.b, false);
    localTypedArray.recycle();
    if (d == 0)
    {
      Resources localResources = getContext().getResources();
      d = localResources.getDimensionPixelSize(efj.Tb);
      e = localResources.getDrawable(aaw.pV);
      f = localResources.getDrawable(aaw.pU);
    }
    this.a = new TextView(paramContext, paramAttributeSet, paramInt);
    int k;
    RelativeLayout.LayoutParams localLayoutParams;
    if (bool)
    {
      k = ehr.di;
      this.a.setTextAppearance(paramContext, k);
      this.a.setMaxLines(2);
      this.a.setEllipsize(TextUtils.TruncateAt.END);
      this.a.setIncludeFontPadding(false);
      TextView localTextView1 = this.a;
      if (Build.VERSION.SDK_INT >= 17) {
        localTextView1.setTextAlignment(5);
      }
      addView(this.a);
      this.g = new ImageView(paramContext, paramAttributeSet, paramInt);
      this.g.setId(efj.Tc);
      this.g.setImageDrawable(f);
      this.g.setScaleType(ImageView.ScaleType.CENTER);
      this.g.setLayoutParams(new RelativeLayout.LayoutParams(-2, -2));
      addView(this.g);
      this.b = new TextView(paramContext, paramAttributeSet, paramInt);
      localLayoutParams = new RelativeLayout.LayoutParams(-1, -2);
      if (Build.VERSION.SDK_INT < 17) {
        break label350;
      }
      localLayoutParams.addRule(16, efj.Tc);
    }
    for (;;)
    {
      this.b.setLayoutParams(localLayoutParams);
      this.b.setTextAppearance(paramContext, ehr.dm);
      this.b.setEllipsize(TextUtils.TruncateAt.END);
      TextView localTextView2 = this.b;
      if (Build.VERSION.SDK_INT >= 17) {
        localTextView2.setTextAlignment(5);
      }
      addView(this.b);
      return;
      k = ehr.dj;
      break;
      label350:
      localLayoutParams.addRule(1, efj.Tc);
    }
  }
  
  @TargetApi(17)
  private final void a(View paramView, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    if ((Build.VERSION.SDK_INT >= 17) && (getLayoutDirection() == 1))
    {
      paramView.layout(getMeasuredWidth() - paramInt3, paramInt2, getMeasuredWidth() - paramInt1, paramInt4);
      return;
    }
    paramView.layout(paramInt1, paramInt2, paramInt3, paramInt4);
  }
  
  public final void a(String paramString, boolean paramBoolean1, CharSequence paramCharSequence1, CharSequence paramCharSequence2, boolean paramBoolean2, boolean paramBoolean3)
  {
    this.j = paramCharSequence1;
    this.i = paramBoolean3;
    boolean bool1;
    label56:
    label90:
    int k;
    label106:
    ImageView localImageView;
    int m;
    if (paramBoolean1)
    {
      this.a.setCompoundDrawablesWithIntrinsicBounds(null, null, e, null);
      this.a.setCompoundDrawablePadding(d);
      this.a.setText(paramString);
      if (TextUtils.isEmpty(paramCharSequence1)) {
        break label155;
      }
      bool1 = true;
      this.h = bool1;
      if ((!this.h) || (!paramBoolean2)) {
        break label161;
      }
      this.b.setText(efj.y(paramCharSequence1.toString()));
      TextView localTextView = this.b;
      if (!this.h) {
        break label192;
      }
      k = 0;
      localTextView.setVisibility(k);
      localImageView = this.g;
      boolean bool2 = this.i;
      m = 0;
      if (!bool2) {
        break label199;
      }
    }
    for (;;)
    {
      localImageView.setVisibility(m);
      return;
      this.a.setCompoundDrawablesWithIntrinsicBounds(null, null, null, null);
      break;
      label155:
      bool1 = false;
      break label56;
      label161:
      if (!TextUtils.isEmpty(paramCharSequence2))
      {
        this.b.setText(paramCharSequence2);
        break label90;
      }
      this.b.setText(paramCharSequence1);
      break label90;
      label192:
      k = 8;
      break label106;
      label199:
      m = 8;
    }
  }
  
  protected final void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    int k = paramInt3 - paramInt1;
    int m = this.a.getMeasuredHeight();
    int n = m + this.b.getMeasuredHeight();
    a(this.a, 0, 0, this.a.getMeasuredWidth(), m);
    boolean bool = this.i;
    int i1 = 0;
    if (bool)
    {
      int i2 = f.getIntrinsicWidth();
      a(this.g, 0, m, i2, n);
      i1 = i2 + d;
    }
    a(this.b, i1, m, k, n);
  }
  
  protected final void onMeasure(int paramInt1, int paramInt2)
  {
    int k = 2;
    int m = 1;
    int n = View.MeasureSpec.getSize(paramInt1);
    int i1 = View.MeasureSpec.getSize(paramInt2);
    TextView localTextView1 = this.a;
    int i2 = View.MeasureSpec.makeMeasureSpec(n, -2147483648);
    int i3;
    int i4;
    int i12;
    if (i1 == 0)
    {
      i3 = 0;
      localTextView1.measure(i2, View.MeasureSpec.makeMeasureSpec(i1, i3));
      i4 = this.a.getMeasuredHeight();
      if (!this.i) {
        break label372;
      }
      i12 = f.getIntrinsicWidth();
      this.g.measure(View.MeasureSpec.makeMeasureSpec(i12, 1073741824), View.MeasureSpec.makeMeasureSpec(f.getIntrinsicHeight(), 1073741824));
    }
    label201:
    label228:
    label358:
    label372:
    for (int i5 = i12 + d;; i5 = 0)
    {
      int i7;
      int i8;
      int i6;
      if (this.h)
      {
        i7 = i1 - i4;
        i8 = this.a.getLineCount();
        if (i8 >= k)
        {
          this.b.measure(View.MeasureSpec.makeMeasureSpec(n - i5, 1073741824), View.MeasureSpec.makeMeasureSpec(0, -2147483648));
          i6 = i4;
        }
      }
      for (;;)
      {
        setMeasuredDimension(n, i6);
        return;
        i3 = -2147483648;
        break;
        TextView localTextView2;
        int i10;
        int i11;
        if (getResources().getConfiguration().fontScale > 1.0F)
        {
          int i9 = k - i8;
          if ((i9 != m) && (!this.i) && (!this.c)) {
            break label341;
          }
          if (m != 0)
          {
            if ((i9 <= 0) || (TextUtils.isEmpty(this.j))) {
              break label347;
            }
            this.b.setText(this.j, TextView.BufferType.SPANNABLE);
          }
          this.b.setSingleLine(m);
          this.b.setMaxLines(i9);
          localTextView2 = this.b;
          i10 = View.MeasureSpec.makeMeasureSpec(n - i5, 1073741824);
          i11 = 0;
          if (i7 != 0) {
            break label358;
          }
        }
        for (;;)
        {
          localTextView2.measure(i10, View.MeasureSpec.makeMeasureSpec(i7, i11));
          i6 = i4 + this.b.getMeasuredHeight();
          break;
          k = 3;
          break label201;
          m = 0;
          break label228;
          this.b.setText(null);
          break label262;
          i11 = -2147483648;
        }
        i6 = i4;
      }
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     com.google.android.libraries.social.people.ui.PeopleListRowNameView
 * JD-Core Version:    0.7.0.1
 */