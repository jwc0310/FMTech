import android.content.ContentResolver;
import android.os.Handler;
import android.os.Looper;

final class fpg
  extends Thread
{
  fpg(String paramString, ContentResolver paramContentResolver)
  {
    super(paramString);
  }
  
  public final void run()
  {
    Looper.prepare();
    this.a.registerContentObserver(fpf.a, true, new fph(this, new Handler(Looper.myLooper())));
    Looper.loop();
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     fpg
 * JD-Core Version:    0.7.0.1
 */