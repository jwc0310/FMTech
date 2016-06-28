import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.concurrent.BlockingQueue;

final class evs
  extends Handler
{
  evs(evr paramevr, Looper paramLooper)
  {
    super(paramLooper);
  }
  
  public final void handleMessage(Message paramMessage)
  {
    if (paramMessage != null) {}
    Intent localIntent = (Intent)paramMessage.obj;
    if ("com.google.android.c2dm.intent.REGISTRATION".equals(localIntent.getAction())) {
      evr.a(this.a).add(localIntent);
    }
    while (evr.a(this.a, localIntent)) {
      return;
    }
    localIntent.setPackage(evr.b(this.a).getPackageName());
    evr.b(this.a).sendBroadcast(localIntent);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     evs
 * JD-Core Version:    0.7.0.1
 */