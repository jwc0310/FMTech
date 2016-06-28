package com.google.android.libraries.social.ui.views.slidingtab;

import aau;
import aaw;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.content.res.TypedArray;
import android.support.v4.view.ViewPager;
import android.text.TextUtils.TruncateAt;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;
import efj;
import gxn;
import lzj;
import lzk;
import lzl;
import lzm;
import nc;

public final class SlidingTabLayout
  extends HorizontalScrollView
  implements View.OnClickListener
{
  private static final int c = aaw.qJ;
  public ViewPager a;
  public lzm b;
  private int d;
  private int e;
  private int f;
  private int g;
  private int h;
  
  public SlidingTabLayout(Context paramContext)
  {
    super(paramContext);
    a(paramContext, null);
  }
  
  public SlidingTabLayout(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    a(paramContext, paramAttributeSet);
  }
  
  public SlidingTabLayout(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    a(paramContext, paramAttributeSet);
  }
  
  private final void a(Context paramContext, AttributeSet paramAttributeSet)
  {
    float f1 = getResources().getDisplayMetrics().density;
    if (paramAttributeSet != null)
    {
      TypedArray localTypedArray = paramContext.obtainStyledAttributes(paramAttributeSet, lzj.a);
      this.g = localTypedArray.getResourceId(lzj.d, aau.Du);
      this.h = localTypedArray.getResourceId(lzj.g, c);
      this.d = ((int)localTypedArray.getDimension(lzj.f, 24.0F * f1));
      this.e = ((int)localTypedArray.getDimension(lzj.h, 16.0F * f1));
      this.f = ((int)localTypedArray.getDimension(lzj.e, f1 * 10.0F));
      localTypedArray.recycle();
    }
    for (;;)
    {
      setHorizontalScrollBarEnabled(false);
      setFillViewport(true);
      this.b = new lzm(paramContext, paramAttributeSet);
      this.b.setId(efj.aaJ);
      addView(this.b, -1, -2);
      return;
      this.g = aau.Du;
      this.h = c;
      this.d = ((int)(24.0F * f1));
      this.e = ((int)(16.0F * f1));
      this.f = ((int)(f1 * 10.0F));
    }
  }
  
  public final void a(int paramInt1, int paramInt2)
  {
    int i = this.b.getChildCount();
    if ((i == 0) || (paramInt1 < 0) || (paramInt1 >= i)) {}
    View localView;
    do
    {
      return;
      localView = this.b.getChildAt(paramInt1);
    } while (localView == null);
    int j = paramInt2 + localView.getLeft();
    if ((paramInt1 > 0) || (paramInt2 > 0)) {
      j -= this.d;
    }
    scrollTo(j, 0);
  }
  
  public final void a(ViewPager paramViewPager)
  {
    this.b.removeAllViews();
    this.a = paramViewPager;
    if (paramViewPager != null)
    {
      paramViewPager.a(new lzk(this));
      nc localnc = this.a.c;
      boolean bool = localnc instanceof lzl;
      lzl locallzl = null;
      if (bool) {
        locallzl = (lzl)localnc;
      }
      gxn localgxn = new gxn(this);
      Context localContext = getContext();
      int i = localnc.b();
      int j = 0;
      if (j < i)
      {
        TextView localTextView = new TextView(localContext);
        localTextView.setEllipsize(TextUtils.TruncateAt.END);
        localTextView.setMaxLines(1);
        localTextView.setTextAppearance(localContext, this.h);
        localTextView.setTextColor(getResources().getColorStateList(this.g));
        localTextView.setGravity(17);
        LinearLayout.LayoutParams localLayoutParams = new LinearLayout.LayoutParams(0, -2);
        localLayoutParams.weight = 1.0F;
        localTextView.setLayoutParams(localLayoutParams);
        TypedValue localTypedValue = new TypedValue();
        getContext().getTheme().resolveAttribute(16843534, localTypedValue, true);
        localTextView.setBackgroundResource(localTypedValue.resourceId);
        localTextView.setAllCaps(true);
        localTextView.setPadding(this.f, this.e, this.f, this.e);
        CharSequence localCharSequence = localnc.b(j);
        localTextView.setText(localCharSequence);
        if (locallzl != null)
        {
          efj.a(localTextView, locallzl.c(j));
          localTextView.setOnClickListener(localgxn);
          label274:
          this.b.addView(localTextView);
          if (j != this.a.d) {
            break label367;
          }
          localTextView.setSelected(true);
        }
        label367:
        for (int k = aaw.qH;; k = aaw.qI)
        {
          Object[] arrayOfObject = new Object[3];
          arrayOfObject[0] = localCharSequence;
          arrayOfObject[1] = Integer.valueOf(j + 1);
          arrayOfObject[2] = Integer.valueOf(i);
          localTextView.setContentDescription(localContext.getString(k, arrayOfObject));
          j++;
          break;
          localTextView.setOnClickListener(this);
          break label274;
        }
      }
    }
  }
  
  protected final void onAttachedToWindow()
  {
    super.onAttachedToWindow();
    if (this.a != null) {
      a(this.a.d, 0);
    }
  }
  
  public final void onClick(View paramView)
  {
    for (int i = 0;; i++) {
      if (i < this.b.getChildCount())
      {
        if (paramView == this.b.getChildAt(i)) {
          this.a.b(i);
        }
      }
      else {
        return;
      }
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     com.google.android.libraries.social.ui.views.slidingtab.SlidingTabLayout
 * JD-Core Version:    0.7.0.1
 */