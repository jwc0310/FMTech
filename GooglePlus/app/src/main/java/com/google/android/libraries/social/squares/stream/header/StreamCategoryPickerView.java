package com.google.android.libraries.social.squares.stream.header;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.Spinner;
import az;
import da;
import efj;
import gxq;
import java.util.List;
import kwz;
import lhs;
import lht;
import lhu;
import mbb;
import pjo;

public final class StreamCategoryPickerView
  extends FrameLayout
{
  public final lhu a;
  public final lht b;
  public Spinner c;
  private final kwz d;
  
  public StreamCategoryPickerView(Context paramContext)
  {
    super(paramContext);
    Context localContext = getContext();
    this.a = new lhu(localContext);
    this.d = ((kwz)mbb.a(localContext, kwz.class));
    this.b = ((lht)mbb.a(localContext, lht.class));
  }
  
  public StreamCategoryPickerView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    Context localContext = getContext();
    this.a = new lhu(localContext);
    this.d = ((kwz)mbb.a(localContext, kwz.class));
    this.b = ((lht)mbb.a(localContext, lht.class));
  }
  
  public StreamCategoryPickerView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    Context localContext = getContext();
    this.a = new lhu(localContext);
    this.d = ((kwz)mbb.a(localContext, kwz.class));
    this.b = ((lht)mbb.a(localContext, lht.class));
  }
  
  protected final void onAttachedToWindow()
  {
    super.onAttachedToWindow();
    this.d.a(this.a);
  }
  
  protected final void onDetachedFromWindow()
  {
    super.onDetachedFromWindow();
    kwz localkwz = this.d;
    lhu locallhu = this.a;
    localkwz.c.remove(locallhu);
  }
  
  protected final void onFinishInflate()
  {
    super.onFinishInflate();
    this.c = ((Spinner)findViewById(az.X));
    efj.a(this.c, new gxq(pjo.m));
    this.c.setAdapter(this.a);
    this.c.setOnItemSelectedListener(new lhs(this));
    setBackgroundColor(0);
    this.c.getBackground().setColorFilter(getContext().getResources().getColor(da.am), PorterDuff.Mode.SRC_ATOP);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     com.google.android.libraries.social.squares.stream.header.StreamCategoryPickerView
 * JD-Core Version:    0.7.0.1
 */