import android.content.Context;
import android.graphics.SurfaceTexture;
import android.view.TextureView;
import android.view.TextureView.SurfaceTextureListener;
import java.lang.ref.WeakReference;

public final class lsg
  extends TextureView
  implements TextureView.SurfaceTextureListener
{
  public static final lsm a = new lsm();
  public final WeakReference<lsg> b = new WeakReference(this);
  public lsl c;
  public lso d;
  public lsh e;
  public lsi f;
  public lsj g;
  public int h;
  private boolean i;
  
  public lsg(Context paramContext)
  {
    super(paramContext);
    setSurfaceTextureListener(this);
  }
  
  public final void a()
  {
    lsl locallsl = this.c;
    synchronized (a)
    {
      locallsl.h = true;
      a.notifyAll();
      return;
    }
  }
  
  public final void b()
  {
    if (this.c != null) {
      throw new IllegalStateException("setRenderer has already been called for this instance.");
    }
  }
  
  protected final void finalize()
  {
    try
    {
      if (this.c != null) {
        this.c.e();
      }
      return;
    }
    finally
    {
      super.finalize();
    }
  }
  
  protected final void onAttachedToWindow()
  {
    super.onAttachedToWindow();
    if ((this.i) && (this.d != null)) {
      if (this.c == null) {
        break label74;
      }
    }
    label74:
    for (int j = this.c.a();; j = 1)
    {
      this.c = new lsl(this.b);
      if (j != 1) {
        this.c.a(j);
      }
      this.c.start();
      this.i = false;
      return;
    }
  }
  
  protected final void onDetachedFromWindow()
  {
    if (this.c != null) {
      this.c.e();
    }
    this.i = true;
    super.onDetachedFromWindow();
  }
  
  public final void onSurfaceTextureAvailable(SurfaceTexture paramSurfaceTexture, int paramInt1, int paramInt2)
  {
    lsl locallsl = this.c;
    synchronized (a)
    {
      locallsl.d = true;
      locallsl.f = false;
      a.notifyAll();
      for (;;)
      {
        if ((locallsl.e) && (!locallsl.f))
        {
          boolean bool = locallsl.a;
          if (!bool) {
            try
            {
              a.wait();
            }
            catch (InterruptedException localInterruptedException)
            {
              Thread.currentThread().interrupt();
            }
          }
        }
      }
    }
    this.c.a(paramInt1, paramInt2);
  }
  
  public final boolean onSurfaceTextureDestroyed(SurfaceTexture paramSurfaceTexture)
  {
    lsl locallsl = this.c;
    synchronized (a)
    {
      locallsl.d = false;
      a.notifyAll();
      for (;;)
      {
        if (!locallsl.e)
        {
          boolean bool = locallsl.a;
          if (!bool) {
            try
            {
              a.wait();
            }
            catch (InterruptedException localInterruptedException)
            {
              Thread.currentThread().interrupt();
            }
          }
        }
      }
    }
    return true;
  }
  
  public final void onSurfaceTextureSizeChanged(SurfaceTexture paramSurfaceTexture, int paramInt1, int paramInt2)
  {
    this.c.a(paramInt1, paramInt2);
  }
  
  public final void onSurfaceTextureUpdated(SurfaceTexture paramSurfaceTexture)
  {
    this.c.b();
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     lsg
 * JD-Core Version:    0.7.0.1
 */