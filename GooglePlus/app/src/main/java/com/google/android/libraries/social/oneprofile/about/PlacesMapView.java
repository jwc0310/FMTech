package com.google.android.libraries.social.oneprofile.about;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.View.MeasureSpec;
import com.google.android.libraries.social.media.ui.MediaView;
import efj;
import ipf;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class PlacesMapView
  extends MediaView
{
  private static Pattern a = Pattern.compile(".*size=(\\d+)x(\\d+)");
  private float b;
  private int c;
  private int d;
  private float e;
  
  public PlacesMapView(Context paramContext)
  {
    super(paramContext, null);
    this.s = 1;
    if (this.b == 0.0F) {
      this.b = (getContext().getResources().getInteger(efj.QN) / 100.0F);
    }
    this.e = this.b;
  }
  
  public PlacesMapView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    this.s = 1;
    if (this.b == 0.0F) {
      this.b = (getContext().getResources().getInteger(efj.QN) / 100.0F);
    }
    this.e = this.b;
  }
  
  public final void a(ipf paramipf)
  {
    if (paramipf != null)
    {
      Matcher localMatcher = a.matcher(paramipf.c);
      if (localMatcher.find())
      {
        this.c = Integer.parseInt(localMatcher.group(1));
        this.d = Integer.parseInt(localMatcher.group(2));
      }
    }
    for (this.e = (this.c / this.d);; this.e = this.b)
    {
      super.a(paramipf);
      return;
    }
  }
  
  protected final void onMeasure(int paramInt1, int paramInt2)
  {
    int i = View.MeasureSpec.getSize(paramInt1);
    setMeasuredDimension(i, (int)((i - getPaddingLeft() - getPaddingRight()) / this.e) + getPaddingTop() + getPaddingBottom());
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     com.google.android.libraries.social.oneprofile.about.PlacesMapView
 * JD-Core Version:    0.7.0.1
 */