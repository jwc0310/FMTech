import android.os.Handler.Callback;
import android.os.Message;

final class kay
  implements Handler.Callback
{
  public final boolean handleMessage(Message paramMessage)
  {
    switch (paramMessage.what)
    {
    default: 
      return false;
    case 0: 
      ((kbb)paramMessage.obj).b();
      return true;
    }
    ((kbb)paramMessage.obj).ap_();
    return true;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     kay
 * JD-Core Version:    0.7.0.1
 */