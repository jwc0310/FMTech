package com.google.android.libraries.social.tiledimage.views;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import android.view.Choreographer;
import android.view.Choreographer.FrameCallback;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import lsg;
import lsh;
import lsi;
import lsj;
import lsl;
import lso;
import lsr;
import lsv;
import lsw;
import lsx;
import lsy;
import mcs;

public final class TiledImageView
  extends FrameLayout
{
  public static final boolean a;
  private static final boolean j;
  private static final mcs k;
  public lsg b;
  public boolean c = false;
  public boolean d;
  public boolean e = true;
  public float[] f = new float[9];
  public final Object g = new Object();
  public lsy h;
  public RectF i = new RectF();
  private Choreographer.FrameCallback l;
  
  static
  {
    boolean bool1 = true;
    boolean bool2;
    if (Build.VERSION.SDK_INT >= 16)
    {
      bool2 = bool1;
      a = bool2;
      if (Build.VERSION.SDK_INT < 16) {
        break label47;
      }
    }
    for (;;)
    {
      j = bool1;
      k = new mcs("debug.tiledimage.draw_overlay", (byte)0);
      return;
      bool2 = false;
      break;
      label47:
      bool1 = false;
    }
  }
  
  public TiledImageView(Context paramContext)
  {
    this(paramContext, null);
  }
  
  public TiledImageView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    if (!a) {
      return;
    }
    this.h = new lsy();
    this.h.g = new lsr(this);
    this.b = new lsg(paramContext);
    lsg locallsg1 = this.b;
    locallsg1.b();
    locallsg1.h = 2;
    lsg locallsg2 = this.b;
    lso locallso = new lso(this);
    locallsg2.b();
    if (locallsg2.e == null) {
      locallsg2.e = new lsh(locallsg2, 8, 8, 8, 0, 16, 0);
    }
    if (locallsg2.f == null) {
      locallsg2.f = new lsi(locallsg2);
    }
    if (locallsg2.g == null) {
      locallsg2.g = new lsj();
    }
    locallsg2.d = locallso;
    locallsg2.c = new lsl(locallsg2.b);
    locallsg2.c.start();
    this.b.c.a(0);
    this.b.setSurfaceTextureListener(new lsw(this));
    addView(this.b, new FrameLayout.LayoutParams(-1, -1));
  }
  
  private final void a(lsy paramlsy)
  {
    if ((paramlsy == null) || (paramlsy.e == null) || (paramlsy.a > 0.0F) || (getWidth() == 0)) {
      return;
    }
    paramlsy.a = Math.min(getWidth() / paramlsy.e.b(), getHeight() / paramlsy.e.c());
  }
  
  public final void a(lsv paramlsv, Runnable paramRunnable)
  {
    if (!a) {
      return;
    }
    synchronized (this.g)
    {
      this.h.e = paramlsv;
      this.h.f = paramRunnable;
      lsy locallsy1 = this.h;
      if (paramlsv != null) {}
      for (int m = paramlsv.b() / 2;; m = 0)
      {
        locallsy1.b = m;
        lsy locallsy2 = this.h;
        if (paramlsv == null) {
          break;
        }
        n = paramlsv.c() / 2;
        locallsy2.c = n;
        lsy locallsy3 = this.h;
        int i1 = 0;
        if (paramlsv != null) {
          i1 = paramlsv.e();
        }
        locallsy3.d = i1;
        this.h.a = 0.0F;
        a(this.h);
        invalidate();
        return;
      }
      int n = 0;
    }
  }
  
  protected final void dispatchDraw(Canvas paramCanvas)
  {
    if (!a) {
      return;
    }
    super.dispatchDraw(paramCanvas);
  }
  
  public final void invalidate()
  {
    if (!a) {}
    do
    {
      return;
      if (!j) {
        break;
      }
    } while (this.c);
    this.c = true;
    if (this.l == null) {
      this.l = new lsx(this);
    }
    Choreographer.getInstance().postFrameCallback(this.l);
    return;
    this.b.a();
  }
  
  protected final void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    super.onLayout(paramBoolean, paramInt1, paramInt2, paramInt3, paramInt4);
    if (!a) {
      return;
    }
    synchronized (this.g)
    {
      a(this.h);
      return;
    }
  }
  
  @SuppressLint({"NewApi"})
  public final void setTranslationX(float paramFloat)
  {
    if (!a) {
      return;
    }
    super.setTranslationX(paramFloat);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     com.google.android.libraries.social.tiledimage.views.TiledImageView
 * JD-Core Version:    0.7.0.1
 */