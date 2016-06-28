package com.google.android.libraries.social.ui.tabbar;

import aau;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.FrameLayout.LayoutParams;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;
import dxp;
import efj;
import gxn;
import gxq;
import gxt;
import java.util.ArrayList;
import lwa;
import lwb;
import lxj;

public final class TabBar
  extends HorizontalScrollView
  implements View.OnClickListener, lxj
{
  private static int d;
  public dxp a;
  public lwa b;
  public ArrayList<lwb> c = new ArrayList();
  private LinearLayout e;
  private int f;
  private int g;
  private TabBar h;
  
  public TabBar(Context paramContext)
  {
    super(paramContext);
    if (d == 0) {
      d = getResources().getDimensionPixelSize(efj.aaf);
    }
  }
  
  public TabBar(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    if (d == 0) {
      d = getResources().getDimensionPixelSize(efj.aaf);
    }
  }
  
  public TabBar(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    if (d == 0) {
      d = getResources().getDimensionPixelSize(efj.aaf);
    }
  }
  
  public final void D_()
  {
    this.e.removeAllViews();
    this.c.clear();
    this.b = null;
    this.g = 0;
    this.f = 0;
    if (this.h != null)
    {
      TabBar localTabBar = this.h;
      if (localTabBar.h == this) {
        localTabBar.h = null;
      }
      this.h = null;
    }
  }
  
  public final void a(int paramInt)
  {
    int i = this.c.size();
    int j = 0;
    if (j < i)
    {
      lwb locallwb = (lwb)this.c.get(j);
      if (locallwb.a == paramInt)
      {
        locallwb.b.setTextAppearance(getContext(), aau.Dt);
        locallwb.b.setBackgroundDrawable(locallwb.c);
        locallwb.b.setPadding(this.f, 0, this.g, 0);
        TextView localTextView2 = locallwb.b;
        Resources localResources2 = getResources();
        int m = aau.Dq;
        Object[] arrayOfObject2 = new Object[3];
        arrayOfObject2[0] = locallwb.b.getText();
        arrayOfObject2[1] = Integer.valueOf(j + 1);
        arrayOfObject2[2] = Integer.valueOf(this.c.size());
        localTextView2.setContentDescription(localResources2.getString(m, arrayOfObject2));
      }
      for (;;)
      {
        j++;
        break;
        locallwb.b.setTextAppearance(getContext(), aau.Ds);
        locallwb.b.setBackgroundDrawable(locallwb.d);
        locallwb.b.setPadding(this.f, 0, this.g, 0);
        TextView localTextView1 = locallwb.b;
        Resources localResources1 = getResources();
        int k = aau.Dr;
        Object[] arrayOfObject1 = new Object[3];
        arrayOfObject1[0] = locallwb.b.getText();
        arrayOfObject1[1] = Integer.valueOf(j + 1);
        arrayOfObject1[2] = Integer.valueOf(this.c.size());
        localTextView1.setContentDescription(localResources1.getString(k, arrayOfObject1));
      }
    }
  }
  
  public final void a(int paramInt1, String paramString, int paramInt2, gxt paramgxt, Object paramObject)
  {
    lwb locallwb = new lwb(this);
    locallwb.a = paramInt2;
    locallwb.b = ((TextView)inflate(getContext(), paramInt1, null));
    locallwb.b.setText(paramString);
    locallwb.b.setTag(Integer.valueOf(paramInt2));
    if (paramObject != null)
    {
      int i = efj.aak;
      if (locallwb.b != null) {
        locallwb.b.setTag(i, paramObject);
      }
    }
    if (paramgxt != null)
    {
      efj.a(locallwb.b, new gxq(paramgxt));
      locallwb.b.setOnClickListener(new gxn(this));
    }
    for (;;)
    {
      if (this.f == 0)
      {
        this.f = locallwb.b.getPaddingLeft();
        this.g = locallwb.b.getPaddingRight();
      }
      Resources localResources = getResources();
      locallwb.c = localResources.getDrawable(efj.aah);
      locallwb.d = localResources.getDrawable(efj.aai);
      this.c.add(locallwb);
      LinearLayout.LayoutParams localLayoutParams = new LinearLayout.LayoutParams(-2, -1);
      localLayoutParams.weight = 1.0F;
      this.e.addView(locallwb.b, localLayoutParams);
      return;
      locallwb.b.setOnClickListener(this);
    }
  }
  
  public final void a(TabBar paramTabBar)
  {
    this.h = paramTabBar;
    if (paramTabBar != null) {
      scrollTo(paramTabBar.getScrollX(), paramTabBar.getScrollY());
    }
  }
  
  public final boolean a(int paramInt, boolean paramBoolean)
  {
    int i = this.c.size();
    for (int j = 0;; j++)
    {
      boolean bool = false;
      lwb locallwb;
      if (j < i)
      {
        locallwb = (lwb)this.c.get(j);
        if (locallwb.a != paramInt) {
          continue;
        }
        if (!paramBoolean) {
          break label86;
        }
      }
      label86:
      for (int k = 0;; k = 8)
      {
        int m = locallwb.b.getVisibility();
        bool = false;
        if (m != k) {
          bool = true;
        }
        locallwb.b.setVisibility(k);
        return bool;
      }
    }
  }
  
  public final View b(int paramInt)
  {
    lwb locallwb = (lwb)this.c.get(paramInt);
    if (locallwb != null) {
      return locallwb.b;
    }
    return null;
  }
  
  @SuppressLint({"NewApi"})
  public final void b()
  {
    Resources localResources = getResources();
    setHorizontalScrollBarEnabled(false);
    setHorizontalFadingEdgeEnabled(true);
    setFadingEdgeLength(d);
    setBackgroundDrawable(localResources.getDrawable(efj.aaj));
    int i = localResources.getDimensionPixelOffset(efj.aag);
    this.e = new LinearLayout(getContext());
    this.e.setOrientation(0);
    this.e.setPadding(i, 0, i, 0);
    FrameLayout.LayoutParams localLayoutParams = generateDefaultLayoutParams();
    addView(this.e, localLayoutParams);
  }
  
  public final void onClick(View paramView)
  {
    if (this.b == null) {
      return;
    }
    int i = ((Integer)paramView.getTag()).intValue();
    this.b.b(i);
  }
  
  protected final void onFinishInflate()
  {
    super.onFinishInflate();
    b();
  }
  
  protected final void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    super.onLayout(paramBoolean, paramInt1, paramInt2, paramInt3, paramInt4);
    if (this.a != null) {
      this.a.a();
    }
  }
  
  protected final void onScrollChanged(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    super.onScrollChanged(paramInt1, paramInt2, paramInt3, paramInt4);
    if (this.h != null) {
      this.h.scrollTo(paramInt1, paramInt2);
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     com.google.android.libraries.social.ui.tabbar.TabBar
 * JD-Core Version:    0.7.0.1
 */