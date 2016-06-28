package com.google.android.libraries.social.acl2;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Build.VERSION;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.FrameLayout.LayoutParams;
import android.widget.LinearLayout.LayoutParams;
import android.widget.ScrollView;
import android.widget.TextView;
import com.google.android.libraries.social.ui.views.multilinelayout.MultiLineLayout;
import efj;
import goa;
import gol;
import gom;
import gon;
import goz;
import hrs;
import hru;
import hrv;
import hrw;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import mbb;

public final class ChipsSummaryView
  extends ScrollView
  implements View.OnClickListener, hru
{
  private final goa a;
  private final hrs b;
  private final List<gon> c;
  private final MultiLineLayout d;
  private int e = -1;
  private boolean f = true;
  private boolean g;
  private boolean h;
  
  public ChipsSummaryView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    int i = getResources().getDimensionPixelSize(efj.DV);
    int j = getResources().getDimensionPixelSize(efj.DX);
    if (paramAttributeSet != null)
    {
      TypedArray localTypedArray = paramContext.obtainStyledAttributes(paramAttributeSet, goz.a);
      this.e = localTypedArray.getInt(goz.c, -1);
      this.f = localTypedArray.getBoolean(goz.b, true);
      localTypedArray.recycle();
    }
    if (this.f) {
      setOnClickListener(this);
    }
    this.d = new MultiLineLayout(paramContext, null);
    this.d.setPadding(i, i, i, i);
    this.d.c = j;
    if (this.f) {
      this.d.setOnClickListener(this);
    }
    addView(this.d, new FrameLayout.LayoutParams(-1, -2));
    Configuration localConfiguration = paramContext.getResources().getConfiguration();
    if ((this.e != -1) && (localConfiguration.orientation == 2)) {
      this.e = (-1 + this.e);
    }
    this.c = mbb.c(paramContext, gon.class);
    this.a = ((goa)mbb.b(paramContext, goa.class));
    b();
    this.b = ((hrs)mbb.b(paramContext, hrs.class));
    if (this.b != null)
    {
      a(hrv.a, this.b.c());
      if ((this.b instanceof hrw)) {
        ((hrw)this.b).a(this);
      }
      return;
    }
    setVisibility(8);
  }
  
  private void a()
  {
    if (!this.f) {}
    for (;;)
    {
      return;
      for (int i = 0; i < this.d.getChildCount(); i++)
      {
        gol localgol = (gol)this.d.getChildAt(i);
        if (localgol.e)
        {
          localgol.e = false;
          localgol.removeView(localgol.b());
          localgol.d.setContentDescription(localgol.d.getText());
          if (localgol.g) {
            localgol.addView(localgol.c, 0);
          }
          localgol.a();
        }
      }
    }
  }
  
  private final void b()
  {
    this.d.setContentDescription(getContext().getResources().getString(efj.Er));
  }
  
  public final void a(int paramInt, Parcelable paramParcelable)
  {
    this.g = false;
    switch (goo.a[(paramInt - 1)])
    {
    }
    label204:
    String str1;
    do
    {
      do
      {
        do
        {
          do
          {
            for (;;)
            {
              return;
              this.g = true;
              gom localgom;
              if (this.c != null)
              {
                Iterator localIterator = this.c.iterator();
                while (localIterator.hasNext())
                {
                  gon localgon = (gon)localIterator.next();
                  if (localgon.a(paramParcelable)) {
                    localgom = localgon.a(getContext(), paramParcelable);
                  }
                }
              }
              for (;;)
              {
                if (localgom == null) {
                  break label204;
                }
                gol localgol = new gol(getContext(), localgom);
                localgol.setTag(paramParcelable);
                if (this.f) {
                  localgol.setOnClickListener(this);
                }
                this.d.addView(localgol);
                this.d.setContentDescription(null);
                String str3 = getContext().getString(efj.Ep);
                if (Build.VERSION.SDK_INT < 16) {
                  break;
                }
                announceForAccessibility(str3);
                return;
                localgom = null;
                continue;
                localgom = null;
              }
            }
          } while (!this.f);
          this.d.removeView(findViewWithTag(paramParcelable));
          String str2 = getContext().getString(efj.Eq);
          if (Build.VERSION.SDK_INT >= 16) {
            announceForAccessibility(str2);
          }
        } while (this.d.getChildCount() != 0);
        b();
        return;
      } while (!this.f);
      b();
      this.d.removeAllViews();
      str1 = getContext().getString(efj.Eo);
    } while (Build.VERSION.SDK_INT < 16);
    announceForAccessibility(str1);
  }
  
  public final void a(Integer paramInteger, Collection<Parcelable> paramCollection)
  {
    Iterator localIterator = paramCollection.iterator();
    while (localIterator.hasNext()) {
      a(paramInteger, (Parcelable)localIterator.next());
    }
  }
  
  protected final void onAttachedToWindow()
  {
    super.onAttachedToWindow();
    ViewGroup localViewGroup = (ViewGroup)getParent();
    if (this.f) {
      localViewGroup.setOnClickListener(this);
    }
  }
  
  public final void onClick(View paramView)
  {
    this.g = false;
    gol localgol;
    if ((paramView instanceof gol))
    {
      localgol = (gol)paramView;
      if (localgol.e) {
        this.b.b((Parcelable)localgol.getTag());
      }
    }
    goa localgoa;
    do
    {
      do
      {
        do
        {
          return;
          a();
        } while (!localgol.f);
        localgol.addView(localgol.b(), 0);
        localgol.e = true;
        Context localContext = localgol.getContext();
        int i = efj.Ew;
        Object[] arrayOfObject = new Object[1];
        arrayOfObject[0] = localgol.d.getText();
        String str = localContext.getString(i, arrayOfObject);
        localgol.d.setContentDescription(str);
        if (Build.VERSION.SDK_INT >= 16) {
          localgol.announceForAccessibility(str);
        }
        if (localgol.g) {
          localgol.removeView(localgol.c);
        }
        LinearLayout.LayoutParams localLayoutParams = new LinearLayout.LayoutParams(-2, -2);
        localLayoutParams.gravity = 16;
        localLayoutParams.setMargins(0, gol.a, gol.b, gol.a);
        if (Build.VERSION.SDK_INT >= 17)
        {
          localLayoutParams.setMarginStart(0);
          localLayoutParams.setMarginEnd(gol.b);
        }
        localgol.d.setLayoutParams(localLayoutParams);
        return;
        a();
      } while (this.a == null);
      localgoa = this.a;
    } while (localgoa.a == null);
    localgoa.a.a("");
  }
  
  protected final void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    super.onLayout(paramBoolean, paramInt1, paramInt2, paramInt3, paramInt4);
    if ((this.g) && (this.h)) {
      smoothScrollTo(0, this.d.getMeasuredHeight());
    }
  }
  
  protected final void onMeasure(int paramInt1, int paramInt2)
  {
    super.onMeasure(paramInt1, paramInt2);
    int i = this.d.getMeasuredHeight();
    int j = this.d.a(this.e);
    boolean bool;
    if ((this.e != -1) && (i >= j))
    {
      bool = true;
      this.h = bool;
      if (!this.h) {
        break label85;
      }
    }
    label85:
    for (int k = j;; k = i)
    {
      setMeasuredDimension(resolveSize(2147483647, paramInt1), resolveSize(k, paramInt2));
      return;
      bool = false;
      break;
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     com.google.android.libraries.social.acl2.ChipsSummaryView
 * JD-Core Version:    0.7.0.1
 */