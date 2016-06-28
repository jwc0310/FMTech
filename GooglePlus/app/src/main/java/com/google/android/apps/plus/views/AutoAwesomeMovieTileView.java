package com.google.android.apps.plus.views;

import aaw;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.google.android.libraries.social.media.ui.MediaView;

public class AutoAwesomeMovieTileView
  extends FrameLayout
{
  public TextView a;
  public MediaView b;
  
  public AutoAwesomeMovieTileView(Context paramContext)
  {
    super(paramContext);
  }
  
  public AutoAwesomeMovieTileView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }
  
  public AutoAwesomeMovieTileView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
  }
  
  protected void onFinishInflate()
  {
    super.onFinishInflate();
    View localView1 = findViewById(aaw.ls);
    if (localView1 == null) {
      throw new NullPointerException();
    }
    this.a = ((TextView)localView1);
    View localView2 = findViewById(aaw.hn);
    if (localView2 == null) {
      throw new NullPointerException();
    }
    this.b = ((MediaView)localView2);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     com.google.android.apps.plus.views.AutoAwesomeMovieTileView
 * JD-Core Version:    0.7.0.1
 */