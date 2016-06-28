package com.google.android.apps.plus.views;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.widget.ListView;
import dvc;
import dvf;
import dvg;
import efj;
import java.util.HashSet;
import lwj;
import mbb;

public class BarGraphListView
  extends ListView
{
  public static TextPaint a;
  public static TextPaint b;
  public static Paint c;
  public static Paint d;
  public static int e;
  public static int f;
  public static int g;
  private static boolean n;
  public dvg[] h;
  public final HashSet<dvg> i = new HashSet();
  public long j;
  public long k;
  public String l;
  public final dvf m = new dvf(this);
  
  public BarGraphListView(Context paramContext)
  {
    this(paramContext, null);
  }
  
  public BarGraphListView(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }
  
  public BarGraphListView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    if (!n)
    {
      Resources localResources = paramContext.getResources();
      mbb.a(paramContext, lwj.class);
      TextPaint localTextPaint1 = new TextPaint();
      a = localTextPaint1;
      localTextPaint1.setAntiAlias(true);
      a.setColor(localResources.getColor(efj.js));
      a.setTextSize(localResources.getDimension(efj.nL));
      a.setTypeface(Typeface.DEFAULT_BOLD);
      lwj.a(a, efj.nL);
      TextPaint localTextPaint2 = new TextPaint();
      b = localTextPaint2;
      localTextPaint2.setAntiAlias(true);
      b.setColor(localResources.getColor(efj.jt));
      b.setTextSize(localResources.getDimension(efj.nK));
      b.setTypeface(Typeface.DEFAULT_BOLD);
      lwj.a(b, efj.nK);
      Paint localPaint1 = new Paint();
      c = localPaint1;
      localPaint1.setColor(localResources.getColor(efj.jq));
      c.setStyle(Paint.Style.STROKE);
      Paint localPaint2 = new Paint();
      d = localPaint2;
      localPaint2.setColor(localResources.getColor(efj.jr));
      d.setStyle(Paint.Style.FILL);
      e = (int)localResources.getDimension(efj.kP);
      f = (int)localResources.getDimension(efj.kR);
      g = (int)localResources.getDimension(efj.kQ);
      n = true;
    }
    setRecyclerListener(new dvc(this));
    setAdapter(this.m);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     com.google.android.apps.plus.views.BarGraphListView
 * JD-Core Version:    0.7.0.1
 */