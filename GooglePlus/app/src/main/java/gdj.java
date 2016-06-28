import android.os.Handler;
import android.os.HandlerThread;

final class gdj
  implements gdm<E>
{
  private HandlerThread b = new HandlerThread("BackgroundRecorder", 10);
  private Handler c;
  
  gdj(gdi paramgdi)
  {
    this.b.start();
    this.c = new Handler(this.b.getLooper());
  }
  
  public final void a(String paramString, E paramE)
  {
    this.c.post(new gdk(this, paramString, paramE));
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     gdj
 * JD-Core Version:    0.7.0.1
 */