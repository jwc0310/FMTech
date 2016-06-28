import android.os.Handler;
import android.os.Looper;
import android.os.Message;

public final class egx
  extends Handler
{
  public egx(egw paramegw, Looper paramLooper)
  {
    super(paramLooper);
  }
  
  public final void handleMessage(Message paramMessage)
  {
    int i = 1;
    if (paramMessage.what == i) {}
    while (i == 0)
    {
      throw new IllegalArgumentException();
      i = 0;
    }
    egw localegw = this.a;
    egy localegy = (egy)paramMessage.obj;
    Object localObject = localegw.b;
    if (localObject != null) {}
    try
    {
      localegy.a(localObject);
      return;
    }
    catch (RuntimeException localRuntimeException)
    {
      throw localRuntimeException;
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     egx
 * JD-Core Version:    0.7.0.1
 */