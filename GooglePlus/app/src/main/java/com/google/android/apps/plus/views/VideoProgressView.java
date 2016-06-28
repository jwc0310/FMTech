package com.google.android.apps.plus.views;

import aaw;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import android.widget.SeekBar;
import android.widget.SeekBar.OnSeekBarChangeListener;
import android.widget.TextView;
import eak;

public class VideoProgressView
  extends LinearLayout
  implements SeekBar.OnSeekBarChangeListener
{
  public SeekBar a;
  public double b;
  public double c;
  public eak d;
  private TextView e;
  private TextView f;
  private boolean g;
  
  public VideoProgressView(Context paramContext)
  {
    super(paramContext);
  }
  
  public VideoProgressView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }
  
  public VideoProgressView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
  }
  
  private static String c(double paramDouble)
  {
    int i = (int)paramDouble % 60;
    int j = (int)paramDouble / 60 % 60;
    int k = (int)paramDouble / 3600;
    if (k > 0)
    {
      Object[] arrayOfObject2 = new Object[3];
      arrayOfObject2[0] = Integer.valueOf(k);
      arrayOfObject2[1] = Integer.valueOf(j);
      arrayOfObject2[2] = Integer.valueOf(i);
      return String.format("%d:%02d:%02d", arrayOfObject2);
    }
    Object[] arrayOfObject1 = new Object[2];
    arrayOfObject1[0] = Integer.valueOf(j);
    arrayOfObject1[1] = Integer.valueOf(i);
    return String.format("%d:%02d", arrayOfObject1);
  }
  
  public final void a()
  {
    this.e.setText(c(this.b));
    this.f.setText(c(this.c));
  }
  
  public final void a(double paramDouble)
  {
    if (this.g) {
      return;
    }
    this.b = paramDouble;
    a();
    if (this.c != 0.0D)
    {
      int i = (int)(1000.0D * (this.b / this.c));
      this.a.setProgress(i);
      return;
    }
    this.a.setProgress(0);
  }
  
  public final void b(double paramDouble)
  {
    this.c = paramDouble;
    a();
    if (this.c != 0.0D)
    {
      int i = (int)(1000.0D * (this.b / this.c));
      this.a.setProgress(i);
      return;
    }
    this.a.setProgress(0);
  }
  
  protected void onFinishInflate()
  {
    super.onFinishInflate();
    this.e = ((TextView)findViewById(aaw.ch));
    this.f = ((TextView)findViewById(aaw.cO));
    this.a = ((SeekBar)findViewById(aaw.hU));
    this.a.setMax(1000);
    this.a.setOnSeekBarChangeListener(this);
    a();
    if (this.c != 0.0D)
    {
      int i = (int)(1000.0D * (this.b / this.c));
      this.a.setProgress(i);
      return;
    }
    this.a.setProgress(0);
  }
  
  public void onProgressChanged(SeekBar paramSeekBar, int paramInt, boolean paramBoolean)
  {
    if ((paramBoolean) && (this.c != 0.0D))
    {
      this.b = (this.c * (paramInt / 1000.0D));
      a();
    }
  }
  
  public void onStartTrackingTouch(SeekBar paramSeekBar)
  {
    this.g = true;
  }
  
  public void onStopTrackingTouch(SeekBar paramSeekBar)
  {
    this.g = false;
    this.d.a(this.b);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     com.google.android.apps.plus.views.VideoProgressView
 * JD-Core Version:    0.7.0.1
 */