import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

public final class dmy
  extends Thread
{
  final Queue<Intent> a;
  final Runnable b = new dmz(this);
  Handler c;
  dnb d;
  private final Handler e;
  
  public dmy(Handler paramHandler, String paramString, dnb paramdnb)
  {
    this.e = paramHandler;
    String str = String.valueOf(this);
    setName(0 + String.valueOf(paramString).length() + String.valueOf(str).length() + paramString + str);
    this.a = new LinkedBlockingQueue();
    this.d = paramdnb;
  }
  
  public final void a()
  {
    if (this.c != null) {
      this.c.getLooper().quit();
    }
    if (this.a.size() > 0) {
      this.a.clear();
    }
  }
  
  public final void a(Intent paramIntent)
  {
    this.a.add(paramIntent);
    if (this.c != null) {
      this.c.post(this.b);
    }
  }
  
  public final void run()
  {
    Looper.prepare();
    this.c = new Handler();
    this.e.post(new dna(this));
    Looper.loop();
    if (this.d != null) {
      this.d.a();
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     dmy
 * JD-Core Version:    0.7.0.1
 */