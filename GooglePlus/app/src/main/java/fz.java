import android.content.BroadcastReceiver;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.ArrayList;

final class fz
  extends Handler
{
  fz(fy paramfy, Looper paramLooper)
  {
    super(paramLooper);
  }
  
  public final void handleMessage(Message paramMessage)
  {
    switch (paramMessage.what)
    {
    default: 
      super.handleMessage(paramMessage);
      return;
    }
    fy localfy = this.a;
    for (;;)
    {
      int i;
      synchronized (localfy.b)
      {
        i = localfy.c.size();
        if (i <= 0) {
          return;
        }
      }
      ga[] arrayOfga = new ga[i];
      localfy.c.toArray(arrayOfga);
      localfy.c.clear();
      for (int j = 0; j < arrayOfga.length; j++)
      {
        ga localga = arrayOfga[j];
        for (int k = 0; k < localga.b.size(); k++) {
          ((gb)localga.b.get(k)).b.onReceive(localfy.a, localga.a);
        }
      }
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     fz
 * JD-Core Version:    0.7.0.1
 */