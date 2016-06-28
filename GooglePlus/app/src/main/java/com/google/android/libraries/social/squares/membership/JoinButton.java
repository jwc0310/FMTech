package com.google.android.libraries.social.squares.membership;

import aau;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import android.widget.Button;
import fa;
import gxq;
import gxs;
import gxt;
import kuw;
import kxg;
import lfv;
import lga;
import pjo;

public final class JoinButton
  extends Button
  implements gxs, lfv
{
  public String a = null;
  public boolean b = false;
  private int c;
  private kxg d = kxg.a;
  
  public JoinButton(Context paramContext)
  {
    this(paramContext, null);
  }
  
  public JoinButton(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }
  
  public JoinButton(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    setGravity(17);
    a(kxg.a);
    TypedArray localTypedArray = paramContext.obtainStyledAttributes(paramAttributeSet, lga.a);
    this.b = localTypedArray.getBoolean(lga.b, false);
    localTypedArray.recycle();
    this.c = getContext().getResources().getColor(aau.Cp);
  }
  
  public final String a()
  {
    return this.a;
  }
  
  public final void a(kxg paramkxg)
  {
    if (this.d == paramkxg) {
      return;
    }
    this.d = paramkxg;
    int i;
    if (this.b)
    {
      i = -1;
      label23:
      if (!this.b) {
        break label95;
      }
    }
    label95:
    for (int j = aau.Cq;; j = aau.Cr) {
      switch (lfw.a[paramkxg.ordinal()])
      {
      default: 
        setVisibility(8);
        return;
        i = this.c;
        break label23;
      }
    }
    int m = fa.h;
    int n = i;
    boolean bool = true;
    for (;;)
    {
      int[] arrayOfInt = new int[4];
      arrayOfInt[0] = getPaddingLeft();
      arrayOfInt[1] = getPaddingTop();
      arrayOfInt[2] = getPaddingRight();
      arrayOfInt[3] = getPaddingBottom();
      setText(m);
      setTextColor(n);
      setBackgroundResource(j);
      setEnabled(bool);
      setVisibility(0);
      setPadding(arrayOfInt[0], arrayOfInt[1], arrayOfInt[2], arrayOfInt[3]);
      if (Build.VERSION.SDK_INT < 18) {
        break;
      }
      setVisibility(8);
      setVisibility(0);
      return;
      m = fa.e;
      n = i;
      bool = true;
      continue;
      m = fa.j;
      n = i;
      bool = true;
      continue;
      int i2 = fa.f;
      int i3 = this.c;
      j = aau.Cr;
      m = i2;
      n = i3;
      bool = true;
      continue;
      int i1 = fa.g;
      j = aau.Cr;
      m = i1;
      n = -3355444;
      bool = false;
      continue;
      int k = fa.k;
      j = aau.Cr;
      m = k;
      n = -7829368;
      bool = true;
    }
  }
  
  public final kxg b()
  {
    return this.d;
  }
  
  public final gxq v()
  {
    gxt localgxt;
    switch (lfw.a[this.d.ordinal()])
    {
    default: 
      return null;
    case 2: 
      localgxt = pjo.a;
    }
    for (;;)
    {
      return new kuw(localgxt, this.a);
      localgxt = pjo.i;
      continue;
      localgxt = pjo.aw;
      continue;
      localgxt = pjo.ay;
      continue;
      localgxt = pjo.f;
      continue;
      localgxt = pjo.aU;
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     com.google.android.libraries.social.squares.membership.JoinButton
 * JD-Core Version:    0.7.0.1
 */