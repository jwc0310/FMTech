package com.google.android.libraries.social.oneprofile.about;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.ImageView;
import android.widget.LinearLayout;
import eyg;

public final class LocalStarRating
  extends LinearLayout
{
  private static Drawable b;
  private static Drawable c;
  private static Drawable d;
  private static Drawable e;
  private static Drawable f;
  private static Drawable g;
  private ImageView[] a;
  private Drawable h;
  private Drawable i;
  private Drawable j;
  
  public LocalStarRating(Context paramContext)
  {
    super(paramContext);
    a(null);
  }
  
  public LocalStarRating(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    a(paramAttributeSet);
  }
  
  public LocalStarRating(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    a(paramAttributeSet);
  }
  
  private final void a(AttributeSet paramAttributeSet)
  {
    int k = 0;
    if (b == null)
    {
      Resources localResources = getContext().getResources();
      b = localResources.getDrawable(eyg.aq);
      c = localResources.getDrawable(eyg.ao);
      d = localResources.getDrawable(eyg.am);
      e = localResources.getDrawable(eyg.ar);
      f = localResources.getDrawable(eyg.ap);
      g = localResources.getDrawable(eyg.an);
    }
    if (paramAttributeSet != null)
    {
      String str1 = paramAttributeSet.getAttributeValue(null, "size");
      if (str1 != null)
      {
        if (!"12".equals(str1)) {
          break label195;
        }
        this.h = b;
        this.i = c;
      }
      for (this.j = d;; this.j = g)
      {
        setOrientation(0);
        this.a = new ImageView[5];
        while (k < 5)
        {
          this.a[k] = new ImageView(getContext());
          this.a[k].setImageDrawable(this.j);
          addView(this.a[k]);
          k++;
        }
        label195:
        if (!"16".equals(str1)) {
          break;
        }
        this.h = e;
        this.i = f;
      }
      String str2 = String.valueOf(str1);
      if (str2.length() != 0) {}
      for (String str3 = "Invalid size value: ".concat(str2);; str3 = new String("Invalid size value: ")) {
        throw new IllegalArgumentException(str3);
      }
    }
    throw new IllegalArgumentException("Missing size value!");
  }
  
  public final void a(int paramInt)
  {
    int k = 0;
    int m = 500;
    int n = 0;
    if (k < 5)
    {
      if (paramInt > m) {
        this.a[k].setImageDrawable(this.h);
      }
      for (;;)
      {
        k++;
        m += 1000;
        n += 1000;
        break;
        if (paramInt > n) {
          this.a[k].setImageDrawable(this.i);
        } else {
          this.a[k].setImageDrawable(this.j);
        }
      }
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     com.google.android.libraries.social.oneprofile.about.LocalStarRating
 * JD-Core Version:    0.7.0.1
 */