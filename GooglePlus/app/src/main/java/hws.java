import android.os.Handler;
import android.os.Message;
import java.lang.ref.WeakReference;

final class hws
  extends Handler
{
  private final WeakReference<hwq> a;
  
  hws(hwq paramhwq)
  {
    this.a = new WeakReference(paramhwq);
  }
  
  public final void handleMessage(Message paramMessage)
  {
    if (paramMessage.what == 0)
    {
      hwq localhwq = (hwq)this.a.get();
      if (localhwq != null) {
        localhwq.d();
      }
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     hws
 * JD-Core Version:    0.7.0.1
 */