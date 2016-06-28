package com.google.android.apps.plus.views;

import aaw;
import android.annotation.TargetApi;
import android.content.Context;
import android.database.Cursor;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import com.google.android.libraries.social.media.ui.MediaView;
import dvv;
import dvw;
import dvx;
import dvy;
import dvz;
import iqp;
import java.util.ArrayList;

public class DreamViewFlipper
  extends FrameLayout
  implements iqp
{
  public static final String[] a = { "tile_id", "photo_id", "image_url", "owner_id", "NULL AS _data", "NULL AS _id" };
  public static final String[] b = { "NULL AS tile_id", "NULL AS photo_id", "NULL AS image_url", "NULL AS owner_id", "NULL AS _data", "_id" };
  public static final String[] c = { "NULL AS tile_id", "NULL AS photo_id", "NULL AS image_url", "NULL AS owner_id", "_data", "NULL AS _id" };
  public MediaView d;
  public MediaView e;
  public ArrayList<String> f;
  public int g;
  public Cursor h;
  public final Handler i = new Handler();
  public boolean j;
  public boolean k;
  public boolean l;
  public final Runnable m = new dvv(this);
  public final Runnable n = new dvw(this);
  private dvz o;
  
  public DreamViewFlipper(Context paramContext)
  {
    super(paramContext);
  }
  
  public DreamViewFlipper(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }
  
  public DreamViewFlipper(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
  }
  
  public final void a()
  {
    this.l = false;
    this.k = false;
    this.i.removeCallbacks(this.m);
    this.i.removeCallbacks(this.n);
    c();
    if (this.o != null) {
      this.o.cancel(false);
    }
  }
  
  public final void a(MediaView paramMediaView)
  {
    if (paramMediaView == this.e)
    {
      this.j = true;
      if (this.k)
      {
        this.k = false;
        b();
      }
    }
  }
  
  public final void a(String paramString)
  {
    new dvy(this).execute(new String[] { paramString });
  }
  
  @TargetApi(16)
  public final void b()
  {
    ViewPropertyAnimator localViewPropertyAnimator1 = this.d.animate().alpha(0.0F).setDuration(1000L).withEndAction(new dvx(this));
    ViewPropertyAnimator localViewPropertyAnimator2 = this.e.animate().alpha(1.0F).setDuration(1000L);
    localViewPropertyAnimator1.start();
    localViewPropertyAnimator2.start();
  }
  
  public final void c()
  {
    if (this.h != null)
    {
      this.h.close();
      this.h = null;
    }
  }
  
  protected void onFinishInflate()
  {
    super.onFinishInflate();
    this.d = ((MediaView)findViewById(aaw.es));
    this.e = ((MediaView)findViewById(aaw.bb));
    this.d.s = 3;
    this.d.F = this;
    this.e.s = 3;
    this.e.F = this;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     com.google.android.apps.plus.views.DreamViewFlipper
 * JD-Core Version:    0.7.0.1
 */