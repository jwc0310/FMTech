import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Shader.TileMode;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.SystemClock;
import android.support.rastermill.FrameSequence;

public final class aq
  extends Drawable
  implements Animatable, Runnable
{
  private static final Object m = new Object();
  private static HandlerThread n;
  private static Handler o;
  public final Paint a;
  public boolean b;
  public final Object c = new Object();
  public final at d;
  public boolean e = false;
  public Bitmap f;
  public Bitmap g;
  public int h;
  public int i = 3;
  long j;
  long k;
  int l;
  private final FrameSequence p;
  private final eez q;
  private BitmapShader r;
  private BitmapShader s;
  private final Rect t;
  private int u;
  private Runnable v = new ar(this);
  private Runnable w = new as(this);
  
  static
  {
    new our();
  }
  
  public aq(FrameSequence paramFrameSequence, at paramat)
  {
    if ((paramFrameSequence == null) || (paramat == null)) {
      throw new IllegalArgumentException();
    }
    this.p = paramFrameSequence;
    this.q = paramFrameSequence.a();
    int i1 = paramFrameSequence.a;
    int i2 = paramFrameSequence.b;
    this.d = paramat;
    this.f = a(paramat, i1, i2);
    this.g = a(paramat, i1, i2);
    this.t = new Rect(0, 0, i1, i2);
    this.a = new Paint();
    this.a.setFilterBitmap(true);
    this.r = new BitmapShader(this.f, Shader.TileMode.CLAMP, Shader.TileMode.CLAMP);
    this.s = new BitmapShader(this.g, Shader.TileMode.CLAMP, Shader.TileMode.CLAMP);
    this.j = 0L;
    this.l = -1;
    this.q.a(0, this.f, -1);
    synchronized (m)
    {
      if (n != null) {
        return;
      }
      HandlerThread localHandlerThread = new HandlerThread("FrameSequence decoding thread", 10);
      n = localHandlerThread;
      localHandlerThread.start();
      o = new Handler(n.getLooper());
      return;
    }
  }
  
  private static Bitmap a(at paramat, int paramInt1, int paramInt2)
  {
    Bitmap localBitmap = paramat.a(paramInt1, paramInt2);
    if ((localBitmap.getWidth() < paramInt1) || (localBitmap.getHeight() < paramInt2) || (localBitmap.getConfig() != Bitmap.Config.ARGB_8888)) {
      throw new IllegalArgumentException("Invalid bitmap provided");
    }
    return localBitmap;
  }
  
  private final void b()
  {
    this.h = 1;
    this.l = ((1 + this.l) % this.p.d);
    o.post(this.v);
  }
  
  public final void a()
  {
    if (this.e) {
      throw new IllegalStateException("Cannot perform operation on recycled drawable");
    }
  }
  
  public final void draw(Canvas paramCanvas)
  {
    for (int i1 = 1;; i1 = 0)
    {
      synchronized (this.c)
      {
        a();
        if ((this.h == 3) && (this.k - SystemClock.uptimeMillis() <= 0L)) {
          this.h = 4;
        }
        if ((isRunning()) && (this.h == 4))
        {
          Bitmap localBitmap = this.g;
          this.g = this.f;
          this.f = localBitmap;
          BitmapShader localBitmapShader = this.s;
          this.s = this.r;
          this.r = localBitmapShader;
          this.j = SystemClock.uptimeMillis();
          if (this.l == -1 + this.p.d)
          {
            this.u = (1 + this.u);
            if (((this.i == i1) && (this.u == i1)) || ((this.i == 3) && (this.u == this.p.e))) {
              continue;
            }
          }
          if (i1 != 0) {
            b();
          }
        }
        else
        {
          if (!this.b) {
            break label268;
          }
          Rect localRect = getBounds();
          this.a.setShader(this.r);
          float f1 = localRect.width();
          float f2 = localRect.height();
          float f3 = Math.min(f1, f2) / 2.0F;
          paramCanvas.drawCircle(f1 / 2.0F, f2 / 2.0F, f3, this.a);
          return;
        }
        scheduleSelf(this.w, 0L);
      }
      label268:
      this.a.setShader(null);
      paramCanvas.drawBitmap(this.f, this.t, getBounds(), this.a);
      return;
    }
  }
  
  protected final void finalize()
  {
    try
    {
      this.q.a();
      return;
    }
    finally
    {
      super.finalize();
    }
  }
  
  public final int getIntrinsicHeight()
  {
    return this.p.b;
  }
  
  public final int getIntrinsicWidth()
  {
    return this.p.a;
  }
  
  public final int getOpacity()
  {
    if (this.p.c) {
      return -1;
    }
    return -2;
  }
  
  public final boolean isRunning()
  {
    for (;;)
    {
      synchronized (this.c)
      {
        if ((this.l >= 0) && (!this.e))
        {
          bool = true;
          return bool;
        }
      }
      boolean bool = false;
    }
  }
  
  public final void run()
  {
    synchronized (this.c)
    {
      int i1 = this.l;
      int i2 = 0;
      if (i1 >= 0)
      {
        int i3 = this.h;
        i2 = 0;
        if (i3 == 3)
        {
          this.h = 4;
          i2 = 1;
        }
      }
      if (i2 != 0) {
        invalidateSelf();
      }
      return;
    }
  }
  
  public final void setAlpha(int paramInt)
  {
    this.a.setAlpha(paramInt);
  }
  
  public final void setColorFilter(ColorFilter paramColorFilter)
  {
    this.a.setColorFilter(paramColorFilter);
  }
  
  public final void setFilterBitmap(boolean paramBoolean)
  {
    this.a.setFilterBitmap(paramBoolean);
  }
  
  public final boolean setVisible(boolean paramBoolean1, boolean paramBoolean2)
  {
    boolean bool = super.setVisible(paramBoolean1, paramBoolean2);
    if (!paramBoolean1) {
      stop();
    }
    while ((!paramBoolean2) && (!bool)) {
      return bool;
    }
    stop();
    start();
    return bool;
  }
  
  public final void start()
  {
    if (!isRunning()) {
      synchronized (this.c)
      {
        a();
        if (this.h == 1) {
          return;
        }
        this.u = 0;
        b();
        return;
      }
    }
  }
  
  public final void stop()
  {
    if (isRunning()) {
      unscheduleSelf(this);
    }
  }
  
  public final void unscheduleSelf(Runnable paramRunnable)
  {
    synchronized (this.c)
    {
      this.l = -1;
      this.h = 0;
      super.unscheduleSelf(paramRunnable);
      return;
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     aq
 * JD-Core Version:    0.7.0.1
 */