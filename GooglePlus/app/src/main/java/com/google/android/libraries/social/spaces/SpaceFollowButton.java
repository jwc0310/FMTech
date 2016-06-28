package com.google.android.libraries.social.spaces;

import android.content.Context;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import android.widget.Button;
import gxq;
import gxs;
import gxt;
import java.util.BitSet;
import kxd;
import kxe;
import kxg;
import kxh;
import mbb;
import pjn;

public final class SpaceFollowButton
  extends Button
  implements gxs
{
  public kxe a;
  public kxg b = kxg.a;
  int c;
  kxd d;
  private final kxh e = (kxh)mbb.b(getContext(), kxh.class);
  
  public SpaceFollowButton(Context paramContext)
  {
    super(paramContext);
  }
  
  public SpaceFollowButton(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }
  
  public SpaceFollowButton(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
  }
  
  final void a()
  {
    int[] arrayOfInt;
    if (this.d != null)
    {
      arrayOfInt = new int[4];
      arrayOfInt[0] = getPaddingLeft();
      arrayOfInt[1] = getPaddingTop();
      arrayOfInt[2] = getPaddingRight();
      arrayOfInt[3] = getPaddingBottom();
      if (!this.d.e.get(this.b.ordinal())) {
        break label109;
      }
      setBackgroundResource(this.d.a);
      int j = this.d.b;
      if (j == 0) {
        j = this.c;
      }
      setTextColor(j);
    }
    for (;;)
    {
      setPadding(arrayOfInt[0], arrayOfInt[1], arrayOfInt[2], arrayOfInt[3]);
      return;
      label109:
      setBackgroundResource(this.d.c);
      int i = this.d.d;
      if (i == 0) {
        i = this.c;
      }
      setTextColor(i);
    }
  }
  
  public final void a(kxg paramkxg)
  {
    this.b = paramkxg;
    setEnabled(true);
    if ((this.a != null) && (paramkxg != kxg.a)) {
      setText(this.a.a(paramkxg));
    }
    switch (kxc.a[paramkxg.ordinal()])
    {
    }
    for (;;)
    {
      a();
      if (Build.VERSION.SDK_INT >= 18) {
        setVisibility(8);
      }
      setVisibility(0);
      return;
      setVisibility(8);
      return;
      setEnabled(false);
    }
  }
  
  protected final void onDetachedFromWindow()
  {
    super.onDetachedFromWindow();
  }
  
  public final gxq v()
  {
    if (this.b == kxg.b) {}
    for (gxt localgxt = pjn.F;; localgxt = pjn.ad) {
      return new gxq(localgxt);
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     com.google.android.libraries.social.spaces.SpaceFollowButton
 * JD-Core Version:    0.7.0.1
 */