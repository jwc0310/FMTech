package com.google.android.apps.plus.views;

import aaw;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.google.android.libraries.social.media.ui.MediaView;
import efj;

public class AlbumTileView
  extends RelativeLayout
{
  public static Bitmap a;
  public static Bitmap b;
  public static Bitmap c;
  public static Bitmap d;
  public static Bitmap e;
  public static Bitmap f;
  public TextView g;
  public TextView h;
  public MediaView i;
  public ImageView j;
  
  public AlbumTileView(Context paramContext)
  {
    super(paramContext, null);
    a(paramContext);
  }
  
  public AlbumTileView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet, 0);
    a(paramContext);
  }
  
  public AlbumTileView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    a(paramContext);
  }
  
  private static void a(Context paramContext)
  {
    if (b == null)
    {
      Resources localResources = paramContext.getResources();
      a = efj.a(localResources, efj.rT);
      b = efj.a(localResources, efj.rs);
      c = efj.a(localResources, efj.rH);
      e = efj.a(localResources, efj.rD);
      d = efj.a(localResources, efj.rC);
      f = efj.a(localResources, efj.rr);
    }
  }
  
  protected void onFinishInflate()
  {
    super.onFinishInflate();
    this.g = ((TextView)findViewById(aaw.ls));
    this.h = ((TextView)findViewById(aaw.cc));
    this.i = ((MediaView)findViewById(aaw.hn));
    this.j = ((ImageView)findViewById(aaw.cb));
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     com.google.android.apps.plus.views.AlbumTileView
 * JD-Core Version:    0.7.0.1
 */