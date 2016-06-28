import android.content.Context;
import android.net.Uri;
import android.os.Handler;
import android.os.Handler.Callback;
import android.os.HandlerThread;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

public final class fyf
  extends HandlerThread
  implements Handler.Callback, fyd
{
  Handler a;
  private final Context b;
  private final ArrayList<fyg> c = new ArrayList();
  private final Object d = new Object();
  private efd e;
  
  public fyf(Context paramContext)
  {
    super("PanoramaClient", 10);
    this.b = paramContext.getApplicationContext();
  }
  
  private final boolean a()
  {
    return (this.e != null) && (this.e.e());
  }
  
  public final void a(Uri paramUri, fye paramfye)
  {
    if (eer.a(this.b) != 0)
    {
      paramfye.g();
      return;
    }
    fyg localfyg = new fyg(this, paramfye, paramUri);
    synchronized (this.d)
    {
      this.c.add(localfyg);
      if (this.a == null)
      {
        start();
        this.a = new Handler(getLooper(), this);
      }
      this.a.sendEmptyMessage(0);
      return;
    }
  }
  
  public final boolean handleMessage(Message paramMessage)
  {
    switch (paramMessage.what)
    {
    default: 
      return false;
    case 0: 
      for (;;)
      {
        fyg localfyg;
        int k;
        synchronized (this.d)
        {
          this.a.removeMessages(0);
          ArrayList localArrayList = new ArrayList(this.c);
          this.c.clear();
          int i = localArrayList.size();
          int j = 0;
          if (j >= i) {
            break;
          }
          localfyg = (fyg)localArrayList.get(j);
          if (a())
          {
            k = 1;
            if (k == 0) {
              break label325;
            }
            if (Log.isLoggable("PanoramaClient", 3))
            {
              String str1 = String.valueOf(localfyg.b);
              new StringBuilder(38 + String.valueOf(str1).length()).append("Detecting if the image is a panorama: ").append(str1);
            }
            this.a.removeMessages(1);
            fku.c.a(this.e, localfyg.b, null).a(localfyg);
            j++;
          }
        }
        if (this.e != null) {
          this.e.d();
        }
        this.e = new efe(this.b).a(fku.b).a();
        ConnectionResult localConnectionResult = this.e.a(30L, TimeUnit.SECONDS);
        if (Log.isLoggable("PanoramaClient", 3))
        {
          String str2 = String.valueOf(localConnectionResult);
          new StringBuilder(18 + String.valueOf(str2).length()).append("ConnectionResult: ").append(str2);
        }
        if (localConnectionResult.c == 0)
        {
          k = 1;
        }
        else
        {
          k = 0;
          continue;
          label325:
          localfyg.a.g();
        }
      }
      return true;
    }
    if (a())
    {
      this.e.d();
      this.e = null;
    }
    return true;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     fyf
 * JD-Core Version:    0.7.0.1
 */