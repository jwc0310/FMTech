import android.os.Looper;
import android.os.MessageQueue;

final class ifo
  implements Runnable
{
  ifo(ifl paramifl) {}
  
  public final void run()
  {
    Looper.myQueue().addIdleHandler(this.a.b);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     ifo
 * JD-Core Version:    0.7.0.1
 */