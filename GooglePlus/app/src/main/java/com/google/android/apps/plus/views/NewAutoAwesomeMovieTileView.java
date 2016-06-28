package com.google.android.apps.plus.views;

import aaw;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import efj;

public class NewAutoAwesomeMovieTileView
  extends RelativeLayout
{
  public TextView a;
  private ImageView b;
  
  public NewAutoAwesomeMovieTileView(Context paramContext)
  {
    super(paramContext);
  }
  
  public NewAutoAwesomeMovieTileView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }
  
  public NewAutoAwesomeMovieTileView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
  }
  
  protected void onFinishInflate()
  {
    super.onFinishInflate();
    this.a = ((TextView)efj.e(findViewById(aaw.ls), "no view with id text found"));
    this.b = ((ImageView)efj.e(findViewById(aaw.fM), "no icon view found"));
  }
  
  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    super.onLayout(paramBoolean, paramInt1, paramInt2, paramInt3, paramInt4);
    int i = this.b.getBottom();
    int j = this.a.getTop();
    if (i > j)
    {
      int k = i - j + getPaddingTop();
      this.b.layout(this.b.getLeft(), this.b.getTop() - k, this.b.getRight(), this.b.getBottom() - k);
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     com.google.android.apps.plus.views.NewAutoAwesomeMovieTileView
 * JD-Core Version:    0.7.0.1
 */