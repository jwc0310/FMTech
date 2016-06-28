import android.content.Context;
import android.media.MediaPlayer;
import android.media.MediaPlayer.OnErrorListener;
import android.media.MediaPlayer.OnPreparedListener;
import android.view.SurfaceHolder;
import android.view.SurfaceHolder.Callback;
import android.view.SurfaceView;
import java.io.File;

public final class duy
  extends SurfaceView
  implements kbb
{
  private static ipb g;
  SurfaceHolder a;
  private String b;
  private MediaPlayer c;
  private MediaPlayer.OnPreparedListener d;
  private MediaPlayer.OnErrorListener e;
  private kaz f;
  private ipf h;
  private SurfaceHolder.Callback i = new duz(this);
  
  public duy(Context paramContext)
  {
    super(paramContext);
    getHolder().addCallback(this.i);
    getHolder().setType(3);
    if (g == null) {
      g = (ipb)mbb.a(paramContext, ipb.class);
    }
  }
  
  public final void a()
  {
    if ((this.b == null) || (this.a == null)) {
      return;
    }
    d();
    try
    {
      this.c = new MediaPlayer();
      this.c.setOnPreparedListener(this.d);
      this.c.setOnErrorListener(this.e);
      this.c.setDataSource(this.b);
      this.c.setDisplay(this.a);
      this.c.prepareAsync();
      return;
    }
    catch (Exception localException)
    {
      d();
    }
  }
  
  public final void a(MediaPlayer.OnErrorListener paramOnErrorListener)
  {
    this.e = paramOnErrorListener;
    if (this.c != null) {
      this.c.setOnErrorListener(this.e);
    }
  }
  
  public final void a(MediaPlayer.OnPreparedListener paramOnPreparedListener)
  {
    this.d = paramOnPreparedListener;
    if (this.c != null) {
      this.c.setOnPreparedListener(this.d);
    }
  }
  
  public final void a(String paramString)
  {
    ap_();
    this.h = ipf.a(getContext(), paramString, ipm.b);
    b();
  }
  
  public final void a(kaz paramkaz)
  {
    if ((paramkaz == this.f) && (this.f.q == 1))
    {
      this.b = this.f.g().toString();
      a();
      requestLayout();
      invalidate();
    }
  }
  
  public final void ap_()
  {
    if (this.f != null)
    {
      this.f.b(this);
      this.f = null;
    }
  }
  
  public final void b()
  {
    if (this.h != null) {
      this.f = g.a(this.h, 4, null, 34, this);
    }
  }
  
  public final void d()
  {
    if (this.c != null)
    {
      this.c.reset();
      this.c.release();
      this.c = null;
    }
  }
  
  protected final void onAttachedToWindow()
  {
    super.onAttachedToWindow();
    b();
  }
  
  protected final void onDetachedFromWindow()
  {
    super.onDetachedFromWindow();
    ap_();
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     duy
 * JD-Core Version:    0.7.0.1
 */