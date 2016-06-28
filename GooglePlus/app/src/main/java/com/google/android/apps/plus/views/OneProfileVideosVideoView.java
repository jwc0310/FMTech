package com.google.android.apps.plus.views;

import aaw;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.TextView;
import dxr;
import java.text.SimpleDateFormat;
import java.util.TimeZone;

public class OneProfileVideosVideoView
  extends dxr
{
  public String b;
  public OneProfileVideoThumbnailView c;
  public TextView d;
  public TextView e;
  public SimpleDateFormat f = new SimpleDateFormat("mm:ss");
  
  public OneProfileVideosVideoView(Context paramContext)
  {
    super(paramContext);
    this.f.setTimeZone(TimeZone.getTimeZone("UTC"));
  }
  
  public OneProfileVideosVideoView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    this.f.setTimeZone(TimeZone.getTimeZone("UTC"));
  }
  
  public OneProfileVideosVideoView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    this.f.setTimeZone(TimeZone.getTimeZone("UTC"));
  }
  
  protected void onFinishInflate()
  {
    super.onFinishInflate();
    this.c = ((OneProfileVideoThumbnailView)findViewById(aaw.lE));
    this.d = ((TextView)findViewById(aaw.lK));
    this.e = ((TextView)findViewById(aaw.cO));
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     com.google.android.apps.plus.views.OneProfileVideosVideoView
 * JD-Core Version:    0.7.0.1
 */