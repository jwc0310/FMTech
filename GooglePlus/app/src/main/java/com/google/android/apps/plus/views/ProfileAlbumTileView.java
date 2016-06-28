package com.google.android.apps.plus.views;

import aaw;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.google.android.libraries.social.media.ui.MediaView;
import dza;
import efj;
import lxj;

public class ProfileAlbumTileView
  extends RelativeLayout
  implements View.OnClickListener, lxj
{
  public static Bitmap a;
  public static Bitmap b;
  public static Bitmap c;
  public static Bitmap d;
  public TextView e;
  public TextView f;
  public MediaView g;
  public ImageView h;
  public String i;
  public dza j;
  
  public ProfileAlbumTileView(Context paramContext)
  {
    super(paramContext, null);
    a(paramContext);
  }
  
  public ProfileAlbumTileView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet, 0);
    a(paramContext);
  }
  
  public ProfileAlbumTileView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    a(paramContext);
  }
  
  private static void a(Context paramContext)
  {
    if (b == null)
    {
      Resources localResources = paramContext.getResources();
      a = efj.a(localResources, efj.pF);
      b = efj.a(localResources, efj.ph);
      c = efj.a(localResources, efj.po);
      d = efj.a(localResources, efj.pq);
    }
  }
  
  public final void D_()
  {
    this.g.a(null);
    this.h.setImageDrawable(null);
  }
  
  public void onClick(View paramView)
  {
    if (this.j != null) {
      this.j.a(this.i);
    }
  }
  
  protected void onFinishInflate()
  {
    super.onFinishInflate();
    this.e = ((TextView)findViewById(aaw.ls));
    this.f = ((TextView)findViewById(aaw.cc));
    this.g = ((MediaView)findViewById(aaw.hn));
    this.h = ((ImageView)findViewById(aaw.cb));
  }
  
  protected void onMeasure(int paramInt1, int paramInt2)
  {
    if (View.MeasureSpec.getMode(paramInt2) != 0) {}
    for (;;)
    {
      super.onMeasure(paramInt1, paramInt2);
      return;
      paramInt2 = paramInt1;
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     com.google.android.apps.plus.views.ProfileAlbumTileView
 * JD-Core Version:    0.7.0.1
 */