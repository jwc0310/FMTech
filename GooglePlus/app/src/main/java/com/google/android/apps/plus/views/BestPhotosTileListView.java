package com.google.android.apps.plus.views;

import android.content.Context;
import android.database.Cursor;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Pair;
import android.util.SparseIntArray;
import android.widget.AbsListView;
import android.widget.AbsListView.OnScrollListener;
import android.widget.ListAdapter;
import cya;
import dvh;
import lb;

public class BestPhotosTileListView
  extends FastScrollListView
  implements AbsListView.OnScrollListener
{
  private boolean b;
  private int c;
  private int d;
  private int[] e;
  private int[] f;
  private String[] g;
  private AbsListView.OnScrollListener h;
  private cya i;
  
  public BestPhotosTileListView(Context paramContext)
  {
    this(paramContext, null);
  }
  
  public BestPhotosTileListView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    super.setOnScrollListener(this);
  }
  
  protected void handleDataChanged()
  {
    int j = getCount() - getHeaderViewsCount();
    int k;
    cya localcya2;
    int[] arrayOfInt1;
    int[] arrayOfInt2;
    int m;
    int i3;
    int i4;
    int i5;
    int i6;
    int i14;
    if ((this.b) && (j > 0))
    {
      cya localcya1 = this.i;
      k = 0;
      if (localcya1 != null)
      {
        localcya2 = this.i;
        arrayOfInt1 = this.e;
        String[] arrayOfString = this.g;
        arrayOfInt2 = this.f;
        m = this.c;
        if (localcya2.k == null) {
          throw new IllegalStateException("Must set list after cursor is set");
        }
        if (localcya2.o != 0)
        {
          localcya2.k.c();
          localcya2.m.clear();
          localcya2.n.c();
          localcya2.l.clear();
          localcya2.o = 0;
        }
        (localcya2.p * localcya2.j);
        int n = arrayOfInt1.length;
        if (localcya2.c == null) {}
        for (int i1 = 0;; i1 = localcya2.c.getCount())
        {
          int i2 = i1 - 1;
          i3 = localcya2.c.getPosition();
          i4 = 0;
          k = 0;
          i5 = 0;
          if (i4 >= n) {
            break label439;
          }
          i6 = arrayOfInt1[i4];
          if (i6 > i2) {
            break label439;
          }
          if (m >= i6) {
            k = i5;
          }
          localcya2.c.moveToPosition(i6);
          if ((!cya.d(localcya2.c)) || (!TextUtils.equals(localcya2.c.getString(4), arrayOfString[i4]))) {
            break label439;
          }
          localcya2.k.a(i6, arrayOfString[i4]);
          localcya2.n.a(i6, localcya2.c.getString(5));
          arrayOfString[i4];
          if (i4 != n - 1) {
            break label490;
          }
          i14 = i6;
          while ((i14 < -1 + localcya2.c.getCount()) && ((arrayOfString[i4].equals(localcya2.c.getString(3))) || (arrayOfString[i4].equals(localcya2.c.getString(4)))))
          {
            i14++;
            localcya2.c.moveToNext();
          }
        }
      }
    }
    int i8;
    label439:
    label490:
    for (int i7 = i14 + 1;; i7 = arrayOfInt1[(i4 + 1)])
    {
      i8 = i7;
      if (i8 > 0) {
        break;
      }
      localcya2.o = i5;
      localcya2.l.put(i5, i6);
      if (localcya2.o != 0) {
        localcya2.notifyDataSetChanged();
      }
      localcya2.c.moveToPosition(i3);
      setSelection(k);
      this.b = false;
      this.e = null;
      this.g = null;
      super.handleDataChanged();
      return;
    }
    int i9 = i6;
    int i10 = i5;
    if (i9 < i8) {
      if (m < i9) {
        break label652;
      }
    }
    label652:
    for (int i11 = i10;; i11 = k)
    {
      if (i9 == i6) {}
      for (int i12 = 1;; i12 = localcya2.b(i9))
      {
        if ((localcya2.h) && (i9 > i6 + 1) && (i8 - (i9 + i12) < 0)) {
          break label639;
        }
        localcya2.o = i10;
        localcya2.l.put(i10, i9);
        if (i9 == i6) {
          localcya2.m.put(i10, arrayOfInt2[i4]);
        }
        int i13 = i12 + i9;
        i10++;
        i9 = i13;
        k = i11;
        break;
      }
      label639:
      k = i11;
      i4++;
      i5 = i10;
      break;
    }
  }
  
  public void onRestoreInstanceState(Parcelable paramParcelable)
  {
    dvh localdvh = (dvh)paramParcelable;
    super.onRestoreInstanceState(localdvh.getSuperState());
    this.c = localdvh.a;
    this.d = localdvh.b;
    this.e = localdvh.c;
    this.g = localdvh.d;
    this.f = localdvh.e;
    if (this.e != null) {}
    for (boolean bool = true;; bool = false)
    {
      this.b = bool;
      requestLayout();
      return;
    }
  }
  
  public Parcelable onSaveInstanceState()
  {
    dvh localdvh = new dvh(super.onSaveInstanceState());
    int j = getCount() - getHeaderViewsCount();
    int k;
    int m;
    int i1;
    if ((getChildCount() > 0) && (j > 0))
    {
      k = 1;
      long l = getSelectedItemId();
      m = getLastVisiblePosition();
      if (l < 0L) {
        break label157;
      }
      i1 = getSelectedItemPosition();
    }
    for (;;)
    {
      label60:
      cya localcya;
      if (this.i != null)
      {
        localcya = this.i;
        if (localcya.k != null) {
          break label192;
        }
      }
      label157:
      int n;
      label192:
      int[] arrayOfInt;
      String[] arrayOfString;
      for (Pair localPair = null;; localPair = new Pair(arrayOfInt, arrayOfString))
      {
        if (localPair != null)
        {
          localdvh.c = ((int[])localPair.first);
          localdvh.d = ((String[])localPair.second);
          localdvh.e = this.i.b();
          localdvh.a = this.i.a(i1);
          localdvh.b = this.i.a(m);
        }
        return localdvh;
        k = 0;
        break;
        n = getFirstVisiblePosition();
        i1 = 0;
        if (k == 0) {
          break label60;
        }
        i1 = 0;
        if (n <= 0) {
          break label60;
        }
        if (n < j) {
          break label318;
        }
        i1 = j - 1;
        break label60;
        lb locallb1 = localcya.k;
        if (locallb1.b) {
          locallb1.a();
        }
        arrayOfInt = new int[locallb1.e];
        lb locallb2 = localcya.k;
        if (locallb2.b) {
          locallb2.a();
        }
        arrayOfString = new String[locallb2.e];
        for (int i2 = -1 + arrayOfInt.length; i2 >= 0; i2--)
        {
          arrayOfInt[i2] = localcya.k.d(i2);
          arrayOfString[i2] = ((String)localcya.k.e(i2));
        }
      }
      label318:
      i1 = n;
    }
  }
  
  public void onScroll(AbsListView paramAbsListView, int paramInt1, int paramInt2, int paramInt3)
  {
    if (this.h != null) {
      this.h.onScroll(paramAbsListView, paramInt1, paramInt2, paramInt3);
    }
  }
  
  public void onScrollStateChanged(AbsListView paramAbsListView, int paramInt)
  {
    if (this.h != null) {
      this.h.onScrollStateChanged(paramAbsListView, paramInt);
    }
  }
  
  public void setAdapter(ListAdapter paramListAdapter)
  {
    if ((paramListAdapter instanceof cya)) {
      this.i = ((cya)paramListAdapter);
    }
    super.setAdapter(paramListAdapter);
  }
  
  public void setOnScrollListener(AbsListView.OnScrollListener paramOnScrollListener)
  {
    this.h = paramOnScrollListener;
    super.setOnScrollListener(this);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     com.google.android.apps.plus.views.BestPhotosTileListView
 * JD-Core Version:    0.7.0.1
 */