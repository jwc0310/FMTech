package android.support.design.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.design.internal.NavigationMenuView;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.MenuInflater;
import android.view.View;
import android.view.View.MeasureSpec;
import android.widget.LinearLayout;
import j;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import ji;
import k;
import l;
import m;
import nj;
import ns;
import o;
import wx;
import xl;
import xz;
import y;

public class NavigationView
  extends o
{
  private static final int[] c = { 16842912 };
  private static final int[] d = { -16842910 };
  private final k e;
  private final l f = new l();
  private int g;
  private MenuInflater h;
  
  public NavigationView(Context paramContext)
  {
    this(paramContext, null);
  }
  
  public NavigationView(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }
  
  public NavigationView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    this.e = new k(paramContext);
    TypedArray localTypedArray = paramContext.obtainStyledAttributes(paramAttributeSet, j.g, paramInt, 2131821248);
    setBackgroundDrawable(localTypedArray.getDrawable(j.h));
    if (localTypedArray.hasValue(j.k))
    {
      float f1 = localTypedArray.getDimensionPixelSize(j.k, 0);
      nj.a.f(this, f1);
    }
    boolean bool = localTypedArray.getBoolean(j.i, false);
    nj.a.c(this, bool);
    this.g = localTypedArray.getDimensionPixelSize(j.j, 0);
    ColorStateList localColorStateList1;
    int i;
    if (localTypedArray.hasValue(j.n))
    {
      localColorStateList1 = localTypedArray.getColorStateList(j.n);
      if (!localTypedArray.hasValue(j.o)) {
        break label620;
      }
      i = localTypedArray.getResourceId(j.o, 0);
    }
    for (int j = 1;; j = 0)
    {
      if (localTypedArray.hasValue(j.p)) {}
      for (ColorStateList localColorStateList2 = localTypedArray.getColorStateList(j.p);; localColorStateList2 = null)
      {
        if ((j == 0) && (localColorStateList2 == null)) {
          localColorStateList2 = a(16842806);
        }
        Drawable localDrawable = localTypedArray.getDrawable(j.m);
        this.e.a(new ji(this));
        this.f.d = 1;
        this.f.a(paramContext, this.e);
        this.f.a(localColorStateList1);
        if (j != 0) {
          this.f.a(i);
        }
        this.f.b(localColorStateList2);
        this.f.k = localDrawable;
        k localk = this.e;
        localk.a(this.f, localk.a);
        l locall1 = this.f;
        if (locall1.a == null)
        {
          locall1.a = ((NavigationMenuView)locall1.f.inflate(2130968760, this, false));
          if (locall1.e == null) {
            locall1.e = new m(locall1);
          }
          locall1.b = ((LinearLayout)locall1.f.inflate(2130968757, locall1.a, false));
          locall1.a.addHeaderView(locall1.b, null, false);
          locall1.a.setAdapter(locall1.e);
          locall1.a.setOnItemClickListener(locall1);
        }
        addView((View)locall1.a);
        if (localTypedArray.hasValue(j.q))
        {
          int m = localTypedArray.getResourceId(j.q, 0);
          this.f.b(true);
          if (this.h == null) {
            this.h = new wx(getContext());
          }
          this.h.inflate(m, this.e);
          this.f.b(false);
          this.f.a(false);
        }
        if (localTypedArray.hasValue(j.l))
        {
          int k = localTypedArray.getResourceId(j.l, 0);
          l locall2 = this.f;
          View localView = locall2.f.inflate(k, locall2.b, false);
          locall2.b.addView(localView);
          locall2.a.setPadding(0, 0, 0, locall2.a.getPaddingBottom());
        }
        localTypedArray.recycle();
        return;
        localColorStateList1 = a(16842808);
        break;
      }
      label620:
      i = 0;
    }
  }
  
  private final ColorStateList a(int paramInt)
  {
    TypedValue localTypedValue = new TypedValue();
    if (!getContext().getTheme().resolveAttribute(paramInt, localTypedValue, true)) {}
    ColorStateList localColorStateList;
    do
    {
      return null;
      localColorStateList = getResources().getColorStateList(localTypedValue.resourceId);
    } while (!getContext().getTheme().resolveAttribute(2130772369, localTypedValue, true));
    int i = localTypedValue.data;
    int j = localColorStateList.getDefaultColor();
    int[][] arrayOfInt = new int[3][];
    arrayOfInt[0] = d;
    arrayOfInt[1] = c;
    arrayOfInt[2] = EMPTY_STATE_SET;
    int[] arrayOfInt1 = new int[3];
    arrayOfInt1[0] = localColorStateList.getColorForState(d, j);
    arrayOfInt1[1] = i;
    arrayOfInt1[2] = j;
    return new ColorStateList(arrayOfInt, arrayOfInt1);
  }
  
  protected void onMeasure(int paramInt1, int paramInt2)
  {
    switch (View.MeasureSpec.getMode(paramInt1))
    {
    }
    for (;;)
    {
      super.onMeasure(paramInt1, paramInt2);
      return;
      paramInt1 = View.MeasureSpec.makeMeasureSpec(Math.min(View.MeasureSpec.getSize(paramInt1), this.g), 1073741824);
      continue;
      paramInt1 = View.MeasureSpec.makeMeasureSpec(this.g, 1073741824);
    }
  }
  
  protected void onRestoreInstanceState(Parcelable paramParcelable)
  {
    y localy = (y)paramParcelable;
    super.onRestoreInstanceState(localy.getSuperState());
    k localk = this.e;
    SparseArray localSparseArray = localy.a.getSparseParcelableArray("android:menu:presenters");
    if ((localSparseArray == null) || (localk.l.isEmpty())) {}
    for (;;)
    {
      return;
      Iterator localIterator = localk.l.iterator();
      while (localIterator.hasNext())
      {
        WeakReference localWeakReference = (WeakReference)localIterator.next();
        xz localxz = (xz)localWeakReference.get();
        if (localxz == null)
        {
          localk.l.remove(localWeakReference);
        }
        else
        {
          int i = localxz.b();
          if (i > 0)
          {
            Parcelable localParcelable = (Parcelable)localSparseArray.get(i);
            if (localParcelable != null) {
              localxz.a(localParcelable);
            }
          }
        }
      }
    }
  }
  
  protected Parcelable onSaveInstanceState()
  {
    y localy = new y(super.onSaveInstanceState());
    localy.a = new Bundle();
    this.e.a(localy.a);
    return localy;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     android.support.design.widget.NavigationView
 * JD-Core Version:    0.7.0.1
 */