package com.google.android.libraries.social.ingest.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.TextView;
import efj;
import java.text.DateFormatSymbols;
import java.util.Locale;

public final class DateTileView
  extends FrameLayout
{
  public static String[] a = DateFormatSymbols.getInstance().getShortMonths();
  private static Locale i;
  public TextView b;
  public TextView c;
  public TextView d;
  public int e = -1;
  public int f = -1;
  public int g = -1;
  public String[] h = a;
  
  static
  {
    a();
  }
  
  public DateTileView(Context paramContext)
  {
    super(paramContext);
  }
  
  public DateTileView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }
  
  public DateTileView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
  }
  
  public static boolean a()
  {
    Locale localLocale = Locale.getDefault();
    if (!localLocale.equals(i))
    {
      i = localLocale;
      a = DateFormatSymbols.getInstance(localLocale).getShortMonths();
      return true;
    }
    return false;
  }
  
  protected final void onFinishInflate()
  {
    super.onFinishInflate();
    this.b = ((TextView)findViewById(efj.Ng));
    this.c = ((TextView)findViewById(efj.Nh));
    this.d = ((TextView)findViewById(efj.Ni));
  }
  
  public final void onMeasure(int paramInt1, int paramInt2)
  {
    super.onMeasure(paramInt1, paramInt1);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     com.google.android.libraries.social.ingest.ui.DateTileView
 * JD-Core Version:    0.7.0.1
 */